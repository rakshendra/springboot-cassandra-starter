package com.dataservice.dataService.repository;

import com.dataservice.dataService.keyspace.perfmonitor.DirectoryEvent;
import com.dataservice.dataService.keyspace.perfmonitor.EventKey;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.stereotype.Repository;

@EnableCassandraRepositories
@Repository
public interface EventRepository extends CassandraRepository<DirectoryEvent, EventKey> {
}
