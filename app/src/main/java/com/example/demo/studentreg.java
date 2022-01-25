package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class studentreg extends AppCompatActivity {


        Button studreg;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.studentreg);

            studreg = findViewById(R.id.studreg);
            studreg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent studentintent = new Intent(studentreg.this,alumnireg.class);
                    startActivity(studentintent);
                }
            });
        }
    }

