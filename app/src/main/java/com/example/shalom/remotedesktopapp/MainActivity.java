package com.example.shalom.remotedesktopapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button windows,linux,mac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        windows=(Button)findViewById(R.id.w);
        linux=(Button)findViewById(R.id.l);
        mac=(Button)findViewById(R.id.m);

        windows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Windows.class);
                startActivity(i);
            }
        });
        linux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Linux.class);
                startActivity(i);
            }
        });
        mac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Mac.class);
                startActivity(i);
            }
        });

    }
}
