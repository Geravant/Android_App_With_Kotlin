package com.edu.Keddit.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  public NetworkModule_ProvideRetrofitFactory(NetworkModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.provideRetrofit(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Retrofit> create(NetworkModule module) {
    return new NetworkModule_ProvideRetrofitFactory(module);
  }
}
