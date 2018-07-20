package com.edu.Keddit.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/edu/Keddit/api/NewsRestAPI;", "Lcom/edu/Keddit/api/NewsAPI;", "redditApi", "Lcom/edu/Keddit/api/RedditApi;", "(Lcom/edu/Keddit/api/RedditApi;)V", "getNews", "Lretrofit2/Call;", "Lcom/edu/Keddit/api/RedditNewsResponse;", "after", "", "limit", "Keddit-DependencyInjection_debug"})
public final class NewsRestAPI implements com.edu.Keddit.api.NewsAPI {
    private final com.edu.Keddit.api.RedditApi redditApi = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public retrofit2.Call<com.edu.Keddit.api.RedditNewsResponse> getNews(@org.jetbrains.annotations.NotNull()
    java.lang.String after, @org.jetbrains.annotations.NotNull()
    java.lang.String limit) {
        return null;
    }
    
    @javax.inject.Inject()
    public NewsRestAPI(@org.jetbrains.annotations.NotNull()
    com.edu.Keddit.api.RedditApi redditApi) {
        super();
    }
}