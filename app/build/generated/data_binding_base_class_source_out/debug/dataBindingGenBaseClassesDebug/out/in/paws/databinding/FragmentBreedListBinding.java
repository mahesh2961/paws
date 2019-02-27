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
import in.paws.viewmodels.BaseCategoryViewModel;

public abstract class FragmentBreedListBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView pawsList;

  @Bindable
  protected BaseCategoryViewModel mViewModel;

  protected FragmentBreedListBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView pawsList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.pawsList = pawsList;
  }

  public abstract void setViewModel(@Nullable BaseCategoryViewModel viewModel);

  @Nullable
  public BaseCategoryViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentBreedListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentBreedListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentBreedListBinding>inflate(inflater, in.paws.R.layout.fragment_breed_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentBreedListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentBreedListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentBreedListBinding>inflate(inflater, in.paws.R.layout.fragment_breed_list, null, false, component);
  }

  public static FragmentBreedListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentBreedListBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentBreedListBinding)bind(component, view, in.paws.R.layout.fragment_breed_list);
  }
}
