package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button persegi, segitiga, lingkaran, clear;
    TextView hasil1, hasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        persegi = (Button) findViewById(R.id.persegi);
        segitiga = (Button) findViewById(R.id.segitiga);
        lingkaran = (Button) findViewById(R.id.lingkaran);
        clear = (Button) findViewById(R.id.clear);
        hasil1 = (TextView) findViewById(R.id.hasil1);
        hasil2 = (TextView) findViewById(R.id.hasil2);

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((num1.getText().length()>0 && (num2.getText().length()>0))){
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());
                    double lp = n1 * n2;
                    hasil1.setText(String.format("%.2f",lp));
                    double kp = 2 * (n1 + n2);
                    hasil2.setText(String.format("%.2f",kp));
                }   else {
                    Toast toast = Toast.makeText(MainActivity.this, "Masukan angka !", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((num1.getText().length()>0 && (num2.getText().length()>0))){
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());
                    double ls = 0.5 * (n1 * n2);
                    hasil1.setText(String.format("%.2f",ls));
                    double m = Math.sqrt(Math.pow(n1,2) + Math.pow(n2,2));
                    double ks = m + n1 + n2;
                    hasil2.setText(String.format("%.2f",ks));
                }   else {
                    Toast toast = Toast.makeText(MainActivity.this, "Masukan angka !", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num1.getText().length()>0) {
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double r = n1/2;
                    double ll = 3.14 * Math.pow(r, 2);
                    hasil1.setText(String.format("%.2f",ll));
                    double kl = 2 * 3.14 * r;
                    hasil2.setText(String.format("%.2f",kl));
                }   else {
                    Toast toast = Toast.makeText(MainActivity.this, "Masukan angka !", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1.setText("");
                num2.setText("");
                hasil1.setText("");
                hasil2.setText("");
                num1.requestFocus();
            }
        });

    }
}