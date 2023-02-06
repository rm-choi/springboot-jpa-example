package sun.woo.jpa.queryDsl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import sun.woo.jpa.queryDsl.dto.MemberSearchCondition;
import sun.woo.jpa.queryDsl.dto.MemberTeamDto;
import sun.woo.jpa.queryDsl.entity.Member;
import sun.woo.jpa.queryDsl.entity.Team;

import java.util.List;


@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("/queryDsl")
public class MemberController {

    private final MemberRepo memberRepo;

    private final TeamRepo teamRepo;


    @GetMapping("/members")
    public List<MemberTeamDto> getMemberList(MemberSearchCondition condition) {
        return memberRepo.getMemberList(condition);
    }

    @PostMapping("/member")
    public Member setMember(@RequestBody Member member) {
        return memberRepo.save(member);
    }

    @PostMapping("/team")
    public Team setTeam(@RequestBody Team team) {
        return teamRepo.save(team);
    }

    @GetMapping("/test")
    public List<Member> test() {
        return memberRepo.findAll();
    }



}
