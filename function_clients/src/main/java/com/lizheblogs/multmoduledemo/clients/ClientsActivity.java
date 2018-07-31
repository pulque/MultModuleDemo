package com.lizheblogs.multmoduledemo.clients;

import android.os.Bundle;

import com.lizheblogs.common.base.activity.BaseActivity;

public class ClientsActivity extends BaseActivity {

    public ClientsActivity() {
        name = "往来单位";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clients);
    }
}
