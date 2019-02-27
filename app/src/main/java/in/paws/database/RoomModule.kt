package `in`.paws.database

import `in`.paws.network.NetworkManager
import dagger.Provides
import javax.inject.Singleton
import androidx.room.Room
import `in`.paws.utils.DATABASE_NAME
import android.content.Context
import dagger.Module


@Module
class RoomModule
{
    lateinit var database: AppDatabase

    @Singleton
    @Provides
    fun providesRoomDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()
    }

    @Singleton
    @Provides
    fun providesBreadDao(database: AppDatabase): DogBreedDao {
        return database.dogCategoryDao()
    }

    @Provides
    fun provideRepo(dogBreedDao: DogBreedDao, networkManager: NetworkManager) :DogBreedRepository= DogBreedRepository(dogBreedDao,networkManager)
}