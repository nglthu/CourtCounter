package com.test.amanda.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int points=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    protected void displayTeamA(int score){
        TextView txt=(TextView)findViewById(R.id.score_team_A);
        txt.setText(String.valueOf(score));
    }
    protected void displayTeamB(int score){
        TextView txt=(TextView)findViewById(R.id.score_team_B);
        txt.setText(String.valueOf(score));
    }
    protected void threePoints(View view){
        points=points+3;
        displayTeamA(points);

    }
    protected void threePointsTeamB(View view){
        points=points+3;
        displayTeamB(points);

    }
    protected void twoPoints(View view){
        points=points+2;
        displayTeamA(points);
    }
    protected void twoPointsTeamB(View view){
        points=points+2;
        displayTeamB(points);
    }
    protected  void freeThrow(View view){
        points=points +1;
        displayTeamA(points);
    }
    protected  void freeThrowTeamB(View view){
        points=points +1;
        displayTeamB(points);
    }
    public void reset(View view){
        points=0;
        displayTeamA(points);
        displayTeamB(points);
    }

}
