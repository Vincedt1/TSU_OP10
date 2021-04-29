// Generated by view binder compiler. Do not edit!
package info.nightscout.androidaps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import info.nightscout.androidaps.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class OverviewFragmentNsclientBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView overviewNotifications;

  @NonNull
  public final TextView overviewOpenaps;

  @NonNull
  public final TextView overviewPump;

  @NonNull
  public final ScrollView overviewToppartScrollbar;

  @NonNull
  public final TextView overviewUploader;

  private OverviewFragmentNsclientBinding(@NonNull LinearLayout rootView,
      @NonNull RecyclerView overviewNotifications, @NonNull TextView overviewOpenaps,
      @NonNull TextView overviewPump, @NonNull ScrollView overviewToppartScrollbar,
      @NonNull TextView overviewUploader) {
    this.rootView = rootView;
    this.overviewNotifications = overviewNotifications;
    this.overviewOpenaps = overviewOpenaps;
    this.overviewPump = overviewPump;
    this.overviewToppartScrollbar = overviewToppartScrollbar;
    this.overviewUploader = overviewUploader;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static OverviewFragmentNsclientBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OverviewFragmentNsclientBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.overview_fragment_nsclient, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OverviewFragmentNsclientBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.overview_notifications;
      RecyclerView overviewNotifications = rootView.findViewById(id);
      if (overviewNotifications == null) {
        break missingId;
      }

      id = R.id.overview_openaps;
      TextView overviewOpenaps = rootView.findViewById(id);
      if (overviewOpenaps == null) {
        break missingId;
      }

      id = R.id.overview_pump;
      TextView overviewPump = rootView.findViewById(id);
      if (overviewPump == null) {
        break missingId;
      }

      id = R.id.overview_toppart_scrollbar;
      ScrollView overviewToppartScrollbar = rootView.findViewById(id);
      if (overviewToppartScrollbar == null) {
        break missingId;
      }

      id = R.id.overview_uploader;
      TextView overviewUploader = rootView.findViewById(id);
      if (overviewUploader == null) {
        break missingId;
      }

      return new OverviewFragmentNsclientBinding((LinearLayout) rootView, overviewNotifications,
          overviewOpenaps, overviewPump, overviewToppartScrollbar, overviewUploader);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}