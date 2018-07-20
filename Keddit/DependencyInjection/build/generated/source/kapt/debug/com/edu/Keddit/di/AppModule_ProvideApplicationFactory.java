package com.edu.Keddit.di;

import com.edu.Keddit.KedditApp;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideApplicationFactory implements Factory<KedditApp> {
  private final AppModule module;

  public AppModule_ProvideApplicationFactory(AppModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public KedditApp get() {
    return Preconditions.checkNotNull(
        module.provideApplication(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<KedditApp> create(AppModule module) {
    return new AppModule_ProvideApplicationFactory(module);
  }
}
