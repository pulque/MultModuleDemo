package com.lizheblogs.multmoduledemo.billordersale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lizheblogs.common.base.activity.BaseActivity;

public class BillOrderSaleActivity extends BaseActivity {

    public BillOrderSaleActivity() {
        name = "销售订单";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_order_sale);
    }
}
