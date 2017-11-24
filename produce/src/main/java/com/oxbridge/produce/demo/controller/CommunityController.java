package com.oxbridge.produce.demo.controller;

import com.oxbridge.produce.demo.model.community;
import com.oxbridge.produce.demo.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "community")
public class CommunityController {
    @Autowired
    CommunityService communityService;

    @GetMapping(value = "selectTop10")
    public List<community> selectTop10() {
        return communityService.selectTop10();
    }
}
