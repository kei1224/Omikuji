package jp.wings.nikkeibp.omikuji;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by satoshi on 2015/11/23.
 */
public class OmikujiPreferenceFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference);
    }
}
