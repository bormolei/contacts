package contacts.mvc.model;

import contacts.mvc.service.Service;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContactTest {
    @Test
    public void NewContact() {
        assertTrue(Service.addContact("TestName","TestInfo"
        ,"TestSkype","89109256512","gasdxzcasd","test@mail.ru"));
    }

    @Test
    public void DeleteContact() {
        assertTrue(Service.deleteContact(1));
    }

    @Test
    public void updateContact() {
        assertTrue(Service.updateContact(1,"TestNewName"
        ,"TestNewItnfo"));
    }


}