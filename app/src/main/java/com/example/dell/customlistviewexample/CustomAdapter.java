package com.example.dell.customlistviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    String[] names;
    int[] images;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, String[] names, int[] images) {
        this.context = context;
        this.names = names;
        this.images = images;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null){
            convertView = inflater.inflate(R.layout.sample_layout, null);

        }

        ImageView imageView = convertView.findViewById(R.id.pictureId);
        TextView textView = convertView.findViewById(R.id.nameId);

        imageView.setImageResource(images[position]);
        textView.setText(names[position]);

        return convertView;
    }
}
