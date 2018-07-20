package com.edu.Keddit.di.news;

import com.edu.Keddit.api.NewsAPI;
import com.edu.Keddit.api.RedditApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NewsModule_ProvideNewsAPIFactory implements Factory<NewsAPI> {
  private final NewsModule module;

  private final Provider<RedditApi> redditApiProvider;

  public NewsModule_ProvideNewsAPIFactory(
      NewsModule module, Provider<RedditApi> redditApiProvider) {
    assert module != null;
    this.module = module;
    assert redditApiProvider != null;
    this.redditApiProvider = redditApiProvider;
  }

  @Override
  public NewsAPI get() {
    return Preconditions.checkNotNull(
        module.provideNewsAPI(redditApiProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<NewsAPI> create(NewsModule module, Provider<RedditApi> redditApiProvider) {
    return new NewsModule_ProvideNewsAPIFactory(module, redditApiProvider);
  }
}
