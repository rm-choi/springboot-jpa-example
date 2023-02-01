package sun.woo.jpa.queryDsl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import sun.woo.jpa.queryDsl.entity.Member;


public interface MemberRepo extends JpaRepository<Member, Long>, MemberRepoCustom, QuerydslPredicateExecutor<Member> {




}
