package info.m2sj.springbootquerydsl;

import info.m2sj.springbootquerydsl.dept.SearchDto;
import info.m2sj.springbootquerydsl.emp.Emp;
import info.m2sj.springbootquerydsl.emp.EmpRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {
    private final EmpRepository empRepository;

    public DataService(EmpRepository empRepository) {
        this.empRepository = empRepository;
    }

    Page<Emp> listPaging(Pageable pageable) {
        return empRepository.findAll(pageable);
    }


    List<Emp> listBySearch(SearchDto search) {
        //return empRepository.findByDeptnoEqualsAndSalGreaterThanEqual(search.getDeptno(), search.getSal());
        return null;
    }

    Page<Emp> listBySearchPaging(Pageable pageable, SearchDto searchDto) {
        return empRepository.findByDeptnoEqualsAndSalGreaterThanEqual(searchDto.getDeptno(), searchDto.getSal(), pageable);
    }
}
