package com.dataservice.dataService.controllers;

import com.dataservice.dataService.entities.MonitorData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/data")
public class DataController {

    @PostMapping(path = "/add")
    public void addMonitorData(@RequestBody MonitorData monitorData){
        System.out.println(monitorData.getFilePath());
    }
}
