package contacts;

import contacts.mvc.DAO.DbConnection;
import contacts.mvc.model.Contact;
import contacts.mvc.model.Phone;
import contacts.mvc.service.Service;

import java.sql.SQLException;
import java.util.List;

public class main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        List list = Service.showAllContacts();
        System.out.println();
    }
}
