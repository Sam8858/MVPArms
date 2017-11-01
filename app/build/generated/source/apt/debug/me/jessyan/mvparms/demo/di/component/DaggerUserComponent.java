package me.jessyan.mvparms.demo.di.component;

import android.app.Application;
import android.support.v7.widget.RecyclerView;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.integration.AppManager;
import com.jess.arms.integration.IRepositoryManager;
import com.tbruyelle.rxpermissions2.RxPermissions;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.mvparms.demo.di.module.UserModule;
import me.jessyan.mvparms.demo.di.module.UserModule_ProvideLayoutManagerFactory;
import me.jessyan.mvparms.demo.di.module.UserModule_ProvideRxPermissionsFactory;
import me.jessyan.mvparms.demo.di.module.UserModule_ProvideUserAdapterFactory;
import me.jessyan.mvparms.demo.di.module.UserModule_ProvideUserListFactory;
import me.jessyan.mvparms.demo.di.module.UserModule_ProvideUserModelFactory;
import me.jessyan.mvparms.demo.di.module.UserModule_ProvideUserViewFactory;
import me.jessyan.mvparms.demo.mvp.contract.UserContract;
import me.jessyan.mvparms.demo.mvp.model.UserModel;
import me.jessyan.mvparms.demo.mvp.model.UserModel_Factory;
import me.jessyan.mvparms.demo.mvp.model.entity.User;
import me.jessyan.mvparms.demo.mvp.presenter.UserPresenter;
import me.jessyan.mvparms.demo.mvp.presenter.UserPresenter_Factory;
import me.jessyan.mvparms.demo.mvp.ui.activity.UserActivity;
import me.jessyan.mvparms.demo.mvp.ui.activity.UserActivity_MembersInjector;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerUserComponent implements UserComponent {
  private Provider<IRepositoryManager> repositoryManagerProvider;

  private Provider<UserModel> userModelProvider;

  private Provider<UserContract.Model> provideUserModelProvider;

  private Provider<UserContract.View> provideUserViewProvider;

  private Provider<RxErrorHandler> rxErrorHandlerProvider;

  private Provider<AppManager> appManagerProvider;

  private Provider<Application> applicationProvider;

  private Provider<List<User>> provideUserListProvider;

  private Provider<RecyclerView.Adapter> provideUserAdapterProvider;

  private Provider<UserPresenter> userPresenterProvider;

  private Provider<RxPermissions> provideRxPermissionsProvider;

  private Provider<RecyclerView.LayoutManager> provideLayoutManagerProvider;

  private MembersInjector<UserActivity> userActivityMembersInjector;

  private DaggerUserComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.repositoryManagerProvider =
        new com_jess_arms_di_component_AppComponent_repositoryManager(builder.appComponent);

    this.userModelProvider =
        DoubleCheck.provider(
            UserModel_Factory.create(
                MembersInjectors.<UserModel>noOp(), repositoryManagerProvider));

    this.provideUserModelProvider =
        DoubleCheck.provider(
            UserModule_ProvideUserModelFactory.create(builder.userModule, userModelProvider));

    this.provideUserViewProvider =
        DoubleCheck.provider(UserModule_ProvideUserViewFactory.create(builder.userModule));

    this.rxErrorHandlerProvider =
        new com_jess_arms_di_component_AppComponent_rxErrorHandler(builder.appComponent);

    this.appManagerProvider =
        new com_jess_arms_di_component_AppComponent_appManager(builder.appComponent);

    this.applicationProvider =
        new com_jess_arms_di_component_AppComponent_application(builder.appComponent);

    this.provideUserListProvider =
        DoubleCheck.provider(UserModule_ProvideUserListFactory.create(builder.userModule));

    this.provideUserAdapterProvider =
        DoubleCheck.provider(
            UserModule_ProvideUserAdapterFactory.create(
                builder.userModule, provideUserListProvider));

    this.userPresenterProvider =
        DoubleCheck.provider(
            UserPresenter_Factory.create(
                MembersInjectors.<UserPresenter>noOp(),
                provideUserModelProvider,
                provideUserViewProvider,
                rxErrorHandlerProvider,
                appManagerProvider,
                applicationProvider,
                provideUserListProvider,
                provideUserAdapterProvider));

    this.provideRxPermissionsProvider =
        DoubleCheck.provider(UserModule_ProvideRxPermissionsFactory.create(builder.userModule));

    this.provideLayoutManagerProvider =
        DoubleCheck.provider(UserModule_ProvideLayoutManagerFactory.create(builder.userModule));

    this.userActivityMembersInjector =
        UserActivity_MembersInjector.create(
            userPresenterProvider,
            provideRxPermissionsProvider,
            provideLayoutManagerProvider,
            provideUserAdapterProvider);
  }

  @Override
  public void inject(UserActivity activity) {
    userActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private UserModule userModule;

    private AppComponent appComponent;

    private Builder() {}

    public UserComponent build() {
      if (userModule == null) {
        throw new IllegalStateException(UserModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerUserComponent(this);
    }

    public Builder userModule(UserModule userModule) {
      this.userModule = Preconditions.checkNotNull(userModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }

  private static class com_jess_arms_di_component_AppComponent_repositoryManager
      implements Provider<IRepositoryManager> {
    private final AppComponent appComponent;

    com_jess_arms_di_component_AppComponent_repositoryManager(AppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public IRepositoryManager get() {
      return Preconditions.checkNotNull(
          appComponent.repositoryManager(),
          "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class com_jess_arms_di_component_AppComponent_rxErrorHandler
      implements Provider<RxErrorHandler> {
    private final AppComponent appComponent;

    com_jess_arms_di_component_AppComponent_rxErrorHandler(AppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public RxErrorHandler get() {
      return Preconditions.checkNotNull(
          appComponent.rxErrorHandler(),
          "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class com_jess_arms_di_component_AppComponent_appManager
      implements Provider<AppManager> {
    private final AppComponent appComponent;

    com_jess_arms_di_component_AppComponent_appManager(AppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public AppManager get() {
      return Preconditions.checkNotNull(
          appComponent.appManager(), "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class com_jess_arms_di_component_AppComponent_application
      implements Provider<Application> {
    private final AppComponent appComponent;

    com_jess_arms_di_component_AppComponent_application(AppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public Application get() {
      return Preconditions.checkNotNull(
          appComponent.application(), "Cannot return null from a non-@Nullable component method");
    }
  }
}
