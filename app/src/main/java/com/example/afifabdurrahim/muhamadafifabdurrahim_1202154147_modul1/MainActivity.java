package com.example.afifabdurrahim.muhamadafifabdurrahim_1202154147_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText EditMenu;
    private EditText Porsi;
    private Button Eatbus;
    private Button Abnormal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditMenu = findViewById(R.id.Pesenan);
        Porsi = findViewById(R.id.Porsi);
        Eatbus = findViewById(R.id.button_eatbus);
        Abnormal = findViewById(R.id.button_abnormal);


    }

    public void Eatbus(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        String Makan = EditMenu.getText().toString();
        String porsi = Porsi.getText().toString();
        String Restaurant = Eatbus.getText().toString();


        intent.putExtra("Makan", Makan);
        intent.putExtra("porsi", porsi);
        intent.putExtra("Restaurant", Restaurant);

        startActivity(intent);
    }

    public void Abnormal(View view) {

        Intent intent = new Intent(this, Main2Activity.class);

        String Makan = EditMenu.getText().toString();
        String porsi = Porsi.getText().toString();
        String Restaurant = Abnormal.getText().toString();


        intent.putExtra("Makan", Makan);
        intent.putExtra("porsi", porsi);
        intent.putExtra("Restaurant", Restaurant);

        startActivity(intent);
    }
}