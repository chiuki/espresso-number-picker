package com.sqisland.android.espresso_number_picker;

import android.test.AndroidTestCase;
import android.widget.NumberPicker;

public class NumberPickerTest extends AndroidTestCase {
  public void testNumberPicker() {
    NumberPicker picker = new NumberPicker(getContext());
    assertNotNull(picker);
  }
}
