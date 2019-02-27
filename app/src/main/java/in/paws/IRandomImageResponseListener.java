package in.paws;

import in.paws.pojos.RandomCategoryImage;

public interface IRandomImageResponseListener {
     void onRandomImageResponseSuccess(RandomCategoryImage randomCategoryImage);
    void onRandomImageResponseThrowable(Throwable e);

}
