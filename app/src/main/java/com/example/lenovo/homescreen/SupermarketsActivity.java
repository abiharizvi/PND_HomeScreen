package com.example.lenovo.homescreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SupermarketsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    SupermarketsAdaptor adaptor;

    List<Supermarkets> supermarketsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supermarkets);

        supermarketsList = new ArrayList<>();
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        supermarketsList.add(
                new Supermarkets(
                        1,
                        "Al-Fatah",
                        "50% off on All Grocery",
                        "Supermarket",
                        "Grocery",
                        R.drawable.alfatah));
        supermarketsList.add(
               new Supermarkets(
                       1,
                "Metro Cash & Carry",
                "20% off on Electronics",
                "Supermarket",
                "Electronics",
                R.drawable.metro));
       supermarketsList.add(
        new Supermarkets(
                1,
                "Swera Departmental Store",
                "20% off on Crockery",
                "Supermarket",
                "Crockery",
                R.drawable.swera));
supermarketsList.add(
        new Supermarkets(
                1,
                "Greenvalley Premium Hypermarket",
                "20% off on Vegetables",
                "Supermarket",
                "Vegetables",
                R.drawable.greenvalley));
       supermarketsList.add(
        new Supermarkets(
                1,
                "Esajee's",
                "15% off on Dairy Products",
                "Supermarket",
                "Dairy Products",
                R.drawable.esajees));
       supermarketsList.add(
        new Supermarkets(
                1,
                "Rainbow Cash & Carry",
                "20% off on Crockery",
                "Supermarket",
                "Crockery",
                R.drawable.rainbowcashandcarry));
        supermarketsList.add(
       new Supermarkets(
                1,
                "Rahat Bakers & Departmental Store",
                "40% off on Bakery Items",
                "Supermarket",
                "Bakery",
                R.drawable.rahat));
        supermarketsList.add(
        new Supermarkets(
                1,
                "CSD",
                "20% off on Cosmetics",
                "Supermarket",
                "Cosmetics",
                R.drawable.csd));
        supermarketsList.add(
        new Supermarkets(
                1,
                "Hyperstar",
                "20% off on Toys",
                "Supermarket",
                "Toys",
                R.drawable.hyperstar));
        supermarketsList.add(
        new Supermarkets(
                1,
                "Imtiaz Supermarket",
                "20% off on Sports Items",
                "Supermarket",
                "Sports Items",
                R.drawable.imtiazsupermarket));


        adaptor=new SupermarketsAdaptor(this, supermarketsList);
        recyclerView.setAdapter(adaptor);


    }
}
