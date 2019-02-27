package in.paws;

import android.view.View;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import in.paws.activities.MainActivity;
import in.paws.database.DogCategory;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;

public class MainActivityTest {
    @Rule public final ActivityRule<MainActivity> main= new ActivityRule<>(MainActivity.class);


    //Testing basic flow
    @Test public void shouldLaunchMainScreen() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        onView(ViewMatchers.withId(R.id.paws_list))
                .perform(
                        RecyclerViewActions.actionOnItemAtPosition(0, ViewActions.click())
                );

        try {
            onView(ViewMatchers.withId(R.id.paws_list)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
            onView(ViewMatchers.withId(R.id.paws_list))
                    .perform(
                            RecyclerViewActions.actionOnItemAtPosition(0, ViewActions.click())
                    );
        } catch (Exception e) {
            e.printStackTrace();

            onView(ViewMatchers.withId(R.id.image_list)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
            onView(ViewMatchers.withId(R.id.image_list))
                    .perform(
                            RecyclerViewActions.actionOnItemAtPosition(0, ViewActions.click())
                    );

        }

        onView(ViewMatchers.withId(R.id.full_image)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));


    }

}
