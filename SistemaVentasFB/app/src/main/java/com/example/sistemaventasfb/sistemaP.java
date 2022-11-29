package com.example.sistemaventasfb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sistemaP extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema_p);
    }
    public void registar(View v)
    {
        Intent intento=new Intent(this, MainActivity.class);
        startActivity(intento);
    }

    public void salir(View v)
    {
        finish();
    }

}