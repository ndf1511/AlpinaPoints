package com.example.yiyisman.prototipo;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Login extends AppCompatActivity {

    ImageButton log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        log=findViewById(R.id.imageButton6);

        log.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent myIntent = new Intent(Login.this, LoginCorre.class);
            startActivity(myIntent);
        }
    });
    }

}
