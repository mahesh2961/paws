package in.paws.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ImageFragmentArgs {
  private final HashMap arguments = new HashMap();

  private ImageFragmentArgs() {
  }

  private ImageFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ImageFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ImageFragmentArgs __result = new ImageFragmentArgs();
    bundle.setClassLoader(ImageFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("imageUrl")) {
      String imageUrl;
      imageUrl = bundle.getString("imageUrl");
      if (imageUrl == null) {
        throw new IllegalArgumentException("Argument \"imageUrl\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("imageUrl", imageUrl);
    } else {
      throw new IllegalArgumentException("Required argument \"imageUrl\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getImageUrl() {
    return (String) arguments.get("imageUrl");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("imageUrl")) {
      String imageUrl = (String) arguments.get("imageUrl");
      __result.putString("imageUrl", imageUrl);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ImageFragmentArgs that = (ImageFragmentArgs) object;
    if (arguments.containsKey("imageUrl") != that.arguments.containsKey("imageUrl")) {
      return false;
    }
    if (getImageUrl() != null ? !getImageUrl().equals(that.getImageUrl()) : that.getImageUrl() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (getImageUrl() != null ? getImageUrl().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ImageFragmentArgs{"
        + "imageUrl=" + getImageUrl()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ImageFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String imageUrl) {
      if (imageUrl == null) {
        throw new IllegalArgumentException("Argument \"imageUrl\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("imageUrl", imageUrl);
    }

    @NonNull
    public ImageFragmentArgs build() {
      ImageFragmentArgs result = new ImageFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setImageUrl(@NonNull String imageUrl) {
      if (imageUrl == null) {
        throw new IllegalArgumentException("Argument \"imageUrl\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("imageUrl", imageUrl);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getImageUrl() {
      return (String) arguments.get("imageUrl");
    }
  }
}
