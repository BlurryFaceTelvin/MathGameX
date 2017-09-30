package com.example.blurryface.mathgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.Scanner;

public class GameActivity extends AppCompatActivity {
    TextView num1,num2,score;
    EditText answer;
    private int val;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        num1 = (TextView)findViewById(R.id.textPartA);
        num2 = (TextView)findViewById(R.id.textPartB);
        score = (TextView)findViewById(R.id.scoreTxt);
        answer = (EditText)findViewById(R.id.answerTxt);
    }
    public void correctAnswer(View view)
    {
        int first = Integer.parseInt(num1.getText().toString());
        int second = Integer.parseInt(num2.getText().toString());
        int correct = first* second;
        int answerGiven = Integer.parseInt(answer.getText().toString());
        if(answerGiven==correct)
        {
            val++;
            Toast.makeText(getApplicationContext(),"Correct Answer",Toast.LENGTH_LONG).show();
            score.setText(String.valueOf(val));
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_LONG).show();
            score.setText(String.valueOf(val));
        }

    }
    public void generateNumber(View view)
    {
        Random random = new Random();
        int f = 1+ random.nextInt(9);
        int s = 1+random.nextInt(9);
        num1.setText(String.valueOf(f));
        num2.setText(String.valueOf(s));
    }


    public void exitGame(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
