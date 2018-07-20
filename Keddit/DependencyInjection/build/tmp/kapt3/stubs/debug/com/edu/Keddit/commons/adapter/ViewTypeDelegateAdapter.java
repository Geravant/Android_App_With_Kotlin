package com.edu.Keddit.commons.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/edu/Keddit/commons/adapter/ViewTypeDelegateAdapter;", "", "onBindViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "item", "Lcom/edu/Keddit/commons/adapter/ViewType;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "Keddit-DependencyInjection_debug"})
public abstract interface ViewTypeDelegateAdapter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent);
    
    public abstract void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder holder, @org.jetbrains.annotations.NotNull()
    com.edu.Keddit.commons.adapter.ViewType item);
}