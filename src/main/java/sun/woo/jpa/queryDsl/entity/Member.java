package sun.woo.jpa.queryDsl.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@DynamicInsert
@DynamicUpdate
@Table(name="jpa_member")
public class Member {


    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    //name : Field와 매핑할 테이블의 Column 이름
    //Insertable / updatable : 등록 / 변경 가능 여부
    //Insertable / updatable : 등록 / 변경 가능 여부
    @Column(name = "member_name", nullable = false)
    private String memberName;

    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;


}
