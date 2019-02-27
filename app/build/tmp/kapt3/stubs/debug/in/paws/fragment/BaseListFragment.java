package in.paws.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0010H&J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0016H&R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006%"}, d2 = {"Lin/paws/fragment/BaseListFragment;", "Lin/paws/fragment/BaseFragment;", "()V", "binding", "Lin/paws/databinding/FragmentBreedListBinding;", "getBinding", "()Lin/paws/databinding/FragmentBreedListBinding;", "setBinding", "(Lin/paws/databinding/FragmentBreedListBinding;)V", "viewModel", "Lin/paws/viewmodels/BaseCategoryViewModel;", "getViewModel", "()Lin/paws/viewmodels/BaseCategoryViewModel;", "setViewModel", "(Lin/paws/viewmodels/BaseCategoryViewModel;)V", "vmFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getVmFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setVmFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getAdapter", "Lin/paws/adapters/DogsCategoryAdapter;", "initializeViewModel", "factory", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setRecyclerView", "", "adapter", "subscribeUi", "app_debug"})
public abstract class BaseListFragment extends in.paws.fragment.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory vmFactory;
    @org.jetbrains.annotations.NotNull()
    public in.paws.viewmodels.BaseCategoryViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    public in.paws.databinding.FragmentBreedListBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getVmFactory() {
        return null;
    }
    
    public final void setVmFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.paws.viewmodels.BaseCategoryViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    in.paws.viewmodels.BaseCategoryViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.paws.databinding.FragmentBreedListBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    in.paws.databinding.FragmentBreedListBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setRecyclerView(in.paws.adapters.DogsCategoryAdapter adapter, in.paws.databinding.FragmentBreedListBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract in.paws.viewmodels.BaseCategoryViewModel initializeViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory factory);
    
    private final in.paws.adapters.DogsCategoryAdapter getAdapter() {
        return null;
    }
    
    /**
     * * Waits for updates to Model from ViewModel and applies changes accordingly
     */
    public abstract void subscribeUi(@org.jetbrains.annotations.NotNull()
    in.paws.adapters.DogsCategoryAdapter adapter);
    
    public BaseListFragment() {
        super();
    }
}