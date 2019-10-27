package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static int gradeCalculator = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //prevents Android on-screen keyboard auto popping up
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    /**
     * @param gradeCalculator keep track of the score to display it in toast message as finalResult...
     * @return gradeCalculator after counting the final score...
     */
    private int calculateScore(int gradeCalculator) {
        //question one answer 22--------------------------------------------------------------------
        RadioButton questionOne = findViewById(R.id.q1a2);
        boolean questionOneAnswerTwo = questionOne.isChecked();

        if (questionOneAnswerTwo) {
            gradeCalculator = gradeCalculator + 1;
        }

        //question two answer egypt and morocco-----------------------------------------------------
        CheckBox questionTwoEgyptCheckBox = findViewById(R.id.egypt);
        boolean questionTwoAnswerEgypt = questionTwoEgyptCheckBox.isChecked();

        CheckBox questionTwoMoroccoCheckBox = findViewById(R.id.morocco);
        boolean questionTwoAnswerMorocco = questionTwoMoroccoCheckBox.isChecked();

        CheckBox questionTwoTurkeyCheckBox = findViewById(R.id.turkey);
        boolean questionTwoAnswerTurkey = questionTwoTurkeyCheckBox.isChecked();

        if (questionTwoAnswerEgypt && questionTwoAnswerMorocco && !questionTwoAnswerTurkey) {
            gradeCalculator = gradeCalculator + 1;
        }

        //question three answer africa--------------------------------------------------------------
        EditText QuestionThree = findViewById(R.id.question3);
        String QuestionThreeAnswer = QuestionThree.getText().toString().toLowerCase();

        if (QuestionThreeAnswer.equals("africa") || QuestionThreeAnswer.equals("افريقيا")) {
            gradeCalculator = gradeCalculator + 1;
        }

        //question four answer is the first---------------------------------------------------------
        RadioButton questionFour = findViewById(R.id.egypt_flag);
        boolean questionFourAnswerThree = questionFour.isChecked();

        if (questionFourAnswerThree) {
            gradeCalculator = gradeCalculator + 1;
        }

        //question five answer 422 million----------------------------------------------------------
        RadioButton questionFive = findViewById(R.id.q5a3);
        boolean questionFiveAnswerThree = questionFive.isChecked();

        if (questionFiveAnswerThree) {
            gradeCalculator = gradeCalculator + 1;
        }

        //question six answer is Alslam alaikum and Marhaba-----------------------------------------
        CheckBox questionSixAnswer1CheckBox = findViewById(R.id.q6a1);
        boolean questionSixAnswerOne = questionSixAnswer1CheckBox.isChecked();

        CheckBox questionSixAnswer2CheckBox = findViewById(R.id.q6a2);
        boolean questionSixAnswerTwo = questionSixAnswer2CheckBox.isChecked();

        CheckBox questionSixAnswer3CheckBox = findViewById(R.id.q6a3);
        boolean questionSixAnswerThree = questionSixAnswer3CheckBox.isChecked();

        if (questionSixAnswerOne && questionSixAnswerTwo && !questionSixAnswerThree) {
            gradeCalculator = gradeCalculator + 1;
        }

        //question seven answer arabic and french---------------------------------------------------
        CheckBox questionSevenArabicCheckBox = findViewById(R.id.q7a1);
        boolean questionSevenAnswerArabic = questionSevenArabicCheckBox.isChecked();

        CheckBox questionSevenFrenchCheckBox = findViewById(R.id.q7a2);
        boolean questionSevenAnswerFrench = questionSevenFrenchCheckBox.isChecked();

        CheckBox questionSevenEnglish = findViewById(R.id.q7a3);
        boolean questionSevenAnswerEnglish = questionSevenEnglish.isChecked();

        if (questionSevenAnswerArabic && questionSevenAnswerFrench && !questionSevenAnswerEnglish) {
            gradeCalculator = gradeCalculator + 1;
        }

        //question eight answer 28------------------------------------------------------------------
        RadioButton questionEight = findViewById(R.id.q8a2);
        boolean questionEightAnswerTwo = questionEight.isChecked();

        if (questionEightAnswerTwo) {
            gradeCalculator = gradeCalculator + 1;
        }

        //question nine answer asia-----------------------------------------------------------------
        EditText QuestionNine = findViewById(R.id.question9);
        String QuestionNineAnswer = QuestionNine.getText().toString().toLowerCase();

        if (QuestionNineAnswer.equals("asia") || QuestionNineAnswer.equals("اسيا")) {
            gradeCalculator = gradeCalculator + 1;
        }

        //question ten answer cairo-----------------------------------------------------------------
        RadioButton questionTen = findViewById(R.id.q10a3);
        boolean questionTenAnswerThree = questionTen.isChecked();

        if (questionTenAnswerThree) {
            gradeCalculator = gradeCalculator + 1;
        }

        return gradeCalculator;
    }

    /**
     * @param view views the score in a toast message...
     */
    public void checkAnswers(View view) {
        int finalResult = calculateScore(gradeCalculator);
        //display when submit button is clicked to submit the answer and display the score message
        Toast.makeText(MainActivity.this, getString(R.string.toast) + " " + finalResult + "/10", Toast.LENGTH_SHORT).show();
    }
}
