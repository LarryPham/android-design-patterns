package com.capsule.patterns.criteria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mResultTextView = (TextView) findViewById(R.id.result_text_view);

        List<Ingredient> ingredients = new ArrayList<Ingredient>();
        ingredients.add(new Ingredient("Cheddar",  "Locally produced", true));
        ingredients.add(new Ingredient("Ham", "Cheshire", false));
        ingredients.add(new Ingredient("Tomato", "Kent", true));
        ingredients.add(new Ingredient("Turkey", "Locally produced", false));

        Filter local = new LocalFilter();
        Filter nonLocal = new NonLocalFilter();
        Filter vegeterian = new VegeterianFilter();
        Filter localAndVegeterian = new AndCriteria(local, vegeterian);
        Filter localOrVegeterian = new OrCriteria(local, vegeterian);

        printIngredients(local.meetCriteria(ingredients), "LOCAL:\n");
        printIngredients(nonLocal.meetCriteria(ingredients), "\nNOT LOCAL:\n");
        printIngredients(vegeterian.meetCriteria(ingredients), "\nVEGETARIAN:\n");
        printIngredients(localAndVegeterian.meetCriteria(ingredients), "\nLOCAL VEGETARIAN:\n");
        printIngredients(localOrVegeterian.meetCriteria(ingredients), "\nENVIRONMENTALLY FRIENDLY:\n");
    }

    public void printIngredients(List<Ingredient> ingredients, String header) {
        mResultTextView.append(header);
        for (Ingredient ingredient: ingredients) {
            mResultTextView.append(ingredient.getName() + " " + ingredient.getLocal() + "\n");
        }
    }
}
