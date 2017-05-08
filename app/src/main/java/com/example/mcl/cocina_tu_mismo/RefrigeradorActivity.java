package com.example.mcl.cocina_tu_mismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RefrigeradorActivity extends AppCompatActivity implements View.OnClickListener{

    Button volver_refri, ir_a_recetas;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refrigerador);

            volver_refri=(Button)findViewById(R.id.button_volverderefri);
            ir_a_recetas=(Button)findViewById(R.id.button_arecetas_derefrigerador);
            volver_refri.setOnClickListener(this);
            ir_a_recetas.setOnClickListener(this);

    }

        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.button_volverderefri:
                    Intent intentVolver=new Intent(RefrigeradorActivity.this,MainActivity.class);
                    startActivity(intentVolver);
                    break;
                case R.id.button_arecetas_derefrigerador:
                    Intent intentVolver2=new Intent(RefrigeradorActivity.this,RecetasActivity.class);
                    startActivity(intentVolver2);
                    break;



        }
    }
}
