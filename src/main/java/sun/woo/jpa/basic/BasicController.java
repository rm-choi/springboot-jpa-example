package sun.woo.jpa.basic;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/basics/contents/null")
    public Page<BasicModel> getBasicByContentsIsNull(@PageableDefault(size = 20, sort = "id",
                                                     direction = Sort.Direction.DESC)
                                                     Pageable pageable) {
        return basicService.getBasicByContentsIsNull(pageable);
    }

    @GetMapping("/basics/ignoreCase")
    public Page<BasicModel> getBasicByIgnoreCase(
            @RequestParam("title") String title,
            @PageableDefault(size = 20, sort = "id",
                    direction = Sort.Direction.DESC) Pageable pageable) {
        return basicService.getBasicByIgnoreCase(title, pageable);
    }

    @GetMapping("/basics/ignoreCaseAll")
    public Page<BasicModel> getBasicByIgnoreCaseAll(
            @RequestParam("title") String title,
            @RequestParam("contents") String contents,
            @PageableDefault(size = 20, sort = "id",
                    direction = Sort.Direction.DESC) Pageable pageable) {
        return basicService.getBasicByIgnoreCaseAll(title,contents, pageable);
    }

    @GetMapping("/basics/and")
    public Page<BasicModel> getBasicByCategoryAndTitle(
            @RequestParam("category") String category,
            @RequestParam("title") String title,
            @PageableDefault(size = 20, sort = "id",
                    direction = Sort.Direction.DESC) Pageable pageable) {
        return basicService.getBasicByCategoryAndTitle(category, title, pageable);
    }

    @GetMapping("/basics/or")
    public Page<BasicModel> getBasicByCategoryOrTitle(
            @RequestParam("category") String category,
            @RequestParam("title") String title,
            @PageableDefault(size = 20, sort = "id",
                    direction = Sort.Direction.DESC) Pageable pageable) {
        return basicService.getBasicByCategoryOrTitle(category,title, pageable);
    }


    @GetMapping("/basics/between")
    public Page<BasicModel> getBasicByIdBetween(
            @RequestParam("startId") long startId,
            @RequestParam("endId") long endId,
            @PageableDefault(size = 20, sort = "id",
                    direction = Sort.Direction.DESC) Pageable pageable) {
        return basicService.getBasicByIdBetween(startId, endId, pageable);
    }

    @GetMapping("/basics/lessThan")
    public Page<BasicModel> getBasicByIdLessThan(
            @RequestParam("endId") long endId,
            @PageableDefault(size = 20, sort = "id",
                    direction = Sort.Direction.DESC) Pageable pageable) {
        return basicService.getBasicByIdLessThan(endId, pageable);
    }

    @GetMapping("/basics/lessThanEq")
    public Page<BasicModel> getBasicByIdLessThanEq(
            @RequestParam("endId") long endId,
            @PageableDefault(size = 20, sort = "id",
                    direction = Sort.Direction.DESC) Pageable pageable) {
        return basicService.getBasicByIdLessThanEq(endId, pageable);
    }

    @GetMapping("/basics/greatThan")
    public Page<BasicModel> getBasicByIdGreatThan(
            @RequestParam("startId") long startId,
            @PageableDefault(size = 20, sort = "id",
                    direction = Sort.Direction.DESC) Pageable pageable) {
        return basicService.getBasicByIdGreatThan(startId, pageable);
    }

    @GetMapping("/basics/greatThanEq")
    public Page<BasicModel> getBasicByIdGreatThanEq(
            @RequestParam("startId") long startId,
            @PageableDefault(size = 20, sort = "id",
                    direction = Sort.Direction.DESC) Pageable pageable) {
        return basicService.getBasicByIdGreatThanEq(startId, pageable);
    }

    @GetMapping("/basics/date")
    public Page<BasicModel> getBasicByDate(
            @RequestParam("date") long date,
            @RequestParam("type") int type,
            @PageableDefault(size = 20, sort = "id",
                    direction = Sort.Direction.DESC) Pageable pageable) {
        return basicService.getBasicByDate(date, type, pageable);
    }



    @GetMapping("/basics/flag")
    public Page<BasicModel> getBasicByFlag(
            @RequestParam("flag") boolean flag,
            @PageableDefault(size = 20, sort = "id",
                   direction = Sort.Direction.DESC) Pageable pageable) {
        return basicService.getBasicByFlag(flag, pageable);
    }

    @GetMapping("/basics/like")
    public Page<BasicModel> getBasicByTitleLike(
            @RequestParam("title") String title,
            @RequestParam("type") int type,
            @PageableDefault(size = 20, sort = "id",
                    direction = Sort.Direction.DESC) Pageable pageable) {
        return basicService.getBasicByTitleLike(title,type, pageable);
    }

    @GetMapping("/basics/in")
    public Page<BasicModel> getBasicByCategoryList(
            @RequestParam("category") List<String> categoryList,
            @PageableDefault(size = 20, sort = "id",
                   direction = Sort.Direction.DESC) Pageable pageable) {
        return basicService.getBasicByCategoryList(categoryList, pageable);
    }



    @PostMapping("/basic")
    public Long setBasic(@RequestBody BasicModel basicModel) throws Exception {
        return basicService.setBasic(basicModel);
    }

}
