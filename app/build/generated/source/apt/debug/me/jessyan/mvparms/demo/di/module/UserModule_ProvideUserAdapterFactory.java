package me.jessyan.mvparms.demo.di.module;

import android.support.v7.widget.RecyclerView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.mvparms.demo.mvp.model.entity.User;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserModule_ProvideUserAdapterFactory implements Factory<RecyclerView.Adapter> {
  private final UserModule module;

  private final Provider<List<User>> listProvider;

  public UserModule_ProvideUserAdapterFactory(
      UserModule module, Provider<List<User>> listProvider) {
    assert module != null;
    this.module = module;
    assert listProvider != null;
    this.listProvider = listProvider;
  }

  @Override
  public RecyclerView.Adapter get() {
    return Preconditions.checkNotNull(
        module.provideUserAdapter(listProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RecyclerView.Adapter> create(
      UserModule module, Provider<List<User>> listProvider) {
    return new UserModule_ProvideUserAdapterFactory(module, listProvider);
  }

  /** Proxies {@link UserModule#provideUserAdapter(List)}. */
  public static RecyclerView.Adapter proxyProvideUserAdapter(UserModule instance, List<User> list) {
    return instance.provideUserAdapter(list);
  }
}
