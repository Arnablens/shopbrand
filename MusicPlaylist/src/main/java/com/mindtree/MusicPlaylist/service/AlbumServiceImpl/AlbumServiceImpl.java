package com.mindtree.MusicPlaylist.service.AlbumServiceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.MusicPlaylist.dto.AlbumDto;
import com.mindtree.MusicPlaylist.entity.Album;
import com.mindtree.MusicPlaylist.exception.MusicCompanyServiceException;
import com.mindtree.MusicPlaylist.repository.AlbumRepository;
import com.mindtree.MusicPlaylist.repository.ArtistRepository;
import com.mindtree.MusicPlaylist.repository.SongRepository;
import com.mindtree.MusicPlaylist.service.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService {

	@Autowired
	SongRepository songRepo;
	@Autowired
	AlbumRepository albumRepo;
	@Autowired
	ArtistRepository artistRepo;
	ModelMapper modelMapper = new ModelMapper();

	public List<Album> getAlbum() {
		// TODO Auto-generated method stub
		return albumRepo.findAll();
	}

	public String addAlbum(AlbumDto album) throws MusicCompanyServiceException {
		return null;
		// TODO Auto-generated method stub
	}

	private Album convertDtoToEntity(AlbumDto album) {
		// TODO Auto-generated method stub
		return modelMapper.map(album, Album.class);
	}

}
