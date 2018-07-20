package com.edu.Keddit.di.news;

import java.lang.System;

/**
 * *
 * * @author juancho.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/edu/Keddit/di/news/NewsComponent;", "", "inject", "", "newsFragment", "Lcom/edu/Keddit/features/news/NewsFragment;", "Keddit-DependencyInjection_debug"})
@dagger.Component(modules = {com.edu.Keddit.di.AppModule.class, com.edu.Keddit.di.news.NewsModule.class, com.edu.Keddit.di.NetworkModule.class})
@javax.inject.Singleton()
public abstract interface NewsComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.edu.Keddit.features.news.NewsFragment newsFragment);
}