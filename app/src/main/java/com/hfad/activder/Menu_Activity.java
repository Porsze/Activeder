package com.hfad.activder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void onSearch (View view) {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);

    }
    public void onAdd (View view) {
        Intent intent = new Intent(this, AddActivity.class);
        startActivity(intent);

    }
    public void onConfig (View view) {
        Intent intent = new Intent(this, ConfigActivity.class);
        startActivity(intent);

    }
}