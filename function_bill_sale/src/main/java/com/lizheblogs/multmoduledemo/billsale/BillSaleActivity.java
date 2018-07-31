package com.lizheblogs.multmoduledemo.billsale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lizheblogs.common.base.activity.BaseActivity;

public class BillSaleActivity extends BaseActivity {

    public BillSaleActivity() {
        name = "销售单";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_sale);
    }
}
