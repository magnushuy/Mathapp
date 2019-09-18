package com.s315271.mappe1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {

    TextView view;

    @Override
    public void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activity_game);

        view = findViewById(R.id.textView);
        view.setText("hei");
    }

    public void numberClick(View v){
        Button b = (Button)v;
        String number = b.getText().toString();
        appendText(number);
    }

    public void appendText(String text){
        view.append(text);
    }
}
