package com.lizheblogs.multmoduledemo.retailstatus;

import android.os.Bundle;

import com.lizheblogs.common.base.activity.BaseActivity;

public class RetailStatusActivity extends BaseActivity {

    public RetailStatusActivity() {
        name = "零售状况";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retail_status);
    }
}
