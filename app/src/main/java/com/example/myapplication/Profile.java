package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Profile extends AppCompatActivity {
    Button btnmonan;
    ImageButton ibtnexit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnmonan = (Button) findViewById(R.id.buttonmonan);
        btnmonan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh2 = new Intent( Profile.this, listview.class);
                startActivity(mh2);
            }
        });

        ibtnexit = (ImageButton) findViewById(R.id.imageButtonexit);
        ibtnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh3 = new Intent( Profile.this, MainActivity.class);
                startActivity(mh3);
            }
        });
    }
}