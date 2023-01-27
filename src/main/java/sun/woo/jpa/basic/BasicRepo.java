package sun.woo.jpa.basic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


public interface BasicRepo extends JpaRepository<BasicModel, Long> {

    Page<BasicModel> findByCategoryNot(String category, Pageable pageable);

    Page<BasicModel> findByContentsIsNull(Pageable pageable);

    Page<BasicModel> findByCategoryIgnoreCase(String category, Pageable pageable);
    Page<BasicModel> findByCategoryAndTitleAllIgnoreCase(String category, String title, Pageable pageable);

    Page<BasicModel> findByCategoryAndTitle(String category, String title, Pageable pageable);
    Page<BasicModel> findByCategoryOrTitle(String category, String title, Pageable pageable);

    //compare
    Page<BasicModel> findByIdBetween(long startId, long endId, Pageable pageable); // between
    Page<BasicModel> findByIdLessThan(long endId,  Pageable pageable); //<
    Page<BasicModel> findByIdLessThanEqual(long endId,  Pageable pageable); //<=
    Page<BasicModel> findByIdGreaterThan(long startId,  Pageable pageable); //>
    Page<BasicModel> findByIdGreaterThanEqual(long startId,  Pageable pageable); //>=
    Page<BasicModel> findByDateAfter(Date date, Pageable pageable); //>
    Page<BasicModel> findByDateBefore(Date date,  Pageable pageable); //<

    //Like
    Page<BasicModel> findByTitleStartingWith(String title, Pageable pageable); //like '-%'
    Page<BasicModel> findByTitleEndingWith(String title, Pageable pageable); //like '%-'
    Page<BasicModel> findByTitleContaining(String title, Pageable pageable); //like '%-%'

    //boolean
    Page<BasicModel> findByFlagTrue(Pageable pageable); // = true
    Page<BasicModel> findByFlagFalse(Pageable pageable); // = false

    //in
    Page<BasicModel> findByCategoryIn(List<String> categoryList, Pageable pageable); // in




}
