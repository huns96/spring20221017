package org.zerock.domain.board;

import lombok.Data;

@Data
public class PageInfo {
	
	private boolean hasPrevButton;
	private boolean hasNextButton;
	private int jumpPrevPageNumber;
	private int jumpNextPageNumber;
	private int lastPageNumber;
	private int leftPageNumber;
	private int rightPageNumber;
	private int currentPageNumber;
	
}