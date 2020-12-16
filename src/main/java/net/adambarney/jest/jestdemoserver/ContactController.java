package net.adambarney.jest.jestdemoserver;

import net.adambarney.jest.jestdemoserver.model.Contact;
import net.adambarney.jest.jestdemoserver.service.ContactService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/contact")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }
//    @CrossOrigin(origins = "http://localhost:8081")
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
