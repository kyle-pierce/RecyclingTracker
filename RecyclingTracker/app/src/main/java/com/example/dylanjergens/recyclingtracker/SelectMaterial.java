package com.example.dylanjergens.recyclingtracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Jacob on 10/21/2017.
 */
public class SelectMaterial extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_material);
    }

    public void selectedPaper()
    {
        handleSelection("Paper");
    }

    public void selectedPlastic()
    {
        handleSelection("Plastic");
    }

    public void selectedGlass()
    {
        handleSelection("Glass");
    }

    public void handleSelection(String material)
    {
        Intent intent = new Intent(getApplicationContext(), SelectQuantity.class);
        intent.putExtra("material", material);
        startActivity(intent);
    }
}
