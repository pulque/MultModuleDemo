package com.lizheblogs.multmoduledemo.accounts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lizheblogs.common.base.activity.BaseActivity;

public class AccountsActivity extends BaseActivity {

    public AccountsActivity() {
        name = "银行账户";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts);
    }
}
