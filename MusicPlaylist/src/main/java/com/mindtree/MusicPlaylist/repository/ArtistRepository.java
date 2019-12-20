package com.mindtree.MusicPlaylist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.MusicPlaylist.entity.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, String>{

}
