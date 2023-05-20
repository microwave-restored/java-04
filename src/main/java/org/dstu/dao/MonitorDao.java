package org.dstu.dao;

import org.dstu.domain.Monitor;

public class MonitorDao extends BaseDaoImpl <Monitor, Integer> {
    public MonitorDao() {
        super(Monitor.class);
    }
}
