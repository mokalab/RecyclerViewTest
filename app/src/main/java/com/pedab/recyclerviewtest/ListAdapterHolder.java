package com.pedab.recyclerviewtest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Pirdad S on 14-11-06.
 */
public class ListAdapterHolder extends RecyclerView.Adapter<ListAdapterHolder.ViewHolder> {

    private LayoutInflater mInflater;
    private List<String> mItems;

    public ListAdapterHolder(Context context, List<String> items) {

        mInflater = LayoutInflater.from(context);
        mItems = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View itemView = mInflater.inflate(R.layout.layout_item, viewGroup, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        viewHolder.getTxtText().setText(mItems.get(i));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mTxtText;

        public ViewHolder(View itemView) {

            super(itemView);
            mTxtText = (TextView) itemView.findViewById(R.id.txtText);
        }

        public TextView getTxtText() {
            return mTxtText;
        }
    }
}
