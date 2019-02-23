package com.zsy.shoppingselect;

import android.graphics.Color;
import android.widget.CompoundButton;

public class ButtonSelectUtils {
    public static void setSelectTrue(CompoundButton button){
        button.setTextColor(Color.parseColor("#26a8fe"));
    }
    public static void setSelectFalse(CompoundButton button){
        button.setTextColor(Color.parseColor("#343434"));
    }
}
