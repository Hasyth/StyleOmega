package com.example.asuspc.styleomegaassignment;

/**
 * Created by Asus PC on 8/24/2017.
 */


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
/*        String username = intent.getStringExtra(LoginActivity.USERNAME);

        String password = intent.getStringExtra(LoginActivity.PASSWORD);*/


    }

}
