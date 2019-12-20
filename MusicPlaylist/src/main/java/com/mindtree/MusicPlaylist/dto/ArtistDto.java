package com.mindtree.MusicPlaylist.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ArtistDto {
	
	private String artistName;
	@JsonIgnore
	private List<SongDto> songs;
	public ArtistDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArtistDto(String artistName, List<SongDto> songs) {
		super();
		this.artistName = artistName;
		this.songs = songs;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public List<SongDto> getSongs() {
		return songs;
	}
	public void setSongs(List<SongDto> songs) {
		this.songs = songs;
	}
	

}
