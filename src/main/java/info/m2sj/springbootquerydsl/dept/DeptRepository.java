package info.m2sj.springbootquerydsl.dept;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepository extends CrudRepository<Dept, Long>, JpaRepository<Dept, Long> {
}
