package com.example.Book_My_Show.Services;

import com.example.Book_My_Show.Converters.MovieConverter;
import com.example.Book_My_Show.Entites.MovieEntity;
import com.example.Book_My_Show.EntryDtos.MovieEntryDto;
import com.example.Book_My_Show.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
  @Autowired
  MovieRepository mr;


  public String addMove(MovieEntryDto movieEntryDto)throws Exception{

    MovieEntity movieEntity = MovieConverter.convertEntryDtoToEntity(movieEntryDto);

    mr.save(movieEntity);

    return "Movie added Successfully";
  }

  public MovieEntity getMovieById(int id)throws Exception{

    MovieEntity movieEntity = mr.findById(id).get();
    if(movieEntity == null){
      throw new Exception("Movie not Found");
    }

    return movieEntity;

  }

  public List<MovieEntity> getAllMovies(){
    List<MovieEntity> movieEntityList = mr.findAll();

    return movieEntityList;
  }
}
