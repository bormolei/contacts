//package contacts.mvc.DAO;
//
//import contacts.mvc.model.Contact;
//import contacts.mvc.model.Model;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//import java.util.List;
//
//public class HibernateController {
//
//    private static Contact contact = new Contact();
//
//    public static void doHibernateAction(Model model, Actions action) {
//        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
//            Transaction tx1 = session.beginTransaction();
//            switchByActions(model, action, session);
//            tx1.commit();
//        }
//    }
//
//    private static void switchByActions(Model model, Actions action, Session session) {
//        switch (action) {
//            case SAVE:
//                session.save(model);
//                break;
//            case UPDATE:
//                //setId(telegram_helper, session);
//                session.update(model);
//                break;
//            case DELETE:
//                //setId(telegram_helper, session);
//                session.delete(model);
//                break;
//        }
//    }
//
//
//    public static List showAllContacts(Model model) {
//       try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
//
//            return session.createQuery(String.format("from %s " +
//                            "left join contactslist.contacts_phones " +
//                            "on contactslist.contacts_phones.id_contact = contactslist.contacts.id " +
//                            "left join contactslist.phone " +
//                            "on contactslist.contacts_phones.id_phone = contactslist.phone.id"
//                    ,model.getClass().getSimpleName()))
//                    .list();
//        }
//    }
//}
//
//
