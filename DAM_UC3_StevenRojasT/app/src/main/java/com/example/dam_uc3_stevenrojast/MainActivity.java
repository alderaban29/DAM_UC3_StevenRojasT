package com.example.dam_uc3_stevenrojast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sexos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sexos = (Spinner) findViewById(R.id.idspinnersexo);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.sexos, android.R.layout.simple_spinner_item);
        sexos.setAdapter(adapter);

        Button btn2 = findViewById(R.id.idbtnregistrate);
        btn2.setOnClickListener(view -> Toast.makeText(this, "Se envio sus datos", Toast.LENGTH_SHORT).show());
    }
}