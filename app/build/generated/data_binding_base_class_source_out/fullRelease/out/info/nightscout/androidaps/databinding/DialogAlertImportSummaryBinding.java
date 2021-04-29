// Generated by view binder compiler. Do not edit!
package info.nightscout.androidaps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import info.nightscout.androidaps.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogAlertImportSummaryBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final NestedScrollView scrollContentFrame;

  @NonNull
  public final Button summaryDetailsBtn;

  @NonNull
  public final TableLayout summaryTable;

  private DialogAlertImportSummaryBinding(@NonNull CoordinatorLayout rootView,
      @NonNull NestedScrollView scrollContentFrame, @NonNull Button summaryDetailsBtn,
      @NonNull TableLayout summaryTable) {
    this.rootView = rootView;
    this.scrollContentFrame = scrollContentFrame;
    this.summaryDetailsBtn = summaryDetailsBtn;
    this.summaryTable = summaryTable;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogAlertImportSummaryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogAlertImportSummaryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_alert_import_summary, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogAlertImportSummaryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.scroll_content_frame;
      NestedScrollView scrollContentFrame = rootView.findViewById(id);
      if (scrollContentFrame == null) {
        break missingId;
      }

      id = R.id.summary_details_btn;
      Button summaryDetailsBtn = rootView.findViewById(id);
      if (summaryDetailsBtn == null) {
        break missingId;
      }

      id = R.id.summary_table;
      TableLayout summaryTable = rootView.findViewById(id);
      if (summaryTable == null) {
        break missingId;
      }

      return new DialogAlertImportSummaryBinding((CoordinatorLayout) rootView, scrollContentFrame,
          summaryDetailsBtn, summaryTable);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}