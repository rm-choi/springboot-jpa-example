package sun.woo.jpa.extend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import sun.woo.jpa.extend.entity.Album;
import sun.woo.jpa.extend.entity.Item;
import sun.woo.jpa.queryDsl.MemberRepoCustom;
import sun.woo.jpa.queryDsl.entity.Member;


public interface AlbumRepo extends JpaRepository<Album, Long> {




}
