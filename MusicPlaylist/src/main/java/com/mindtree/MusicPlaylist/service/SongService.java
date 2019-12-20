package com.mindtree.MusicPlaylist.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.MusicPlaylist.dto.SongDto;
import com.mindtree.MusicPlaylist.exception.MusicCompanyServiceException;

@Service
public interface SongService {
	public String addSong(SongDto song);

	public List<SongDto> getSongBySinger(int songId) throws MusicCompanyServiceException;

	public int getNumberOfSongsInAlbum(String albumName) throws MusicCompanyServiceException;

}
