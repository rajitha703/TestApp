package com.springelasticsearch.app;

import  org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * Created by rajithar on 20/8/18.
 */
public interface EntityServiceCustom {
  Show save(Show show);
  void delete(Show show);
  Show findOne(String id);
  Iterable<Show> findAll();
  List<Show> findByTitle(String title);
  List<Show> findByTitleLike(String title);
  List<Show> findByActor(String actor);
  List<Show> findByDirector(String director);
  List<Show> findByGenre(String genre);
  List<Show> findByLanguage(String language);
}
