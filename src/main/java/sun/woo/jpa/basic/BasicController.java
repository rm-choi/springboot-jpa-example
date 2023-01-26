package sun.woo.jpa.basic;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/jpa")
public class BasicController {

    private final BasicService basicService;

    @GetMapping("/basics/{id}")
    public BasicModel getBasicById(@PathVariable("id") Long id) {
        return basicService.getBasicById(id);
    }

    @GetMapping("/basics/not")
    public Page<BasicModel> getBasicByCategoryNot(@RequestParam("category") String category,
                                                  @PageableDefault(size = 20, sort = "id",
                                                  direction = Sort.Direction.DESC)
                                                  Pageable pageable) {
        return basicService.getBasicByCategoryNot(category, pageable);
    }

    @GetMapping("/basics/category/null")
    public Page<BasicModel> getBasicByCategoryIsNull(@PageableDefault(size = 20, sort = "id",
                                                     direction = Sort.Direction.DESC)
                                                     Pageable pageable) {
        return basicService.getBasicByCategoryIsNull(pageable);
    }



    @PostMapping("/basic")
    public Long setBasic(@RequestBody BasicModel basicModel) throws Exception {
        return basicService.setBasic(basicModel);
    }

}
