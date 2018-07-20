package com.edu.Keddit.di;

import java.lang.System;

/**
 * *
 * * @author juancho.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0007J\b\u0010\b\u001a\u00020\tH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/edu/Keddit/di/AppModule;", "", "app", "Lcom/edu/Keddit/KedditApp;", "(Lcom/edu/Keddit/KedditApp;)V", "getApp", "()Lcom/edu/Keddit/KedditApp;", "provideApplication", "provideContext", "Landroid/content/Context;", "Keddit-DependencyInjection_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    private final com.edu.Keddit.KedditApp app = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.edu.Keddit.KedditApp provideApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.edu.Keddit.KedditApp getApp() {
        return null;
    }
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    com.edu.Keddit.KedditApp app) {
        super();
    }
}