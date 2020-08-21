package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class expertoCafetero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experto_cafetero);

        TextView textView1 = findViewById(R.id.texto1);
        TextView textView2 = findViewById(R.id.text2);
        String titulo= getIntent().getStringExtra("dato1");
        textView1.setText(titulo);

        ExpertoDescripcion mExperto = new ExpertoDescripcion( titulo);

        textView2.setText(mExperto.getDescrip());

    }
}
