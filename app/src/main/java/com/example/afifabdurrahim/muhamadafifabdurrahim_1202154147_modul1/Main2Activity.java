package com.example.afifabdurrahim.muhamadafifabdurrahim_1202154147_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String Makan = intent.getStringExtra("Makan");
        String porsi = intent.getStringExtra("porsi");
        String Restaurant = intent.getStringExtra("Restaurant");
        TextView textmakan = findViewById(R.id.NamaMakan);
        TextView Porsi = findViewById(R.id.Jumlah);
        TextView Reatbos = findViewById(R.id.Restaurant);
        TextView Hitung = findViewById(R.id.Total);
        int A = Integer.parseInt(porsi);

        int HargaEatbus = 50000 * A;
        String B = String.valueOf(HargaEatbus);

        int C = Integer.parseInt(porsi);
        int HargaAbnormal = 30000 * C;
        String D = String.valueOf(HargaAbnormal);


        if (Restaurant.equalsIgnoreCase("EATBUS")) {
            int uang = 65500;
            if (HargaEatbus > uang) {

                textmakan.setText(Makan);
                Porsi.setText(porsi);
                Reatbos.setText(Restaurant);
                Hitung.setText(B);
                Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
            } else {
                textmakan.setText(Makan);
                Porsi.setText(porsi);
                Reatbos.setText(Restaurant);
                Hitung.setText(B);
                Toast.makeText(this, "disini aja makan malamnya", Toast.LENGTH_LONG).show();
            }

        } else {
            int uang = 65500;
            if (HargaAbnormal > uang) {

                textmakan.setText(Makan);
                Porsi.setText(porsi);
                Reatbos.setText(Restaurant);
                Hitung.setText(D);
                Toast.makeText(this, "Jangan makan disini makan malamnya , uang kamu tidak cukup", Toast.LENGTH_LONG).show();
            } else {
                textmakan.setText(Makan);
                Porsi.setText(porsi);
                Reatbos.setText(Restaurant);
                Hitung.setText(D);
                Toast.makeText(this, "disini aja makan malamnya", Toast.LENGTH_LONG).show();
            }
        }

    }

}