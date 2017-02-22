package jp.co.kenshu.form.employee;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

public class EmployeeListForm {
	@NotEmpty
    private String name;
	@NotEmpty
	@Min(18)
    private Integer age;
    private String memo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

}