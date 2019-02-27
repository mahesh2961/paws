package `in`.paws.fragment

import `in`.paws.R
import `in`.paws.adapters.DogsCategoryAdapter
import `in`.paws.viewmodels.BaseCategoryViewModel
import `in`.paws.viewmodels.DogSubCategoryViewModel
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

class DogSubCategoryListFragment:BaseListFragment() {

    lateinit var model:DogSubCategoryViewModel
    lateinit var category:String

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setHasOptionsMenu(false)
        return super.onCreateView(inflater, container, savedInstanceState)


    }

    override fun initializeViewModel(factory: ViewModelProvider.Factory): BaseCategoryViewModel {
        model= ViewModelProviders.of(this, factory).get(DogSubCategoryViewModel::class.java)
        return model;

    }

    override fun subscribeUi(adapter: DogsCategoryAdapter) {
        category = DogSubCategoryListFragmentArgs.fromBundle(arguments!!).category

        model.getSubCategories(category).observe(viewLifecycleOwner, Observer { categories ->
            adapter.submitList(categories)
        })
    }


    override fun getTitle(): String {
        return getString(R.string.sub_category_title)
    }

}