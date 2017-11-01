package me.jessyan.mvparms.demo.mvp.presenter;

import android.app.Application;
import android.support.v7.widget.RecyclerView;
import com.jess.arms.integration.AppManager;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.mvparms.demo.mvp.contract.UserContract;
import me.jessyan.mvparms.demo.mvp.model.entity.User;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserPresenter_Factory implements Factory<UserPresenter> {
  private final MembersInjector<UserPresenter> userPresenterMembersInjector;

  private final Provider<UserContract.Model> modelProvider;

  private final Provider<UserContract.View> rootViewProvider;

  private final Provider<RxErrorHandler> handlerProvider;

  private final Provider<AppManager> appManagerProvider;

  private final Provider<Application> applicationProvider;

  private final Provider<List<User>> listProvider;

  private final Provider<RecyclerView.Adapter> adapterProvider;

  public UserPresenter_Factory(
      MembersInjector<UserPresenter> userPresenterMembersInjector,
      Provider<UserContract.Model> modelProvider,
      Provider<UserContract.View> rootViewProvider,
      Provider<RxErrorHandler> handlerProvider,
      Provider<AppManager> appManagerProvider,
      Provider<Application> applicationProvider,
      Provider<List<User>> listProvider,
      Provider<RecyclerView.Adapter> adapterProvider) {
    assert userPresenterMembersInjector != null;
    this.userPresenterMembersInjector = userPresenterMembersInjector;
    assert modelProvider != null;
    this.modelProvider = modelProvider;
    assert rootViewProvider != null;
    this.rootViewProvider = rootViewProvider;
    assert handlerProvider != null;
    this.handlerProvider = handlerProvider;
    assert appManagerProvider != null;
    this.appManagerProvider = appManagerProvider;
    assert applicationProvider != null;
    this.applicationProvider = applicationProvider;
    assert listProvider != null;
    this.listProvider = listProvider;
    assert adapterProvider != null;
    this.adapterProvider = adapterProvider;
  }

  @Override
  public UserPresenter get() {
    return MembersInjectors.injectMembers(
        userPresenterMembersInjector,
        new UserPresenter(
            modelProvider.get(),
            rootViewProvider.get(),
            handlerProvider.get(),
            appManagerProvider.get(),
            applicationProvider.get(),
            listProvider.get(),
            adapterProvider.get()));
  }

  public static Factory<UserPresenter> create(
      MembersInjector<UserPresenter> userPresenterMembersInjector,
      Provider<UserContract.Model> modelProvider,
      Provider<UserContract.View> rootViewProvider,
      Provider<RxErrorHandler> handlerProvider,
      Provider<AppManager> appManagerProvider,
      Provider<Application> applicationProvider,
      Provider<List<User>> listProvider,
      Provider<RecyclerView.Adapter> adapterProvider) {
    return new UserPresenter_Factory(
        userPresenterMembersInjector,
        modelProvider,
        rootViewProvider,
        handlerProvider,
        appManagerProvider,
        applicationProvider,
        listProvider,
        adapterProvider);
  }
}
