package com.example.lanouhn.zhibo.utils;

import com.example.lanouhn.zhibo.view.App;

public class CommonUtil {

    public static int dip2px(float dpValue) {
        float scale = App.getContext().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
