package com.mindtree.MusicPlaylist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "songId")
	private int songId;

	@Column(name = "songName")
	private String songName;

	@ManyToOne
	@JoinColumn(name = "albumName", nullable = false)
	private Album album;

	@ManyToOne
	@JoinColumn(name = "artistName", nullable = false)
	private Artist artist;

	public Song() {
		super();
	}

	public Song(int songId, String songName, Album album, Artist artist) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.album = album;
		this.artist = artist;
	}

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

}
