package sun.woo.jpa.basic;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static org.assertj.core.api.Assertions.*;


public class BasicTest {

    BasicService basicService;


    @AfterEach
    public void afterEach(){
        //TODO 테스트 진행후 처리 필요 작성
    }

    @Test
    public void save(){
        BasicModel basicModel = BasicModel.builder().category("category").title("title").build();
        Long id = basicService.setBasic(basicModel);
        BasicModel result = basicService.getBasicById(id);
        assertThat(basicModel).isEqualTo(result);
    }

}
