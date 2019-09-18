package info.m2sj.springbootquerydsl.dept;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Pageable;

@Getter
@Setter
public class SearchDto {
    private Pageable pageable;

    private String ename;

    private float sal;

    private int deptno;
}
