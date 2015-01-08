package com.sqisland.android.espresso_number_picker;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.NumberPicker;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
  public MainActivityTest() {
    super(MainActivity.class);
  }

  public void testClass() {
    getActivity();
    onView(withId(R.id.number_picker)).check(matches(isAssignableFrom(NumberPicker.class)));
  }
}