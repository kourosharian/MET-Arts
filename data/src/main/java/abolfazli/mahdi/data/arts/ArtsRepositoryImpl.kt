package abolfazli.mahdi.data.arts

import abolfazli.mahdi.domain.arts.repositories.ArtsRepository
import javax.inject.Inject

class ArtsRepositoryImpl @Inject constructor(
    private val artsRemoteDataSource: ArtsRemoteDataSource
) : ArtsRepository {

    override suspend fun searchArtsRemote(query: String): Result<List<Int>> {
        return artsRemoteDataSource.searchArtsRemoteDataSource(query).map { it.objectIDs }
    }
}