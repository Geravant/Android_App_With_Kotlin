package com.edu.Keddit.commons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/edu/Keddit/commons/RxBaseFragment;", "Landroid/support/v4/app/Fragment;", "()V", "subscriptions", "Lrx/subscriptions/CompositeSubscription;", "getSubscriptions", "()Lrx/subscriptions/CompositeSubscription;", "setSubscriptions", "(Lrx/subscriptions/CompositeSubscription;)V", "onPause", "", "onResume", "Keddit-DependencyInjection_debug"})
public class RxBaseFragment extends android.support.v4.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private rx.subscriptions.CompositeSubscription subscriptions;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final rx.subscriptions.CompositeSubscription getSubscriptions() {
        return null;
    }
    
    protected final void setSubscriptions(@org.jetbrains.annotations.NotNull()
    rx.subscriptions.CompositeSubscription p0) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    public RxBaseFragment() {
        super();
    }
}