package in.paws.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lin/paws/database/RoomModule;", "", "()V", "database", "Lin/paws/database/AppDatabase;", "getDatabase", "()Lin/paws/database/AppDatabase;", "setDatabase", "(Lin/paws/database/AppDatabase;)V", "provideRepo", "Lin/paws/database/DogBreedRepository;", "dogBreedDao", "Lin/paws/database/DogBreedDao;", "networkManager", "Lin/paws/network/NetworkManager;", "providesBreadDao", "providesRoomDatabase", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class RoomModule {
    @org.jetbrains.annotations.NotNull()
    public in.paws.database.AppDatabase database;
    
    @org.jetbrains.annotations.NotNull()
    public final in.paws.database.AppDatabase getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull()
    in.paws.database.AppDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final in.paws.database.AppDatabase providesRoomDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final in.paws.database.DogBreedDao providesBreadDao(@org.jetbrains.annotations.NotNull()
    in.paws.database.AppDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final in.paws.database.DogBreedRepository provideRepo(@org.jetbrains.annotations.NotNull()
    in.paws.database.DogBreedDao dogBreedDao, @org.jetbrains.annotations.NotNull()
    in.paws.network.NetworkManager networkManager) {
        return null;
    }
    
    public RoomModule() {
        super();
    }
}