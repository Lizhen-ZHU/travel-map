package com.example.travelmap;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {
    private List<MovieInfo> movie;
    private Context context;

    public MovieAdapter(List<MovieInfo> movie, Context context) {
        this.movie = movie;
        this.context = context;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_movie, parent, false);
        return new MovieViewHolder(view, context);
    }


    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        MovieInfo movies = movie.get(position);
        holder.getMovieNameView().setText(movies.getName());
        holder.getMovieInfoView().setText(movies.getLocation());
        holder.getMoviePhotoView().setImageResource(movies.getPhotoID());
    }

    @Override
    public int getItemCount() {
        return movie.size();
    }

}
