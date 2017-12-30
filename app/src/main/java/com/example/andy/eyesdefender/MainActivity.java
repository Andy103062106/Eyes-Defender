package com.example.andy.eyesdefender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    private Button todayBtn;
    private Button historyBtn;
    private Button aboutBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todayBtn = (Button)findViewById(R.id.todayButton);
        todayBtn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Today.class);
                startActivity(intent);
            }
        });

        historyBtn = (Button)findViewById(R.id.historyButton);
        historyBtn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, History.class);
                startActivity(intent);
            }
        });

        aboutBtn = (Button)findViewById(R.id.aboutButton);
        aboutBtn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                //setContentView(R.layout.activity_about);
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, About.class);
                startActivity(intent);
            }
        });
    }
}
