package com.gjg.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaderBoardController {

    @RequestMapping(value = "/leaderboard")
    String leaderBoard(){
        return "this is a leader board";
    }





}
