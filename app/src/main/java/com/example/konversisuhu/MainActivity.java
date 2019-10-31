package com.example.konversisuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void load(){
        spinner=findViewById(R.id.spinner);
    }

    public void bKonversi(View view) {
        String pilihan = spinner.getSelectedItem().toString();

        System.out.println(pilihan);
    }
}
