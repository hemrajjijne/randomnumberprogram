package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] randomNo = new int[10];
        int temp;
        Random rnum = new Random();
        for (int i = 0; i < 10; i++) {
            randomNo[i] = rnum.nextInt(500);
        }

        for (int i = 0; i < randomNo.length; i++) {
            for (int j = i + 1; j < randomNo.length; j++) {
                if (randomNo[i] > randomNo[j]) {
                    temp = randomNo[i];
                    randomNo[i] = randomNo[j];
                    randomNo[j] = temp;
                }
            }
        }
        System.out.println("**Ascending Random Number***");

        for (int i = 0; i < randomNo.length; i++) {
            System.out.println(randomNo[i]);
        }
    }
}