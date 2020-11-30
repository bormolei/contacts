package contacts.mvc.service;


import contacts.mvc.DAO.HibernateController;
import contacts.mvc.model.Contact;

public class Service
{
    public static boolean addContact(Contact model)
    {
        try
        {
            //HibernateController.doHibernateAction(model);
            return true;
        }
        catch (Exception e)
        {
            e.toString();
            return false;
        }

    }

    public boolean deleteContact(int id)
    {
        try
        {
            //HibernateController.delete(id);
            return true;
        }
        catch (Exception e)
        {
            e.toString();
            return false;
        }

    }

    public boolean updateContact(Contact model)
    {
        try
        {
            //HibernateController.update(model);
            return true;
        }
        catch (Exception e)
        {
            e.toString();
            return false;
        }

    }


    public boolean showAllContacts()
    {
        try
        {
            HibernateController.showAll();
            return true;
        }
        catch (Exception e)
        {
            e.toString();
            return false;
        }

    }
}
