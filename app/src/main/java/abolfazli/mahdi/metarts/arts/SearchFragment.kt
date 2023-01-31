package abolfazli.mahdi.metarts.arts

import abolfazli.mahdi.metarts.R
import abolfazli.mahdi.metarts.databinding.FragmentSearchBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import timber.log.Timber

@AndroidEntryPoint
class SearchFragment: Fragment(R.layout.fragment_search) {

    private val artsViewModel: SearchViewModel by viewModels()

    private var _binding: FragmentSearchBinding? = null

    private val binding get() = _binding!!

    private lateinit var artsAdapter: ArtsAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSearchSearchFragment.setOnClickListener {
            artsViewModel.search(binding.etSearchQuerySearchFragment.text.toString())
        }

        setupRecyclerView()

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                // Trigger the flow and start listening for values.
                // Note that this happens when lifecycle is STARTED and stops
                // collecting when the lifecycle is STOPPED
                artsViewModel.idState.collect {
                    if (it != null && it.isNotEmpty()) {
                        Timber.e(it.toString())
                        artsAdapter.submitList(it)
                    }

                }
            }
        }

    }

    private fun setupRecyclerView() {
        artsAdapter = ArtsAdapter()
        binding.rvArtsListSearchFragment.apply {
            adapter = artsAdapter

        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}