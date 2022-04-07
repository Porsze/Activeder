package com.hfad.activder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CreateActivity extends Activity {
public static final String CREATE_MESSAGE = "create";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        Intent intent = getIntent();
        String createInfo = intent.getStringExtra(CREATE_MESSAGE);
        TextView createView = (TextView) findViewById(R.id.text_create);
        createView.setText(createInfo);

    }
    public void onChange (View view){
        Intent intent = new Intent(this,AddActivity.class);
        startActivity(intent);
    }
    public void onApprove (View view) {
        Intent intent = new Intent(this,Menu_Activity.class);
        startActivity(intent);
    }



}