package com.example.tuan_muda.cobalagi;

import android.hardware.Camera;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Handler handler=new Handler();
    TextView textview;
    TextView textview2;
    Button btnA,btnB,btnC,btnD,btnE,btnF,btnG,btnH,btnI,btnJ,btnK,btnL,btnM,btnN,btnO,btnP,btnQ,btnR,btnS,btnT,btnU,btnV,btnW,btnX,btnY,btnZ,btnStrip,btnTitik;
    ToggleButton tglbtnLampu;
    @SuppressWarnings("deprecation")
    Camera kamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView) findViewById(R.id.textView);
        textview2 = (TextView) findViewById(R.id.textView2);
        btnA=(Button)findViewById(R.id.btnA);
        btnA.setOnClickListener(this);
        btnB=(Button)findViewById(R.id.btnB);
        btnB.setOnClickListener(this);
        btnC=(Button)findViewById(R.id.btnC);
        btnC.setOnClickListener(this);
        btnD=(Button)findViewById(R.id.btnD);
        btnD.setOnClickListener(this);
        btnE=(Button)findViewById(R.id.btnE);
        btnE.setOnClickListener(this);
        btnF=(Button)findViewById(R.id.btnF);
        btnF.setOnClickListener(this);
        btnG=(Button)findViewById(R.id.btnG);
        btnG.setOnClickListener(this);
        btnH=(Button)findViewById(R.id.btnH);
        btnH.setOnClickListener(this);
        btnI=(Button)findViewById(R.id.btnI);
        btnI.setOnClickListener(this);
        btnJ=(Button)findViewById(R.id.btnJ);
        btnJ.setOnClickListener(this);
        btnK=(Button)findViewById(R.id.btnK);
        btnK.setOnClickListener(this);
        btnL=(Button)findViewById(R.id.btnL);
        btnL.setOnClickListener(this);
        btnM=(Button)findViewById(R.id.btnM);
        btnM.setOnClickListener(this);
        btnN=(Button)findViewById(R.id.btnN);
        btnN.setOnClickListener(this);
        btnO=(Button)findViewById(R.id.btnO);
        btnO.setOnClickListener(this);
        btnP=(Button)findViewById(R.id.btnP);
        btnP.setOnClickListener(this);
        btnQ=(Button)findViewById(R.id.btnQ);
        btnQ.setOnClickListener(this);
        btnR=(Button)findViewById(R.id.btnR);
        btnR.setOnClickListener(this);
        btnS=(Button)findViewById(R.id.btnS);
        btnS.setOnClickListener(this);
        btnT=(Button)findViewById(R.id.btnT);
        btnT.setOnClickListener(this);
        btnU=(Button)findViewById(R.id.btnU);
        btnU.setOnClickListener(this);
        btnV=(Button)findViewById(R.id.btnV);
        btnV.setOnClickListener(this);
        btnW=(Button)findViewById(R.id.btnW);
        btnW.setOnClickListener(this);
        btnX=(Button)findViewById(R.id.btnX);
        btnX.setOnClickListener(this);
        btnY=(Button)findViewById(R.id.btnY);
        btnY.setOnClickListener(this);
        btnZ=(Button)findViewById(R.id.btnZ);
        btnZ.setOnClickListener(this);
        btnStrip=(Button)findViewById(R.id.btnStrip);
        btnStrip.setOnClickListener(this);
        btnTitik=(Button)findViewById(R.id.btnTitik);
        btnTitik.setOnClickListener(this);
        tglbtnLampu = (ToggleButton) findViewById(R.id.tglbtnLampu);
        tglbtnLampu.setOnClickListener(this);
    }
    private Runnable mati = new Runnable() {
        @SuppressWarnings("deprecation")

        @Override
        public void run() {
            textview2.setText("mati");
            textview2.setVisibility(View.VISIBLE);
            Camera.Parameters params = kamera.getParameters();
            params.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
            kamera.setParameters(params);
            kamera.stopPreview();
            kamera.release();

        }
    };
    private Runnable nyala = new Runnable() {
        @SuppressWarnings("deprecation")

        @Override
        public void run() {
            textview2.setText("nyala");
            textview2.setVisibility(View.VISIBLE);
            kamera = Camera.open();
            Camera.Parameters params = kamera.getParameters();
            params.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
            kamera.setParameters(params);
            kamera.startPreview();

        }
    };
    @SuppressWarnings("deprecation")
    @Override

    public void onClick(View v) {
        if (v == tglbtnLampu) {
            try {
                if (tglbtnLampu.isChecked()) {
                    kamera = Camera.open();
                    Camera.Parameters params = kamera.getParameters();
                    params.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
                    kamera.setParameters(params);
                    kamera.startPreview();
                } else {
                    Camera.Parameters params = kamera.getParameters();
                    params.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
                    kamera.setParameters(params);
                    kamera.stopPreview();
                    kamera.release();
                }
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("exceptionku", e.getMessage());
            }
        }
        else if(v == btnA){
            textview.setText("._");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 1000);
            handler.postDelayed(nyala, 1500);
            handler.postDelayed(mati, 3500);

        }

        else if(v == btnB){
            textview.setText("-...");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 2000);

            handler.postDelayed(nyala, 2500);
            handler.postDelayed(mati, 3500);

            handler.postDelayed(nyala, 4000);
            handler.postDelayed(mati, 5000);

            handler.postDelayed(nyala, 5500);
            handler.postDelayed(mati, 6500);
        }
        else if(v == btnC){
            textview.setText("-.-.");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 2000);

            handler.postDelayed(nyala, 2500);
            handler.postDelayed(mati, 3500);

            handler.postDelayed(nyala, 4000);
            handler.postDelayed(mati, 6000);

            handler.postDelayed(nyala, 6500);
            handler.postDelayed(mati, 7500);
        }
        else if(v == btnD){
            textview.setText("-..");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 2000);

            handler.postDelayed(nyala, 2500);
            handler.postDelayed(mati, 3500);

            handler.postDelayed(nyala, 4000);
            handler.postDelayed(mati, 5000);

        }
        else if(v == btnE){
            textview.setText(".");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 1000);
        }
        else if(v == btnF){
            textview.setText("..-.");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 1000);

            handler.postDelayed(nyala, 1500);
            handler.postDelayed(mati, 2500);

            handler.postDelayed(nyala, 3000);
            handler.postDelayed(mati, 5000);

            handler.postDelayed(nyala, 5500);
            handler.postDelayed(mati, 6500);
        }
        else if(v == btnG){
            textview.setText("--.");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 2000);

            handler.postDelayed(nyala, 2500);
            handler.postDelayed(mati, 4500);

            handler.postDelayed(nyala, 5000);
            handler.postDelayed(mati, 6000);
        }
        else if(v == btnH){
            textview.setText("....");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 1000);

            handler.postDelayed(nyala, 1500);
            handler.postDelayed(mati, 2500);

            handler.postDelayed(nyala, 3000);
            handler.postDelayed(mati, 4000);

            handler.postDelayed(nyala, 4500);
            handler.postDelayed(mati, 5500);
        }
        else if(v == btnI){
            textview.setText("..");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 1000);

            handler.postDelayed(nyala, 1500);
            handler.postDelayed(mati, 2500);
        }
        else if(v == btnJ){
            textview.setText(".---");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 1000);

            handler.postDelayed(nyala, 1500);
            handler.postDelayed(mati, 2500);

            handler.postDelayed(nyala, 3000);
            handler.postDelayed(mati, 5000);

            handler.postDelayed(nyala, 5500);
            handler.postDelayed(mati, 7500);
        }
        else if(v == btnK){
            textview.setText("-.-");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 2000);

            handler.postDelayed(nyala, 2500);
            handler.postDelayed(mati, 3500);

            handler.postDelayed(nyala, 4000);
            handler.postDelayed(mati, 6000);
        }
        else if(v == btnL){
            textview.setText(".-..");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 1000);

            handler.postDelayed(nyala, 1500);
            handler.postDelayed(mati, 3500);

            handler.postDelayed(nyala, 4000);
            handler.postDelayed(mati, 5000);

            handler.postDelayed(nyala, 5500);
            handler.postDelayed(mati, 6500);
        }
        else if(v == btnM){
            textview.setText("--");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 2000);

            handler.postDelayed(nyala, 2500);
            handler.postDelayed(mati, 4500);
        }
        else if(v == btnN){
            textview.setText("-.");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 2000);

            handler.postDelayed(nyala, 2500);
            handler.postDelayed(mati, 3500);
        }
        else if(v == btnO){
            textview.setText("---");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 2000);

            handler.postDelayed(nyala, 2500);
            handler.postDelayed(mati, 4500);

            handler.postDelayed(nyala, 5000);
            handler.postDelayed(mati, 7000);
        }
        else if(v == btnP){
            textview.setText(".--.");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 1000);

            handler.postDelayed(nyala, 1500);
            handler.postDelayed(mati, 3500);

            handler.postDelayed(nyala, 4000);
            handler.postDelayed(mati, 6000);

            handler.postDelayed(nyala, 6500);
            handler.postDelayed(mati, 7500);
        }
        else if(v == btnQ){
            textview.setText("--.-");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 2000);

            handler.postDelayed(nyala, 2500);
            handler.postDelayed(mati, 4500);

            handler.postDelayed(nyala, 5000);
            handler.postDelayed(mati, 6000);

            handler.postDelayed(nyala, 6500);
            handler.postDelayed(mati, 8500);
        }
        else if(v == btnR){
            textview.setText(".-.");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 1000);

            handler.postDelayed(nyala, 1500);
            handler.postDelayed(mati, 3500);

            handler.postDelayed(nyala, 4000);
            handler.postDelayed(mati, 5000);
        }
        else if(v == btnS){
            textview.setText("...");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 1000);

            handler.postDelayed(nyala, 1500);
            handler.postDelayed(mati, 2500);

            handler.postDelayed(nyala, 3000);
            handler.postDelayed(mati, 4000);
}
        else if(v == btnT){
            textview.setText("-");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 2000);
        }
        else if(v == btnU){
            textview.setText("..-");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 1000);

            handler.postDelayed(nyala, 1500);
            handler.postDelayed(mati, 2500);

            handler.postDelayed(nyala, 3000);
            handler.postDelayed(mati, 5000);

        }
        else if(v == btnV){
            textview.setText("...-");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 1000);

            handler.postDelayed(nyala, 1500);
            handler.postDelayed(mati, 2500);

            handler.postDelayed(nyala, 3000);
            handler.postDelayed(mati, 4000);

            handler.postDelayed(nyala, 4500);
            handler.postDelayed(mati, 6500);
        }
        else if(v == btnW){
            textview.setText(".--");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 1000);

            handler.postDelayed(nyala, 1500);
            handler.postDelayed(mati, 3500);

            handler.postDelayed(nyala, 4000);
            handler.postDelayed(mati, 6000);
        }
        else if(v == btnX){
            textview.setText("-..-");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 2000);

            handler.postDelayed(nyala, 2500);
            handler.postDelayed(mati, 3500);

            handler.postDelayed(nyala, 4000);
            handler.postDelayed(mati, 5000);

            handler.postDelayed(nyala, 5500);
            handler.postDelayed(mati, 7500);
        }
        else if(v == btnY){
            textview.setText("-.--");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 2000);

            handler.postDelayed(nyala, 2500);
            handler.postDelayed(mati, 3500);

            handler.postDelayed(nyala, 4000);
            handler.postDelayed(mati, 6000);

            handler.postDelayed(nyala, 6500);
            handler.postDelayed(mati, 8500);
        }
        else if(v == btnZ){
            textview.setText("--..");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 2000);

            handler.postDelayed(nyala, 2500);
            handler.postDelayed(mati, 4500);

            handler.postDelayed(nyala, 5000);
            handler.postDelayed(mati, 6000);

            handler.postDelayed(nyala, 6500);
            handler.postDelayed(mati, 7500);
        }

        else if(v == btnStrip){
            textview.setText("STRIP");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 2000);
        }


        else if(v == btnTitik){
            textview.setText("TITIK");
            textview.setVisibility(View.VISIBLE);

            handler.postDelayed(nyala, 0);
            handler.postDelayed(mati, 1000);
        }

    }
}
