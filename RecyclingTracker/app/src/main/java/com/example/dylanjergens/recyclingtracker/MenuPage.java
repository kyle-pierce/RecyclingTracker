package com.example.dylanjergens.recyclingtracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by pierceka on 10/21/17.
 */

public class MenuPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);
    }

    public void selectedLog()
    {
        startActivity(new Intent(MenuPage.this, SelectMaterial.class));
    }

    public void selectedStats()
    {
        startActivity(new Intent(MenuPage.this, ViewStats.class));
    }

    public void selectedFriends()
    {
        startActivity(new Intent(MenuPage.this, ViewFriends.class));
    }
}