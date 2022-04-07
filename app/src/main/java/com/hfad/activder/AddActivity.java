package com.hfad.activder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AddActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }
    public void onCreate (View view) {
        Button buttonCreate = (Button) findViewById(R.id.button_create);
        Spinner spinnerDiscipline = (Spinner) findViewById(R.id.spinner_discipline);
        Spinner spinnerDate = (Spinner) findViewById(R.id.spinner_date);
        Spinner spinnerTime = (Spinner) findViewById(R.id.spinner_time);
        Spinner spinnerLocalization = (Spinner) findViewById(R.id.spinner_localization);
        Spinner spinnerLevel = (Spinner) findViewById(R.id.spinner_level);
        StringBuffer event = new StringBuffer();
        event
                .append(spinnerDiscipline.getSelectedItem())
                .append('\n')
                .append(spinnerDate.getSelectedItem())
                .append('\n')
                .append(spinnerTime.getSelectedItem())
                .append('\n')
                .append(spinnerLocalization.getSelectedItem())
                .append('\n')
                .append(spinnerLevel.getSelectedItem());
        String eventInfoMsg = event.toString();

        TextView eventText = (TextView) findViewById(R.id.event_text);
        eventText.setText(event);
        Intent intent = new Intent(this, CreateActivity.class);
        intent.putExtra(CreateActivity.CREATE_MESSAGE,eventInfoMsg);
        startActivity(intent);
    }
}