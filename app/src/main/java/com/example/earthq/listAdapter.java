package com.example.earthq;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class listAdapter extends ArrayAdapter<details> {
    public listAdapter(Activity context, ArrayList<details> index) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0,index);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView=convertView;
        if (listItemView==null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_layout,parent,false);

        }

        String country="";
        String extra="";

        details currenDetail=getItem(position);

        String currentLocation=currenDetail.getLocation();
        if(currentLocation.contains(",")){
            String[] parts=currentLocation.split(",");
            country=parts[1];
            extra=parts[0];
        }


        TextView magnitude_view=(TextView)listItemView.findViewById(R.id.magnitude);
        TextView country_view=(TextView)listItemView.findViewById(R.id.country);
        TextView extra_view=(TextView)listItemView.findViewById(R.id.extra);
        TextView date_view=(TextView)listItemView.findViewById(R.id.date);

        magnitude_view.setText((currenDetail.getMag()));
        country_view.setText(country);
        extra_view.setText(extra);
        date_view.setText(currenDetail.getDate());

        return listItemView;


    }
}
