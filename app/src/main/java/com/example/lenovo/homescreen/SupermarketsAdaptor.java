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

public class SupermarketsAdaptor extends RecyclerView.Adapter<SupermarketsAdaptor.SupermarketsViewHolder> {


    private Context mCtx;
    private List<Supermarkets> supermarketsList;

    public SupermarketsAdaptor(Context mCtx, List<Supermarkets> supermarketsList) {
        this.mCtx = mCtx;
        this.supermarketsList = supermarketsList;
    }

    @Override
    public SupermarketsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout_supermarkets, null);
        SupermarketsViewHolder holder = new SupermarketsViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(SupermarketsViewHolder holder, int position) {
        Supermarkets supermarkets= supermarketsList.get(position);

        holder.textViewTitle.setText(supermarkets.getTitle());
        holder.textViewDesc.setText(supermarkets.getShortdesc());
        holder.textViewCategory.setText(String.valueOf(supermarkets.getCategory()));
        holder.textViewSubcategory.setText(String.valueOf(supermarkets.getSubcategory()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(supermarkets.getImage() , null));

    }

    @Override
    public int getItemCount() {
        return supermarketsList.size();
    }

    class SupermarketsViewHolder extends RecyclerView.ViewHolder
    {

        ImageView imageView;
        TextView textViewTitle , textViewDesc, textViewCategory, textViewSubcategory;

        public SupermarketsViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewCategory = itemView.findViewById(R.id.textViewCategory);
            textViewSubcategory = itemView.findViewById(R.id.textViewSubcategory);

        }
    }

}
