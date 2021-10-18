package com.example.lesson_two_exercise_three;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Result = findViewById(R.id.tvResult);
        Button btEnter = findViewById(R.id.btnEnter);

        btEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int age = 65;
                boolean payment = false;
                boolean pensiondocument = true;

                if ((age >= 18) && (age <= 59)) {
                    Log.d("myLog", "ADULT, please provide payment");
                    if(payment == true) {
                        Log.d("myLog","ENTRANCE ACCEPTED");
                        Result.setBackgroundColor(Color.GREEN);
                        Result.setText("ENTRANCE ACCEPTED");
                    } else {
                        Log.d("myLog", "ENTRANCE DENIED!");
                        Result.setBackgroundColor(Color.RED);
                        Result.setText("ENTRANCE DENIED");
                    }
                }else {

                    if (age >= 60) {
                        Log.d("myLog", "Elder, provide retirement documents");
                        if (pensiondocument == true) {
                            Log.d("myLog", "ELDER ENTRANCE ACCEPTED");
                            Result.setBackgroundColor(Color.GREEN);
                            Result.setText("ENTRANCE ACCEPTED");
                        } else {
                            Log.d("myLog", "ELDER ENTRANCE DENIED");
                            Result.setBackgroundColor(Color.RED);
                            Result.setText("ENTRANCE DENIED");
                        }
                    }

                    if (age <= 17) {
                        Log.d("myLog", "CHILD, ENTRANCE ACCEPTED");
                        Result.setBackgroundColor(Color.GREEN);
                        Result.setText("ENTRANCE ACCEPTED");
                    }
                }


            }
        });
    }
}