package sun.woo.jpa.queryDsl.dto;

import lombok.*;

@Data
public class MemberSearchCondition {


    private String userName;
    private String teamName;
    private Integer maxAge;
    private Integer minAge;

}
