package com.pram.testsimplemvc.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pram.testsimplemvc.R;
import com.pram.testsimplemvc.model.ItemModel;
import com.pram.testsimplemvc.viewholder.ItemViewHolder;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private List<ItemModel> mItemModels;

    public ItemAdapter(List<ItemModel> itemModels) {
        mItemModels = itemModels;
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
