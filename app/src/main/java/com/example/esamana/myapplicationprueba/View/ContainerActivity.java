package com.example.esamana.myapplicationprueba.View;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.esamana.myapplicationprueba.R;
import com.example.esamana.myapplicationprueba.View.fragment.HomeFragment;
import com.example.esamana.myapplicationprueba.View.fragment.ProfileFragment;
import com.example.esamana.myapplicationprueba.View.fragment.SearchFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;


public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        BottomBar bottonbar = (BottomBar) findViewById(R.id.buttomBar);
        bottonbar.setDefaultTab(R.id.tab_home);

        bottonbar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(int tabId) {

                switch (tabId){

                    case R.id.tab_home:
                        HomeFragment homeFragment = new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.containerFrame, homeFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();

                        break;

                    case R.id.tab_profile:
                       ProfileFragment profileFragment = new ProfileFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.containerFrame, profileFragment)
                               .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();

                          break;

                       case R.id.tab_search:
                           SearchFragment searchFragment = new SearchFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.containerFrame, searchFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();

                          break;



                }
            }
        });

    }
}
