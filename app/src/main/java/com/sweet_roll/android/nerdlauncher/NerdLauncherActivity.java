package com.sweet_roll.android.nerdlauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NerdLauncherActivity extends SingleFragmentActivity {

    @Override
    protected void Fragment createFragment()
    {
        return NerdLauncherFragment.newInstance();
    }
}
