package com.mindtree.MusicPlaylist.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Artist {
	@Id
	@Column(name = "artistName")
	private String artistName;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "artist")
	private List<Song> songs;

	public Artist() {
		super();
	}

	public Artist(String artistName, List<Song> songs) {
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

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

}
