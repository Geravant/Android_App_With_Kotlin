package com.edu.Keddit.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0014\u0010\u0012\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\f\u00a8\u0006\u001f"}, d2 = {"Lcom/edu/Keddit/adapter/NewsAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "()V", "delegateAdapters", "Landroid/support/v4/util/SparseArrayCompat;", "Lcom/edu/Keddit/commons/adapter/ViewTypeDelegateAdapter;", "items", "Ljava/util/ArrayList;", "Lcom/edu/Keddit/commons/adapter/ViewType;", "loadingItem", "com/edu/Keddit/adapter/NewsAdapter$loadingItem$1", "Lcom/edu/Keddit/adapter/NewsAdapter$loadingItem$1;", "addNews", "", "news", "", "Lcom/edu/Keddit/commons/RedditNewsItem;", "clearAndAddNews", "getItemCount", "", "getItemViewType", "position", "getLastPosition", "getNews", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Keddit-DependencyInjection_debug"})
public final class NewsAdapter extends android.support.v7.widget.RecyclerView.Adapter<android.support.v7.widget.RecyclerView.ViewHolder> {
    private java.util.ArrayList<com.edu.Keddit.commons.adapter.ViewType> items;
    private android.support.v4.util.SparseArrayCompat<com.edu.Keddit.commons.adapter.ViewTypeDelegateAdapter> delegateAdapters;
    private final com.edu.Keddit.commons.adapter.ViewType loadingItem = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final void addNews(@org.jetbrains.annotations.NotNull()
    java.util.List<com.edu.Keddit.commons.RedditNewsItem> news) {
    }
    
    public final void clearAndAddNews(@org.jetbrains.annotations.NotNull()
    java.util.List<com.edu.Keddit.commons.RedditNewsItem> news) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.edu.Keddit.commons.RedditNewsItem> getNews() {
        return null;
    }
    
    private final int getLastPosition() {
        return 0;
    }
    
    public NewsAdapter() {
        super();
    }
}