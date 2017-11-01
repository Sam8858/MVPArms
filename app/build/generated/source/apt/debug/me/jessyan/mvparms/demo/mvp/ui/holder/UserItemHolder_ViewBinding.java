// Generated code from Butter Knife. Do not modify!
package me.jessyan.mvparms.demo.mvp.ui.holder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import me.jessyan.mvparms.demo.R;

public class UserItemHolder_ViewBinding implements Unbinder {
  private UserItemHolder target;

  @UiThread
  public UserItemHolder_ViewBinding(UserItemHolder target, View source) {
    this.target = target;

    target.mAvater = Utils.findRequiredViewAsType(source, R.id.iv_avatar, "field 'mAvater'", ImageView.class);
    target.mName = Utils.findRequiredViewAsType(source, R.id.tv_name, "field 'mName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    UserItemHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mAvater = null;
    target.mName = null;
  }
}
