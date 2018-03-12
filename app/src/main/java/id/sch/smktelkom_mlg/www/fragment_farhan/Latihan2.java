package id.sch.smktelkom_mlg.www.fragment_farhan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import id.sch.smktelkom_mlg.www.fragment_farhan.Fragment_lat2.MultipleFragment;

public class Latihan2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan2);
    }

    public void multiple(View view) {
        Intent intent = new Intent(getApplicationContext(), MultipleFragment.class);
        startActivity(intent);
    }
}
