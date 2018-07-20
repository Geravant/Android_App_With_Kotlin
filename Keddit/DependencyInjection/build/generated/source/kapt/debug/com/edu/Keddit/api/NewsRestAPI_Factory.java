package com.edu.Keddit.api;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NewsRestAPI_Factory implements Factory<NewsRestAPI> {
  private final Provider<RedditApi> redditApiProvider;

  public NewsRestAPI_Factory(Provider<RedditApi> redditApiProvider) {
    assert redditApiProvider != null;
    this.redditApiProvider = redditApiProvider;
  }

  @Override
  public NewsRestAPI get() {
    return new NewsRestAPI(redditApiProvider.get());
  }

  public static Factory<NewsRestAPI> create(Provider<RedditApi> redditApiProvider) {
    return new NewsRestAPI_Factory(redditApiProvider);
  }
}
