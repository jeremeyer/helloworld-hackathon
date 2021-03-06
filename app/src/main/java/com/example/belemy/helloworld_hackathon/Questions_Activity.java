package com.example.belemy.helloworld_hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

import java.util.ArrayList;

import backend.GameParameters;

public class Questions_Activity extends AppCompatActivity {
    ArrayList<String> genres;
    //int[] ids = new int[]{R.id.Question3, R.id.Question5, R.id.Question10, R.id.Question15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            genres = bundle.getStringArrayList("genres");
            }//else
    }//oncreate
    public void nextActivity(View view){
        int QuestionNumber;
        switch(view.getId()) {
            case R.id.radioButton8:
                QuestionNumber=15;
                    break;
            case R.id.radioButton5:
                QuestionNumber=3;
                    break;
            case R.id.radioButton6:
                QuestionNumber=5;
                    break;
            case R.id.radioButton7:
                QuestionNumber=10;
                    break;
            default:
                QuestionNumber=3;
        }
        Intent intent = new Intent(this, areyouReady.class);
        intent.putExtra("genres", genres);
        intent.putExtra("questions", QuestionNumber);
        startActivity(intent);
    }//nextactivity

}//class
