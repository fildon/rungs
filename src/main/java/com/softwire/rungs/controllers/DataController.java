package com.softwire.rungs.controllers;

import com.softwire.rungs.models.StatisticsModel;
import com.softwire.rungs.models.Stock;
import com.softwire.rungs.models.StockBo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataController {

    @RequestMapping(value="/data", method= RequestMethod.GET)
    public @ResponseBody StatisticsModel displayHome() {

        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        StockBo stockBo = (StockBo)appContext.getBean("stockBo");


        /** insert **/
//        Stock stock = new Stock();
//        stock.setStockCode("7668");
//        stock.setStockName("HAIO");
//        stockBo.save(stock);

        /** select **/
        Stock stock2 = stockBo.findByStockCode("7668");
        System.out.println(stock2);

        /** update **/
//        stock2.setStockName("HAIO-1");
//        stockBo.update(stock2);

        /** delete **/
//        stockBo.delete(stock2);

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