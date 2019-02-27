package in.paws.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ImageListFragmentDirections {
  @NonNull
  public static ActionImageToFullImage actionImageToFullImage(@NonNull String imageUrl) {
    return new ActionImageToFullImage(imageUrl);
  }

  public static class ActionImageToFullImage implements NavDirections {
    private final HashMap arguments = new HashMap();

    public ActionImageToFullImage(@NonNull String imageUrl) {
      if (imageUrl == null) {
        throw new IllegalArgumentException("Argument \"imageUrl\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("imageUrl", imageUrl);
    }

    @NonNull
    public ActionImageToFullImage setImageUrl(@NonNull String imageUrl) {
      if (imageUrl == null) {
        throw new IllegalArgumentException("Argument \"imageUrl\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("imageUrl", imageUrl);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("imageUrl")) {
        String imageUrl = (String) arguments.get("imageUrl");
        __result.putString("imageUrl", imageUrl);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return in.paws.R.id.action_image_to_full_image;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getImageUrl() {
      return (String) arguments.get("imageUrl");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionImageToFullImage that = (ActionImageToFullImage) object;
      if (arguments.containsKey("imageUrl") != that.arguments.containsKey("imageUrl")) {
        return false;
      }
      if (getImageUrl() != null ? !getImageUrl().equals(that.getImageUrl()) : that.getImageUrl() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + (getImageUrl() != null ? getImageUrl().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionImageToFullImage(actionId=" + getActionId() + "){"
          + "imageUrl=" + getImageUrl()
          + "}";
    }
  }
}
