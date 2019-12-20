package com.mindtree.MusicPlaylist.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.MusicPlaylist.dto.AlbumDto;
import com.mindtree.MusicPlaylist.entity.Album;
import com.mindtree.MusicPlaylist.exception.MusicCompanyServiceException;

@Service
public interface AlbumService {
	public String addAlbum(AlbumDto album) throws MusicCompanyServiceException;

	public List<Album> getAlbum();

}
