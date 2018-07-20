package com.edu.Keddit.commons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/edu/Keddit/commons/InfiniteScrollListener;", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "func", "Lkotlin/Function0;", "", "layoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "(Lkotlin/jvm/functions/Function0;Landroid/support/v7/widget/LinearLayoutManager;)V", "firstVisibleItem", "", "getFunc", "()Lkotlin/jvm/functions/Function0;", "getLayoutManager", "()Landroid/support/v7/widget/LinearLayoutManager;", "loading", "", "previousTotal", "totalItemCount", "visibleItemCount", "visibleThreshold", "onScrolled", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "dx", "dy", "Keddit-DependencyInjection_debug"})
public final class InfiniteScrollListener extends android.support.v7.widget.RecyclerView.OnScrollListener {
    private int previousTotal;
    private boolean loading;
    private int visibleThreshold;
    private int firstVisibleItem;
    private int visibleItemCount;
    private int totalItemCount;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> func = null;
    @org.jetbrains.annotations.NotNull()
    private final android.support.v7.widget.LinearLayoutManager layoutManager = null;
    
    @java.lang.Override()
    public void onScrolled(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getFunc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.LinearLayoutManager getLayoutManager() {
        return null;
    }
    
    public InfiniteScrollListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> func, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.LinearLayoutManager layoutManager) {
        super();
    }
}