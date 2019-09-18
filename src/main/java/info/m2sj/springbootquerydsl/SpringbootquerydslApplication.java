package info.m2sj.springbootquerydsl;

import info.m2sj.springbootquerydsl.dept.Dept;
import info.m2sj.springbootquerydsl.dept.DeptRepository;
import info.m2sj.springbootquerydsl.emp.Emp;
import info.m2sj.springbootquerydsl.emp.EmpRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@SpringBootApplication
public class SpringbootquerydslApplication implements CommandLineRunner {
    private final DeptRepository deptRepository;

    private final EmpRepository empRepository;

    public SpringbootquerydslApplication(DeptRepository deptRepository, EmpRepository empRepository) {
        this.deptRepository = deptRepository;
        this.empRepository = empRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringbootquerydslApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) {
        if (empRepository.count() < 1) {
            deptRepository.save(Dept.builder().deptno(10).dname("ACCOUNTING").loc("NEW YORK").build());
            deptRepository.save(Dept.builder().deptno(20).dname("RESEARCH").loc("DALLAS").build());
            deptRepository.save(Dept.builder().deptno(30).dname("SALES").loc("CHICAGO").build());
            deptRepository.save(Dept.builder().deptno(40).dname("OPERATIONS").loc("BOSTON").build());
            empRepository.save(Emp.builder().empno(7369).ename("SMITH").job("CLERK").mgr(7902).hiredate(LocalDate.of(1997, 12, 11)).sal(800).comm(0).deptno(20).build());
            empRepository.save(Emp.builder().empno(7499).ename("ALLEN").job("SALESMAN").mgr(7698).hiredate(LocalDate.of(1991, 11, 12)).sal(1600).comm(300).deptno(30).build());
            empRepository.save(Emp.builder().empno(7521).ename("WARD").job("SALESMAN").mgr(7698).hiredate(LocalDate.of(1995, 2, 28)).sal(1250).comm(500).deptno(30).build());
            empRepository.save(Emp.builder().empno(7566).ename("JONES").job("MANAGER").mgr(7839).hiredate(LocalDate.of(1999, 3, 21)).sal(2975).comm(0).deptno(20).build());
            empRepository.save(Emp.builder().empno(7654).ename("MARTIN").job("SALESMAN").mgr(7698).hiredate(LocalDate.of(1981, 4, 22)).sal(1250).comm(1400).deptno(30).build());
            empRepository.save(Emp.builder().empno(7698).ename("BLAKE").job("MANAGER").mgr(7839).hiredate(LocalDate.of(2015, 5, 18)).sal(2850).comm(0).deptno(30).build());
            empRepository.save(Emp.builder().empno(7782).ename("CLARK").job("MANAGER").mgr(7839).hiredate(LocalDate.of(2005, 12, 20)).sal(2450).comm(0).deptno(10).build());
            empRepository.save(Emp.builder().empno(7788).ename("SCOTT").job("ANALYST").mgr(7566).hiredate(LocalDate.of(2011, 6, 22)).sal(3000).comm(0).deptno(20).build());
            empRepository.save(Emp.builder().empno(7839).ename("KING").job("PRESIDENT").mgr(-1).hiredate(LocalDate.of(1985, 7, 15)).sal(5000).comm(0).deptno(10).build());
            empRepository.save(Emp.builder().empno(7844).ename("TURNER").job("SALESMAN").mgr(7698).hiredate(LocalDate.of(2012, 12, 17)).sal(1500).comm(0).deptno(30).build());
            empRepository.save(Emp.builder().empno(7876).ename("ADAMS").job("CLERK").mgr(7788).hiredate(LocalDate.of(2015, 2, 10)).sal(1100).comm(0).deptno(20).build());
            empRepository.save(Emp.builder().empno(7900).ename("JAMES").job("CLERK").mgr(7698).hiredate(LocalDate.of(2013, 3, 9)).sal(950).comm(0).deptno(30).build());
            empRepository.save(Emp.builder().empno(7902).ename("FORD").job("ANALYST").mgr(7566).hiredate(LocalDate.of(2010, 4, 3)).sal(3000).comm(0).deptno(20).build());
            empRepository.save(Emp.builder().empno(7934).ename("MILLER").job("CLERK").mgr(7782).hiredate(LocalDate.of(2002, 6, 2)).sal(1300).comm(0).deptno(10).build());
        }
    }
}
