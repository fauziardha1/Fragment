package com.example.myflexiblefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager mFragmentManager = getSupportFragmentManager(); // untuk mengorganisir fragments
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction(); // untuk menambahkan,mengurangi,hapus fragments
        HomeFragment mHomeFragment = new HomeFragment(); // object fragment home sederhana

        Fragment fragment = mFragmentManager.findFragmentByTag(HomeFragment.class.getSimpleName()); // object fragment yang akan menampung fragment2 lain.
        if (!(fragment instanceof HomeFragment)){
            mFragmentTransaction.add(R.id.frame_container, mHomeFragment,HomeFragment.class.getSimpleName()); // menambahkan fragment ke mainactivity
            Log.d("MyFlexibleFragment","Fragment Name : "+HomeFragment.class.getSimpleName());
            mFragmentTransaction.commit(); // menampilkan hasil penambahan fragment
        }
    }
}
