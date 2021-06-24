package com.example.discount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText D1;
    private EditText D2;
    private EditText D3;
    private Button BB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        D1 = (EditText)findViewById(R.id.D1);
        D2 = (EditText)findViewById(R.id.D2);
        D3 = (EditText)findViewById(R.id.D3);
        BB = (Button)findViewById(R.id.BB);

        BB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               double n1 =Double.parseDouble(D1.getText().toString());
                double n2 = Double.parseDouble(D2.getText().toString());
                double calc = n1* n2/100;

                double discount=n1-calc;

                D3.setText(String.valueOf(discount));


            }
        });

    }
}