package com.capsule.patterns.decorator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String DEBUG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bread bagel = new Bagel();
        LowFatSpread spread = new LowFatSpread(bagel);
        Toasted toasted = new Toasted(spread);
        Open open = new Open(toasted);

        Log.d(DEBUG_TAG, open.getDescription() + " " + open.getKCal());
    }
}
