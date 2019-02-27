package in.paws.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class ImageListItemBinding extends ViewDataBinding {
  @Bindable
  protected View.OnClickListener mClickListener;

  @Bindable
  protected String mImageUrl;

  protected ImageListItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setClickListener(@Nullable View.OnClickListener clickListener);

  @Nullable
  public View.OnClickListener getClickListener() {
    return mClickListener;
  }

  public abstract void setImageUrl(@Nullable String imageUrl);

  @Nullable
  public String getImageUrl() {
    return mImageUrl;
  }

  @NonNull
  public static ImageListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ImageListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ImageListItemBinding>inflate(inflater, in.paws.R.layout.image_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static ImageListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ImageListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ImageListItemBinding>inflate(inflater, in.paws.R.layout.image_list_item, null, false, component);
  }

  public static ImageListItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ImageListItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ImageListItemBinding)bind(component, view, in.paws.R.layout.image_list_item);
  }
}
