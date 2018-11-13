package org.justdev.randomeatery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int NUMOFEATERY = 22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStatrButtonClicked(View v) {
        TextView output = (TextView)findViewById(R.id.Output);
        Random random = new Random();
        String[] eatery = {"학식", "버거킹", "맘스터치", "육삼냉면", "김밥천국", "한솥", "봉구스밥버거", "맥도날드", "현대옥", "귀신반점", "덕천순대", "연다라순대", "헤이루", "순이네", "참돈", "갈무리", "황제보쌈", "층만치킨", "꼬꼬아찌", "부대통령", "얌샘", "세마을"};

        output.setText(eatery[random.nextInt(NUMOFEATERY)]);
    }
}
