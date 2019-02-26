package com.example.esamana.myapplicationprueba.View.fragment;


import android.app.Notification;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.pm.PackageInfoCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.esamana.myapplicationprueba.R;
import com.example.esamana.myapplicationprueba.adapter.PictureAdapterRecyclerView;
import com.example.esamana.myapplicationprueba.model.Picture;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        showToolbar("Home", false, view);
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        picturesRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buidPictures(), R.layout.cardview_picture, getActivity());

        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }

     public ArrayList<Picture> buidPictures(){

         ArrayList<Picture> pictures = new ArrayList<>();
         pictures.add(new Picture("http://smartmovepro.net/img/caracteristicas/google_apps.png", "EFISAT", "4 días", "3"));
         pictures.add(new Picture("https://www.diariomotor.com/imagenes/picscache/1920x1600c/ferrari-812-superfast-exterior-mdm-00014_1920x1600c.jpg", "SMARTMOVE", "2 días", "5"));
         pictures.add(new Picture("https://viapais.com.ar/media/cache/resolve/medium/https://viapais.com.ar/files/2017/12/20171219090513_30926875_0_body.jpg", "EMA", "7 días", "16"));
        return pictures;
     }

    public void  showToolbar(String titulo, Boolean bton_volver, View view){

       Toolbar myToolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(myToolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(titulo);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(bton_volver);


    }

}
