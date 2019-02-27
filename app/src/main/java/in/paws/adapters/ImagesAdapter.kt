package `in`.paws.adapters

import `in`.paws.databinding.ImageListItemBinding
import `in`.paws.fragment.ImageListFragmentDirections
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ImagesAdapter : ListAdapter<String, ImagesAdapter.ViewHolder>(DiffCall()) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val imgUrl = getItem(position)
        holder.apply {
            bind(createOnClickListener(imgUrl),imgUrl)
            itemView.tag = imgUrl
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ImageListItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false))
    }

    private fun createOnClickListener(image: String): View.OnClickListener {
        return View.OnClickListener {
            //Onclick
            val direction = ImageListFragmentDirections.actionImageToFullImage(image)
            it.findNavController().navigate(direction)
        }
    }

    class ViewHolder(
            private val binding: ImageListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(listener: View.OnClickListener, item: String) {
            binding.apply {
                clickListener = listener
                imageUrl = item
                executePendingBindings()
            }
        }
    }
}

/**
 * checks if List contains same objects after notifyDatasetChange
 */
private class DiffCall : DiffUtil.ItemCallback<String>() {

    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem.equals(newItem)
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem.equals(newItem)
    }
}