package info.m2sj.springbootquerydsl.dept;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "dept")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    @Id
    @Column(name = "deptno", columnDefinition = "Decimal(2)")
    private int deptno;

    @Column(name = "dname", length = 14)
    private String dname;

    @Column(name = "loc", length = 13)
    private String loc;
}
