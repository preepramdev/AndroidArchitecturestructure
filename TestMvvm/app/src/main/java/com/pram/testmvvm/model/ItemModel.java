package com.pram.testmvvm.model;

public class ItemModel {
    private String itemId;
    private String itemContent;

    public ItemModel(String itemId, String itemContent) {
        this.itemId = itemId;
        this.itemContent = itemContent;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemContent() {
        return itemContent;
    }
}
