package com.example.bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("myBundle");
        Toast.makeText(getApplicationContext(), bundle.getIntegerArrayList("array").size()+"",Toast.LENGTH_LONG).show();
    }
}