package com.hfad.activder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Logging_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logging);
    }
    public void onLogging (View view) {
        Intent intent = new Intent(this, LogActivity.class);
        startActivity(intent);
    }
    public void onRegister (View view) {
        Intent intent = new Intent (this, RegisterActivity.class);
        startActivity(intent);
    }
}