package `in`.paws.fragment

import `in`.paws.R
import `in`.paws.adapters.ImagesAdapter
import `in`.paws.databinding.FragmentCategoryImagesBinding
import `in`.paws.viewmodels.CategoryImageViewModel
import android.os.Bundle
import android.view.*
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import javax.inject.Inject

class ImageListFragment :BaseFragment(){

    @Inject
    lateinit var vmFactory: ViewModelProvider.Factory
    lateinit var viewModel: CategoryImageViewModel
    lateinit var category:String


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var binding =  FragmentCategoryImagesBinding.inflate(inflater, container, false)
        viewModel= ViewModelProviders.of(this, vmFactory).get(CategoryImageViewModel::class.java)
        binding.viewModel=viewModel

        var adapter=getAdapter()
        setRecyclerView(adapter,binding)
        subscribeUi(adapter)
        setHasOptionsMenu(true)

        return binding.root
    }

    override fun getTitle(): String {
        return getString(R.string.images_title)
    }


    private fun subscribeUi(adapter: ImagesAdapter)
    {
        category = DogSubCategoryListFragmentArgs.fromBundle(arguments!!).category
        viewModel.getCategory(category).observe(viewLifecycleOwner, Observer { category ->
             if(category.isSynced)adapter.submitList(category.images) //Todo shift this logic to data binding
        })
    }

    private fun setRecyclerView(adapter: ImagesAdapter, binding: FragmentCategoryImagesBinding) {

        binding.imageList.apply {
            setAdapter(adapter)
            layoutManager=GridLayoutManager(context,1)
        }
    }

    private fun getAdapter() = ImagesAdapter()

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.refresh_menu, menu);
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return (when(item?.itemId) {
            R.id.action_refresh -> {
                refresh()
                true
            }
            else ->
                super.onOptionsItemSelected(item)
        })
    }

    fun refresh()
    {
        viewModel.referesh()
    }

}