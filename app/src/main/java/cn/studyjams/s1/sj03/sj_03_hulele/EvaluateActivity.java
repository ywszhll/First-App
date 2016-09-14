package cn.studyjams.s1.sj03.sj_03_hulele;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by asus on 2016-04-28.
 */
public class EvaluateActivity extends AppCompatActivity {
    int  score=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluate);
    }


    /**
         * This method is called when the plus button is clicked.
         */
    public void increment(View view) {
        if (score==10) {
            // Show an error message as a toast
            Toast.makeText(this,"非常感谢，但是超出分数上限了哦！",Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }
        score=score+1;
        displayScore(score);
    }
    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        if (score==1) {
            // Show an error message as a toast
            Toast.makeText(this,"给0分可不太好哦！",Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }
        score=score-1;
        displayScore(score);
    }

    /**
     * This method is called when the sure button is clicked.
     */
    public void Sure(View view) {

        String scoreMessage=createSoresTest(score);
        displayEnding(scoreMessage);
    }

    /**
     * Make sure.
     *
     * @param score of the test
     * @return score message
     */
    private String createSoresTest(int score){
        String scoreMessage="您此次的评分为： ";
        scoreMessage+="\n"+score+"分";
        scoreMessage+="\n感谢您的评分!";
        return scoreMessage;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayScore(int scoreOfTheTest) {
        TextView scoreTextView = (TextView) findViewById(
                R.id.score_text_view);
        scoreTextView.setText("" + scoreOfTheTest);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayEnding(String message) {
        TextView resultTextView = (TextView) findViewById(
                R.id.result_text_view);
        resultTextView.setText(message);
    }



}
