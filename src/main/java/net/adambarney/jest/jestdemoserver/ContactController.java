package net.adambarney.jest.jestdemoserver;

import net.adambarney.jest.jestdemoserver.model.Contact.Contact;
import net.adambarney.jest.jestdemoserver.service.ContactService.ContactService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/contact")
public class ContactController {

    private ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public ResponseEntity<List<Contact>> getContacts() {
        return ResponseEntity.ok(contactService.getContacts());
    }

    @PostMapping
    public ResponseEntity<List<Contact>> addContact(@RequestBody Contact contact) {
        contactService.addContact(contact);
        return ResponseEntity.ok(contactService.getContacts());
    }
}
