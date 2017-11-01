package com.jess.arms.di.module;

import com.jess.arms.integration.cache.Cache;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GlobalConfigModule_ProvideCacheFactoryFactory implements Factory<Cache.Factory> {
  private final GlobalConfigModule module;

  public GlobalConfigModule_ProvideCacheFactoryFactory(GlobalConfigModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Cache.Factory get() {
    return Preconditions.checkNotNull(
        module.provideCacheFactory(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Cache.Factory> create(GlobalConfigModule module) {
    return new GlobalConfigModule_ProvideCacheFactoryFactory(module);
  }

  /** Proxies {@link GlobalConfigModule#provideCacheFactory()}. */
  public static Cache.Factory proxyProvideCacheFactory(GlobalConfigModule instance) {
    return instance.provideCacheFactory();
  }
}
