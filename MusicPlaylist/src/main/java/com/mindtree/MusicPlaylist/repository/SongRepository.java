package com.mindtree.MusicPlaylist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.MusicPlaylist.entity.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer>{

}
