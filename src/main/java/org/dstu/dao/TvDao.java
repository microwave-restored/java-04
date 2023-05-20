package org.dstu.dao;

import org.dstu.domain.Tv;
import org.hibernate.query.Query;

import java.util.List;

public class TvDao extends BaseDaoImpl<Tv, Integer> {
    public TvDao() {
        super(Tv.class);
    }

    public List<Tv> getAllByGroup(String resolution) {
        Query q = getSession().createQuery("FROM Tv WHERE Tv.resolution = \"" + resolution + "\"");
        return q.list();
    }
}
