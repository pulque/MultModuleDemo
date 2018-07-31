package com.lizheblogs.common.base.activity;

import android.content.Context;

import com.lizheblogs.common.base.adapter.BaseAdapter;
import com.lizheblogs.common.base.adapter.BaseHolder;

import java.util.List;


/**
 * Created by LiZhe on 2017-09-30.
 * com.lizheblogs.domainsearch
 */

public class ItemAdapter extends BaseAdapter<String> {


    public ItemAdapter(Context context, List<String> beanList) {
        super(context, beanList);
    }

    @Override
    public BaseHolder initHolder() {
        return new ItemHolder(context, mList);
    }
}
