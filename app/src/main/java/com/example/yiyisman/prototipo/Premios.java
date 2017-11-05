package com.example.yiyisman.prototipo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Premios extends AppCompatActivity {

    ImageButton log;
    int[] images ={R.drawable.bonyurt,R.drawable.leche,R.drawable.arequipe,R.drawable.flan};
    String [] Names = {"Recibo Aplicado","Recibo Aplicado","Recibo Aplicado","Recibo Aplicado"};
    String [] Puntos = {"+ 100 pts","+ 250 pts","+ 50 pts","+ 150 pts"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premios);

        log=findViewById(R.id.imageButton5);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Premios.this, Principal.class);
                startActivity(myIntent);
            }
        });
    }
}
