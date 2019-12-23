package com.mindtree.MusicPlaylist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.MusicPlaylist.dto.AlbumDto;
import com.mindtree.MusicPlaylist.dto.SongDto;
import com.mindtree.MusicPlaylist.entity.Album;
import com.mindtree.MusicPlaylist.exception.MusicCompanyServiceException;
import com.mindtree.MusicPlaylist.service.AlbumService;
import com.mindtree.MusicPlaylist.service.ArtistService;
import com.mindtree.MusicPlaylist.service.SongService;

@RestController
public class MusicAppController {
	@Autowired
	ArtistService artistService;
	@Autowired
	SongService songService;
	@Autowired
	AlbumService albumService;
	
	@PostMapping( value="/addSong")
	public String addSong(@RequestBody SongDto song)
	{
		 return songService.addSong(song);
		 
	}
	@PostMapping(value="/addAlbum")
	public String addAlbum(@RequestBody AlbumDto album) throws MusicCompanyServiceException
	{
		return albumService.addAlbum(album);
	}
	@GetMapping("/getSongBySinger/{songId}")
	public List<SongDto> getSongBySinger(@PathVariable int songId) throws MusicCompanyServiceException
	{
		return  songService.getSongBySinger(songId); 
		
	}
	
	@GetMapping("/getAlbum")
	public List<Album> getTest(){
		List<Album> albums=albumService.getAlbum();
		return albums;
	}
	@GetMapping("/getNumberOfSongsInAlbum/{albumName}")
	public int getNumberOfSongsInAlbum(@PathVariable String albumName) throws MusicCompanyServiceException
	{
		return songService.getNumberOfSongsInAlbum(albumName);
	}
	@GetMapping("/messageInfo")
	public String hello(){
		System.out.println("hello");
		return "hello";
	}
	

}
