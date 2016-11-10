package com.example.sah.a2nd_less_2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.firstButtom);
        assert button != null;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, Activity2.class);
                startActivityForResult(in, 1);
            }
        });

    }


    @Override
    protected void onActivityResult(int code, int result, Intent data) {

        String yourText = data.getStringExtra("text");
        TextView textField = (TextView) findViewById(R.id.text1);
        textField.setText(yourText);
    }


}
