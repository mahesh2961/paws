package `in`.paws.di

import `in`.paws.database.AppDatabase
import `in`.paws.network.NetworkModule
import dagger.Module

@Module(includes = [ViewModelModule::class, NetworkModule::class,AppDatabase::class])
class AppModule {
    /* You can place something useful here
    @Provides
    fun providesResources(context: Context): Resources = context.resources
    */

}