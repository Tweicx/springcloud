package com.oxbridge.produce.demo.dao;

import com.oxbridge.produce.demo.model.community;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommunityMapper {
    int deleteByPrimaryKey(String communityId);

    int insert(community record);

    int insertSelective(community record);

    community selectByPrimaryKey(String communityId);

    int updateByPrimaryKeySelective(community record);

    int updateByPrimaryKeyWithBLOBs(community record);

    int updateByPrimaryKey(community record);

    List<community> selectTop10();
}