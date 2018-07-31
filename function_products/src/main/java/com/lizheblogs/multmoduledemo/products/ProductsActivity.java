package com.lizheblogs.multmoduledemo.products;

import android.os.Bundle;

import com.lizheblogs.common.base.activity.BaseActivity;

public class ProductsActivity extends BaseActivity {

    public ProductsActivity() {
        name = "商品资料";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
    }
}
