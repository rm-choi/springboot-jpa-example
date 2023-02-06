package sun.woo.jpa.queryDsl;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import sun.woo.jpa.queryDsl.dto.MemberSearchCondition;
import sun.woo.jpa.queryDsl.dto.MemberTeamDto;
import sun.woo.jpa.queryDsl.dto.QMemberTeamDto;

import java.util.List;

import static org.springframework.util.StringUtils.hasText;
import static sun.woo.jpa.queryDsl.entity.QTeam.team;
import static sun.woo.jpa.queryDsl.entity.QMember.member;


public class MemberRepoCustomImpl implements MemberRepoCustom {

    private final JPAQueryFactory queryFactory;

    public MemberRepoCustomImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<MemberTeamDto> getMemberList(MemberSearchCondition condition) {
        return queryFactory
                .select(new QMemberTeamDto(
                        member.id.as("memberId"),
                        member.memberName,
                        member.age,
                        team.id.as("teamId"),
                        team.teamName.as("teamName")
                ))
                .from(member)
                .innerJoin(member.team, team)
                .where(
                        memberNameEq(condition.getMemberName()),
                        teamNameEq(condition.getTeamName())
                )
                .fetch();
    }


    private BooleanExpression memberNameEq(String memberName) {
        return hasText(memberName) ? member.memberName.eq(memberName) : null;
    }

    private BooleanExpression teamNameEq(String teamName) {
        return hasText(teamName) ? team.teamName.eq(teamName) : null;
    }






}
