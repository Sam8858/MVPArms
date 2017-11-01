package com.jess.arms.base.delegate;

import com.jess.arms.integration.ActivityLifecycle;
import com.jess.arms.integration.lifecycle.ActivityLifecycleForRxLifecycle;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppDelegate_MembersInjector implements MembersInjector<AppDelegate> {
  private final Provider<ActivityLifecycle> mActivityLifecycleProvider;

  private final Provider<ActivityLifecycleForRxLifecycle> mActivityLifecycleForRxLifecycleProvider;

  public AppDelegate_MembersInjector(
      Provider<ActivityLifecycle> mActivityLifecycleProvider,
      Provider<ActivityLifecycleForRxLifecycle> mActivityLifecycleForRxLifecycleProvider) {
    assert mActivityLifecycleProvider != null;
    this.mActivityLifecycleProvider = mActivityLifecycleProvider;
    assert mActivityLifecycleForRxLifecycleProvider != null;
    this.mActivityLifecycleForRxLifecycleProvider = mActivityLifecycleForRxLifecycleProvider;
  }

  public static MembersInjector<AppDelegate> create(
      Provider<ActivityLifecycle> mActivityLifecycleProvider,
      Provider<ActivityLifecycleForRxLifecycle> mActivityLifecycleForRxLifecycleProvider) {
    return new AppDelegate_MembersInjector(
        mActivityLifecycleProvider, mActivityLifecycleForRxLifecycleProvider);
  }

  @Override
  public void injectMembers(AppDelegate instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mActivityLifecycle = mActivityLifecycleProvider.get();
    instance.mActivityLifecycleForRxLifecycle = mActivityLifecycleForRxLifecycleProvider.get();
  }

  public static void injectMActivityLifecycle(
      AppDelegate instance, Provider<ActivityLifecycle> mActivityLifecycleProvider) {
    instance.mActivityLifecycle = mActivityLifecycleProvider.get();
  }

  public static void injectMActivityLifecycleForRxLifecycle(
      AppDelegate instance,
      Provider<ActivityLifecycleForRxLifecycle> mActivityLifecycleForRxLifecycleProvider) {
    instance.mActivityLifecycleForRxLifecycle = mActivityLifecycleForRxLifecycleProvider.get();
  }
}
