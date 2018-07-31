package com.lizheblogs.multmoduledemo.billinventory;

import android.os.Bundle;

import com.lizheblogs.common.base.activity.BaseActivity;

public class BillInventoryActivity extends BaseActivity {

    public BillInventoryActivity() {
        name = "盘点单";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_inventory);
    }
}
