package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class singin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn3;
        ImageButton ibtn5;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singin);
        btn3 = (Button) findViewById(R.id.button3);
        ibtn5 = (ImageButton) findViewById(R.id.imageButton5);

        ibtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh3 = new Intent(singin.this, MainActivity.class);
                startActivity(mh3);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh3 = new Intent(singin.this, MainActivity.class);
                startActivity(mh3);

            }
        });
    }
}