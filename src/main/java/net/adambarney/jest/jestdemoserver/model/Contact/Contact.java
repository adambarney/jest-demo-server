package net.adambarney.jest.jestdemoserver.model.Contact;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    private String name;
    private String phoneNumber;
}
