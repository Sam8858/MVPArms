package me.jessyan.mvparms.demo.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.Generated;
import me.jessyan.mvparms.demo.mvp.model.entity.User;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserModule_ProvideUserListFactory implements Factory<List<User>> {
  private final UserModule module;

  public UserModule_ProvideUserListFactory(UserModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public List<User> get() {
    return Preconditions.checkNotNull(
        module.provideUserList(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<List<User>> create(UserModule module) {
    return new UserModule_ProvideUserListFactory(module);
  }

  /** Proxies {@link UserModule#provideUserList()}. */
  public static List<User> proxyProvideUserList(UserModule instance) {
    return instance.provideUserList();
  }
}
