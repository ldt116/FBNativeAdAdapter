package me.timos.thuanle.fbnativeadadapterexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import me.timos.thuanle.fbnativeadadapter.FBNativeAdAdapter;

public class LinearAdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        MyAdapter adapter = new MyAdapter();
        FBNativeAdAdapter fbAdapter = FBNativeAdAdapter.Builder
                .with("321357575164976_321357668498300", adapter)
                .build();

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        rv.setAdapter(fbAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}
