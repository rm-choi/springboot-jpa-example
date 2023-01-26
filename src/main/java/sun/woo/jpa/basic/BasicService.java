package sun.woo.jpa.basic;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


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

    public Page<BasicModel> getBasicByCategoryIsNull(Pageable pageable) {
        return basicRepo.findByCategoryIsNull(pageable);
    }

    public Long setBasic(BasicModel basicModel) {
        return basicRepo.save(basicModel).getId();
    }


}
