package com.edu.Keddit.features.news;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NewsFragment_MembersInjector implements MembersInjector<NewsFragment> {
  private final Provider<NewsManager> newsManagerProvider;

  public NewsFragment_MembersInjector(Provider<NewsManager> newsManagerProvider) {
    assert newsManagerProvider != null;
    this.newsManagerProvider = newsManagerProvider;
  }

  public static MembersInjector<NewsFragment> create(Provider<NewsManager> newsManagerProvider) {
    return new NewsFragment_MembersInjector(newsManagerProvider);
  }

  @Override
  public void injectMembers(NewsFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.newsManager = newsManagerProvider.get();
  }
}
