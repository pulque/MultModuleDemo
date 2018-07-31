package com.lizheblogs.multmoduledemo.staff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lizheblogs.common.base.activity.BaseActivity;

public class StaffActivity extends BaseActivity {

    public StaffActivity(){
        name = "职员";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);
    }
}
