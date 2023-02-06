package sun.woo.jpa.extend;

import org.springframework.data.jpa.repository.JpaRepository;
import sun.woo.jpa.extend.entity.Album;
import sun.woo.jpa.extend.entity.Movie;


public interface MovieRepo extends JpaRepository<Movie, Long> {




}
