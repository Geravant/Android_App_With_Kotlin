package com.edu.Keddit.di.news;

import com.edu.Keddit.api.RedditApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NewsModule_ProvideRedditApiFactory implements Factory<RedditApi> {
  private final NewsModule module;

  private final Provider<Retrofit> retrofitProvider;

  public NewsModule_ProvideRedditApiFactory(
      NewsModule module, Provider<Retrofit> retrofitProvider) {
    assert module != null;
    this.module = module;
    assert retrofitProvider != null;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public RedditApi get() {
    return Preconditions.checkNotNull(
        module.provideRedditApi(retrofitProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RedditApi> create(NewsModule module, Provider<Retrofit> retrofitProvider) {
    return new NewsModule_ProvideRedditApiFactory(module, retrofitProvider);
  }
}
