package in.paws.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0015\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0014R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lin/paws/viewmodels/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "dogBreedRepository", "Lin/paws/database/DogBreedRepository;", "(Lin/paws/database/DogBreedRepository;)V", "displayMessage", "Landroidx/databinding/ObservableField;", "", "getDisplayMessage", "()Landroidx/databinding/ObservableField;", "setDisplayMessage", "(Landroidx/databinding/ObservableField;)V", "message", "", "getMessage", "setMessage", "postDisplayMessage", "", "setShowMessage", "showMessage", "(Ljava/lang/Boolean;)V", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> displayMessage;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> message;
    private final in.paws.database.DogBreedRepository dogBreedRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getDisplayMessage() {
        return null;
    }
    
    public final void setDisplayMessage(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    public final void setShowMessage(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean showMessage) {
    }
    
    public final void postDisplayMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    in.paws.database.DogBreedRepository dogBreedRepository) {
        super();
    }
}