package in.paws.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lin/paws/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lin/paws/PawsApp;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, in.paws.di.AppModule.class, in.paws.di.ActivityModule.class, in.paws.database.RoomModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<in.paws.PawsApp> {
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lin/paws/di/AppComponent$Builder;", "Ldagger/android/AndroidInjector$Builder;", "Lin/paws/PawsApp;", "()V", "appContext", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract class Builder extends dagger.android.AndroidInjector.Builder<in.paws.PawsApp> {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract in.paws.di.AppComponent.Builder appContext(@org.jetbrains.annotations.NotNull()
        android.content.Context appContext);
        
        public Builder() {
            super();
        }
    }
}