package com.dataservice.dataService.keyspace.perfmonitor;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.time.LocalDateTime;


@PrimaryKeyClass
public class EventKey {
    @PrimaryKeyColumn(ordinal = 0, name = "ip",type = PrimaryKeyType.PARTITIONED)
    private String ip;
    @PrimaryKeyColumn(ordinal = 1,name = "event_type",type = PrimaryKeyType.CLUSTERED)
    private String eventType;
    @PrimaryKeyColumn(ordinal = 2, name = "event_time_stamp", type = PrimaryKeyType.CLUSTERED)
    private LocalDateTime eventTimeStamp;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public LocalDateTime getEventTimeStamp() {
        return eventTimeStamp;
    }

    public void setEventTimeStamp(LocalDateTime eventTimeStamp) {
        this.eventTimeStamp = eventTimeStamp;
    }
}
