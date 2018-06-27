package com.example.kemie_home.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kemie-home on 2016/7/31.
 */
public class MovieAdapter extends BaseAdapter {
    private LayoutInflater myInflater;
    private ArrayList<Movie> movies;
    public MovieAdapter(Context c, ArrayList<Movie> movie){
        myInflater = (LayoutInflater) c.getSystemService(c.LAYOUT_INFLATER_SERVICE);
        this.movies = movie;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int i) {
        return movies.get(i);
    }

    @Override
    public long getItemId(int i) {
        return movies.indexOf(getItem(i));
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Movie movie = (Movie) getItem(i);

        View v = myInflater.inflate(R.layout.item_view, null);
        ImageView pic2 = (ImageView) v.findViewById(R.id.pic);
        pic2.setImageResource(movie.pic);
        TextView name = (TextView) v.findViewById(R.id.name);
        name.setText(movie.name);
        TextView date = (TextView) v.findViewById(R.id.date);
        date.setText(movie.date);
        TextView intro = (TextView) v.findViewById(R.id.intro);
        intro.setText(movie.intro);
        return v;
    }
}
