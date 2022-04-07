package com.hfad.activder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
    }
    public void onLog (View view) {
        String artur = "Artur";
        String hasło = "Barca123";
        Intent intent = new Intent(this,Menu_Activity.class);
        EditText logName = (EditText) findViewById(R.id.log_name);
        String name = logName.getText().toString();
        EditText logPass = (EditText)  findViewById(R.id.password_name);
        String pass = logPass.getText().toString();
        startActivity(intent);
//        if (name.equals(artur)&&pass.equals(hasło))
//        {
//            startActivity(intent);
//        }
//        else
//        {
//       TextView wrongPass = (TextView) findViewById(R.id.log_hint);
//       wrongPass.setText("Nieporawne dane logowania. Spróbuj ponownie");
//
//        }

    }
}