package sun.woo.jpa.extend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sun.woo.jpa.extend.entity.Album;
import sun.woo.jpa.extend.entity.Book;
import sun.woo.jpa.extend.entity.Movie;
import sun.woo.jpa.queryDsl.MemberRepo;
import sun.woo.jpa.queryDsl.TeamRepo;
import sun.woo.jpa.queryDsl.dto.MemberSearchCondition;
import sun.woo.jpa.queryDsl.dto.MemberTeamDto;
import sun.woo.jpa.queryDsl.entity.Member;
import sun.woo.jpa.queryDsl.entity.Team;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/extend")
public class ItemController {

    private final AlbumRepo albumRepo;

    private final BookRepo bookRepo;

    private final MovieRepo movieRepo;

    @PostMapping("/album")
    public Album setAlbum(@RequestBody Album album) {
        return albumRepo.save(album);
    }

    @GetMapping("/albums/{id}")
    public Album getAlbumById(@PathVariable("id") Long id) {
        return albumRepo.findById(id).orElseThrow();
    }

    @PostMapping("/book")
    public Book setBook(@RequestBody Book book) {
        return bookRepo.save(book);
    }

    @PostMapping("/movie")
    public Movie setMovie(@RequestBody Movie movie) {
        return movieRepo.save(movie);
    }





}
