package `in`.paws.adapters

import `in`.paws.database.DogCategory
import `in`.paws.databinding.ListItemBreadBinding
import `in`.paws.fragment.DogCategoryListFragmentDirections
import `in`.paws.fragment.DogSubCategoryListFragmentDirections
import `in`.paws.viewmodels.BaseCategoryViewModel
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView


/**
 * Adapter to Display Category List
 */
class DogsCategoryAdapter(var model: BaseCategoryViewModel) : ListAdapter<DogCategory, DogsCategoryAdapter.ViewHolder>(DiffCallback()) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = getItem(position)
        holder.apply {
            bind(createOnClickListener(category), category, model)
            itemView.tag = category
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ListItemBreadBinding.inflate(
                LayoutInflater.from(parent.context), parent, false))
    }

    private fun createOnClickListener(category: DogCategory): View.OnClickListener {
        return View.OnClickListener {
            //Onclick
            if (!category.isSubCat) {
                if (!category.subCategory.isNullOrEmpty()) {
                    val direction = DogCategoryListFragmentDirections.actionCategoryToSubCategory(category.category)
                    it.findNavController().navigate(direction)
                } else {
                    val direction = DogCategoryListFragmentDirections.actionCategoryToImages(category.category)
                    it.findNavController().navigate(direction)
                }
            } else {
                val direction = DogSubCategoryListFragmentDirections.actionSubcategoryToImages(category.category)
                it.findNavController().navigate(direction)

            }

        }
    }

    class ViewHolder(
            private val binding: ListItemBreadBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(listener: View.OnClickListener, item: DogCategory, model: BaseCategoryViewModel) {
            binding.apply {
                clickListener = listener
                dog = item
                viewModel = model
                executePendingBindings()
            }
        }
    }
}

/**
 * checks if List contains same objects after notifyDatasetChange
 */
private class DiffCallback : DiffUtil.ItemCallback<DogCategory>() {

    override fun areItemsTheSame(oldItem: DogCategory, newItem: DogCategory): Boolean {
        return oldItem.category.equals(newItem.category)
    }

    override fun areContentsTheSame(oldItem: DogCategory, newItem: DogCategory): Boolean {
        return oldItem.images.equals(newItem.images)
    }
}