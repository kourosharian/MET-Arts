package abolfazli.mahdi.data.arts.di

import abolfazli.mahdi.data.arts.ArtsRemoteDataSource
import abolfazli.mahdi.data.arts.ArtsRepositoryImpl
import abolfazli.mahdi.data.arts.ArtsService
import abolfazli.mahdi.domain.arts.repositories.ArtsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ArtsModule {

    @Provides
    @Singleton
    fun provideArtsApi(retrofit: Retrofit) =
        retrofit.create(ArtsService::class.java)

    @Provides
    @Singleton
    fun provideRepo(artsRemoteDataSource: ArtsRemoteDataSource) : ArtsRepository =
        ArtsRepositoryImpl(artsRemoteDataSource)
}