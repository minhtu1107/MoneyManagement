package com.unicorn.moneymanagement;

import android.support.v4.app.Fragment;

/**
 * Created by tu.tranhienminh on 3/31/2018.
 */
public class MoneyManagementActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return MoneyManagementFragment.newInstance();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_masterdetail;
    }
}
