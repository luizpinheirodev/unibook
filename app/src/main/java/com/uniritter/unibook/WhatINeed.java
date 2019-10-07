package com.uniritter.unibook;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WhatINeed extends AppCompatActivity {

    private static final Double AVERAGE = 6.0;

    private EditText n1;
    private Button calculateWIN;
    private TextView whatINeedResult;
    private TextView whatINeedText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Full screen
        requestWindowFeature(Window.FEATURE_OPTIONS_PANEL);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.what_i_need);

        n1 = findViewById(R.id.n1W);
        calculateWIN = findViewById(R.id.btnCalculate);

        whatINeedResult = findViewById(R.id.nResult);
        whatINeedText = findViewById(R.id.nText);

        /**
         * average rule => n1 + (n2 * 2) = AVG
         * n2 = (6 * 3 - n1)/2
         */
        calculateWIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (n1.getText().toString().isEmpty()) {
                    whatINeedText.setText("Favor preencher a nota.");
                } else {
                    Double n1Value = null;
                    try {
                        n1Value = Double.valueOf(n1.getText().toString());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Double needed =  (AVERAGE * 3 - n1Value) / 2;
                    whatINeedResult.setText(needed.toString());
                    if(needed < 6.0){
                        whatINeedText.setText("Parabéns, você está acima da média.");
                    }else{
                        whatINeedText.setText("Ta foda, vai ter que se puxar.");
                    }
                }

            }
        });

    }

}
