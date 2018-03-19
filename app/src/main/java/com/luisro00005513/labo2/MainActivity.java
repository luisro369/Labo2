package com.luisro00005513.labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView firstTextView, sndTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //-----------------------------------
    }
    public void changeText(View v){
        String aux;
        firstTextView = findViewById(R.id.FirstTextView);
        sndTextView = findViewById(R.id.sndTextView);

        aux = firstTextView.getText().toString();
        firstTextView.setText(sndTextView.getText());
        sndTextView.setText(aux);
    }//change text
}
