package com.mvc.board;

import java.sql.Timestamp;

public class BoardDTO {
	
	private int bId;
	private String bWriter;
	private String bTitle;
	private String bContent;
	private Timestamp bDate;
	private int bHit;
	
	public BoardDTO() {
		
	}
	
	public BoardDTO(int bId, String bWriter, String bTitle, String bContent, Timestamp bDate, int bHit) {
		super();
		this.bId = bId;
		this.bWriter = bWriter;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bDate = bDate;
		this.bHit = bHit;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbWriter() {
		return bWriter;
	}

	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public Timestamp getbDate() {
		return bDate;
	}

	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}

	public int getbHit() {
		return bHit;
	}

	public void setbHit(int bHit) {
		this.bHit = bHit;
	}
	
	
	
	
}
