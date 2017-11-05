package com.example.yiyisman.prototipo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    Statics s;
    TextView text;
    int pts;
    ListView sListView;
    ImageButton log, cam;
    int[] images ={R.drawable.bill,R.drawable.bill,R.drawable.bill,R.drawable.bill};
    String [] Names = {"Recibo Aplicado","Recibo Aplicado","Recibo Aplicado","Recibo Aplicado"};
    String [] Puntos = {"+ 100 pts","+ 250 pts","+ 50 pts","+ 150 pts"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        pts= s.getPts();
        sListView = findViewById(R.id.list1);
        Principal.CustomAdapter customAdapter =new Principal.CustomAdapter();
        sListView.setAdapter(customAdapter);
        log=findViewById(R.id.imageButton5);
        text = findViewById(R.id.textView5);
        text.setText(""+pts);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Principal.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

        cam=findViewById(R.id.imageButton7);

        cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Principal.this, Camera.class);
                startActivity(myIntent);
            }
        });

    }
    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            View view1 = getLayoutInflater().inflate(R.layout.customlayout, null);

            ImageView sImageView =view1.findViewById(R.id.imageView);
            TextView mTextVIew = view1.findViewById(R.id.TextView);
            TextView sTextVIew = view1.findViewById(R.id.TextView1);

            sImageView.setImageResource(images[i]);
            mTextVIew.setText(Names[i]);
            sTextVIew.setText(Puntos[i]);

            return view1;
        }
    }
}
