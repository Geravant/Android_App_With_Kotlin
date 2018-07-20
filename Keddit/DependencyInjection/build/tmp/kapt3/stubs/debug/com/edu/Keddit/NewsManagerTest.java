package com.edu.Keddit;

import java.lang.System;

/**
 * * Unit Tests for NewsManager
 * *
 * * @author juancho.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u0018H\u0007J\b\u0010\u001a\u001a\u00020\u0018H\u0007J\b\u0010\u001b\u001a\u00020\u0018H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001c"}, d2 = {"Lcom/edu/Keddit/NewsManagerTest;", "", "()V", "apiMock", "Lcom/edu/Keddit/api/NewsAPI;", "getApiMock", "()Lcom/edu/Keddit/api/NewsAPI;", "setApiMock", "(Lcom/edu/Keddit/api/NewsAPI;)V", "callMock", "Lretrofit2/Call;", "Lcom/edu/Keddit/api/RedditNewsResponse;", "getCallMock", "()Lretrofit2/Call;", "setCallMock", "(Lretrofit2/Call;)V", "testSub", "Lrx/observers/TestSubscriber;", "Lcom/edu/Keddit/commons/RedditNews;", "getTestSub", "()Lrx/observers/TestSubscriber;", "setTestSub", "(Lrx/observers/TestSubscriber;)V", "setup", "", "testError", "testSuccess_basic", "testSuccess_checkOneNews", "Keddit-DependencyInjection_debug"})
public final class NewsManagerTest {
    @org.jetbrains.annotations.NotNull()
    private rx.observers.TestSubscriber<com.edu.Keddit.commons.RedditNews> testSub;
    @org.jetbrains.annotations.NotNull()
    private com.edu.Keddit.api.NewsAPI apiMock;
    @org.jetbrains.annotations.NotNull()
    private retrofit2.Call<com.edu.Keddit.api.RedditNewsResponse> callMock;
    
    @org.jetbrains.annotations.NotNull()
    public final rx.observers.TestSubscriber<com.edu.Keddit.commons.RedditNews> getTestSub() {
        return null;
    }
    
    public final void setTestSub(@org.jetbrains.annotations.NotNull()
    rx.observers.TestSubscriber<com.edu.Keddit.commons.RedditNews> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.edu.Keddit.api.NewsAPI getApiMock() {
        return null;
    }
    
    public final void setApiMock(@org.jetbrains.annotations.NotNull()
    com.edu.Keddit.api.NewsAPI p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.edu.Keddit.api.RedditNewsResponse> getCallMock() {
        return null;
    }
    
    public final void setCallMock(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<com.edu.Keddit.api.RedditNewsResponse> p0) {
    }
    
    @org.junit.Before()
    public final void setup() {
    }
    
    @org.junit.Test()
    public final void testSuccess_basic() {
    }
    
    @org.junit.Test()
    public final void testSuccess_checkOneNews() {
    }
    
    @org.junit.Test()
    public final void testError() {
    }
    
    public NewsManagerTest() {
        super();
    }
}