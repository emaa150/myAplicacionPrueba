package com.example.esamana.myapplicationprueba.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.esamana.myapplicationprueba.R;
import com.example.esamana.myapplicationprueba.model.Picture;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder>{

    private ArrayList<Picture> pictures;
    private int resource;
    private Activity activity;

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @NonNull
    @Override
    public PictureViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(resource, viewGroup, false);

        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PictureViewHolder pictureViewHolder, int position) {

        Picture picture = pictures.get(position);
        pictureViewHolder.userNameCard.setText(picture.getUserName());
        pictureViewHolder.timeCard.setText(picture.getTime());
        pictureViewHolder.timeCard.setText(picture.getLike_number());

    }

    @Override
    public int getItemCount() {

        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{

        private ImageView pictureCard;
        private TextView userNameCard;
        private TextView timeCard;
        private TextView likeNumberCard;


        public PictureViewHolder(@NonNull View itemView) {
            super(itemView);

            pictureCard = (ImageView) itemView.findViewById(R.id.pictureCard);
            userNameCard = (TextView) itemView.findViewById(R.id.usernameCard);
            timeCard = (TextView) itemView.findViewById(R.id.timeCard);
            likeNumberCard = (TextView) itemView.findViewById(R.id.like_numberCard);
        }
    }
}
