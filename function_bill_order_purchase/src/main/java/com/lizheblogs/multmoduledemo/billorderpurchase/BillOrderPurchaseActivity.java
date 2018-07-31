package com.lizheblogs.multmoduledemo.billorderpurchase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lizheblogs.common.base.activity.BaseActivity;

public class BillOrderPurchaseActivity extends BaseActivity {

    public BillOrderPurchaseActivity() {
        name = "采购订单";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_order_purchase);
    }
}
