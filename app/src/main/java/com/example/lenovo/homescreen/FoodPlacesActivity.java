package com.example.lenovo.homescreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FoodPlacesActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    FoodPlacesAdaptor adaptor;

    List<FoodPlaces> foodPlacesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_places);
        foodPlacesList=new ArrayList<>();
        recyclerView =(RecyclerView) findViewById(R.id.recyclerView2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "McDonald's",
                        "50% off on Happy Meal",
                        "Food Place",
                        "Fast Food",
                        R.drawable.mcdonalds));

        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "Rina's Kitchenette",
                        "40% off on Deal of the Day",
                        "Food Place",
                        "Italian Cuisine",
                        R.drawable.rinaskitchenette));

        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "Options Exotic Restaurant",
                        "20% off on Desi Cuisine",
                        "Food Place",
                        "Continental",
                        R.drawable.optionsrestaurant));

        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "Nando's",
                        "60% off on Deal of the Day",
                        "Food Place",
                        "Fast Food",
                        R.drawable.nandos));

        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "Bundu Khan",
                        "20% off on Chef's Recommendation",
                        "Food Place",
                        "Continental",
                        R.drawable.bundukhan));

        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "Howdy",
                        "40% off on Beef Burgers",
                        "Food Place",
                        "Fast Food",
                        R.drawable.howdy));
        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "Hardees",
                        "30% off on All Deals",
                        "Food Place",
                        "Fast Food",
                        R.drawable.hardees));

        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "Gourmet Restaurant",
                        "20% off on Desserts",
                        "Food Place",
                        "Continental",
                        R.drawable.gourmetrestaurant));
        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "Gloria Jean's",
                        "25% off on All Shakes",
                        "Food Place",
                        "Coffee Shop",
                        R.drawable.gloriajeans));
        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "Ziafat",
                        "25% off on All New Dishes",
                        "Food Place",
                        "Continental",
                        R.drawable.ziafat));

        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "OPTP",
                        "20% off on Burgers",
                        "Food Place",
                        "Fast Food",
                        R.drawable.optp));
        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "Chaaye Khana",
                        "25% off on All New Dishes",
                        "Food Place",
                        "Continental",
                        R.drawable.chaayekhaana));
        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "Bombay Chowpatty",
                        "20% off on All Chaats",
                        "Food Place",
                        "Continental",
                        R.drawable.bombaychowpatty));
        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "Baskin Robbins",
                        "25% off on All New Flavours",
                        "Food Place",
                        "Ice Cream Parlour",
                        R.drawable.baskinrobbins));
        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "Taipei",
                        "45% off on All Italian Dishes",
                        "Food Place",
                        "Continental & Chinese",
                        R.drawable.taipei));
        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "Tuscany Courtyard",
                        "20% off on All Italian Dishes",
                        "Food Place",
                        "Italian",
                        R.drawable.tuscanycourtyard));
        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "Arcadian Cafe",
                        "25% off on Pastas of All Types",
                        "Food Place",
                        "Italian",
                        R.drawable.arcadiancafe));
        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "Subway",
                        "25% off on 6' Sandwiches",
                        "Food Place",
                        "Fast Food",
                        R.drawable.subway));
        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "The Rice Bowl",
                        "40% off on New Dishes",
                        "Food Place",
                        "Chinese",
                        R.drawable.ricebowl));
        foodPlacesList.add(
                new FoodPlaces(
                        1,
                        "English Tea House",
                        "10% off on Breakfast Items",
                        "Food Place",
                        "Fine Dining",
                        R.drawable.englishtehouse));


        adaptor = new FoodPlacesAdaptor(this, foodPlacesList);
        recyclerView.setAdapter(adaptor);

    }
}




