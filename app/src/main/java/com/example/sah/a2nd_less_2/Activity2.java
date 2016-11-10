package com.example.sah.a2nd_less_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {


    Button secondButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        secondButton = (Button) findViewById(R.id.secondButtom);
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                EditText textField2 = (EditText) findViewById(R.id.textField);
                String yourText = textField2.getText().toString();
                intent.putExtra("text", yourText);
                setResult(RESULT_OK, intent);
                finish();
            }
        });


    }
}


