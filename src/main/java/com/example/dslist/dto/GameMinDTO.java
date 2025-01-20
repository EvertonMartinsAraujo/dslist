package com.example.dslist.dto;

import com.example.dslist.entities.Game;

public class GameMinDTO {
	
	private Long id;
	private String title;	
	private Integer year;
	private String imgUrl;
	private String short_Description;

	public GameMinDTO() {
	}

	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		short_Description = entity.getShort_Description();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShort_Description() {
		return short_Description;
	}
	
	
}
