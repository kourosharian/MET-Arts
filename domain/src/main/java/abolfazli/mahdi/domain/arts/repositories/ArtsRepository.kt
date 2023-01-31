package abolfazli.mahdi.domain.arts.repositories

interface ArtsRepository {

    suspend fun searchArtsRemote(query: String): Result<List<Int>>
}