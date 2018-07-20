package com.edu.Keddit.features.news;

import com.edu.Keddit.api.NewsAPI;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NewsManager_Factory implements Factory<NewsManager> {
  private final Provider<NewsAPI> apiProvider;

  public NewsManager_Factory(Provider<NewsAPI> apiProvider) {
    assert apiProvider != null;
    this.apiProvider = apiProvider;
  }

  @Override
  public NewsManager get() {
    return new NewsManager(apiProvider.get());
  }

  public static Factory<NewsManager> create(Provider<NewsAPI> apiProvider) {
    return new NewsManager_Factory(apiProvider);
  }
}
