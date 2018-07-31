package com.lizheblogs.multmoduledemo.billpurchase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lizheblogs.common.base.activity.BaseActivity;

public class BillPurchaseActivity extends BaseActivity {

    public BillPurchaseActivity() {
        name = "采购单";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_purchase);
    }
}
