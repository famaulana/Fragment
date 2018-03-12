package id.sch.smktelkom_mlg.www.fragment_farhan.Fragment_lat2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import id.sch.smktelkom_mlg.www.fragment_farhan.R;

/**
 * Created by Farhan on 12/03/2018.
 */
public class MultipleFragment extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_fragment);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.menuContainer, new MenuFragment()).commit();
        }
    }
}