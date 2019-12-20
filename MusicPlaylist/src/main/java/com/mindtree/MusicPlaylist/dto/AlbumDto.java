package com.mindtree.MusicPlaylist.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AlbumDto {
	private String albumName;
    @JsonIgnore
	private List<SongDto> songs;
	public AlbumDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AlbumDto(String albumName, List<SongDto> songs) {
		super();
		this.albumName = albumName;
		this.songs = songs;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public List<SongDto> getSongs() {
		return songs;
	}
	public void setSongs(List<SongDto> songs) {
		this.songs = songs;
	}
	

}
