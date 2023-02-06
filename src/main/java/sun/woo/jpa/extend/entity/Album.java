package sun.woo.jpa.extend.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "Album")
public class Album extends Item {
    private String artist;
    private String etc;
}
