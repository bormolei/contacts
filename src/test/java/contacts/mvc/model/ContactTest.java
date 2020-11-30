package contacts.mvc.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContactTest {
    Contact contact = new Contact();


    @Test
    public void getFirstName() {
        contact.setFirstName("test1");
        assertSame("test1",contact.getFirstName());
    }

    @Test
    public void setFirstName() {
        contact.setFirstName("test1");
        assertSame("test1",contact.getFirstName());
    }

    @Test
    public void getInfo() {
        contact.setInfo("testinfo");
        assertSame("testinfo", contact.getInfo());
    }

    @Test
    public void setInfo() {
    }
}