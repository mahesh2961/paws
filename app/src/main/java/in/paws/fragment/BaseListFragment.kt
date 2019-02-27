package `in`.paws.fragment

import `in`.paws.adapters.DogsCategoryAdapter
import `in`.paws.databinding.FragmentBreedListBinding
import `in`.paws.viewmodels.BaseCategoryViewModel
import android.os.Bundle
import android.view.*
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

/**
 * Fragment o display List of Categories
 */
const val TAG="BaseListFragment"
abstract class BaseListFragment : BaseFragment()
{
    @Inject
    lateinit var vmFactory: ViewModelProvider.Factory
    lateinit var viewModel:BaseCategoryViewModel
    lateinit var binding:FragmentBreedListBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =  FragmentBreedListBinding.inflate(inflater, container, false)

        viewModel = initializeViewModel(vmFactory)

        var adapter=getAdapter()
        setRecyclerView(adapter,binding)
        subscribeUi(adapter)

        return binding.root
    }

    private fun setRecyclerView(adapter:DogsCategoryAdapter, binding:FragmentBreedListBinding) {
        binding.pawsList.adapter = adapter
    }

    abstract fun initializeViewModel(factory:ViewModelProvider.Factory):BaseCategoryViewModel



    private fun getAdapter():DogsCategoryAdapter=DogsCategoryAdapter(viewModel)

    /**
     * Waits for updates to Model from ViewModel and applies changes accordingly
     */

    abstract fun subscribeUi(adapter: DogsCategoryAdapter)


}