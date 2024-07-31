package com.nt.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="emp")
@Data
public class Employee
{
	@Id
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
