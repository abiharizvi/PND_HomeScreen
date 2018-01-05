package com.example.lenovo.homescreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class EntertainmentActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    EntertainmentAdaptor adaptor;

    List<Entertainment> entertainmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);

        entertainmentList=new ArrayList<>();
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        entertainmentList.add(
                new Entertainment(
                        1,
                        "Bounce",
                        "50% off for Children below 12 years",
                        "Entertainment",
                        "Indoor Trampoline Park",
                        R.drawable.bounce));
        entertainmentList.add(
                new Entertainment(
                        1,
                        "Joyland",
                        "25% off for Children on Children's Day",
                        "Entertainment",
                        "Amusement Park",
                        R.drawable.joyland));
        entertainmentList.add(
                new Entertainment(
                        1,
                        "Sozo Water Park",
                        "40% off on Water Slides",
                        "Entertainment",
                        "Amusement Park",
                        R.drawable.sozowaterpark));

        entertainmentList.add(
                new Entertainment(
                        1,
                        "Transfinity",
                        "55% off on All VR Games",
                        "Entertainment",
                        "VR Gaming",
                        R.drawable.transfinity2));

        entertainmentList.add(
                new Entertainment(
                        1,
                        "Universal Cinemas",
                        "All Movies in only Rs.300 for Students",
                        "Entertainment",
                        "Cinema",
                        R.drawable.universalcinemas));
        entertainmentList.add(
                new Entertainment(
                        1,
                        "Sindbad's Wonderland",
                        "20% off on All Rides",
                        "Entertainment",
                        "Amusement Park",
                        R.drawable.sindbad));

        entertainmentList.add(
                new Entertainment(
                        1,
                        "Super Cinema",
                        "20% off on Beverages",
                        "Entertainment",
                        "Cinema",
                        R.drawable.supercinema));

        entertainmentList.add(
                new Entertainment(
                        1,
                        "Goodi & Joyous Playland",
                        "10% off on Bowling",
                        "Entertainment",
                        "Indoor Amusement Park",
                        R.drawable.goodiandjoyous));

        entertainmentList.add(
                new Entertainment(
                        1,
                        "Fun Factory",
                        "30% off for School Trips",
                        "Entertainment",
                        "Indoor Amusement Park",
                        R.drawable.funfactory));
        entertainmentList.add(
                new Entertainment(
                        1,
                        "Cinestar IMAX",
                        "Flat 40% off on All Movies",
                        "Entertainment",
                        "Cinema",
                        R.drawable.cinestar));


        adaptor=new EntertainmentAdaptor(this, entertainmentList);
        recyclerView.setAdapter(adaptor);


    }
}
