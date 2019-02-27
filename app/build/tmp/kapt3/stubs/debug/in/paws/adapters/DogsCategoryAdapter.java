package in.paws.adapters;

import java.lang.System;

/**
 * * Adapter to Display Category List
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lin/paws/adapters/DogsCategoryAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lin/paws/database/DogCategory;", "Lin/paws/adapters/DogsCategoryAdapter$ViewHolder;", "model", "Lin/paws/viewmodels/BaseCategoryViewModel;", "(Lin/paws/viewmodels/BaseCategoryViewModel;)V", "getModel", "()Lin/paws/viewmodels/BaseCategoryViewModel;", "setModel", "createOnClickListener", "Landroid/view/View$OnClickListener;", "category", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class DogsCategoryAdapter extends androidx.recyclerview.widget.ListAdapter<in.paws.database.DogCategory, in.paws.adapters.DogsCategoryAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private in.paws.viewmodels.BaseCategoryViewModel model;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    in.paws.adapters.DogsCategoryAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public in.paws.adapters.DogsCategoryAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    private final android.view.View.OnClickListener createOnClickListener(in.paws.database.DogCategory category) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final in.paws.viewmodels.BaseCategoryViewModel getModel() {
        return null;
    }
    
    public final void setModel(@org.jetbrains.annotations.NotNull()
    in.paws.viewmodels.BaseCategoryViewModel p0) {
    }
    
    public DogsCategoryAdapter(@org.jetbrains.annotations.NotNull()
    in.paws.viewmodels.BaseCategoryViewModel model) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lin/paws/adapters/DogsCategoryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lin/paws/databinding/ListItemBreadBinding;", "(Lin/paws/databinding/ListItemBreadBinding;)V", "bind", "", "listener", "Landroid/view/View$OnClickListener;", "item", "Lin/paws/database/DogCategory;", "model", "Lin/paws/viewmodels/BaseCategoryViewModel;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final in.paws.databinding.ListItemBreadBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        android.view.View.OnClickListener listener, @org.jetbrains.annotations.NotNull()
        in.paws.database.DogCategory item, @org.jetbrains.annotations.NotNull()
        in.paws.viewmodels.BaseCategoryViewModel model) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        in.paws.databinding.ListItemBreadBinding binding) {
            super(null);
        }
    }
}