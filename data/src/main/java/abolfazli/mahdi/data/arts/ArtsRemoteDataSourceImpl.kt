package abolfazli.mahdi.data.arts

import abolfazli.mahdi.data.arts.responses.SearchResponse
import arrow.fx.coroutines.Resource
import retrofit2.Response
import javax.inject.Inject

class ArtsRemoteDataSourceImpl @Inject constructor(
    private val artsService: ArtsService
) : ArtsRemoteDataSource {

    //TODO: simplify this function
    override suspend fun searchArtsRemoteDataSource(query: String): Result<SearchResponse> {
        return try {
            val response = artsService.searchArtsApi(query)

            if (response.isSuccessful) {
                val searchResponse = response.body()
                if (searchResponse != null)
                    Result.success(searchResponse)
                else
                    Result.failure(Exception("Error searching arts, response is null"))
            } else
                Result.failure(Exception("Error searching arts"))
        } catch (e: Exception) {
            Result.failure(Exception("IOException"))
        }
    }


}