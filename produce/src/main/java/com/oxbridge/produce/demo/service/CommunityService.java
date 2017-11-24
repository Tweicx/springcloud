package com.oxbridge.produce.demo.service;

import com.oxbridge.produce.demo.dao.CommunityMapper;
import com.oxbridge.produce.demo.model.community;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityService {
    @Autowired
    CommunityMapper communityMapper;

    public List<community> selectTop10() {
        return communityMapper.selectTop10();
    }
}
