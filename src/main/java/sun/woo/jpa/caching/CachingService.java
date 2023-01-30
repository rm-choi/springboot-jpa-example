package sun.woo.jpa.caching;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CachingService {

    private final CachingRepo cachingRepo;


    public CachingModel getCachingById(Long id){
        return cachingRepo.findById(id).orElseThrow();
    }

    public List<CachingModel> getCachingList(){
        return cachingRepo.findAll();
    }

    public CachingModel setCaching(CachingModel cachingModel) {
        return cachingRepo.save(cachingModel);
    }

    public boolean deleteCaching(Long id) {
        cachingRepo.deleteById(id);
        return true;
    }



}
