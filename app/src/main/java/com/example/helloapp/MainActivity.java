package com.example.helloapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goButton= (Button)findViewById(R.id.GO) ;
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nameEditText =(EditText) findViewById(R.id.name1);
                TextView HellotextView=(TextView) findViewById(R.id.HellotextView);

                String res= "Hello "+ (nameEditText).getText().toString();
                HellotextView.setText(res);
            }
        });



    }
}