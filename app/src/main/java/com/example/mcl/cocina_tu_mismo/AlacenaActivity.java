package com.example.mcl.cocina_tu_mismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlacenaActivity extends AppCompatActivity implements View.OnClickListener {

    Button volver_ala, ir_a_recetas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alacena);

        volver_ala = (Button) findViewById(R.id.button_volverdealacena);
        ir_a_recetas = (Button) findViewById(R.id.button_arecetas_dealacena);
        volver_ala.setOnClickListener(this);
        ir_a_recetas.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button_volverdealacena:
                Intent intentVolver = new Intent(AlacenaActivity.this, MainActivity.class);
                startActivity(intentVolver);
                break;
            case R.id.button_arecetas_dealacena:
                Intent intentVolver2 = new Intent(AlacenaActivity.this, RecetasActivity.class);
                startActivity(intentVolver2);
                break;
        }
    }
}
