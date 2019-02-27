package `in`.paws.fragment

import `in`.paws.R
import `in`.paws.adapters.DogsCategoryAdapter
import `in`.paws.viewmodels.BaseCategoryViewModel
import `in`.paws.viewmodels.DogCategoryViewModel
import android.os.Bundle
import android.view.*
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

class DogCategoryListFragment : BaseListFragment()
{
    lateinit var model:DogCategoryViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setHasOptionsMenu(true)
        return super.onCreateView(inflater, container, savedInstanceState)

    }

    fun refresh() {
        model.refresh()
    }

    override fun getTitle(): String {
        return getString(R.string.category_title)
    }

    override fun subscribeUi(adapter: DogsCategoryAdapter) {
        model.getCatgories().observe(viewLifecycleOwner, Observer { categories ->
            adapter.submitList(categories)
        })
    }



    override fun initializeViewModel(factory: ViewModelProvider.Factory): BaseCategoryViewModel {
        model= ViewModelProviders.of(this, factory).get(DogCategoryViewModel::class.java)
        return model;
    }


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

}