package com.jess.arms.di.module;

import com.jess.arms.integration.cache.Cache;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideExtrasFactory implements Factory<Cache<String, Object>> {
  private final AppModule module;

  private final Provider<Cache.Factory> cacheFactoryProvider;

  public AppModule_ProvideExtrasFactory(
      AppModule module, Provider<Cache.Factory> cacheFactoryProvider) {
    assert module != null;
    this.module = module;
    assert cacheFactoryProvider != null;
    this.cacheFactoryProvider = cacheFactoryProvider;
  }

  @Override
  public Cache<String, Object> get() {
    return Preconditions.checkNotNull(
        module.provideExtras(cacheFactoryProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Cache<String, Object>> create(
      AppModule module, Provider<Cache.Factory> cacheFactoryProvider) {
    return new AppModule_ProvideExtrasFactory(module, cacheFactoryProvider);
  }
}
