package com.jess.arms.integration.lifecycle;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityLifecycleForRxLifecycle_Factory
    implements Factory<ActivityLifecycleForRxLifecycle> {
  private static final ActivityLifecycleForRxLifecycle_Factory INSTANCE =
      new ActivityLifecycleForRxLifecycle_Factory();

  @Override
  public ActivityLifecycleForRxLifecycle get() {
    return new ActivityLifecycleForRxLifecycle();
  }

  public static Factory<ActivityLifecycleForRxLifecycle> create() {
    return INSTANCE;
  }
}
