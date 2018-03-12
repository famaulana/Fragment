package id.sch.smktelkom_mlg.www.fragment_farhan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Index extends AppCompatActivity {
    Button toast, pict, alarm, maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        toast = findViewById(R.id.toast);
        pict = findViewById(R.id.pict);
        alarm = findViewById(R.id.alarm);
        maps = findViewById(R.id.maps);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Index.this, Latihan1.class);
                startActivity(intent);
            }
        });

        pict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Index.this, Latihan2.class);
                startActivity(intent);
            }
        });

        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Index.this, Latihan3.class);
                startActivity(intent);
            }
        });

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Index.this, Latihan4.class);
                startActivity(intent);
            }
        });
    }
}
