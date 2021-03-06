package com.liguang.app.activity;

import com.liguang.app.R;

/**
 * Created by a13088 on 2015/07/21.
 */
public enum Demo {

    BASIC(R.string.title_basic),
    CUSTOM_VIEW01(R.string.title_custom_view01),
    CUSTOM_VIEW02(R.string.title_custom_view02),
    IMITATION_LOOP(R.string.title_imitation_loop),
    YEARS(R.string.title_years),
    AUTO_SELECT(R.string.title_auto_select);

    public int titleResId;

    Demo(int titleResId) {
        this.titleResId = titleResId;
    }
}
