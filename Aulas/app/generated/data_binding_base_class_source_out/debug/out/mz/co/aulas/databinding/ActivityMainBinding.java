// Generated by view binder compiler. Do not edit!
package mz.co.aulas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import mz.co.aulas.R;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button btnAula1;

  @NonNull
  public final Button btnAula2;

  @NonNull
  public final Button btnAula3;

  @NonNull
  public final Button btnAula5;

  @NonNull
  public final Button btnAula6;

  @NonNull
  public final Button btnAula7;

  @NonNull
  public final Button btnTPClifecycle;

  @NonNull
  public final Button btnTestLayouts;

  @NonNull
  public final TextView textViewKhalidy;

  private ActivityMainBinding(@NonNull ScrollView rootView, @NonNull Button btnAula1,
      @NonNull Button btnAula2, @NonNull Button btnAula3, @NonNull Button btnAula5,
      @NonNull Button btnAula6, @NonNull Button btnAula7, @NonNull Button btnTPClifecycle,
      @NonNull Button btnTestLayouts, @NonNull TextView textViewKhalidy) {
    this.rootView = rootView;
    this.btnAula1 = btnAula1;
    this.btnAula2 = btnAula2;
    this.btnAula3 = btnAula3;
    this.btnAula5 = btnAula5;
    this.btnAula6 = btnAula6;
    this.btnAula7 = btnAula7;
    this.btnTPClifecycle = btnTPClifecycle;
    this.btnTestLayouts = btnTestLayouts;
    this.textViewKhalidy = textViewKhalidy;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAula1;
      Button btnAula1 = ViewBindings.findChildViewById(rootView, id);
      if (btnAula1 == null) {
        break missingId;
      }

      id = R.id.btnAula2;
      Button btnAula2 = ViewBindings.findChildViewById(rootView, id);
      if (btnAula2 == null) {
        break missingId;
      }

      id = R.id.btnAula3;
      Button btnAula3 = ViewBindings.findChildViewById(rootView, id);
      if (btnAula3 == null) {
        break missingId;
      }

      id = R.id.btnAula5;
      Button btnAula5 = ViewBindings.findChildViewById(rootView, id);
      if (btnAula5 == null) {
        break missingId;
      }

      id = R.id.btnAula6;
      Button btnAula6 = ViewBindings.findChildViewById(rootView, id);
      if (btnAula6 == null) {
        break missingId;
      }

      id = R.id.btnAula7;
      Button btnAula7 = ViewBindings.findChildViewById(rootView, id);
      if (btnAula7 == null) {
        break missingId;
      }

      id = R.id.btnTPClifecycle;
      Button btnTPClifecycle = ViewBindings.findChildViewById(rootView, id);
      if (btnTPClifecycle == null) {
        break missingId;
      }

      id = R.id.btnTestLayouts;
      Button btnTestLayouts = ViewBindings.findChildViewById(rootView, id);
      if (btnTestLayouts == null) {
        break missingId;
      }

      id = R.id.textViewKhalidy;
      TextView textViewKhalidy = ViewBindings.findChildViewById(rootView, id);
      if (textViewKhalidy == null) {
        break missingId;
      }

      return new ActivityMainBinding((ScrollView) rootView, btnAula1, btnAula2, btnAula3, btnAula5,
          btnAula6, btnAula7, btnTPClifecycle, btnTestLayouts, textViewKhalidy);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
