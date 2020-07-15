package com.untoldstories.untoldstories;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class MainActivity extends TutorialActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_main);
        addFragment(new Step.Builder().setTitle("Reveal Your Awesome Story")
                .setContent("Share your best story with allover the world.")
                .setBackgroundColor(Color.parseColor("#428fdb")) // int background color
                .setDrawable(R.drawable.writing) // int top drawable
                // .setSummary("This is summary")
                .build());
        addFragment(new Step.Builder().setTitle("Know The Untold Stories")
                .setContent("You can read every time a new story")
                .setBackgroundColor(Color.parseColor("#6462e3")) // int background color
                .setDrawable(R.drawable.reading) // int top drawable
                //  .setSummary("This is summary")
                .build());
        addFragment(new Step.Builder().setTitle("Get Started")
                .setContent("Write and Read the untold stories in the world")
                .setBackgroundColor(Color.parseColor("#f09f69")) // int background color
                .setDrawable(R.drawable.allbooks) // int top drawable
                // .setSummary("This is summary")
                .build());
    }

    @Override
    public void currentFragmentPosition(int position) {

    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void finishTutorial() {
        Intent intent = new Intent(this,ManinHomeActivity.class);
        startActivity(intent);
    }
}