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

public class EntertainmentAdaptor extends RecyclerView.Adapter<EntertainmentAdaptor.EntertainmentViewHolder> {


    private Context mCtx;
    private List<Entertainment> entertainmentList;

    public EntertainmentAdaptor(Context mCtx, List<Entertainment> entertainmentList) {
        this.mCtx = mCtx;
        this.entertainmentList = entertainmentList;
    }

    @Override
    public EntertainmentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout_entertainment, null);
        EntertainmentViewHolder holder = new EntertainmentViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(EntertainmentViewHolder holder, int position) {
        Entertainment entertainment= entertainmentList.get(position);

        holder.textViewTitle.setText(entertainment.getTitle());
        holder.textViewDesc.setText(entertainment.getShortdesc());
        holder.textViewCategory.setText(String.valueOf(entertainment.getCategory()));
        holder.textViewSubcategory.setText(String.valueOf(entertainment.getSubcategory()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(entertainment.getImage() , null));

    }

    @Override
    public int getItemCount() {
        return entertainmentList.size();
    }

    class EntertainmentViewHolder extends RecyclerView.ViewHolder
    {

        ImageView imageView;
        TextView textViewTitle , textViewDesc, textViewCategory, textViewSubcategory;

        public EntertainmentViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewCategory = itemView.findViewById(R.id.textViewCategory);
            textViewSubcategory = itemView.findViewById(R.id.textViewSubcategory);

        }
    }

}
