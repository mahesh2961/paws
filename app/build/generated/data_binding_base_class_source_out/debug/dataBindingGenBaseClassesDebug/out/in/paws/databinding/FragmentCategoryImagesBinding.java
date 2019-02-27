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
import androidx.recyclerview.widget.RecyclerView;
import in.paws.viewmodels.CategoryImageViewModel;

public abstract class FragmentCategoryImagesBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView imageList;

  @Bindable
  protected CategoryImageViewModel mViewModel;

  protected FragmentCategoryImagesBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView imageList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageList = imageList;
  }

  public abstract void setViewModel(@Nullable CategoryImageViewModel viewModel);

  @Nullable
  public CategoryImageViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentCategoryImagesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentCategoryImagesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentCategoryImagesBinding>inflate(inflater, in.paws.R.layout.fragment_category_images, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCategoryImagesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentCategoryImagesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentCategoryImagesBinding>inflate(inflater, in.paws.R.layout.fragment_category_images, null, false, component);
  }

  public static FragmentCategoryImagesBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentCategoryImagesBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentCategoryImagesBinding)bind(component, view, in.paws.R.layout.fragment_category_images);
  }
}
