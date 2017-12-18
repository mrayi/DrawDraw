package com.example.ayi.drawdraw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);
        final EditText editTextName = (EditText) findViewById(R.id.editTextEmail);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        editTextName.setText(name);
    }
}
