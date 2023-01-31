package abolfazli.mahdi.data.arts

import abolfazli.mahdi.data.arts.responses.SearchResponse
import retrofit2.Response

interface ArtsRemoteDataSource {
    suspend fun searchArtsRemoteDataSource(query: String): Result<SearchResponse>
}