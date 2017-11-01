package me.jessyan.mvparms.demo.mvp.model;

import com.jess.arms.integration.IRepositoryManager;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserModel_Factory implements Factory<UserModel> {
  private final MembersInjector<UserModel> userModelMembersInjector;

  private final Provider<IRepositoryManager> repositoryManagerProvider;

  public UserModel_Factory(
      MembersInjector<UserModel> userModelMembersInjector,
      Provider<IRepositoryManager> repositoryManagerProvider) {
    assert userModelMembersInjector != null;
    this.userModelMembersInjector = userModelMembersInjector;
    assert repositoryManagerProvider != null;
    this.repositoryManagerProvider = repositoryManagerProvider;
  }

  @Override
  public UserModel get() {
    return MembersInjectors.injectMembers(
        userModelMembersInjector, new UserModel(repositoryManagerProvider.get()));
  }

  public static Factory<UserModel> create(
      MembersInjector<UserModel> userModelMembersInjector,
      Provider<IRepositoryManager> repositoryManagerProvider) {
    return new UserModel_Factory(userModelMembersInjector, repositoryManagerProvider);
  }
}
