package com.example.yiyisman.prototipo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Info extends AppCompatActivity {

    ImageButton im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        im=findViewById(R.id.imageButton21);

        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Info.this, Check.class);
                startActivity(myIntent);
            }
        });
    }
}
