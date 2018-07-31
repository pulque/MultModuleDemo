package com.lizheblogs.common.base.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by LiZhe on 2017-10-09.
 * com.teenysoft.aamvp.common.adapter.BaseAdapter
 * 适配器基类，抽象出列表中的对象和显示UI
 */

public abstract class BaseAdapter<T> extends android.widget.BaseAdapter {
    protected final Context context;
    protected List<T> mList;

    public BaseAdapter(Context context, List<T> mList) {
        this.context = context;
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BaseHolder holder;
        if (convertView == null) {
            holder = initHolder();
            convertView = holder.holderView;
            convertView.setTag(holder);
        } else {
            holder = (BaseHolder) convertView.getTag();
        }
        holder.bindData(position);
        return convertView;
    }

    /**
     * 抽象出复用的UI，由子类实现
     * @return
     */
    public abstract BaseHolder initHolder();
}