package com.lizheblogs.common.base.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.lizheblogs.common.ActivityUtils;
import com.lizheblogs.common.R;

import java.util.ArrayList;

/**
 * Created by LiZhe on 2018-07-31.
 * com.lizheblogs.common.base.activity
 */
public class MainBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView functionGV = findViewById(R.id.functionGV);

        ArrayList<String> functions = ActivityUtils.getFunctions();
        functionGV.setAdapter(new ItemAdapter(this, functions));
    }
}
