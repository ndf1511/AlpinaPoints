package com.example.yiyisman.prototipo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Check2 extends AppCompatActivity {
    Statics s;
    int ptsn;
    ImageButton log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check2);
        ptsn=s.getPts();
        s.setPts(ptsn-250);
        log=findViewById(R.id.imageButton21);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Check2.this, Principal.class);
                startActivity(myIntent);
            }
        });
    }
}
