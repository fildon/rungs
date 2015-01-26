package com.softwire.rungs.controllers;

import com.softwire.rungs.models.StatisticsModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataController {
    @RequestMapping(value="/data", method= RequestMethod.GET)
    public @ResponseBody StatisticsModel displayHome() {
        StatisticsModel statisticsModel = new StatisticsModel();
        statisticsModel.p1 = "Simon";
        statisticsModel.p2 = "Rupert";
        return statisticsModel;
    }

    @RequestMapping(value="/data", method= RequestMethod.POST)
    public @ResponseBody StatisticsModel putData(){

        //TODO How to get data in from request message body

        StatisticsModel statisticsModel = new StatisticsModel();
        statisticsModel.p1 = "Simon";
        statisticsModel.p2 = "Rupert";
        return statisticsModel;
    }
}