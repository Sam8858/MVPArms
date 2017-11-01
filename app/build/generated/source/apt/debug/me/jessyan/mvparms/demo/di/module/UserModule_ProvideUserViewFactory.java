package me.jessyan.mvparms.demo.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import me.jessyan.mvparms.demo.mvp.contract.UserContract;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserModule_ProvideUserViewFactory implements Factory<UserContract.View> {
  private final UserModule module;

  public UserModule_ProvideUserViewFactory(UserModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UserContract.View get() {
    return Preconditions.checkNotNull(
        module.provideUserView(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UserContract.View> create(UserModule module) {
    return new UserModule_ProvideUserViewFactory(module);
  }

  /** Proxies {@link UserModule#provideUserView()}. */
  public static UserContract.View proxyProvideUserView(UserModule instance) {
    return instance.provideUserView();
  }
}
