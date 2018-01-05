package com.example.lenovo.homescreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ApparelActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ApparelAdaptor adaptor;

    List<Apparel> apparelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apparel);

        apparelList =new ArrayList<>();
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        apparelList.add(
                new Apparel(
                        1,
                        "Khaadi",
                        "50% off on Pret",
                        "Apparel",
                        "Pret",
                        R.drawable.khaadi));
        apparelList.add(
                new Apparel(
                        1,
                        "Bonanza",
                        "10% off on Men's Wear",
                        "Apparel",
                        "Men's Wear",
                        R.drawable.bonanza));
        apparelList.add(
                new Apparel(
                        1,
                        "Limelight",
                        "40% off on Accessories",
                        "Apparel",
                        "Accessories",
                        R.drawable.limelight));
        apparelList.add(
                new Apparel(
                        1,
                        "J.",
                        "10% off on Teen's Wear",
                        "Apparel",
                        "Teen's Wear",
                        R.drawable.jdot));
        apparelList.add(
                new Apparel(
                        1,
                        "Borjan",
                        "10% off on Bridal Collection",
                        "Apparel",
                        "Footwear",
                        R.drawable.borjan));
        apparelList.add(
                new Apparel(
                        1,
                        "Ego",
                        "20% off on Pret",
                        "Apparel",
                        "Pret",
                        R.drawable.ego));
        apparelList.add(
                new Apparel(
                        1,
                        "Uniworth",
                        "15% off on Formal Wear",
                        "Apparel",
                        "Formal Wear",
                        R.drawable.uniworth));
        apparelList.add(
                new Apparel(
                        1,
                        "Sapphire",
                        "30% off on Unstitched Collection",
                        "Apparel",
                        "Unstitched Collection",
                        R.drawable.sapphire));
        apparelList.add(
                new Apparel(
                        1,
                        "Metro Shoes",
                        "10% off on Men's Footwear",
                        "Apparel",
                        "Footwear",
                        R.drawable.metroshoes));
        apparelList.add(
                new Apparel(
                        1,
                        "Nishat Linen",
                        "Flat 50% off on All Pret Stock",
                        "Apparel",
                        "Pret",
                        R.drawable.nishatlinen));

        adaptor=new ApparelAdaptor(this, apparelList);
        recyclerView.setAdapter(adaptor);


    }
}
