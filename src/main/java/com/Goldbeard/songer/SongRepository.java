package com.Goldbeard.songer;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepository extends CrudRepository<Song, Long> {

     public List<Song> title(String title);
}
