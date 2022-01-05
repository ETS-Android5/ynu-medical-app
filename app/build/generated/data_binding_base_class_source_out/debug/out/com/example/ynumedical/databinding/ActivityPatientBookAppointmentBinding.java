// Generated by view binder compiler. Do not edit!
package com.example.ynumedical.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ynumedical.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPatientBookAppointmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final LinearLayout timeSlots;

  private ActivityPatientBookAppointmentBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView textView3, @NonNull LinearLayout timeSlots) {
    this.rootView = rootView;
    this.textView3 = textView3;
    this.timeSlots = timeSlots;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPatientBookAppointmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPatientBookAppointmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_patient_book_appointment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPatientBookAppointmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.time_slots;
      LinearLayout timeSlots = ViewBindings.findChildViewById(rootView, id);
      if (timeSlots == null) {
        break missingId;
      }

      return new ActivityPatientBookAppointmentBinding((ConstraintLayout) rootView, textView3,
          timeSlots);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
