package com.dataservice.dataService.controllers;

import com.dataservice.dataService.entities.MonitorData;
import com.dataservice.dataService.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/data")
public class DataController {

    @Autowired
    private EventService service;

    @PostMapping(path = "/add")
    public void addMonitorData(@RequestBody MonitorData monitorData){
        service.addEvent(monitorData);
    }
}
