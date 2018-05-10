package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAPoints = 0;
    int teamBPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateDisplayedScores();
    }

    public void add3PointsToTeamA(View view){
        teamAPoints += 3;
        updateDisplayedScores();
    }

    public void add2PointsToTeamA(View view){
        teamAPoints += 2;
        updateDisplayedScores();
    }

    public void add1PointToTeamA(View view){
        teamAPoints += 1;
        updateDisplayedScores();
    }

    public void add3PointsToTeamB(View view){
        teamBPoints += 3;
        updateDisplayedScores();
    }

    public void add2PointsToTeamB(View view){
        teamBPoints += 2;
        updateDisplayedScores();
    }

    public void add1PointToTeamB(View view){
        teamBPoints += 1;
        updateDisplayedScores();
    }

    public void resetScores(View view) {
        teamAPoints = 0;
        teamBPoints = 0;
        updateDisplayedScores();
    }

    private void updateDisplayedScores(){
        TextView teamAScoreTextView = (TextView) findViewById(R.id.team_A_score);
        teamAScoreTextView.setText("" + teamAPoints);

        TextView teamBScoreTextView = (TextView) findViewById(R.id.team_B_score);
        teamBScoreTextView.setText("" + teamBPoints);
    }
}
