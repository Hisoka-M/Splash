package com.example.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ThirdActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void retour(View view){
        //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.fr")); // accès url
        Intent intent = new Intent(this, SecondActivity.class);
        //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK + Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        // voir dans res => anim => slide_in_right.xml, slide_out_left
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
