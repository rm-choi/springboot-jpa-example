package sun.woo.jpa.extend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public class Item extends BaseEntity{
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;
}

