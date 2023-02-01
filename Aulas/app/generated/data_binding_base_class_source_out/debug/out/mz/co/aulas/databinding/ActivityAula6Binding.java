// Generated by view binder compiler. Do not edit!
package mz.co.aulas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import mz.co.aulas.R;

public final class ActivityAula6Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnClick;

  @NonNull
  public final TextView resultadoTv;

  private ActivityAula6Binding(@NonNull ConstraintLayout rootView, @NonNull Button btnClick,
      @NonNull TextView resultadoTv) {
    this.rootView = rootView;
    this.btnClick = btnClick;
    this.resultadoTv = resultadoTv;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAula6Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAula6Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_aula6, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAula6Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_Click;
      Button btnClick = ViewBindings.findChildViewById(rootView, id);
      if (btnClick == null) {
        break missingId;
      }

      id = R.id.resultado_tv;
      TextView resultadoTv = ViewBindings.findChildViewById(rootView, id);
      if (resultadoTv == null) {
        break missingId;
      }

      return new ActivityAula6Binding((ConstraintLayout) rootView, btnClick, resultadoTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
