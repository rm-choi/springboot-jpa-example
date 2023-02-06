package sun.woo.jpa.queryDsl.dto;

import lombok.*;

@Getter
@Setter
public class MemberSearchCondition {


    private String memberName;
    private String teamName;
    private Integer maxAge;
    private Integer minAge;

}
