package com.lizheblogs.multmoduledemo.inventory_status;

import android.os.Bundle;

import com.lizheblogs.common.base.activity.BaseActivity;

public class InventoryStatusActivity extends BaseActivity {

    public InventoryStatusActivity() {
        name = "库存状况";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
