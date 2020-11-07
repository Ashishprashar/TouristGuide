package com.android.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
interface OnRecyclerViewItemClickListener{
    public void onRecycerViewItemClickListener(int p,int id);
}
public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder>{

    private ArrayList<Place> place;
    Place p;
    Context context;
    private OnRecyclerViewItemClickListener listener;

    public PlaceAdapter(ArrayList<Place> place) {
            this.place=place;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView placeImage;
        TextView placeText;
        public ViewHolder(@NonNull View v) {
            super(v);
            placeImage =v.findViewById(R.id.place_image);
            placeText =v.findViewById(R.id.place_name);
        }
    }
    @NonNull
    @Override
    public PlaceAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_items,parent,false);
        context=parent.getContext();
        return new ViewHolder(view);
    }
public  void setOnItemClickListener(OnRecyclerViewItemClickListener listener){
this.listener=listener;
}
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

            holder.placeImage.setImageResource(place.get(position).getImageResourcesId());
            holder.placeText.setText(place.get(position).getPlaceName());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(place.get(position).getUrl()));
                    context.startActivity(intent);
                }
            });

    }

    @Override
    public int getItemCount() {
        return place.size();
    }


}
