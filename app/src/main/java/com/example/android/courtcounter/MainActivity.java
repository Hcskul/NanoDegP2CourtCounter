package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Initializing
    Spinner spinner_a;
    ImageView imageview_a;
    Spinner spinner_b;
    ImageView imageview_b;

    // Tracks the score and the penalties for Team A
    int scoreTeamA = 0;
    int twoMinutesTeamA = 0;

    // Tracks the 7 meter for Team A
    int sevenMetersTeamA = 0;

    // Tracks the score and the penalties for Team B
    int scoreTeamB = 0;
    int twoMinutesTeamB = 0;

    // Tracks the 7 meter for Team B
    int sevenMetersTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinner_a = (Spinner) findViewById(R.id.spinnerA);
        imageview_a = (ImageView) findViewById(R.id.imageViewA);
        spinner_a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinner.
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                if (arg2 == 0) {
                    imageview_a.setImageResource(R.drawable.croatia);
                }
                if (arg2 == 1) {
                    imageview_a.setImageResource(R.drawable.spain);
                }
                if (arg2 == 2) {
                    imageview_a.setImageResource(R.drawable.germany);
                }
                if (arg2 == 3) {
                    imageview_a.setImageResource(R.drawable.sweden);
                }
                if (arg2 == 4) {
                    imageview_a.setImageResource(R.drawable.denmark);
                }
                if (arg2 == 5) {
                    imageview_a.setImageResource(R.drawable.france);
                }
                if (arg2 == 6) {
                    imageview_a.setImageResource(R.drawable.hungary);
                }
                if (arg2 == 7) {
                    imageview_a.setImageResource(R.drawable.serbia);
                }
                if (arg2 == 8) {
                    imageview_a.setImageResource(R.drawable.belarus);
                }
                if (arg2 == 9) {
                    imageview_a.setImageResource(R.drawable.montenegro);
                }
                if (arg2 == 10) {
                    imageview_a.setImageResource(R.drawable.norway);
                }
                if (arg2 == 11) {
                    imageview_a.setImageResource(R.drawable.slovenia);
                }
                if (arg2 == 12) {
                    imageview_a.setImageResource(R.drawable.austria);
                }
                if (arg2 == 13) {
                    imageview_a.setImageResource(R.drawable.czech_republic);
                }
                if (arg2 == 14) {
                    imageview_a.setImageResource(R.drawable.macedonia);
                }
                if (arg2 == 15) {
                    imageview_a.setImageResource(R.drawable.iceland);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }

        });

        spinner_b = (Spinner) findViewById(R.id.spinnerB);
        imageview_b = (ImageView) findViewById(R.id.imageViewB);
        spinner_b.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinner.
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                if (arg2 == 0) {
                    imageview_b.setImageResource(R.drawable.spain);
                }
                if (arg2 == 1) {
                    imageview_b.setImageResource(R.drawable.croatia);
                }
                if (arg2 == 2) {
                    imageview_b.setImageResource(R.drawable.germany);
                }
                if (arg2 == 3) {
                    imageview_b.setImageResource(R.drawable.sweden);
                }
                if (arg2 == 4) {
                    imageview_b.setImageResource(R.drawable.denmark);
                }
                if (arg2 == 5) {
                    imageview_b.setImageResource(R.drawable.france);
                }
                if (arg2 == 6) {
                    imageview_b.setImageResource(R.drawable.hungary);
                }
                if (arg2 == 7) {
                    imageview_b.setImageResource(R.drawable.serbia);
                }
                if (arg2 == 8) {
                    imageview_b.setImageResource(R.drawable.belarus);
                }
                if (arg2 == 9) {
                    imageview_b.setImageResource(R.drawable.montenegro);
                }
                if (arg2 == 10) {
                    imageview_b.setImageResource(R.drawable.norway);
                }
                if (arg2 == 11) {
                    imageview_b.setImageResource(R.drawable.slovenia);
                }
                if (arg2 == 12) {
                    imageview_b.setImageResource(R.drawable.austria);
                }
                if (arg2 == 13) {
                    imageview_b.setImageResource(R.drawable.czech_republic);
                }
                if (arg2 == 14) {
                    imageview_b.setImageResource(R.drawable.macedonia);
                }
                if (arg2 == 15) {
                    imageview_b.setImageResource(R.drawable.iceland);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }

        });

    }

    /**
     * Displays the given score for Team A
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given two minute penalties for Team A
     */
    public void displayTwoMinutesForTeamA(int twoMinutes) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_min);
        scoreView.setText(String.valueOf(twoMinutes));
    }

    /**
     * Displays the given 7 meters for Team A
     */
    public void displaySevenMeterForTeamA(int sevenMeter) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_meter);
        scoreView.setText(String.valueOf(sevenMeter));
    }

    /**
     * adds 1 goal for Team A after the goal Button was clicked and displays the new value
     */
    public void goalTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }

    /**
     * adds one two minute penalty for Team A after the 2 min button was clicked and displays the new value
     */
    public void twoMinutesTeamA(View v) {
        twoMinutesTeamA = twoMinutesTeamA + 1;
        displayTwoMinutesForTeamA(twoMinutesTeamA);
    }

    /**
     * adds one seven meter for  Team A after the 7m button was clicked and displays the new value
     */
    public void sevenMeterTeamA(View v) {
        sevenMetersTeamA = sevenMetersTeamA + 1;
        displaySevenMeterForTeamA(sevenMetersTeamA);
    }

    //--------------------------------------------------------------------------------------------

    /**
     * Displays the given score for Team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given two minute penalties for Team B
     */
    public void displayTwoMinutesForTeamB(int twoMinutes) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_min);
        scoreView.setText(String.valueOf(twoMinutes));
    }

    /**
     * Displays the given 7 meters for Team B
     */
    public void displaySevenMeterForTeamB(int sevenMeter) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_meter);
        scoreView.setText(String.valueOf(sevenMeter));
    }

    /**
     * adds 1 goal for Team B after the goal Button was clicked and displays the new value
     */
    public void goalTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }

    /**
     * adds one two minute penalty for Team B after the 2 min button was clicked and displays the new value
     */
    public void twoMinutesTeamB(View v) {
        twoMinutesTeamB = twoMinutesTeamB + 1;
        displayTwoMinutesForTeamB(twoMinutesTeamB);
    }

    /**
     * adds one seven meter for  Team B after the 7m button was clicked and displays the new value
     */
    public void sevenMeterTeamB(View v) {
        sevenMetersTeamB = sevenMetersTeamB + 1;
        displaySevenMeterForTeamB(sevenMetersTeamB);
    }


    /*
    * resets both the scores and displays 0 to the screen
     */
    public void reset(View v) {
        scoreTeamA = 0;
        twoMinutesTeamA = 0;
        sevenMetersTeamA = 0;
        scoreTeamB = 0;
        twoMinutesTeamB = 0;
        sevenMetersTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayTwoMinutesForTeamA(twoMinutesTeamA);
        displaySevenMeterForTeamA(sevenMetersTeamA);
        displayForTeamB(scoreTeamB);
        displayTwoMinutesForTeamB(twoMinutesTeamB);
        displaySevenMeterForTeamB(sevenMetersTeamB);

    }


}
