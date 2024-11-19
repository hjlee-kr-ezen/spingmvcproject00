package com.jjangplay.board.mapper;

import org.apache.ibatis.annotations.Select;

public interface BoardMapper {

	@Select("Select sysdate from dual")
	public String getTime();
}
