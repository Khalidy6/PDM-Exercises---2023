// Generated by view binder compiler. Do not edit!
package mz.co.aulas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

public final class ActivityAula2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnCalcularIMC;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textView9;

  @NonNull
  public final EditText txtAltura;

  @NonNull
  public final EditText txtIdade;

  @NonNull
  public final EditText txtPeso;

  private ActivityAula2Binding(@NonNull ConstraintLayout rootView, @NonNull Button btnCalcularIMC,
      @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView,
      @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12,
      @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4,
      @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7,
      @NonNull TextView textView8, @NonNull TextView textView9, @NonNull EditText txtAltura,
      @NonNull EditText txtIdade, @NonNull EditText txtPeso) {
    this.rootView = rootView;
    this.btnCalcularIMC = btnCalcularIMC;
    this.imageView = imageView;
    this.linearLayout2 = linearLayout2;
    this.textView = textView;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.textView12 = textView12;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.textView8 = textView8;
    this.textView9 = textView9;
    this.txtAltura = txtAltura;
    this.txtIdade = txtIdade;
    this.txtPeso = txtPeso;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAula2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAula2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_aula2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAula2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCalcularIMC;
      Button btnCalcularIMC = ViewBindings.findChildViewById(rootView, id);
      if (btnCalcularIMC == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = ViewBindings.findChildViewById(rootView, id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);
      if (textView9 == null) {
        break missingId;
      }

      id = R.id.txtAltura;
      EditText txtAltura = ViewBindings.findChildViewById(rootView, id);
      if (txtAltura == null) {
        break missingId;
      }

      id = R.id.txtIdade;
      EditText txtIdade = ViewBindings.findChildViewById(rootView, id);
      if (txtIdade == null) {
        break missingId;
      }

      id = R.id.txtPeso;
      EditText txtPeso = ViewBindings.findChildViewById(rootView, id);
      if (txtPeso == null) {
        break missingId;
      }

      return new ActivityAula2Binding((ConstraintLayout) rootView, btnCalcularIMC, imageView,
          linearLayout2, textView, textView10, textView11, textView12, textView2, textView3,
          textView4, textView5, textView6, textView7, textView8, textView9, txtAltura, txtIdade,
          txtPeso);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
