package com.example.hardwarestore;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductListAdopter extends RecyclerView.Adapter <ProductViewHolder> {

    private Context mContext;
    private List<ProductList> mProductList;

    ProductListAdopter(Context mContext, List<ProductList> mProductList) {
        this.mContext = mContext;
        this.mProductList = mProductList;

    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_row_item, parent, false);
        return new ProductViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        holder.imageView.setImageResource(mProductList.get(position).getProductImage());
        holder.textView.setText(mProductList.get(position).getProductName());

        holder.mCardView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(mContext, ProductDetail.class);
                mIntent.putExtra("Title", mProductList.get(holder.getAdapterPosition()).getProductName());
                mIntent.putExtra("Description", mProductList.get(holder.getAdapterPosition()).getProductDescription());
                mIntent.putExtra("Image", mProductList.get(holder.getAdapterPosition()).getProductImage());
                mContext.startActivity(mIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mProductList.size();
    }
}

class ProductViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        CardView mCardView;


    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView= itemView.findViewById(R.id.imageview);
        textView =itemView.findViewById(R.id.textview);
        mCardView = itemView.findViewById(R.id.cardview);

    }

}
