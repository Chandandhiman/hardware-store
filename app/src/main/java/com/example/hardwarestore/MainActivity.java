package com.example.hardwarestore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;

import com.example.hardwarestore.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {

    GridView g;
    List< ProductList > mProductList;
    ProductList mProductListData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//ViewPager Code Start From Here
        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewpager);
        ImageAdptor adpterView = new ImageAdptor(this);
        mViewPager.setAdapter(adpterView);
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                mViewPager.post(new Runnable() {
                    @Override
                    public void run() {
                        mViewPager.setCurrentItem((mViewPager.getCurrentItem() + 1));
                    }
                });
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 3000, 3000);
//ViewPager Code Ended


//Recyclerview Product List code start from here

        RecyclerView mrecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        GridLayoutManager mgridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        mrecyclerView.setLayoutManager(mgridLayoutManager);

        mProductList = new ArrayList<>();
        mProductListData = new ProductList("Wall Paint", "", R.drawable.paintwall);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Cement Primer", "", R.drawable.primer);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Synthetic Paint", "", R.drawable.syntheticpaint);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Wood Primer", "", R.drawable.woodprimer);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Metal Primer", "", R.drawable.matelprimer);
        mProductList.add(mProductListData);

        mProductListData = new ProductList("Aluminium Paint", "", R.drawable.aluminiumpaint);
        mProductList.add(mProductListData);

        mProductListData = new ProductList("Touch Wood", "", R.drawable.touchwood);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Paint Brush", "", R.drawable.paintbrush);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Tarpeen Oil", "", R.drawable.tarpeenoil);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Thinner Oil", "", R.drawable.thineroil);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Varnish", "", R.drawable.varnish);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Wall Putty", "", R.drawable.wallputty);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Samosam", "", R.drawable.logo);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Board", "", R.drawable.board);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Wood Ply", "", R.drawable.ply);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Sunmica", "", R.drawable.sunmica);
        mProductList.add(mProductListData);

        mProductListData = new ProductList("Fevicole", "", R.drawable.favicol);
        mProductList.add(mProductListData);

        mProductListData = new ProductList("Nails", "", R.drawable.nails);
        mProductList.add(mProductListData);

        mProductListData = new ProductList("Screw", "", R.drawable.screw);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Door Handle", "", R.drawable.doorhandles);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Tower Bolt", "", R.drawable.towerbolt);
        mProductList.add(mProductListData);


        mProductListData = new ProductList("Aldrop", "", R.drawable.aldrop);
        mProductList.add(mProductListData);

        mProductListData = new ProductList("Hings", "", R.drawable.hings);
        mProductList.add(mProductListData);

        mProductListData = new ProductList("Winding Wire", "", R.drawable.windingwire);
        mProductList.add(mProductListData);

        ProductListAdopter productListAdopter = new ProductListAdopter(MainActivity.this, mProductList);
        mrecyclerView.setAdapter(productListAdopter);
//Recyclerview Product List code Ended

//Bottom Navigation Bar Home, Profile, Notifications, Cart code start from here
   BottomNavigationView bottomNavigationView =(BottomNavigationView) findViewById(R.id.bottomnavigationview);
   bottomNavigationView.setSelectedItemId(R.id.mhome);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {


            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.profile:
                            startActivity(new Intent(getApplicationContext(),Profile.class));
                            overridePendingTransition(0,0);
                            return true;

                    case R.id.mhome:
                        return true;

                    case R.id.notifications:
                        startActivity(new Intent(getApplicationContext(),Notifications.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.cart:
                        startActivity(new Intent(getApplicationContext(),Cart.class));
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });
//Bottom Navigation Bar Home, Profile, Notifications, Cart code Ended


    }
}