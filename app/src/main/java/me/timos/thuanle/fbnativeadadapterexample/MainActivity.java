package me.timos.thuanle.fbnativeadadapterexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AudienceNetworkAds.initialize(this);
        AdSettings.addTestDevice("ef656cbc-bb56-4304-8967-53f26a581aa1");

        setContentView(R.layout.activity_main);

        findViewById(R.id.btnLinear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, LinearAdActivity.class);
                startActivity(it);
            }
        });

        findViewById(R.id.btnGrid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, StaggeredGridAdActivity.class);
                startActivity(it);
            }
        });

        findViewById(R.id.btnGridSpan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, GridSpanAdActivity.class);
                startActivity(it);
            }
        });
    }
}
