package com.uniritter.unibook;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Average extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private EditText n3;
    private Button calculate;
    private TextView avgResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Full screen
        requestWindowFeature(Window.FEATURE_OPTIONS_PANEL);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.average);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        calculate = findViewById(R.id.calc);
        avgResult = findViewById(R.id.avgResult);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n1.getText().toString().isEmpty() || n2.getText().toString().isEmpty()) {
                    avgResult.setText("Favor preencher as duas notas.");
                } else {
                    Double n1Value = null;
                    Double n2Value = null;
                    try {
                        n1Value = Double.valueOf(n1.getText().toString());
                        n2Value = Double.valueOf(n2.getText().toString());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Double avg = (n1Value + (n2Value * 2)) / 3;
                    avgResult.setText(avg.toString());
                }
            }
        });

    }

}
