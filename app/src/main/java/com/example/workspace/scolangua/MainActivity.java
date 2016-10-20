package com.example.workspace.scolangua;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the View that shows the family text view
        TextView familyText=(TextView)findViewById(R.id.family);
        // Find the View that shows the colortext text view
        TextView colorText=(TextView)findViewById(R.id.colors);
        // Find the View that shows the food text view
        TextView foodText=(TextView)findViewById(R.id.food);
        // Find the View that shows the number text view
        TextView numberText=(TextView)findViewById(R.id.number);
        // Find the View that shows the phrases text view
        TextView phraseText=(TextView)findViewById(R.id.phrases);
        // Find the View that shows the wordtext text view
        TextView wordText=(TextView)findViewById(R.id.word);

        //Setting the click listener for the textview to load familyActivity
        familyText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(intent);


            }
        });

        //Setting the click listener for the textview to load color Activity
        colorText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ColorActivity.class);
                startActivity(intent);


            }
        });

        //Setting the click listener for the textview to load foodActivity
        foodText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FoodActivity.class);
                startActivity(intent);


            }
        });

        //Setting the click listener for the textview to load numberActivity
        numberText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,NumberActivity.class);
                startActivity(intent);


            }
        });

        //Setting the click listener for the textview to load phraseActivity
        phraseText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(intent);


            }
        });
        //Setting the click listener for the textview to load wordActivity
        wordText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,WordActivity.class);
                startActivity(intent);


            }
        });
    }
}
