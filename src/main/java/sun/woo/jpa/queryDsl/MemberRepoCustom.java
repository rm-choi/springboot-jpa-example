package sun.woo.jpa.queryDsl;


import sun.woo.jpa.queryDsl.dto.MemberSearchCondition;
import sun.woo.jpa.queryDsl.dto.MemberTeamDto;

import java.util.List;



public interface MemberRepoCustom {



      List<MemberTeamDto> getMemberList(MemberSearchCondition condition);
//    Page<MemberModel> getMemberList(MemberSearchCondition condition, Pageable pageable);
//    Page<MemberModel> getMemberListComplex(MemberSearchCondition condition, Pageable pageable);
//
//



}
