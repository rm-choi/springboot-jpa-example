package sun.woo.jpa.extend;

import org.springframework.data.jpa.repository.JpaRepository;
import sun.woo.jpa.extend.entity.Album;
import sun.woo.jpa.extend.entity.Book;


public interface BookRepo extends JpaRepository<Book, Long> {




}
