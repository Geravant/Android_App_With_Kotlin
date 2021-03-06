package com.edu.Keddit.api;

import java.lang.System;

/**
 * * News API
 * *
 * * @author juancho.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/edu/Keddit/api/NewsAPI;", "", "getNews", "Lretrofit2/Call;", "Lcom/edu/Keddit/api/RedditNewsResponse;", "after", "", "limit", "Keddit-DependencyInjection_debug"})
public abstract interface NewsAPI {
    
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.edu.Keddit.api.RedditNewsResponse> getNews(@org.jetbrains.annotations.NotNull()
    java.lang.String after, @org.jetbrains.annotations.NotNull()
    java.lang.String limit);
}