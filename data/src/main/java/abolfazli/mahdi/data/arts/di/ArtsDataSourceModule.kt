package abolfazli.mahdi.data.arts.di

import abolfazli.mahdi.data.arts.ArtsRemoteDataSource
import abolfazli.mahdi.data.arts.ArtsRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class ArtsDataSourceModule {
    @Binds
    abstract fun bindArtsRemoteDataSource(remoteDataSource: ArtsRemoteDataSourceImpl): ArtsRemoteDataSource

}