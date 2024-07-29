package com.example.customadapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class listviewrow extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] itemName;
    private final int[] imageId;
    private final String[] itemDescription;

    public listviewrow(Activity context, int[] imgId, String[] itemNam, String[] itemDesc) {
        super(context, R.layout.activity_listviewrow, itemNam);
        this.context = context;
        this.imageId = imgId;
        this.itemName = itemNam;
        this.itemDescription = itemDesc;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            listItemView = inflater.inflate(R.layout.activity_listviewrow, parent, false);
        }

        ImageView imageView = listItemView.findViewById(R.id.icon);
        TextView itemTitle = listItemView.findViewById(R.id.item);
        TextView descTextView = listItemView.findViewById(R.id.itemdesc);

        imageView.setImageResource(imageId[position]);
        itemTitle.setText(itemName[position]);
        descTextView.setText(itemDescription[position]);

        return listItemView;
    }
}