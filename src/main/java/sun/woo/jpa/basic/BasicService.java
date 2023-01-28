package sun.woo.jpa.basic;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
@RequiredArgsConstructor
public class BasicService {

    private final BasicRepo basicRepo;

    public BasicModel getBasicById(Long id) {
        return basicRepo.findById(id).orElseThrow();
    }

    public Page<BasicModel> getBasicByCategoryNot(String category, Pageable pageable) {
        return basicRepo.findByCategoryNot(category, pageable);
    }

    public Page<BasicModel> getBasicByContentsIsNull(Pageable pageable) {
        return basicRepo.findByContentsIsNull(pageable);
    }

    public Page<BasicModel> getBasicByIgnoreCase(String title, Pageable pageable) {
        return basicRepo.findByTitleIgnoreCase(title, pageable);
    }

    public Page<BasicModel> getBasicByIgnoreCaseAll(String title, String contents, Pageable pageable) {
        return basicRepo.findByTitleAndContentsAllIgnoreCase(title, contents, pageable);
    }

    public Page<BasicModel> getBasicByCategoryAndTitle(String category, String title, Pageable pageable) {
        return basicRepo.findByCategoryAndTitle(category, title, pageable);
    }

    public Page<BasicModel> getBasicByCategoryOrTitle(String category, String title, Pageable pageable) {
        return basicRepo.findByCategoryOrTitle(category, title, pageable);
    }

    public Page<BasicModel> getBasicByIdBetween(long startId, long endId, Pageable pageable) {
        return basicRepo.findByIdBetween(startId, endId, pageable);
    }

    public Page<BasicModel> getBasicByIdLessThan(long endId, Pageable pageable) {
        return basicRepo.findByIdLessThan(endId, pageable);
    }

    public Page<BasicModel> getBasicByIdLessThanEq(long endId, Pageable pageable) {
        return basicRepo.findByIdLessThanEqual(endId, pageable);
    }

    public Page<BasicModel> getBasicByIdGreatThan(long startId, Pageable pageable) {
        return basicRepo.findByIdGreaterThan(startId, pageable);
    }

    public Page<BasicModel> getBasicByIdGreatThanEq(long startId, Pageable pageable) {
        return basicRepo.findByIdGreaterThanEqual(startId, pageable);
    }

    public Page<BasicModel> getBasicByDate(long date, int type, Pageable pageable) {
        Date dateFormat = new Date(date);
        if (type==1) {
            return basicRepo.findByDateAfter(dateFormat, pageable);
        } else {
            return basicRepo.findByDateBefore(dateFormat, pageable);
        }

    }


    public Page<BasicModel> getBasicByTitleLike(String title, int type, Pageable pageable) {
        if (type==1) {
            return basicRepo.findByTitleStartingWith(title, pageable);
        } else if (type==2) {
            return basicRepo.findByTitleEndingWith(title, pageable);
        } else {
            return basicRepo.findByTitleContaining(title, pageable);
        }

    }


    public Page<BasicModel> getBasicByFlag(boolean flag, Pageable pageable) {
        if (flag) {
            return basicRepo.findByFlagTrue(pageable);
        } else {
            return basicRepo.findByFlagFalse(pageable);
        }
    }

    public Page<BasicModel> getBasicByCategoryList(List<String> categoryList, Pageable pageable) {
        return basicRepo.findByCategoryIn(categoryList, pageable);
    }


    public Long setBasic(BasicModel basicModel) {
        return basicRepo.save(basicModel).getId();
    }


}
