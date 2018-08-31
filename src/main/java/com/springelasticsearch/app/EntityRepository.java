package com.springelasticsearch.app;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by rajithar on 20/8/18.
 */
public interface EntityRepository extends ElasticsearchRepository<Show, String> {

  List<Show> findByTitle(String title);
  List<Show> findByTitleLike(String title);
  List<Show> findByActor(String leadActors);
  List<Show> findByDirector(String director);
  List<Show> findByGenre(String genre);
  List<Show> findByLanguage(String language);

}

