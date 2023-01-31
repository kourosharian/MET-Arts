package abolfazli.mahdi.domain.arts.usecases

interface SearchArtsRemoteUseCase {
    suspend operator fun invoke(query: String): Result<List<Int>>
}