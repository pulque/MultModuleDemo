package com.lizheblogs.common.base.activity;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lizheblogs.common.R;
import com.lizheblogs.common.base.adapter.BaseHolder;

import java.util.List;


/**
 * Created by LiZhe on 2017-10-09.
 * com.lizheblogs.domainsearch.main.multiple
 */

public class ItemHolder extends BaseHolder<String> {

    private ImageView imageView;
    private TextView textView;

    public ItemHolder(Context context, List<String> mLists) {
        super(context, mLists);
    }

    @Override
    public View getInflateView(Context context) {
        View view = View.inflate(context, R.layout.item_function, null);
        imageView = view.findViewById(R.id.imageView);
        textView = view.findViewById(R.id.textView);
        return view;
    }

    @Override
    public void bindData(int position) {
        String beanList = mLists.get(position);
        textView.setText(beanList);
    }
}
