package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button carac = findViewById(R.id.caracteristicas);
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence>adapter= ArrayAdapter.createFromResource(this,R.array.nombres,R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);



        carac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), expertoCafetero.class);
                String nombrecient= spinner.getSelectedItem().toString();
                intent.putExtra("dato1",nombrecient);
                startActivity(intent);
            }
        });


    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
     String text  = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
