package com.pram.testmvvm.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pram.testmvvm.R;


public class ItemViewHolder extends RecyclerView.ViewHolder {
    private TextView tvItemId;
    private TextView tvItemContent;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);

        tvItemId = itemView.findViewById(R.id.tv_item_id);
        tvItemContent = itemView.findViewById(R.id.tv_item_content);
    }

    public void setTvItemId(String itemId) {
        tvItemId.setText(itemId);
    }

    public void setTvItemContent(String itemContent) {
        tvItemContent.setText(itemContent);
    }
}
