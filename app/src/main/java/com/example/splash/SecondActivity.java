package com.example.splash;

import android.app.Activity;
import android.content.ContentProviderClient;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

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
            btnfilm.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) { // bouton défini avant v.getTag() = récupération du tag du bouton
                    //affichage du numero du bouton
                    //Toast.makeText(getApplicationContext(), "clique sur " + v.getTag(), Toast.LENGTH_SHORT).show(); // this
                    Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                    intent.putExtra("idbtnfilm", (Integer) v.getTag()); // sert dans la ThirdActivity
                    startActivity(intent);
                    overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
                }
            });
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
