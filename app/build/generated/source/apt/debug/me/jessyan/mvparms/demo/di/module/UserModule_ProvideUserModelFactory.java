package me.jessyan.mvparms.demo.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.mvparms.demo.mvp.contract.UserContract;
import me.jessyan.mvparms.demo.mvp.model.UserModel;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserModule_ProvideUserModelFactory implements Factory<UserContract.Model> {
  private final UserModule module;

  private final Provider<UserModel> modelProvider;

  public UserModule_ProvideUserModelFactory(UserModule module, Provider<UserModel> modelProvider) {
    assert module != null;
    this.module = module;
    assert modelProvider != null;
    this.modelProvider = modelProvider;
  }

  @Override
  public UserContract.Model get() {
    return Preconditions.checkNotNull(
        module.provideUserModel(modelProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UserContract.Model> create(
      UserModule module, Provider<UserModel> modelProvider) {
    return new UserModule_ProvideUserModelFactory(module, modelProvider);
  }

  /** Proxies {@link UserModule#provideUserModel(UserModel)}. */
  public static UserContract.Model proxyProvideUserModel(UserModule instance, UserModel model) {
    return instance.provideUserModel(model);
  }
}
