package `in`.paws.di

import `in`.paws.PawsApp
import `in`.paws.database.RoomModule
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityModule::class,
        RoomModule::class
))
interface AppComponent : AndroidInjector<PawsApp> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<PawsApp>() {
        @BindsInstance abstract fun appContext(appContext: Context): Builder
    }
}