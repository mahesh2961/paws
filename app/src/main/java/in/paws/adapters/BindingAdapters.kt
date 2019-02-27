package `in`.paws.adapters

import `in`.paws.R
import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions


@BindingAdapter("imageFromUrl")
fun bindImageFromUrl(view: ImageView, imageUrl: String?) {
    val requestOptions = RequestOptions()
    requestOptions.placeholder(R.drawable.placeholder)
    requestOptions.diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)


    Glide.with(view.context)
            .setDefaultRequestOptions(requestOptions)
            .load(imageUrl)
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(view)
}


@BindingAdapter("fullImage")
fun bindImageForFullImage(view: ImageView, imageUrl: String?) {
    val requestOptions = RequestOptions()
    requestOptions.error(R.drawable.image_error)
    requestOptions.diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)

    if (!imageUrl.isNullOrEmpty()) {
        Glide.with(view.context)
                .setDefaultRequestOptions(requestOptions)
                .load(imageUrl)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(view)
    }

    Log.d("bindImageForFullImage", "Tesing")
}






