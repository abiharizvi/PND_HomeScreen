package com.example.lenovo.homescreen;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lenovo on 28-Dec-17.
 */

public class FoodPlacesAdaptor extends RecyclerView.Adapter<FoodPlacesAdaptor.FoodPlacesViewHolder> {


    private Context mCtx;
    private List<FoodPlaces> foodPlacesList;

    public FoodPlacesAdaptor(Context mCtx, List<FoodPlaces> foodPlacesList) {
        this.mCtx = mCtx;
        this.foodPlacesList = foodPlacesList;
    }

    @Override
    public FoodPlacesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout_foodplaces, null);
        FoodPlacesViewHolder holder = new FoodPlacesViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(FoodPlacesViewHolder holder, int position) {
        FoodPlaces foodPlaces = foodPlacesList.get(position);

        holder.textViewTitle.setText(foodPlaces.getTitle());
        holder.textViewDesc.setText(foodPlaces.getShortdesc());
        holder.textViewCategory.setText(String.valueOf(foodPlaces.getCategory()));
        holder.textViewSubcategory.setText(String.valueOf(foodPlaces.getSubcategory()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(foodPlaces.getImage() , null));

    }

    @Override
    public int getItemCount() {
        return foodPlacesList.size();
    }

    class FoodPlacesViewHolder extends RecyclerView.ViewHolder
    {

        ImageView imageView;
        TextView textViewTitle , textViewDesc, textViewCategory, textViewSubcategory;

        public FoodPlacesViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewCategory = itemView.findViewById(R.id.textViewCategory);
            textViewSubcategory = itemView.findViewById(R.id.textViewSubcategory);

        }
    }

}
