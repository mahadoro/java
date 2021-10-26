package com.testServlets.bl;

import com.testServlets.persistence.ContactsPersistence;

import java.util.List;

public class ContactsBlService {
    public String getContacts() throws Exception {
        StringBuilder result = new StringBuilder();
        List<String> resultList = ContactsPersistence.getContacts();
        for (String row : resultList) {
            result.append(row);
        }
        return result.toString();
    }

    public String getContactsById(String id) throws Exception {
        StringBuilder result = new StringBuilder();
        List<String> resultList = ContactsPersistence.getContactsById(id);
        for (String row : resultList) {
            result.append(row);
        }
        return result.toString();
    }

    public String getContactsByText(String param) throws Exception {
        StringBuilder result = new StringBuilder();
        List<String> resultList = ContactsPersistence.getContactsByText(param);
        for (String row : resultList) {
            result.append(row);
        }
        return result.toString();
    }

    public String deleteContactsById(String id) throws Exception {
        String result = ContactsPersistence.deleteContactsById(id);
        return result;
    }

    public String postContact(String id, String contact, String contact_name) throws Exception {
        String result = ContactsPersistence.postContact(id, contact, contact_name);
        return result;
    }

    public String putContact(String id, String contact, String contact_name) throws Exception {
        String result = ContactsPersistence.putContact(id, contact, contact_name);
        return result;
    }
}
