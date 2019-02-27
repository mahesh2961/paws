package in.paws.databinding;
import in.paws.R;
import in.paws.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemBreadBindingImpl extends ListItemBreadBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemBreadBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ListItemBreadBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.pawsItemImage.setTag(null);
        this.pawsSubBreedCount.setTag(null);
        this.pawsTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.dog == variableId) {
            setDog((in.paws.database.DogCategory) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((in.paws.viewmodels.BaseCategoryViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDog(@Nullable in.paws.database.DogCategory Dog) {
        this.mDog = Dog;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.dog);
        super.requestRebind();
    }
    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable in.paws.viewmodels.BaseCategoryViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        in.paws.database.DogCategory dog = mDog;
        java.lang.String viewModelGetSubCategoryCountDog = null;
        android.view.View.OnClickListener clickListener = mClickListener;
        java.lang.String viewModelGetRandomImageDog = null;
        in.paws.viewmodels.BaseCategoryViewModel viewModel = mViewModel;
        java.lang.String viewModelGetBreedTitleDog = null;

        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.getSubCategoryCount(dog)
                    viewModelGetSubCategoryCountDog = viewModel.getSubCategoryCount(dog);
                    // read viewModel.getRandomImage(dog)
                    viewModelGetRandomImageDog = viewModel.getRandomImage(dog);
                    // read viewModel.getBreedTitle(dog)
                    viewModelGetBreedTitleDog = viewModel.getBreedTitle(dog);
                }
        }
        if ((dirtyFlags & 0xaL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            in.paws.adapters.BindingAdaptersKt.bindImageFromUrl(this.pawsItemImage, viewModelGetRandomImageDog);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pawsSubBreedCount, viewModelGetSubCategoryCountDog);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pawsTitle, viewModelGetBreedTitleDog);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): dog
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}