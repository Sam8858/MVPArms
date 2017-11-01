package me.jessyan.mvparms.demo.mvp.ui.activity;

import android.support.v7.widget.RecyclerView;
import com.tbruyelle.rxpermissions2.RxPermissions;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.mvparms.demo.mvp.presenter.UserPresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserActivity_MembersInjector implements MembersInjector<UserActivity> {
  private final Provider<UserPresenter> mPresenterProvider;

  private final Provider<RxPermissions> mRxPermissionsProvider;

  private final Provider<RecyclerView.LayoutManager> mLayoutManagerProvider;

  private final Provider<RecyclerView.Adapter> mAdapterProvider;

  public UserActivity_MembersInjector(
      Provider<UserPresenter> mPresenterProvider,
      Provider<RxPermissions> mRxPermissionsProvider,
      Provider<RecyclerView.LayoutManager> mLayoutManagerProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
    assert mRxPermissionsProvider != null;
    this.mRxPermissionsProvider = mRxPermissionsProvider;
    assert mLayoutManagerProvider != null;
    this.mLayoutManagerProvider = mLayoutManagerProvider;
    assert mAdapterProvider != null;
    this.mAdapterProvider = mAdapterProvider;
  }

  public static MembersInjector<UserActivity> create(
      Provider<UserPresenter> mPresenterProvider,
      Provider<RxPermissions> mRxPermissionsProvider,
      Provider<RecyclerView.LayoutManager> mLayoutManagerProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    return new UserActivity_MembersInjector(
        mPresenterProvider, mRxPermissionsProvider, mLayoutManagerProvider, mAdapterProvider);
  }

  @Override
  public void injectMembers(UserActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    com.jess.arms.base.BaseActivity_MembersInjector.injectMPresenter(instance, mPresenterProvider);
    instance.mRxPermissions = mRxPermissionsProvider.get();
    instance.mLayoutManager = mLayoutManagerProvider.get();
    instance.mAdapter = mAdapterProvider.get();
  }

  public static void injectMRxPermissions(
      UserActivity instance, Provider<RxPermissions> mRxPermissionsProvider) {
    instance.mRxPermissions = mRxPermissionsProvider.get();
  }

  public static void injectMLayoutManager(
      UserActivity instance, Provider<RecyclerView.LayoutManager> mLayoutManagerProvider) {
    instance.mLayoutManager = mLayoutManagerProvider.get();
  }

  public static void injectMAdapter(
      UserActivity instance, Provider<RecyclerView.Adapter> mAdapterProvider) {
    instance.mAdapter = mAdapterProvider.get();
  }
}
