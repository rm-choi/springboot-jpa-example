package sun.woo.jpa.extend.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue(value = "Movie")
public class Movie extends Item {
    private String director;
    private String actor;
}
