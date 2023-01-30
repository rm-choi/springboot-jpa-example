package sun.woo.jpa.caching;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/jpa")
public class CachingController {

    private final CachingService cachingService;

    @GetMapping("/cachings/{id}")
    public CachingModel getCachingById(@PathVariable("id") long id) {
        return cachingService.getCachingById(id);
    }

    @GetMapping("/cachings")
    public List<CachingModel> getCachingList() {
        return cachingService.getCachingList();
    }

    @PostMapping("/caching")
    public CachingModel setCaching(@RequestBody CachingModel cachingModel) {
        return cachingService.setCaching(cachingModel);
    }

    @DeleteMapping("/cachings/{id}")
    public boolean deleteCaching(@PathVariable("id") long id) {
        return cachingService.deleteCaching(id);
    }

}
