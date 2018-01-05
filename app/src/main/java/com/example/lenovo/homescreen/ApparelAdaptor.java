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

public class ApparelAdaptor extends RecyclerView.Adapter<ApparelAdaptor.ApparelViewHolder> {


    private Context mCtx;
    private List<Apparel> apparelList;

    public ApparelAdaptor(Context mCtx, List<Apparel> apparelList) {
        this.mCtx = mCtx;
        this.apparelList = apparelList;
    }

    @Override
    public ApparelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout_apparel, null);
        ApparelViewHolder holder = new ApparelViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ApparelViewHolder holder, int position) {
        Apparel apparel = apparelList.get(position);

        holder.textViewTitle.setText(apparel.getTitle());
        holder.textViewDesc.setText(apparel.getShortdesc());
        holder.textViewCategory.setText(String.valueOf(apparel.getCategory()));
        holder.textViewSubcategory.setText(String.valueOf(apparel.getSubcategory()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(apparel.getImage() , null));

    }

    @Override
    public int getItemCount() {
        return apparelList.size();
    }

    class ApparelViewHolder extends RecyclerView.ViewHolder
    {

        ImageView imageView;
        TextView textViewTitle , textViewDesc, textViewCategory, textViewSubcategory;

        public ApparelViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewCategory = itemView.findViewById(R.id.textViewCategory);
            textViewSubcategory = itemView.findViewById(R.id.textViewSubcategory);

        }
    }

}
