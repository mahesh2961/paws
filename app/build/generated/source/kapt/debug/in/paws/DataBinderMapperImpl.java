package in.paws;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import in.paws.databinding.ActivityMainBindingImpl;
import in.paws.databinding.FragmentBreedListBindingImpl;
import in.paws.databinding.FragmentCategoryImagesBindingImpl;
import in.paws.databinding.FragmentImageBindingImpl;
import in.paws.databinding.ImageListItemBindingImpl;
import in.paws.databinding.ListItemBreadBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTBREEDLIST = 2;

  private static final int LAYOUT_FRAGMENTCATEGORYIMAGES = 3;

  private static final int LAYOUT_FRAGMENTIMAGE = 4;

  private static final int LAYOUT_IMAGELISTITEM = 5;

  private static final int LAYOUT_LISTITEMBREAD = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.paws.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.paws.R.layout.fragment_breed_list, LAYOUT_FRAGMENTBREEDLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.paws.R.layout.fragment_category_images, LAYOUT_FRAGMENTCATEGORYIMAGES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.paws.R.layout.fragment_image, LAYOUT_FRAGMENTIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.paws.R.layout.image_list_item, LAYOUT_IMAGELISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(in.paws.R.layout.list_item_bread, LAYOUT_LISTITEMBREAD);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBREEDLIST: {
          if ("layout/fragment_breed_list_0".equals(tag)) {
            return new FragmentBreedListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_breed_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCATEGORYIMAGES: {
          if ("layout/fragment_category_images_0".equals(tag)) {
            return new FragmentCategoryImagesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_category_images is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTIMAGE: {
          if ("layout/fragment_image_0".equals(tag)) {
            return new FragmentImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_image is invalid. Received: " + tag);
        }
        case  LAYOUT_IMAGELISTITEM: {
          if ("layout/image_list_item_0".equals(tag)) {
            return new ImageListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for image_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMBREAD: {
          if ("layout/list_item_bread_0".equals(tag)) {
            return new ListItemBreadBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_bread is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(6);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "imageUrl");
      sKeys.put(2, "viewModel");
      sKeys.put(3, "dog");
      sKeys.put(4, "clickListener");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_main_0", in.paws.R.layout.activity_main);
      sKeys.put("layout/fragment_breed_list_0", in.paws.R.layout.fragment_breed_list);
      sKeys.put("layout/fragment_category_images_0", in.paws.R.layout.fragment_category_images);
      sKeys.put("layout/fragment_image_0", in.paws.R.layout.fragment_image);
      sKeys.put("layout/image_list_item_0", in.paws.R.layout.image_list_item);
      sKeys.put("layout/list_item_bread_0", in.paws.R.layout.list_item_bread);
    }
  }
}
