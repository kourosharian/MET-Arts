package abolfazli.mahdi.metarts.core.di

import abolfazli.mahdi.metarts.MetArtsApp
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideContext(application: MetArtsApp): Context {
        return application
    }

}