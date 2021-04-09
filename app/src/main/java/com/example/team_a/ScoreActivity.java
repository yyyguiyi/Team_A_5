package com.example.team_a;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScoreActivity extends AppCompatActivity {

    private static final String TAG = "ScoreActivity";//学习，直接输入logi回车
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
    }

    private void show() {
        Log.i(TAG, "show: score="+score);//直接输入：logi回车
        TextView show = findViewById(R.id.score1);
        show.setText(String.valueOf(score));
    }

    public void  btn3(View v){
        score += 3;
        show();
    }

    public void  btn2(View v){
        score += 2;
        show();
    }
    public void  btn1(View v){
        score += 1;
        show();
    }

    public void  reset(View v){
        score = 0;
        show();
    }

}