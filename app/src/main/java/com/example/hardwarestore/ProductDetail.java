package com.example.hardwarestore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ProductDetail extends AppCompatActivity {

        List<ProductList> productCatagories;
        ProductList productcatagorydata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.productrecyclerview);
        GridLayoutManager gridLayoutManager= new GridLayoutManager(ProductDetail.this,1);
        recyclerView.setLayoutManager(gridLayoutManager);

        productCatagories = new ArrayList<ProductList>();
        productcatagorydata = new ProductList("Nerolac Paint", "", R.drawable.paintwall);
        productCatagories.add(productcatagorydata);

        productCatagories = new ArrayList<ProductList>();
        productcatagorydata = new ProductList("Asian Paint", "", R.drawable.paintwall);
        productCatagories.add(productcatagorydata);

        productCatagories = new ArrayList<ProductList>();
        productcatagorydata = new ProductList("Burger Paint", "", R.drawable.paintwall);
        productCatagories.add(productcatagorydata);


//        productCatagories.add(productcatagorydata);
//        Adopter_ProductDetail adopter_productDetail = new Adopter_ProductDetail(ProductDetail.this,productCatagories);




    }
}