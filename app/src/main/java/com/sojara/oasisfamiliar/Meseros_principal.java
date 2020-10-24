package com.sojara.oasisfamiliar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Meseros_principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meseros_principal);

        //botones
        Button mesas = (Button)findViewById(R.id.btnMesas);
        Button menu = (Button)findViewById(R.id.btnMenu);

        //set process to buttons
        mesas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Meseros_principal.this, Meseros_mesas.class));
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Meseros_principal.this, Menu.class));
            }
        });
    }
}