package info.m2sj.springbootquerydsl.emp;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "emp")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    @Id
    @Column(name = "empno", columnDefinition = "Decimal(4)")
    private int empno;

    @Column(name = "ename", length = 10)
    private String ename;

    @Column(name = "job", length = 9)
    private String job;

    @Column(name = "mgr", columnDefinition = "Decimal(4)")
    private int mgr;

    @Column(name = "hiredate")
    private LocalDate hiredate;

    @Column(name = "sal", columnDefinition = "Decimal(7,2)")
    private float sal;

    @Column(name = "comm", columnDefinition = "Decimal(7,2)")
    private float comm;

    @Column(name = "deptno", columnDefinition = "Decimal(2)")
    private int deptno;
}



