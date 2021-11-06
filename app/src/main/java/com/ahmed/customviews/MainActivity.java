package com.ahmed.customviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MyFirstCustomView customView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customView = findViewById(R.id.my_view);
        textView = findViewById(R.id.txt_hello_world);

        customView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "",Toast.LENGTH_SHORT).show();
            }
        });

        customView.setOnButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(getResources().getColor(R.color.teal_200));

            }
        });
    }



}