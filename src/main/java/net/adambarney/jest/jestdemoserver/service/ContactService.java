package net.adambarney.jest.jestdemoserver.service;

import net.adambarney.jest.jestdemoserver.model.Contact;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContactService {

    private List<Contact> contacts;

    public ContactService() {
        contacts = new ArrayList<>();
        contacts.add(Contact.builder().name("Joe").phoneNumber("1234567890").build());
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }
}
