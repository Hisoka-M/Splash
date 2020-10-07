package com.example.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

// activité principale
public class SecondActivity extends Activity {
    LinearLayout ll_films;
    Button btnfilm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ll_films = findViewById(R.id.ll_films);
        for(int i = 0; i < 15; i++){
            btnfilm = new Button(this); // activité : activity_second
            btnfilm.setTag(i+1);
            btnfilm.setText("film  " + btnfilm.getTag());
            btnfilm.setAllCaps(false);
            ll_films.addView(btnfilm);
        }
    }
    /*public void next(View view){
        //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.fr")); // accès url
        Intent intent = new Intent(this, ThirdActivity.class);
        //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK + Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }*/
}
