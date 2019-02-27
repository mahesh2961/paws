package in.paws.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import in.paws.database.DogCategory;
import in.paws.viewmodels.BaseCategoryViewModel;

public abstract class ListItemBreadBinding extends ViewDataBinding {
  @NonNull
  public final ImageView pawsItemImage;

  @NonNull
  public final TextView pawsSubBreedCount;

  @NonNull
  public final TextView pawsTitle;

  @Bindable
  protected View.OnClickListener mClickListener;

  @Bindable
  protected DogCategory mDog;

  @Bindable
  protected BaseCategoryViewModel mViewModel;

  protected ListItemBreadBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView pawsItemImage, TextView pawsSubBreedCount,
      TextView pawsTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.pawsItemImage = pawsItemImage;
    this.pawsSubBreedCount = pawsSubBreedCount;
    this.pawsTitle = pawsTitle;
  }

  public abstract void setClickListener(@Nullable View.OnClickListener clickListener);

  @Nullable
  public View.OnClickListener getClickListener() {
    return mClickListener;
  }

  public abstract void setDog(@Nullable DogCategory dog);

  @Nullable
  public DogCategory getDog() {
    return mDog;
  }

  public abstract void setViewModel(@Nullable BaseCategoryViewModel viewModel);

  @Nullable
  public BaseCategoryViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ListItemBreadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ListItemBreadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ListItemBreadBinding>inflate(inflater, in.paws.R.layout.list_item_bread, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemBreadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ListItemBreadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ListItemBreadBinding>inflate(inflater, in.paws.R.layout.list_item_bread, null, false, component);
  }

  public static ListItemBreadBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ListItemBreadBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ListItemBreadBinding)bind(component, view, in.paws.R.layout.list_item_bread);
  }
}
