package com.ahmed.customviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MyFirstCustomView customView;
    TextView textView;
    FrameLayout flContainer;

    String userEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txt_hello_world);
        flContainer = findViewById(R.id.fl_container);

        SignFromView signFromView   = new SignFromView(getBaseContext());
        signFromView.setOnGetDataClicked(new SignFromView.OnGetDataClicked() {
            @Override
            public void onButtonClicked(String email) {
            userEmail = email;
                Toast.makeText(MainActivity.this, userEmail + "______________",Toast.LENGTH_LONG).show();

            }
        });
        flContainer.addView(signFromView);
        flContainer.removeView(signFromView);



    }
}