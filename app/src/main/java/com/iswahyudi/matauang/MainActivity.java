package com.iswahyudi.matauang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText input_uang;
    Button rp_yuan, rp_pound, rp_won, rp_dolarbarutaiwan, rp_euroitaly;
    TextView hasil_konversi;

    double angka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_uang = (EditText) findViewById(R.id.uang_input);
        rp_yuan = (Button) findViewById(R.id.rpyuan);
        rp_pound = (Button) findViewById(R.id.rppound);
        rp_won = (Button) findViewById(R.id.rpwon);
        rp_dolarbarutaiwan = (Button) findViewById(R.id.rpdolarbarutaiwan);
        rp_euroitaly = (Button) findViewById(R.id.rpeuroitaly);
        hasil_konversi = (TextView) findViewById(R.id.hasil_konversi);
    }

    public boolean cek(){
        if (input_uang.getText().toString().isEmpty()){
            Toast.makeText(this, "Silahkan masukan jumlah uang", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public void toWON(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(input_uang.getText().toString());
        }catch(Exception ex){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 11;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.KOREA).format(hasil));
        Toast.makeText(this, "1 WON = Rp 11", Toast.LENGTH_SHORT).show();
    }

    public void toPOUND(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(input_uang.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 17789;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.ENGLISH).format(hasil));
        Toast.makeText(this, "1 POUND = Rp 17.789", Toast.LENGTH_SHORT).show();
    }



    public void toYUAN(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(input_uang.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 1991;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.CHINA).format(hasil));
        Toast.makeText(this, "1 YUAN = Rp 1.991", Toast.LENGTH_SHORT).show();
    }

    public void toDOLARBARUTAIWAN(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(input_uang.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 455;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.TAIWAN).format(hasil));
        Toast.makeText(this, "1 DOLAR BARU TAIWAN = Rp 455", Toast.LENGTH_SHORT).show();
    }

    public void toEUROITALY(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(input_uang.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 15136;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.ITALY).format(hasil));
        Toast.makeText(this, "1 EURO ITALY = Rp 15.136", Toast.LENGTH_SHORT).show();
    }
}
