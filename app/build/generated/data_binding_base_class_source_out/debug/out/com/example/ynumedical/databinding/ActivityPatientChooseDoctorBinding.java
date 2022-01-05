// Generated by view binder compiler. Do not edit!
package com.example.ynumedical.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
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

public final class ActivityPatientChooseDoctorBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout doctorList;

  @NonNull
  public final Spinner filterGender;

  @NonNull
  public final Button filterRefresh;

  @NonNull
  public final Spinner filterSpecialty;

  @NonNull
  public final TextView textView4;

  private ActivityPatientChooseDoctorBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout doctorList, @NonNull Spinner filterGender,
      @NonNull Button filterRefresh, @NonNull Spinner filterSpecialty,
      @NonNull TextView textView4) {
    this.rootView = rootView;
    this.doctorList = doctorList;
    this.filterGender = filterGender;
    this.filterRefresh = filterRefresh;
    this.filterSpecialty = filterSpecialty;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPatientChooseDoctorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPatientChooseDoctorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_patient_choose_doctor, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPatientChooseDoctorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.doctor_list;
      LinearLayout doctorList = ViewBindings.findChildViewById(rootView, id);
      if (doctorList == null) {
        break missingId;
      }

      id = R.id.filter_gender;
      Spinner filterGender = ViewBindings.findChildViewById(rootView, id);
      if (filterGender == null) {
        break missingId;
      }

      id = R.id.filter_refresh;
      Button filterRefresh = ViewBindings.findChildViewById(rootView, id);
      if (filterRefresh == null) {
        break missingId;
      }

      id = R.id.filter_specialty;
      Spinner filterSpecialty = ViewBindings.findChildViewById(rootView, id);
      if (filterSpecialty == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new ActivityPatientChooseDoctorBinding((ConstraintLayout) rootView, doctorList,
          filterGender, filterRefresh, filterSpecialty, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
