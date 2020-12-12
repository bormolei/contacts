package contacts.mvc.service;


import contacts.mvc.DAO.Actions;
import contacts.mvc.DAO.DbConnection;
//import contacts.mvc.DAO.HibernateController;
import contacts.mvc.model.Contact;
import contacts.mvc.model.Model;

import java.sql.SQLException;
import java.util.List;

public class Service {
    public static boolean addContact(String firstname, String info, String skype
            , String phone, String steam, String mail) {
        try {
            DbConnection.executeQuery("insert into contactslist.skype(skype) " +
                    "values (" + skype + ")");
            DbConnection.executeQuery("insert into contactslist.steam(steam) " +
                    "values (" + steam + ")");
            DbConnection.executeQuery("insert into contactslist.mail(mail) " +
                    "values (" + mail + ")");
            DbConnection.executeQuery("insert into contactslist.phone(number) " +
                    "values (" + phone + ")");
            DbConnection.executeQuery("insert into contactslist.contacts(firstname,info,mail,steam,skype) " +
                    "values (" + firstname + ","
                    + info + ",(select mail from contactslist.mail where id = max(id))" +
                    ",(select steam from contactslist.steam where id = max(id))" +
                    ",(select skype from contactslist.skype where id = max(id))" +
                    ",(select mail from contactslist.mail where id = max(id))");
            return true;
        } catch (Exception e) {
            e.toString();
            return false;
        }

    }

    public static boolean deleteContact(int id) {
        try {
            DbConnection.executeQuery("delete\n" +
                    "from contactslist.steam\n" +
                    "where contactslist.steam.id = " +
                    "(select steam from contactslist.contacts where id = " + id + ")");

            DbConnection.executeQuery("delete\n" +
                    "from contactslist.skype\n" +
                    "where contactslist.skype.id = " +
                    "(select skype from contactslist.contacts where id = " + id + ")");

            DbConnection.executeQuery("delete\n" +
                    "from contactslist.mail\n" +
                    "where contactslist.mail.id = " +
                    "(select mail from contactslist.contacts where id = " + id + ")");

            DbConnection.executeQuery("delete\n" +
                    "from contactslist.phone\n" +
                    "where contactslist.phone.id = \n" +
                    "(select id_phone from contactslist.contacts_phones where id_contact = " + id + ")");

            DbConnection.executeQuery("delete\n" +
                    "from contactslist.contacts\n" +
                    "where contactslist.contacts.id = " + id);
            return true;
        } catch (Exception e) {
            e.toString();
            return false;
        }

    }

    public static boolean updateContact(int id,String firstname, String info) {
        try {
            DbConnection.executeQuery("update contactslist.contacts " +
                    "set [firstname] = " + firstname
                    +"set [info] = " + info
                    +" where id =" + id);
            return true;
        } catch (Exception e) {
            e.toString();
            return false;
        }

    }


    public static List showAllContacts() throws SQLException, ClassNotFoundException {
        return DbConnection.executeQuery("select contacts.id, firstname, number, steam.steam, skype.skype, mail.mail\n" +
                "from contactslist.contacts left join contactslist.contacts_phones\n" +
                "on contactslist.contacts_phones.id_contact = contactslist.contacts.id\n" +
                "left join contactslist.phone\n" +
                "on contactslist.contacts_phones.id_phone = contactslist.phone.id\n" +
                "left join contactslist.steam\n" +
                "on contactslist.contacts.steam = contactslist.steam.id\n" +
                "left join contactslist.mail\n" +
                "on contactslist.contacts.mail = contactslist.mail.id\n" +
                "left join contactslist.skype\n" +
                "on contactslist.contacts.skype = contactslist.skype.id");
    }
}
