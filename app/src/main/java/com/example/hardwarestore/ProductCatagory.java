package com.example.hardwarestore;

public class ProductCatagory {

    private String ProductBrandName;
    private String ProductBrandDescription;
    private int ProductBrandImage;

    public void PrductBrand(String ProductName, String ProductDescription, int ProductImage) {
        this.ProductBrandName = ProductName;
        this.ProductBrandDescription = ProductDescription;
        this.ProductBrandImage = ProductImage;
    }

    public String getProductName() {
        return ProductBrandName;
    }

    public String getProductDescription() {
        return ProductBrandDescription;
    }

    public int getProductImage() {
        return ProductBrandImage;
    }
}
