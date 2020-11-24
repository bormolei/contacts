package contacts.mvc.DAO;

import contacts.config.HibernateSessionFactoryUtil;
import contacts.mvc.model.Contact;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.List;

public class HibernateController {

    private static Contact contact = new Contact();

    public static void doHibernateAction(Contact telegram_helper, Actions action) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction tx1 = session.beginTransaction();
            switchByActions(telegram_helper, action, session);
            tx1.commit();
        }
    }

    private static void switchByActions(Contact telegram_helper, Actions action, Session session) {
        switch (action) {
            case SAVE:
                session.save(telegram_helper);
                break;
            case UPDATE:
                //setId(telegram_helper, session);
                session.update(telegram_helper);
                break;
            case DELETE:
                //setId(telegram_helper, session);
                session.delete(telegram_helper);
                break;
        }
    }

    public static List showAll() {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            return session.createQuery(String.format("from %s"
                    , contact.getClass().getSimpleName()))
                    .list();
        }
    }
}


