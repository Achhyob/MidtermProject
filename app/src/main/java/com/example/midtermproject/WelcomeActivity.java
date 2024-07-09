package com.example.midtermproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WelcomeActivity extends AppCompatActivity {

    RelativeLayout welcomeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_welcome);
        welcomeLayout = findViewById(R.id.Welcome);
        Intent myintent = getIntent();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater my = getMenuInflater();
        my.inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       /* switch (item.getItemId()) {
            case R.id.action_red:
                welcomeLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.action_green:
                welcomeLayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.action_yellow:
                welcomeLayout.setBackgroundColor(Color.YELLOW);
                return true;
            default:

                }
*/

        return super.onOptionsItemSelected(item);
    }
}



