package com.yandex.to.ma_list.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yandex.to.ma_list.R;
import com.yandex.to.ma_list.data.storage.model.ListActorModel;

import java.util.ArrayList;


public class ListActorAdapter extends RecyclerView.Adapter<ListViewHolder> {

    ArrayList<ListActorModel> mActors;

    public ListActorAdapter(ArrayList<ListActorModel> mActors){ this.mActors = mActors; }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_actor_card, parent, false);
        return new ListViewHolder(convertView);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        ListActorModel actor = mActors.get(position);

        holder.vName.setText(actor.getName());
        holder.vTags.setText(actor.getTags());
        holder.vImage.setImageDrawable(actor.getImage());
        holder.vInfo.setText(actor.getInfo());
    }

    @Override
    public int getItemCount() {
        return mActors.size();
    }
}
