package com.edu.Keddit;

import java.lang.System;

/**
 * *
 * * @author juancho.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/edu/Keddit/KedditApp;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "Keddit-DependencyInjection_debug"})
public final class KedditApp extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static com.edu.Keddit.di.news.NewsComponent newsComponent;
    public static final com.edu.Keddit.KedditApp.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public KedditApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/edu/Keddit/KedditApp$Companion;", "", "()V", "newsComponent", "Lcom/edu/Keddit/di/news/NewsComponent;", "getNewsComponent", "()Lcom/edu/Keddit/di/news/NewsComponent;", "setNewsComponent", "(Lcom/edu/Keddit/di/news/NewsComponent;)V", "Keddit-DependencyInjection_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.edu.Keddit.di.news.NewsComponent getNewsComponent() {
            return null;
        }
        
        public final void setNewsComponent(@org.jetbrains.annotations.NotNull()
        com.edu.Keddit.di.news.NewsComponent p0) {
        }
        
        private Companion() {
            super();
        }
    }
}