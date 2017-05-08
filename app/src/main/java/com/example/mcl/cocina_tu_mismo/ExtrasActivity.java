package com.example.mcl.cocina_tu_mismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExtrasActivity extends AppCompatActivity implements View.OnClickListener {

    Button volver_ext, ir_a_recetas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extras);

        volver_ext = (Button) findViewById(R.id.button_volverdextras);
        ir_a_recetas = (Button) findViewById(R.id.button_arecetas_deextras);
        volver_ext.setOnClickListener(this);
        ir_a_recetas.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button_volverdextras:
                Intent intentVolver = new Intent(ExtrasActivity.this, MainActivity.class);
                startActivity(intentVolver);
                break;
            case R.id.button_arecetas_deextras:
                Intent intentVolver2 = new Intent(ExtrasActivity.this, RecetasActivity.class);
                startActivity(intentVolver2);
                break;
        }
    }
}
