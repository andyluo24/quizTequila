package edu.illinois.cs.cs125.simplequizsoundeffect;
/**
 * All the import we need to write about this application
 */

import android.media.MediaPlayer;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

/**
 * this is the mainactivity class which extends appcompatactivity from the import.
 */
public class MainActivity extends AppCompatActivity {
    /**
     * create 5 instances for the button class in order to set up button onclickers.
     */
    Button button1, button2, button3, button4, button5;
    /**
     * set up the instances for textview for score text view and question text view
     */
    TextView point, problem;
    /**
     * set up the instance for the question class
     */
    public Question q = new Question();
    /**
     * create an instance for string class that is private access.
     */
    public String daan;
    /**
     * create a private instance of integer initiating to 0
     */
    public int fen = 0;
    /**
     * create a private instance of integer for the question length
     */
    public int questionLength = q.questionDatabase.length;
    /**
     * create a instance of random class
     */
    Random random = new Random();

    /**
     * the main method for button functioning and returns nothing.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer correct = MediaPlayer.create(this, R.raw.correct);
        final MediaPlayer wrong = MediaPlayer.create(this, R.raw.fail);

        button1 = (Button) findViewById(R.id.answer1);
        button2 = (Button) findViewById(R.id.answer2);
        button3 = (Button) findViewById(R.id.answer3);
        button4 = (Button) findViewById(R.id.answer4);
        button5 = (Button) findViewById(R.id.answer5);

        point =  (TextView) findViewById(R.id.score);
        problem = (TextView) findViewById(R.id.question);

        point.setText("Score: " + fen);

        gengxin(random.nextInt(questionLength));
        /**
         * the button 1 onclick listener that activates the clickers to function and play the sound effect
         */
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button1.getText() == daan){
                    fen++;
                    point.setText("Score: " + fen);
                    gengxin(random.nextInt(questionLength));
                    correct.start();
                }else {
                    end();
                    wrong.start();
                }
            }
        });
        /**
         * the button 2 onclick listener that activates the clickers to function and play the sound effect
         */
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button2.getText() == daan){
                    fen++;
                    point.setText("Score: " + fen);
                    gengxin(random.nextInt(questionLength));
                    correct.start();
                }else {
                    end();
                    wrong.start();
                }
            }
        });
        /**
         * the button 3 onclick listener that activates the clickers to function and play the sound effect
         */
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button3.getText() == daan){
                    fen++;
                    point.setText("Score: " + fen);
                    gengxin(random.nextInt(questionLength));
                    correct.start();
                }else {
                    end();
                    wrong.start();
                }

            }
        });
        /**
         * the button 4 onclick listener that activates the clickers to function and play the sound effect
         */
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button4.getText() == daan){
                    fen++;
                    point.setText("Score: " + fen);
                    gengxin(random.nextInt(questionLength));
                    correct.start();
                }else {
                    end();
                    wrong.start();
                }

            }
        });
        /**
         * the button 5 onclick listener that activates the clickers to function and play the sound effect
         */
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button5.getText() == daan){
                    fen++;
                    point.setText("Score: " + fen);
                    gengxin(random.nextInt(questionLength));
                    correct.start();
                }else {
                    end();
                    wrong.start();
                }

            }
        });
    }

    /**
     * the method that update the questions once every question has been correctly answered and returns nothing.
     * @param shu
     */
    private void gengxin(int shu) {
        problem.setText(q.obtainq(shu));
        button1.setText(q.oc1(shu));
        button2.setText(q.oc2(shu));
        button3.setText(q.oc3(shu));
        button4.setText(q.oc4(shu));
        button5.setText(q.oc5(shu));
        daan = q.gca(shu);

    }

    /**
     *  the gameOver method that implements game over process once the questions have been incorrectly answered.
     */
    private void end() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is " + fen + " points.")
                .setCancelable(false)
                .setPositiveButton("New Game",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int shu) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                finish();
                            }
                        })
                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int shu) {
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
