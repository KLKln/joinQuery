package joinQuery.model;
import javax.persistence.*;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "Department", schema = "dbo", catalog = "KSCDatabase")
public class DepartmentEntity {
	private int departmentId;
	private String departmentName;
	
	@Id
	@Column(name = "DepartmentId")
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	@Basic
	@Column(name = "DepartmentName")
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	

}
