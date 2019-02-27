package `in`.paws.fragment

import `in`.paws.R
import `in`.paws.databinding.FragmentImageBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.doOnLayout
import androidx.core.view.updateLayoutParams
import com.ablanco.zoomy.Zoomy
import com.bumptech.glide.Glide


class ImageFragment : BaseFragment() {
    override fun getTitle(): String {
        return getString(R.string.image_title);
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var binding =  FragmentImageBinding.inflate(inflater, container, false)
        var img = ImageFragmentArgs.fromBundle(arguments!!).imageUrl
        binding.imageUrl=img
        val builder = Zoomy.Builder(activity).target(binding.fullImage)
        builder.register()

        return binding.root

    }
}