package com.example.konversisuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerSuhu;
    EditText inputNilai;
    TextView tampilHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        load();

    }

    public void load(){
        spinnerSuhu = findViewById(R.id.spinner);
        inputNilai = findViewById(R.id.editText);
        tampilHasil = findViewById(R.id.textView2);
    }

    public void bKonversi(View view) {
        String pilihan = spinnerSuhu.getSelectedItem().toString();

        if (inputNilai.getText().toString().equals("")){
            Toast.makeText(this, "Nilai Tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }
        else{
            if (pilihan.equals("Celcius - Reamur")){
                cToR();
            }
            else if (pilihan.equals("Celcius - Fahrenheit")){
                cToF();
            }
            else if (pilihan.equals("Celcius - Kelvin")){
                cToK();
            }
            else if (pilihan.equals("Reamur - Celcius")){
                rToC();
            }
            else if (pilihan.equals("Reamur - Fahrenheit")){
                rToF();
            }
            else if (pilihan.equals("Reamur - Kelvin")){
                rToK();
            }
            else if (pilihan.equals("Fahrenheit - Celcius")){
                fToC();
            }
            else if (pilihan.equals("Fahrenheit - Reamur")){
                fToR();
            }
            else if (pilihan.equals("Fahrenheit - Kelvin")){
                fToK();
            }
            else if (pilihan.equals("Kelvin - Celcius")){
                kToC();
            }
            else if (pilihan.equals("Kelvin - Reamur")){
                kToR();
            }
            else if (pilihan.equals("Kelvin - Fahrenheit")){
                kToF();
            }
        }

    }

    public void cToR () {
        double suhu = Double.parseDouble(inputNilai.getText().toString());
        double hasil = (4.0 / 5.0) * suhu;
        tampilHasil.setText(hasil + "");
    }

    public void cToF(){
        double suhu = Double.parseDouble(inputNilai.getText().toString());
        double hasil =  ((9.0 / 5.0) * suhu) + 32;
        tampilHasil.setText(hasil + "");
    }

    public void cToK(){
        double suhu = Double.parseDouble(inputNilai.getText().toString());
        double hasil =  suhu + 273;
        tampilHasil.setText(hasil + "");
    }

    public void rToC(){
        double suhu = Double.parseDouble(inputNilai.getText().toString());
        double hasil =  (5.0 / 4.0) * suhu;
        tampilHasil.setText(hasil + "");
    }

    public void rToF(){
        double suhu = Double.parseDouble(inputNilai.getText().toString());
        double hasil =  ((9.0 / 4.0) * suhu) + 32;
        tampilHasil.setText(hasil + "");
    }

    public void rToK(){
        double suhu = Double.parseDouble(inputNilai.getText().toString());
        double hasil =  ((5.0 / 4.0) * suhu) + 273;
        tampilHasil.setText(hasil + "");
    }

    public void fToC(){
        double suhu = Double.parseDouble(inputNilai.getText().toString());
        double hasil =  (5.0 / 9.0) * (suhu - 32);
        tampilHasil.setText(hasil + "");
    }

    public void fToR(){
        double suhu = Double.parseDouble(inputNilai.getText().toString());
        double hasil =  (4.0 / 9.0) * (suhu - 32);
        tampilHasil.setText(hasil + "");
    }

    public void fToK(){
        double suhu = Double.parseDouble(inputNilai.getText().toString());
        double hasil =  ((5.0 / 9.0) * (suhu - 32)) + 273;
        tampilHasil.setText(hasil + "");
    }

    public void kToC(){
        double suhu = Double.parseDouble(inputNilai.getText().toString());
        double hasil =  suhu - 273;
        tampilHasil.setText(hasil + "");
    }

    public void kToc(){
        double suhu = Double.parseDouble(inputNilai.getText().toString());
        double hasil =  suhu - 273;
        tampilHasil.setText(hasil + "");
    }

    public void kToR(){
        double suhu = Double.parseDouble(inputNilai.getText().toString());
        double hasil =  (4.0 / 5.0) * (suhu - 273);
        tampilHasil.setText(hasil + "");
    }

    public void kToF(){
        double suhu = Double.parseDouble(inputNilai.getText().toString());
        double hasil =  ((9.0 / 5.0) * (suhu - 273)) + 32;
        tampilHasil.setText(hasil + "");
    }
}
