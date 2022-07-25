package com.join.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.join.domain.JoinDTO;

@Mapper
public interface JoinMapper {
	
	public int insertJoin(JoinDTO params);

//	public JoinDTO selectJoinDetail(Long id);
//
//	public int updateJoin(JoinDTO params);
//
//	public int deleteJoin(Long idx);
//
//	public List<JoinDTO> selectJoinList(JoinDTO params);
//
//	public int selectJoinTotalCount(JoinDTO params);

}