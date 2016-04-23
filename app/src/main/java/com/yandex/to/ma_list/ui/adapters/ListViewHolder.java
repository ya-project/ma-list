package com.yandex.to.ma_list.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yandex.to.ma_list.R;

public class ListViewHolder extends RecyclerView.ViewHolder {

    protected TextView vName, vTags, vInfo;
    protected ImageView vImage;

    public ListViewHolder(View itemView) {
        super(itemView);

        vName = (TextView) itemView.findViewById(R.id.actor_name);
        vTags = (TextView) itemView.findViewById(R.id.actor_tags);
        vImage = (ImageView) itemView.findViewById(R.id.actor_img);
        vInfo = (TextView) itemView.findViewById(R.id.actor_info);
    }
}
