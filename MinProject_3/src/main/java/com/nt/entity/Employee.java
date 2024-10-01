package com.nt.entity;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name="emp")
@Data
public class Employee
{
	@Id
	@SequenceGenerator(name="gen1",sequenceName="emp_id_seq",initialValue=1500,allocationSize=1)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
	private Integer empno;
	@Column(length=11)
	private String ename;
	@Column(length=11)
	private String job;
	private Integer mgr; 
	private Date hiredate;
	private Integer sal;
	private Integer comm;
	private Integer deptno;
}
