package in.paws.database;

import java.lang.System;

/**
 * * DAO TO handle data access
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\u00072\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\r\u001a\u00020\u000eH\'J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\'J\u001c\u0010\u0013\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\'J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0003H\'J\u001e\u0010\u0017\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00192\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u001a"}, d2 = {"Lin/paws/database/DogBreedDao;", "", "getCategory", "Lin/paws/database/DogCategory;", "category", "", "getCategoryAsync", "Landroidx/lifecycle/LiveData;", "getDogBreeds", "", "isSubCat", "", "getIsCategorySynced", "getNumberOfRows", "", "getSubCategories", "insertAll", "", "breeds", "setRandomImageForCategory", "imageUrl", "update", "dogCategory", "updateImage", "images", "", "app_debug"})
public abstract interface DogBreedDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Dog_Category where isSubCat=:isSubCat")
    public abstract androidx.lifecycle.LiveData<java.util.List<in.paws.database.DogCategory>> getDogBreeds(boolean isSubCat);
    
    /**
     * * Inserting with onConflict = OnConflictStrategy.IGNORE will not insert a Category if already available in DB
     *     * This will prevent duplication and will also make sure fully fetched Category is not overwritten
     */
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<in.paws.database.DogCategory> breeds);
    
    @androidx.room.Query(value = "SELECT COUNT(category) FROM Dog_Category")
    public abstract int getNumberOfRows();
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    in.paws.database.DogCategory dogCategory);
    
    @androidx.room.Query(value = "UPDATE Dog_Category SET imgUrl=:imageUrl Where category=:category")
    public abstract void setRandomImageForCategory(@org.jetbrains.annotations.Nullable()
    java.lang.String category, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Dog_Category WHERE category like :category")
    public abstract androidx.lifecycle.LiveData<java.util.List<in.paws.database.DogCategory>> getSubCategories(@org.jetbrains.annotations.NotNull()
    java.lang.String category);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Dog_Category WHERE category=:category")
    public abstract in.paws.database.DogCategory getCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Dog_Category WHERE category=:category")
    public abstract androidx.lifecycle.LiveData<in.paws.database.DogCategory> getCategoryAsync(@org.jetbrains.annotations.NotNull()
    java.lang.String category);
    
    @androidx.room.Query(value = "UPDATE Dog_Category set images=:images where category=:category")
    public abstract void updateImage(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> images, @org.jetbrains.annotations.NotNull()
    java.lang.String category);
    
    @androidx.room.Query(value = "SELECT isSynced FROM Dog_Category WHERE category=:category")
    public abstract boolean getIsCategorySynced(@org.jetbrains.annotations.NotNull()
    java.lang.String category);
}