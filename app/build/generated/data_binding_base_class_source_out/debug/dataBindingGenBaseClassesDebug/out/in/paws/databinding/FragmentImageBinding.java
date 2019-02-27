package in.paws.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class FragmentImageBinding extends ViewDataBinding {
  @NonNull
  public final ImageView fullImage;

  @Bindable
  protected String mImageUrl;

  protected FragmentImageBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView fullImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fullImage = fullImage;
  }

  public abstract void setImageUrl(@Nullable String imageUrl);

  @Nullable
  public String getImageUrl() {
    return mImageUrl;
  }

  @NonNull
  public static FragmentImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentImageBinding>inflate(inflater, in.paws.R.layout.fragment_image, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentImageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentImageBinding>inflate(inflater, in.paws.R.layout.fragment_image, null, false, component);
  }

  public static FragmentImageBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentImageBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentImageBinding)bind(component, view, in.paws.R.layout.fragment_image);
  }
}
