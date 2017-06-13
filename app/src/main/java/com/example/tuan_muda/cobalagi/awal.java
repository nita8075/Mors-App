package com.example.tuan_muda.cobalagi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class awal extends AppCompatActivity implements View.OnClickListener {
    Button modeA,modeB,modeC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awal);
        modeA=(Button)findViewById(R.id.btnCahaya);
        modeA.setOnClickListener(this);
        modeB=(Button)findViewById(R.id.btnMorse);
        modeB.setOnClickListener(this);
        modeC=(Button)findViewById(R.id.btnAlpa);
        modeC.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
             if(v == modeA){
                 Intent i =new Intent(getApplicationContext(),MainActivity.class);

                 startActivity(i);
             }

        else if(v == modeB){
                 Intent i =new Intent(getApplicationContext(),convert.class);

                 startActivity(i);
        }

        else if(v == modeC){
                 Intent i =new Intent(getApplicationContext(),convert2.class);

                 startActivity(i);
        }
    }
}
