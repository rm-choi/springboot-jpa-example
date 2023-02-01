package sun.woo.jpa.queryDsl;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sun.woo.jpa.queryDsl.dto.MemberSearchCondition;
import sun.woo.jpa.queryDsl.dto.MemberTeamDto;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/queryDsl")
public class MemberController {

    private final MemberRepo memberRepo;


    @GetMapping("/members")
    public List<MemberTeamDto> getCachingList(MemberSearchCondition condition) {
        return memberRepo.getMemberList(condition);
    }



}
