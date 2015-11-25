package jp.wings.nikkeibp.omikuji;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

/**
 * Created by satoshi on 2015/11/23.
 */
public class OmikujiPreferenceActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(android.R.id.content, new OmikujiPreferenceFragment());
        fragmentTransaction.commit();
    }
}
