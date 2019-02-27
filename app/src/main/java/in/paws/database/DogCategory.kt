package `in`.paws.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Dog_Category")
data class DogCategory(
        @PrimaryKey @ColumnInfo(name = "category")
        var category: String = "",
        var subCategory: List<String> = emptyList(),
        var isSubCat:Boolean,
        var images:MutableList<String> = mutableListOf(),
        var isSynced:Boolean=false,
        var imgUrl:String ="")
{

}