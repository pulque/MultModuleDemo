package com.lizheblogs.multmoduledemo.salesstatus;

import android.os.Bundle;

import com.lizheblogs.common.base.activity.BaseActivity;

public class SalesStatusActivity extends BaseActivity {

    public SalesStatusActivity(){
        name = "销售状况";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales_status);
    }
}
