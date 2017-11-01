package me.jessyan.mvparms.demo.di.module;

import com.tbruyelle.rxpermissions2.RxPermissions;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserModule_ProvideRxPermissionsFactory implements Factory<RxPermissions> {
  private final UserModule module;

  public UserModule_ProvideRxPermissionsFactory(UserModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RxPermissions get() {
    return Preconditions.checkNotNull(
        module.provideRxPermissions(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RxPermissions> create(UserModule module) {
    return new UserModule_ProvideRxPermissionsFactory(module);
  }

  /** Proxies {@link UserModule#provideRxPermissions()}. */
  public static RxPermissions proxyProvideRxPermissions(UserModule instance) {
    return instance.provideRxPermissions();
  }
}
