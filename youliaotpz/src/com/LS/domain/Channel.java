package com.LS.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Channel {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String content;
	
	@OneToMany(mappedBy="channel")
	private Set<Atlas> atlases;
	
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Set<Atlas> getAtlases() {
		return atlases;
	}
	public void setAtlases(Set<Atlas> atlases) {
		this.atlases = atlases;
	}
	
}
