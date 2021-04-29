// Generated by view binder compiler. Do not edit!
package info.nightscout.androidaps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import info.nightscout.androidaps.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TreatmentsProfileswitchItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView invalidSign;

  @NonNull
  public final TextView nsSign;

  @NonNull
  public final CardView profileswitchCardview;

  @NonNull
  public final TextView profileswitchClone;

  @NonNull
  public final TextView profileswitchDate;

  @NonNull
  public final TextView profileswitchDuration;

  @NonNull
  public final TextView profileswitchName;

  @NonNull
  public final TextView profileswitchRemove;

  @NonNull
  public final TextView pumpSign;

  private TreatmentsProfileswitchItemBinding(@NonNull CardView rootView,
      @NonNull TextView invalidSign, @NonNull TextView nsSign,
      @NonNull CardView profileswitchCardview, @NonNull TextView profileswitchClone,
      @NonNull TextView profileswitchDate, @NonNull TextView profileswitchDuration,
      @NonNull TextView profileswitchName, @NonNull TextView profileswitchRemove,
      @NonNull TextView pumpSign) {
    this.rootView = rootView;
    this.invalidSign = invalidSign;
    this.nsSign = nsSign;
    this.profileswitchCardview = profileswitchCardview;
    this.profileswitchClone = profileswitchClone;
    this.profileswitchDate = profileswitchDate;
    this.profileswitchDuration = profileswitchDuration;
    this.profileswitchName = profileswitchName;
    this.profileswitchRemove = profileswitchRemove;
    this.pumpSign = pumpSign;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static TreatmentsProfileswitchItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TreatmentsProfileswitchItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.treatments_profileswitch_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TreatmentsProfileswitchItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.invalid_sign;
      TextView invalidSign = rootView.findViewById(id);
      if (invalidSign == null) {
        break missingId;
      }

      id = R.id.ns_sign;
      TextView nsSign = rootView.findViewById(id);
      if (nsSign == null) {
        break missingId;
      }

      CardView profileswitchCardview = (CardView) rootView;

      id = R.id.profileswitch_clone;
      TextView profileswitchClone = rootView.findViewById(id);
      if (profileswitchClone == null) {
        break missingId;
      }

      id = R.id.profileswitch_date;
      TextView profileswitchDate = rootView.findViewById(id);
      if (profileswitchDate == null) {
        break missingId;
      }

      id = R.id.profileswitch_duration;
      TextView profileswitchDuration = rootView.findViewById(id);
      if (profileswitchDuration == null) {
        break missingId;
      }

      id = R.id.profileswitch_name;
      TextView profileswitchName = rootView.findViewById(id);
      if (profileswitchName == null) {
        break missingId;
      }

      id = R.id.profileswitch_remove;
      TextView profileswitchRemove = rootView.findViewById(id);
      if (profileswitchRemove == null) {
        break missingId;
      }

      id = R.id.pump_sign;
      TextView pumpSign = rootView.findViewById(id);
      if (pumpSign == null) {
        break missingId;
      }

      return new TreatmentsProfileswitchItemBinding((CardView) rootView, invalidSign, nsSign,
          profileswitchCardview, profileswitchClone, profileswitchDate, profileswitchDuration,
          profileswitchName, profileswitchRemove, pumpSign);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}