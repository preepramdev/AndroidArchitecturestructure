package com.pram.testmvp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pram.testmvp.model.ItemModel;
import com.pram.testmvp.viewholder.ItemViewHolder;
import com.pram.testmvp.R;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private List<ItemModel> mItemModels;

    public ItemAdapter(List<ItemModel> itemModels) {
        mItemModels = itemModels;
    }

    public void setItemModels(List<ItemModel> mItemModels) {
        this.mItemModels = mItemModels;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        ItemModel itemModel = mItemModels.get(position);

        holder.setTvItemId(itemModel.getItemId());
        holder.setTvItemContent(itemModel.getItemContent());
    }

    @Override
    public int getItemCount() {
        return mItemModels.size();
    }
}
