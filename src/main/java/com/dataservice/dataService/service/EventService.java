package com.dataservice.dataService.service;

import com.dataservice.dataService.entities.MonitorData;
import com.dataservice.dataService.keyspace.perfmonitor.DirectoryEvent;
import com.dataservice.dataService.keyspace.perfmonitor.EventKey;
import com.dataservice.dataService.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZoneId;

@Service
public class EventService {

    @Autowired
    private EventRepository repository;

    public DirectoryEvent addEvent(MonitorData monitorData){
        DirectoryEvent event = new DirectoryEvent();
        EventKey key = new EventKey();
        key.setIp(monitorData.getIp());
        key.setEventType(monitorData.getEventType());
        key.setEventTimeStamp(monitorData.getEventTimeStamp().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
        event.setEventKey(key);
        event.setDirectory(monitorData.isDirectory());
        event.setFilePath(monitorData.getFilePath());

        repository.save(event);
        return event;
    }
}
