package com.example.hardwarestore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adopter_ProductDetail extends BaseAdapter {
    int quantity;
    Context c;

    int image[]= {R.drawable.logo,R.drawable.logo,R.drawable.logo};
    String brand[]={"Nerolac","Asian","Burger"};



    @Override
    public int getCount() {return 0;}

    @Override
    public Object getItem(int i) {return null;}

    @Override
    public long getItemId(int i) {return 0;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater =(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.productgridview,null);
//        ImageView imageView =view.findViewById(R.id.imageview);
//        TextView textView =view.findViewById(R.id.textview);
//
//        textView.setText(brand[i]);
//        imageView.setImageResource(image[i]);

        return view;}

}
