package sun.woo.jpa.basic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BasicRepo extends JpaRepository<BasicModel, Long> {

    Page<BasicModel> findByCategoryNot(String category, Pageable pageable);

    Page<BasicModel> findByCategoryIsNull(Pageable pageable);


}
