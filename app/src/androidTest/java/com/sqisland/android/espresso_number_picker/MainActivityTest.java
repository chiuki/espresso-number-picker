package com.sqisland.android.espresso_number_picker;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.NumberPicker;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.isAssignableFrom;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
  public MainActivityTest() {
    super(MainActivity.class);
  }

  public void testClass() {
    getActivity();
    onView(withId(R.id.number_picker)).check(matches(isAssignableFrom(NumberPicker.class)));
  }
}