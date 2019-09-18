package info.m2sj.springbootquerydsl;

import info.m2sj.springbootquerydsl.dept.SearchDto;
import info.m2sj.springbootquerydsl.emp.Emp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataResource {
    private final DataService dataService;

    public DataResource(DataService dataService) {
        this.dataService = dataService;
    }

    /**
     * http://localhost:8080/emp/list-paging?size=2&page=4&sort=empno,desc&sort=deptno,asc
     * @param pageable
     * @return
     */
    @GetMapping("/emp/list-paging")
    public Page<Emp> listPaging(Pageable pageable) {
        PageRequest pageRequest;
        return dataService.listPaging(pageable);
    }

    /**
     * http://localhost:8080/emp/list-search?sal=1000&deptno=20
     * @param search
     * @return
     */
    @GetMapping("/emp/list-search")
    public List<Emp> listSearch(SearchDto search) {
        return dataService.listBySearch(search);
    }

    @GetMapping("/emp/list-search-paging")
    public Page<Emp> listSearchPaging(Pageable pageable, SearchDto search) {
        return dataService.listBySearchPaging(pageable, search);
    }
}
