package info.m2sj.springbootquerydsl.emp;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends CrudRepository<Emp, Long>, JpaRepository<Emp, Long> {
    Page<Emp> findByDeptnoEqualsAndSalGreaterThanEqual(int deptno, float sal, Pageable pageable);
}
