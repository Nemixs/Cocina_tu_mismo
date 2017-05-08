package com.example.mcl.cocina_tu_mismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactoActivity extends AppCompatActivity implements View.OnClickListener {

    Button volver_cont;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        volver_cont=(Button)findViewById(R.id.button_volverdecontacto);
        volver_cont.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button_volverdecontacto:
                Intent intentVolver = new Intent(ContactoActivity.this, MainActivity.class);
                startActivity(intentVolver);
                break;
        }
    }
}
