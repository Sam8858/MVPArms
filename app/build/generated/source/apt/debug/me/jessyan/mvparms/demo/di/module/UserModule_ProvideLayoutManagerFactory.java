package me.jessyan.mvparms.demo.di.module;

import android.support.v7.widget.RecyclerView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserModule_ProvideLayoutManagerFactory
    implements Factory<RecyclerView.LayoutManager> {
  private final UserModule module;

  public UserModule_ProvideLayoutManagerFactory(UserModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RecyclerView.LayoutManager get() {
    return Preconditions.checkNotNull(
        module.provideLayoutManager(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RecyclerView.LayoutManager> create(UserModule module) {
    return new UserModule_ProvideLayoutManagerFactory(module);
  }

  /** Proxies {@link UserModule#provideLayoutManager()}. */
  public static RecyclerView.LayoutManager proxyProvideLayoutManager(UserModule instance) {
    return instance.provideLayoutManager();
  }
}
