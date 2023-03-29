package com.example.appse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    TextView receiver_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        receiver_msg = (TextView) findViewById(R.id.received_value_id);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        receiver_msg.setText("Hello " + str + "!");

    }
}