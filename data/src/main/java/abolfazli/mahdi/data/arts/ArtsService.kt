package abolfazli.mahdi.data.arts

import abolfazli.mahdi.data.arts.responses.SearchResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface ArtsService {

    @GET("search")
    suspend fun searchArtsApi(
        @Query("q") query: String
    ): Response<SearchResponse>
}