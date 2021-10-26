package com.testServlets.servlet;

import com.testServlets.bl.ContactsBlService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ContactsServlet extends HttpServlet {
    private ContactsBlService contactsBlService;

    public void init() {
        contactsBlService = new ContactsBlService();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String result = null;
        String path = request.getPathInfo();
        String queryParam = request.getParameter("q");
        PrintWriter messageWriter = response.getWriter();
        if (path != null) {
            try {
                String pathParam = path.split("/")[1];
                result = contactsBlService.getContactsById(pathParam);
                messageWriter.println(result);
            } catch (Exception e) {
                messageWriter.println(e.getMessage());
            }
        } else if (queryParam != null) {
            try {
                result = contactsBlService.getContactsByText(queryParam);
                messageWriter.println(result);
            } catch (Exception e) {
                messageWriter.println(e.getMessage());
            }
        } else {
            try {
                result = contactsBlService.getContacts();
                messageWriter.println(result);
            } catch (Exception e) {
                messageWriter.println(e.getMessage());
            }
        }
    }

    public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String result = null;
        String path = request.getPathInfo();
        PrintWriter messageWriter = response.getWriter();
        try {
            String pathParam = path.split("/")[1];
            result = contactsBlService.deleteContactsById(pathParam);
            messageWriter.println(result);
        } catch (Exception e) {
            messageWriter.println(e.getMessage());
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String result = null;
        String paramId = request.getParameter("id");
        String paramContact = request.getParameter("contact");
        String paramContactName = request.getParameter("contact_name");
        PrintWriter messageWriter = response.getWriter();
        try {
            result = contactsBlService.postContact(paramId, paramContact, paramContactName);
            messageWriter.println(result);
        } catch (Exception e) {
            messageWriter.println(e.getMessage());
        }
    }

    public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String result = null;
        String paramId = request.getParameter("id");
        String paramContact = request.getParameter("contact");
        String paramContactName = request.getParameter("contact_name");
        PrintWriter messageWriter = response.getWriter();
        try {
            result = contactsBlService.putContact(paramId, paramContact, paramContactName);
            messageWriter.println(result);
        } catch (Exception e) {
            messageWriter.println(e.getMessage());
        }
    }
}
