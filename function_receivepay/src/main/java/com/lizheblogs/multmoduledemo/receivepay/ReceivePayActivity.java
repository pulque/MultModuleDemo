package com.lizheblogs.multmoduledemo.receivepay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lizheblogs.common.base.activity.BaseActivity;

public class ReceivePayActivity extends BaseActivity {

    public ReceivePayActivity() {
        name = "应收应付";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_pay);
    }
}
