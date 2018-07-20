package com.edu.Keddit.features.news;

import java.lang.System;

/**
 * * News Manager allows you to request more news from Reddit.
 * *
 * * @author juancho
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/edu/Keddit/features/news/NewsManager;", "", "api", "Lcom/edu/Keddit/api/NewsAPI;", "(Lcom/edu/Keddit/api/NewsAPI;)V", "getNews", "Lrx/Observable;", "Lcom/edu/Keddit/commons/RedditNews;", "after", "", "limit", "Keddit-DependencyInjection_debug"})
@javax.inject.Singleton()
public final class NewsManager {
    private final com.edu.Keddit.api.NewsAPI api = null;
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.edu.Keddit.commons.RedditNews> getNews(@org.jetbrains.annotations.NotNull()
    java.lang.String after, @org.jetbrains.annotations.NotNull()
    java.lang.String limit) {
        return null;
    }
    
    @javax.inject.Inject()
    public NewsManager(@org.jetbrains.annotations.NotNull()
    com.edu.Keddit.api.NewsAPI api) {
        super();
    }
}