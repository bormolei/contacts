package contacts.mvc.model;

import contacts.mvc.service.Service;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContactTest {
    @Test
    public void NewContact() {
        Contact contact1 = new Contact();
        contact1.setInfo("test info");
        contact1.setFirstName("test1");
        assertTrue(Service.addContact(contact1));
    }
}