package com.example.muhammadhaikal.konversibilangan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btn_decimal(View view) {
        Intent psg = new Intent(MainActivity.this, Decimal.class);
        startActivity(psg);

    }

    public void btn_hexa(View view) {
        Intent psg1 = new Intent(MainActivity.this, decimalhexa.class);
        startActivity(psg1);
    }
}
