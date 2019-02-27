package `in`.paws.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import dagger.Module

/**
 * Setting Rooms Database
 */
@Database(entities = [DogCategory::class], version = 1, exportSchema = false)
@TypeConverters(`in`.paws.adapters.Converter::class)
@Module
abstract class AppDatabase : RoomDatabase() {
    abstract fun dogCategoryDao(): DogBreedDao
}