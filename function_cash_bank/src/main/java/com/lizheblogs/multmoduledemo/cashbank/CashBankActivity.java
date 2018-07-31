package com.lizheblogs.multmoduledemo.cashbank;

import android.os.Bundle;

import com.lizheblogs.common.base.activity.BaseActivity;

public class CashBankActivity extends BaseActivity {

    public CashBankActivity() {
        name = "现金银行";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_bank);
    }
}
