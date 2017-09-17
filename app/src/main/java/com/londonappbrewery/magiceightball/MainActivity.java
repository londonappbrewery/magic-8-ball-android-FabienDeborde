package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Store images and button element
        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        Button myButton = (Button) findViewById(R.id.askButton);

        // Add event listener to the button
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define random object
                Random randomNumberGenerator = new Random();
                // Store a random number between 0 and 4
                int number = randomNumberGenerator.nextInt(4);
                // Set the new image
                ballDisplay.setImageResource(ballArray[number]);
            }
        });



    }
}
