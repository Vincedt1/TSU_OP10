// Generated by view binder compiler. Do not edit!
package info.nightscout.androidaps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import info.nightscout.androidaps.R;
import info.nightscout.androidaps.utils.ui.MinutesNumberPicker;
import info.nightscout.androidaps.utils.ui.NumberPicker;
import info.nightscout.androidaps.utils.ui.SingleClickButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogTemptargetBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final SingleClickButton activity;

  @NonNull
  public final MinutesNumberPicker duration;

  @NonNull
  public final SingleClickButton eatingSoon;

  @NonNull
  public final SingleClickButton eatingSoonLarge;

  @NonNull
  public final SingleClickButton eatingSoonMedium;

  @NonNull
  public final SingleClickButton eatingSoonSmall;

  @NonNull
  public final SingleClickButton hypo;

  @NonNull
  public final OkcancelBinding okcancel;

  @NonNull
  public final Spinner reason;

  @NonNull
  public final LinearLayout spacer;

  @NonNull
  public final SingleClickButton targetCancel;

  @NonNull
  public final NumberPicker temptarget;

  @NonNull
  public final TextView units;

  private DialogTemptargetBinding(@NonNull ScrollView rootView, @NonNull SingleClickButton activity,
      @NonNull MinutesNumberPicker duration, @NonNull SingleClickButton eatingSoon,
      @NonNull SingleClickButton eatingSoonLarge, @NonNull SingleClickButton eatingSoonMedium,
      @NonNull SingleClickButton eatingSoonSmall, @NonNull SingleClickButton hypo,
      @NonNull OkcancelBinding okcancel, @NonNull Spinner reason, @NonNull LinearLayout spacer,
      @NonNull SingleClickButton targetCancel, @NonNull NumberPicker temptarget,
      @NonNull TextView units) {
    this.rootView = rootView;
    this.activity = activity;
    this.duration = duration;
    this.eatingSoon = eatingSoon;
    this.eatingSoonLarge = eatingSoonLarge;
    this.eatingSoonMedium = eatingSoonMedium;
    this.eatingSoonSmall = eatingSoonSmall;
    this.hypo = hypo;
    this.okcancel = okcancel;
    this.reason = reason;
    this.spacer = spacer;
    this.targetCancel = targetCancel;
    this.temptarget = temptarget;
    this.units = units;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogTemptargetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogTemptargetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_temptarget, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogTemptargetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.activity;
      SingleClickButton activity = rootView.findViewById(id);
      if (activity == null) {
        break missingId;
      }

      id = R.id.duration;
      MinutesNumberPicker duration = rootView.findViewById(id);
      if (duration == null) {
        break missingId;
      }

      id = R.id.eating_soon;
      SingleClickButton eatingSoon = rootView.findViewById(id);
      if (eatingSoon == null) {
        break missingId;
      }

      id = R.id.eating_soon_large;
      SingleClickButton eatingSoonLarge = rootView.findViewById(id);
      if (eatingSoonLarge == null) {
        break missingId;
      }

      id = R.id.eating_soon_medium;
      SingleClickButton eatingSoonMedium = rootView.findViewById(id);
      if (eatingSoonMedium == null) {
        break missingId;
      }

      id = R.id.eating_soon_small;
      SingleClickButton eatingSoonSmall = rootView.findViewById(id);
      if (eatingSoonSmall == null) {
        break missingId;
      }

      id = R.id.hypo;
      SingleClickButton hypo = rootView.findViewById(id);
      if (hypo == null) {
        break missingId;
      }

      id = R.id.okcancel;
      View okcancel = rootView.findViewById(id);
      if (okcancel == null) {
        break missingId;
      }
      OkcancelBinding binding_okcancel = OkcancelBinding.bind(okcancel);

      id = R.id.reason;
      Spinner reason = rootView.findViewById(id);
      if (reason == null) {
        break missingId;
      }

      id = R.id.spacer;
      LinearLayout spacer = rootView.findViewById(id);
      if (spacer == null) {
        break missingId;
      }

      id = R.id.target_cancel;
      SingleClickButton targetCancel = rootView.findViewById(id);
      if (targetCancel == null) {
        break missingId;
      }

      id = R.id.temptarget;
      NumberPicker temptarget = rootView.findViewById(id);
      if (temptarget == null) {
        break missingId;
      }

      id = R.id.units;
      TextView units = rootView.findViewById(id);
      if (units == null) {
        break missingId;
      }

      return new DialogTemptargetBinding((ScrollView) rootView, activity, duration, eatingSoon,
          eatingSoonLarge, eatingSoonMedium, eatingSoonSmall, hypo, binding_okcancel, reason,
          spacer, targetCancel, temptarget, units);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}