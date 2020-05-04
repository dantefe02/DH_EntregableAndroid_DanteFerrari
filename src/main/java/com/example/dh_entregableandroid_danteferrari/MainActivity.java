package com.example.dh_entregableandroid_danteferrari;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecylerViewFragment recylerViewFragment = new RecylerViewFragment();
        pegarFragment(recylerViewFragment);
    }

    private void pegarFragment(RecylerViewFragment recylerViewFragment) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.activityMain_FrameLayout_ContenedorFragment, recylerViewFragment);
        fragmentTransaction.commit();
    }
}
