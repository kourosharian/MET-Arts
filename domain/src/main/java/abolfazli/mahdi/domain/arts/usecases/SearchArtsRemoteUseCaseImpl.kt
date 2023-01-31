package abolfazli.mahdi.domain.arts.usecases

import abolfazli.mahdi.domain.arts.repositories.ArtsRepository
import javax.inject.Inject

class SearchArtsRemoteUseCaseImpl @Inject constructor(
    private val artsRepository: ArtsRepository
) : SearchArtsRemoteUseCase {
    override suspend operator fun invoke(query: String) : Result<List<Int>> {
        return artsRepository.searchArtsRemote(query)
    }
}