package com.spring.web.board.paging;

import com.spring.web.board.search.SearchVO;

public class Paging {

	public static final int VIEW_POSTS_NUM = 10; // 한 페이지당 게시글 수
	public static final int VIEW_PAGE_NUM = 10; // 한 페이지당 보여줄 페이지 수
	
	private Integer totalPosts; // 총 게시글 수
	// DB에서 totalPosts를 얻어와야 한다.
	
	private Integer currentPage; // 현재 페이지 번호
	// 클라이언트에서 전달된 페이지 번호
	
	private Integer totalPage; // 게시판의 전체 페이지 수
	private Integer endPage; // 현재페이지 끝 번호
	private Integer startPage; // 현재페이지 시작번호
	
	private boolean prev; // 이전버튼 여부
	private boolean next; // 다음버튼 여부
	
	private SearchVO searchVO;
	
	public Paging(Integer totalPosts, 
					Integer currentPage, 
					SearchVO searchVO) {
		
		this.searchVO = searchVO;
		
		if(currentPage != null) {
			
			this.currentPage = currentPage;
			
		}else {
			this.currentPage = 1;
		}
		
		this.totalPosts = totalPosts;
		
		pagingMaker();
		
	}

	// 페이지 번호를 만들어주는 메소드
	private void pagingMaker() {
		
		totalPage = ((totalPosts -1) / VIEW_PAGE_NUM) +1;
		
		// 현재 페이지 만들기
		if(currentPage < 1 || currentPage > totalPage) {
			currentPage = 1;
		}
		
		// 끝 페이지 만들기
		endPage = (((currentPage -1) / VIEW_PAGE_NUM) +1) * VIEW_PAGE_NUM;
		
		if(endPage > totalPage) {
			endPage = totalPage;
		}
		
		startPage = (currentPage -1) / VIEW_PAGE_NUM * VIEW_PAGE_NUM +1;
		
		// 이전버튼 활성화 여부
		prev = (startPage == 1) ? false : true;
		
		// 다음버튼 활성화 여부 
		next = (endPage == totalPage) ? false : true;
		
	}

	public Integer getTotalPosts() {
		return totalPosts;
	}

	public void setTotalPosts(Integer totalPosts) {
		this.totalPosts = totalPosts;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getEndPage() {
		return endPage;
	}

	public void setEndPage(Integer endPage) {
		this.endPage = endPage;
	}

	public Integer getStartPage() {
		return startPage;
	}

	public void setStartPage(Integer startPage) {
		this.startPage = startPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public SearchVO getSearchVO() {
		return searchVO;
	}

	public void setSearchVO(SearchVO searchVO) {
		this.searchVO = searchVO;
	}
	
	
	
	
	
}







