import org.dstu.dao.ManufacturerDao;
import org.dstu.dao.TvDao;
import org.dstu.dao.MonitorDao;
import org.dstu.domain.Manufacturer;
import org.dstu.domain.Tv;
import org.dstu.domain.Monitor;
import org.dstu.util.HibernateUtil;
import org.hibernate.Metamodel;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.metamodel.EntityType;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Session session = HibernateUtil.getSession();
        TvDao tvDao = new TvDao();

        Tv tv = new Tv();
        tv.setModel("G-12");
        tv.setMatrix("OLED");
        tv.setDiagonal("43″");
        tv.setResolution("2160p");
        tv.setSmartTv(12);
        tv.setWifi("Yes");
        tvDao.save(tv);

        ManufacturerDao manufacturerDao = new ManufacturerDao();

        Manufacturer manuf = new Manufacturer();
        manuf.setName("LG");
        manuf.setAvailable(true);
        int savedId = manufacturerDao.save(manuf);
        System.out.println(savedId);

        MonitorDao monitorDao = new MonitorDao();
        Monitor monitor = new Monitor();
        monitor.setModel("KQ942L");
        monitor.setMatrix("TN");
        monitor.setFreshrate(144);
        monitor.setResolution("1080p");
        monitor.setManufacturer(manuf);

        monitorDao.save(monitor);

        Monitor monitor2 = new Monitor();
        monitor2.setModel("R234UU");
        monitor2.setMatrix("IPS");
        monitor2.setFreshrate(60);
        monitor2.setResolution("1440p");
        monitor2.setManufacturer(manuf);
        monitorDao.save(monitor2);


        try {
            System.out.println("querying all the managed entities...");
            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
            for (EntityType<?> entityType : metamodel.getEntities()) {
                final String entityName = entityType.getName();
                final Query query = session.createQuery("from " + entityName);
                System.out.println("executing: " + query.getQueryString());
                for (Object o : query.list()) {
                    System.out.println("  " + o);
                }
            }
        } finally {
            session.close();
        }
    }
}