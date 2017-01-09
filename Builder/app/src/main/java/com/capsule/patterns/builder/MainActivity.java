package com.capsule.patterns.builder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String DEBUG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SandwichBuilder builder = new SandwichBuilder();
        Sandwich custom = new Sandwich();

        custom = builder.build(custom, new Bun());
        custom = builder.build(custom, new CreamCheese());

        Log.d(DEBUG_TAG, "CUSTOMIZED");
        custom.getSandwich();
        custom.getCalories();

        Sandwich offTheShelf = SandwichBuilder.readyMade();
        Log.d(DEBUG_TAG, "READY MADE");
        offTheShelf.getSandwich();
        offTheShelf.getCalories();
    }
}
