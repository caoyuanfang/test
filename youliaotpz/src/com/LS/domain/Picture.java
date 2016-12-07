package com.LS.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table
public class Picture {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String storageName;
	private String expain;
	
	@ManyToMany
	@JoinTable(
			name = "atlas_picture", 
			joinColumns = @JoinColumn(name = "picture_id"), 
			inverseJoinColumns = @JoinColumn(name = "atlas_id")
	)
	private Set<Atlas> Atlases;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStorageName() {
		return storageName;
	}
	public void setStorageName(String storageName) {
		this.storageName = storageName;
	}
	public String getExpain() {
		return expain;
	}
	public void setExpain(String expain) {
		this.expain = expain;
	}
	public Set<Atlas> getAtlases() {
		return Atlases;
	}
	public void setAtlases(Set<Atlas> atlases) {
		Atlases = atlases;
	}
}
