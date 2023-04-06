package com.customlinkedhashmap;

public class Department 
{
    int dId;
	String deptName;
	
	Department()
	{
		
	}

	public Department(int dId, String deptName) {
		super();
		this.dId = dId;
		this.deptName = deptName;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", deptName=" + deptName + "]";
	}
	
	
	
}
