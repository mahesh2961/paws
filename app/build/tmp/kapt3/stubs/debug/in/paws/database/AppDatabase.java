package in.paws.database;

import java.lang.System;

/**
 * * Setting Rooms Database
 */
@androidx.room.TypeConverters(value = {in.paws.adapters.Converter.class})
@androidx.room.Database(entities = {in.paws.database.DogCategory.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lin/paws/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "dogCategoryDao", "Lin/paws/database/DogBreedDao;", "app_debug"})
@dagger.Module()
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract in.paws.database.DogBreedDao dogCategoryDao();
    
    public AppDatabase() {
        super();
    }
}