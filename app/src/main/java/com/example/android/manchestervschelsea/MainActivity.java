package com.example.android.manchestervschelsea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreteamA=0;
    int foulA=0;
    /*keep track of goals of team A*/
    public void goalteamA(View view)
    {
        scoreteamA=scoreteamA+1;
        displayGoalA(scoreteamA);
    }

    /*keep track of fouls of team A*/
    public void foulteamA(View view)
    {
        foulA=foulA+1;
        displayFoulA(foulA);
    }

    int scoreteamB=0;
    int foulB=0;
    /*keep track of goals of team B*/
    public void goalteamB(View view)
    {
        scoreteamB=scoreteamB+1;
        displayGoalB(scoreteamB);
    }

    /*keep track of fouls of team B*/
    public void foulteamB(View view)
    {
        foulB=foulB+1;
        displayFoulB(foulB);
    }


    private void displayFoulA(int foul)
    {
        TextView tt=(TextView) findViewById(R.id.foul_teamA);
        tt.setText(String.valueOf("Total foul :"+foul));
    }
    private void displayFoulB(int foul)
    {
        TextView gg=(TextView)findViewById(R.id.foul_teamB);
        gg.setText(String.valueOf("Total foul :"+foul));
    }
    private void displayGoalA(int goal)
    {
        TextView tt=(TextView) findViewById(R.id.teamAscore);
        tt.setText(String.valueOf(scoreteamA));
    }
    private void displayGoalB(int goal)
    {
        TextView tt=(TextView) findViewById(R.id.teamBscore);
        tt.setText(String.valueOf(scoreteamB));
    }

    public void reset(View view)
    {
        foulA=0;
        foulB=0;
        scoreteamB=0;
        scoreteamA=0;
        displayFoulA(foulA);
        displayFoulB(foulB);
        displayGoalA(scoreteamA);
        displayGoalB(scoreteamB);
        TextView ra=(TextView)findViewById(R.id.winnerView);
        ra.setText("Winner is :");

    }
    public void result(View view)
    {
        TextView rr=(TextView)findViewById(R.id.winnerView);

        if(scoreteamA>scoreteamB)
        {
            rr.setText("Winner is : MAN-U");
        }else if (scoreteamA<scoreteamB){
            rr.setText("Winner is : CHELSEA");
        }else{
            rr.setText("MATCH DRAW");
        }
    }
}
