package com.edu.Keddit.di.news;

import com.edu.Keddit.api.NewsAPI;
import com.edu.Keddit.api.RedditApi;
import com.edu.Keddit.di.AppModule;
import com.edu.Keddit.di.NetworkModule;
import com.edu.Keddit.di.NetworkModule_ProvideRetrofitFactory;
import com.edu.Keddit.features.news.NewsFragment;
import com.edu.Keddit.features.news.NewsFragment_MembersInjector;
import com.edu.Keddit.features.news.NewsManager;
import com.edu.Keddit.features.news.NewsManager_Factory;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerNewsComponent implements NewsComponent {
  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<RedditApi> provideRedditApiProvider;

  private Provider<NewsAPI> provideNewsAPIProvider;

  private Provider<NewsManager> newsManagerProvider;

  private MembersInjector<NewsFragment> newsFragmentMembersInjector;

  private DaggerNewsComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static NewsComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideRetrofitProvider =
        DoubleCheck.provider(NetworkModule_ProvideRetrofitFactory.create(builder.networkModule));

    this.provideRedditApiProvider =
        DoubleCheck.provider(
            NewsModule_ProvideRedditApiFactory.create(builder.newsModule, provideRetrofitProvider));

    this.provideNewsAPIProvider =
        DoubleCheck.provider(
            NewsModule_ProvideNewsAPIFactory.create(builder.newsModule, provideRedditApiProvider));

    this.newsManagerProvider =
        DoubleCheck.provider(NewsManager_Factory.create(provideNewsAPIProvider));

    this.newsFragmentMembersInjector = NewsFragment_MembersInjector.create(newsManagerProvider);
  }

  @Override
  public void inject(NewsFragment newsFragment) {
    newsFragmentMembersInjector.injectMembers(newsFragment);
  }

  public static final class Builder {
    private NetworkModule networkModule;

    private NewsModule newsModule;

    private Builder() {}

    public NewsComponent build() {
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      if (newsModule == null) {
        this.newsModule = new NewsModule();
      }
      return new DaggerNewsComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder newsModule(NewsModule newsModule) {
      this.newsModule = Preconditions.checkNotNull(newsModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }
  }
}
