// Generated code from Butter Knife. Do not modify!
package com.example.mabel.sampleionnetworking;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivityFragment$$ViewBinder<T extends com.example.mabel.sampleionnetworking.MainActivityFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492979, "field 'textTest'");
    target.textTest = finder.castView(view, 2131492979, "field 'textTest'");
    view = finder.findRequiredView(source, 2131492981, "method 'btnTestGet_Touch'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btnTestGet_Touch(finder.<android.widget.Button>castParam(p0, "doClick", 0, "btnTestGet_Touch", 0));
        }
      });
    view = finder.findRequiredView(source, 2131492982, "method 'btnTestPost_Touch'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btnTestPost_Touch(finder.<android.widget.Button>castParam(p0, "doClick", 0, "btnTestPost_Touch", 0));
        }
      });
    view = finder.findRequiredView(source, 2131492980, "method 'btnTestPost2_Touch'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btnTestPost2_Touch(finder.<android.widget.Button>castParam(p0, "doClick", 0, "btnTestPost2_Touch", 0));
        }
      });
  }

  @Override public void unbind(T target) {
    target.textTest = null;
  }
}
