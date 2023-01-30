package sun.woo.jpa.caching;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface CachingRepo extends JpaRepository<CachingModel, Long> {



    @Override
    @Cacheable(value = "caching", key = "#id")
    Optional<CachingModel> findById(Long id);


    @Override
    @Cacheable("caching")
    List<CachingModel> findAll();

    @Override
    @CacheEvict(value = "caching", allEntries = true)
    <S extends CachingModel> S save(S entity);

    @Override
    @CacheEvict(value = "caching", allEntries = true)
    void deleteById(Long id);





}
