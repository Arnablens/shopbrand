package com.mindtree.MusicPlaylist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.MusicPlaylist.entity.Album;

@Repository
public interface AlbumRepository extends JpaRepository<Album, String>{

}
