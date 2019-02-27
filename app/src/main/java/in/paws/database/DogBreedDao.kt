package `in`.paws.database

import androidx.lifecycle.LiveData
import androidx.room.*

/**
 * DAO TO handle data access
 */
@Dao
interface DogBreedDao {
    @Query("SELECT * FROM Dog_Category where isSubCat=:isSubCat")
    fun getDogBreeds(isSubCat: Boolean) : LiveData<List<DogCategory>>

    /**
     * Inserting with onConflict = OnConflictStrategy.IGNORE will not insert a Category if already available in DB
     * This will prevent duplication and will also make sure fully fetched Category is not overwritten
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAll(breeds: List<DogCategory>)


    @Query("SELECT COUNT(category) FROM Dog_Category")
    fun getNumberOfRows(): Int

    @Update
    fun update( dogCategory: DogCategory)


    @Query("UPDATE Dog_Category SET imgUrl=:imageUrl Where category=:category")
    fun setRandomImageForCategory(category: String?,imageUrl:String?)


    @Query("SELECT * FROM Dog_Category WHERE category like :category")
    fun getSubCategories(category: String) : LiveData<List<DogCategory>>

    @Query("SELECT * FROM Dog_Category WHERE category=:category")
    fun getCategory(category: String) : DogCategory


    @Query("SELECT * FROM Dog_Category WHERE category=:category")
    fun getCategoryAsync(category: String) : LiveData<DogCategory>

    @Query("UPDATE Dog_Category set images=:images where category=:category")
    fun updateImage( images:MutableList<String>,category: String)


    @Query("SELECT isSynced FROM Dog_Category WHERE category=:category")
    fun getIsCategorySynced(category: String) : Boolean

}