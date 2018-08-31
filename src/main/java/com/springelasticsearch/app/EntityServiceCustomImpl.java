package com.springelasticsearch.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by rajithar on 20/8/18.
 */
@Service
public class EntityServiceCustomImpl implements EntityServiceCustom {

  @Autowired
  private EntityRepository entityRepository;

  @Override
  public Show save(Show show) {
    return entityRepository.save(show);
  }

  @Override
  public void delete(Show show) {
    entityRepository.delete(show);
  }

  @Override
  public Show findOne(String id) {
    return entityRepository.findOne(id);
  }

  @Override
  public Iterable<Show> findAll() {
    return entityRepository.findAll();
  }

  @Override
  public List<Show> findByTitleLike(String title) {
    return entityRepository.findByTitleLike(title);
  }

  @Override
  public List<Show> findByTitle(String title) {
    return entityRepository.findByTitle(title);
  }

  @Override
  public List<Show> findByActor(String actor) {
    return entityRepository.findByActor(actor);
  }

  @Override
  public List<Show> findByDirector(String director) {
    return entityRepository.findByDirector(director);
  }

  @Override
  public List<Show> findByGenre(String genre) {
    return entityRepository.findByGenre(genre);
  }

  @Override
  public List<Show> findByLanguage(String language) {
    return entityRepository.findByLanguage(language);
  }
}
