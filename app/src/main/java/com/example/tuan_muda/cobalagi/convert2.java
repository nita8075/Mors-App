package com.example.tuan_muda.cobalagi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class convert2 extends AppCompatActivity {
    private TextView txt;
    private TextView result;
    private Button toAlphaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert2);
        txt = (TextView) findViewById(R.id.txt);
        result = (TextView) findViewById(R.id.result);
        toAlphaBtn = (Button) findViewById(R.id.toAlphaBtn);

        toAlphaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtToConvert = txt.getText().toString();
                String convertedTxt = morsecode.morseToAlpha(txtToConvert);
                result.setText(convertedTxt);
            }
        });
    }
}
