package me.timos.thuanle.fbnativeadadapterexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by thuanle on 2/13/17.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.VH> {
    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_rv, parent, false);
        return new VH(view);
    }

    @Override
    public int getItemCount() {
        return 100;
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        holder.tv.setText(String.valueOf(position));
    }

    static class VH extends RecyclerView.ViewHolder {
        TextView tv;

        VH(View itemView) {
            super(itemView);

            tv = (TextView) itemView.findViewById(R.id.tv);
        }
    }
}
