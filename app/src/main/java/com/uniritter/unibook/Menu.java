package com.uniritter.unibook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Full screen
        requestWindowFeature(Window.FEATURE_OPTIONS_PANEL);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.menu);

        //Go to average
        Button avgMenu = (Button) findViewById(R.id.btnAverage);
        avgMenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Menu.this, Average.class);
                startActivity(it);
            }
        });

        //Go to WhatINeed
        Button whatINeedMenu = (Button) findViewById(R.id.btnWhatINeed);
        whatINeedMenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Menu.this, WhatINeed.class);
                startActivity(it);
            }
        });

        //Go to Citizenship
        Button citizenshipMenu = (Button) findViewById(R.id.btnCitizenship);
        citizenshipMenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Menu.this, Citizenship.class);
                startActivity(it);
            }
        });

        //Go to Health
        Button healthMenu = (Button) findViewById(R.id.btnHealth);
        healthMenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Menu.this, Health.class);
                startActivity(it);
            }
        });

    }

}
