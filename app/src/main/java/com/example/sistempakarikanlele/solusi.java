package com.example.sistempakarikanlele;

import static com.android.volley.VolleyLog.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.StringRequest;
import com.example.sistempakarikanlele.API.Server;
import com.example.sistempakarikanlele.App.AppController;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class solusi extends AppCompatActivity {

    TextView penyakit, solusi;

    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solusi);

        penyakit = findViewById(R.id.sPenyakit);
        solusi = findViewById(R.id.sSolusi);

        Intent data = getIntent();
        id = data.getStringExtra("id");

        ViewData(id);

    }

    private void ViewData(String id) {

        StringRequest eventoReq = new StringRequest(Request.Method.POST, Server.AmbilDataPenyakit,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d(TAG, response.toString());
                        try{
                            JSONArray j= new JSONArray(response);

                            // Parsea json
                            for (int i = 0; i < j.length(); i++) {
                                try {
                                    JSONObject obj = j.getJSONObject(i);

                                    penyakit.setText(obj.getString("nama_penyakit"));
                                    solusi.setText(obj.getString("solusi_penyakit"));


                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());

            }
        }){
            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("id", id);
                return params;
            }
        };

        // Añade la peticion a la cola
        AppController.getInstance().addToRequestQueue(eventoReq);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent intent = new Intent(solusi.this, MainActivity.class);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
