package org.dstu.dao;

import org.dstu.domain.Manufacturer;

public class ManufacturerDao extends BaseDaoImpl<Manufacturer, Integer> {
    public ManufacturerDao() {
        super(Manufacturer.class);
    }
}
