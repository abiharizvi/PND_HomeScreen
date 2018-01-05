package com.example.lenovo.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {


    public void food ( View view )
    {

        Intent i = new Intent(MainActivity.this, FoodPlacesActivity.class);
        startActivity(i);

    }
    public void apparel (View view)
    {
        Intent i = new Intent(MainActivity.this, ApparelActivity.class);
        startActivity(i);
    }
    public void supermarkets (View view)
    {
        Intent i = new Intent(MainActivity.this, SupermarketsActivity.class);
        startActivity(i);
    }
    public void entertainment (View view)
    {
        Intent i = new Intent(MainActivity.this, EntertainmentActivity.class);
        startActivity(i);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
