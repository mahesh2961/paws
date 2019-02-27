package `in`.paws.pojos

import com.google.gson.annotations.SerializedName

open class BaseDogResponse<T> {

    @SerializedName("status")
    var status:String =""

    @SerializedName("message")
    var message:T?=null;
}