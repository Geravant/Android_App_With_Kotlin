package com.edu.Keddit.di.news;

import java.lang.System;

/**
 * *
 * * @author juancho.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/edu/Keddit/di/news/NewsModule;", "", "()V", "provideNewsAPI", "Lcom/edu/Keddit/api/NewsAPI;", "redditApi", "Lcom/edu/Keddit/api/RedditApi;", "provideRedditApi", "retrofit", "Lretrofit2/Retrofit;", "Keddit-DependencyInjection_debug"})
@dagger.Module()
public final class NewsModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.edu.Keddit.api.NewsAPI provideNewsAPI(@org.jetbrains.annotations.NotNull()
    com.edu.Keddit.api.RedditApi redditApi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.edu.Keddit.api.RedditApi provideRedditApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    public NewsModule() {
        super();
    }
}