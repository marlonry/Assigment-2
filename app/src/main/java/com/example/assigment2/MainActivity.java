package com.example.assigment2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;

    TextView score, question;

    private Questions questions = new Questions();

    private String cAnswer;
    private int cScore;
    private int questionsLength = questions.questions.length;

    Random r;

    @Override

    /**
     * <p>This is the main entry point for the application</p>
     * @author Marlon
     * @param Bundle savedInstanceState
     * @return void
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("Score: 0" );

        updateQuestion(r.nextInt(questionsLength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.getText() == cAnswer) {
                    cScore++;
                    score.setText("Score: " + cScore);
                    updateQuestion(r.nextInt(questionsLength));
                } else {
                    gameOver();
                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2.getText() == cAnswer) {
                    cScore++;
                    score.setText("Score:" + cScore);
                    updateQuestion(r.nextInt(questionsLength));
                } else {
                    gameOver();
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer3.getText() == cAnswer) {
                    cScore++;
                    score.setText("Score:" + cScore);
                    updateQuestion(r.nextInt(questionsLength));
                } else {
                    gameOver();
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer4.getText() == cAnswer) {
                    cScore++;
                    score.setText("Score:" + cScore);
                    updateQuestion(r.nextInt(questionsLength));
                } else {
                    gameOver();
                }
            }
        });
    }

    /**
     * <p>This the method that shows the game over screen to initiate a new game or finish the current game</p>
     * @author Marlon
     * @return void
     */
    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is " + cScore + "points.")
                .setCancelable(false)
                .setPositiveButton("New Game",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                finish();
                            }
                        })
                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        }
                );
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    /**
     * <p>This method updates the current question </p>
     * @author Marlon
     * @param num
     * @return void
     */
    private void updateQuestion(int num) {
        question.setText(questions.getQuestion(num));
        answer1.setText(questions.getChoice0(num));
        answer2.setText(questions.getChoice1(num));
        answer3.setText(questions.getChoice2(num));
        answer4.setText(questions.getChoice3(num));

        cAnswer = questions.getCorrectAnswer(num);
    }
}
