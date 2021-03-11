// Generated by view binder compiler. Do not edit!
package com.core.shaditest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.core.shaditest.R;
import com.mikhaellopez.circularimageview.CircularImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutProfileBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CircularImageView ivProfile;

  @NonNull
  public final TextView tvAge;

  @NonNull
  public final TextView tvName;

  private LayoutProfileBinding(@NonNull LinearLayout rootView, @NonNull CircularImageView ivProfile,
      @NonNull TextView tvAge, @NonNull TextView tvName) {
    this.rootView = rootView;
    this.ivProfile = ivProfile;
    this.tvAge = tvAge;
    this.tvName = tvName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivProfile;
      CircularImageView ivProfile = rootView.findViewById(id);
      if (ivProfile == null) {
        break missingId;
      }

      id = R.id.tvAge;
      TextView tvAge = rootView.findViewById(id);
      if (tvAge == null) {
        break missingId;
      }

      id = R.id.tvName;
      TextView tvName = rootView.findViewById(id);
      if (tvName == null) {
        break missingId;
      }

      return new LayoutProfileBinding((LinearLayout) rootView, ivProfile, tvAge, tvName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
