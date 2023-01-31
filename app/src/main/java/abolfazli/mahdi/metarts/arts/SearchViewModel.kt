package abolfazli.mahdi.metarts.arts

import abolfazli.mahdi.domain.arts.usecases.SearchArtsRemoteUseCase
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import arrow.core.computations.result
import arrow.core.valid
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val searchArtsRemoteUseCase: SearchArtsRemoteUseCase
) : ViewModel() {

    private val _idState = MutableStateFlow(emptyList<Int>())
    val idState: StateFlow<List<Int>> = _idState

    fun search(query: String) {
        viewModelScope.launch() {
            val result = searchArtsRemoteUseCase(query)
            when {
                result.isSuccess -> {
                    _idState.value = result.getOrNull() ?: emptyList()
                }
                result.isFailure -> {
                    //ArtIdListUiState.Error(artIdListResult.error)
                }
            }

        }
    }
}