package `in`.paws.utils

import `in`.paws.database.DogCategory

class ParsingUtils {
    companion object {

        fun getDogCategoryList( message:Map<String,List<String>>?):List<DogCategory>
        {
           var categoryList:MutableList<DogCategory> = mutableListOf()
           message?.forEach{(category,subCat) ->
               var dogCategory=DogCategory(category,subCat,false)
               categoryList.add(dogCategory)

               if(subCat.isNotEmpty())
               {
                   subCat.forEach {
                       var dogSubCategory=DogCategory(category+"-"+it, emptyList(),true)
                       categoryList.add(dogSubCategory)
                   }
               }
           }
            return categoryList
        }

    }
}