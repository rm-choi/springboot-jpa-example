package sun.woo.jpa.extend.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue(value = "Book")
public class Book extends Item {
    private String author;
    private String isbn;
}
