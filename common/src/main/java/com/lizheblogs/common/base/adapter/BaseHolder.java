package com.lizheblogs.common.base.adapter;

import android.content.Context;
import android.view.View;

import java.util.List;

/**
 * Created by LiZhe on 2017-10-09.
 * com.teenysoft.aamvp.common.adapter
 * 抽象列表中一项的界面
 */

public abstract class BaseHolder<T> {
    public View holderView;
    public List<T> mLists;
    public int tag;

    public BaseHolder(Context context, List<T> mLists) {
        this.mLists = mLists;
        holderView = getInflateView(context);
    }

    public BaseHolder(Context context, List<T> mLists, int tag) {
        this.mLists = mLists;
        this.tag = tag;
        holderView = getInflateView(context);
    }

    public abstract View getInflateView(Context context);

    public abstract void bindData(int position);

}
