package abolfazli.mahdi.domain.arts.usecases.di

import abolfazli.mahdi.domain.arts.usecases.SearchArtsRemoteUseCase
import abolfazli.mahdi.domain.arts.usecases.SearchArtsRemoteUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class ArtsUseCaseModule {
    @Binds
    abstract fun bindArtsUseCases(searchArtsRemoteUseCaseImpl: SearchArtsRemoteUseCaseImpl): SearchArtsRemoteUseCase

}