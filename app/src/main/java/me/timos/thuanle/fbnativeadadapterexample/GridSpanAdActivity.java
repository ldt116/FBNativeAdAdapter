package me.timos.thuanle.fbnativeadadapterexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import me.timos.thuanle.fbnativeadadapter.FBNativeAdAdapter;

public class GridSpanAdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        GridLayoutManager lm = new GridLayoutManager(this, 3);
        MyAdapter adapter = new MyAdapter();
        FBNativeAdAdapter fbAdapter = FBNativeAdAdapter.Builder.with("469109283477914_473204296401746", adapter)
                .adItemIterval(9)
                .enableSpanRow(lm)
                .build();

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(lm);
        rv.setAdapter(fbAdapter);
    }
}
