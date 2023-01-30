public class Department{

private int id;
private String name;
private Employee employee;

public Department(){}

public Department(int id, String name, Employee employee){
this.id=id;
this.name=name;
this.employee=employee;
}

public void setId(int id){
this.id=id;
}

public void setName(String name){
this.name=name;
}

public void setEmployee(Employee employee){
    this.employee=employee;
}

public int getId(){
return id;
}

public String getName(){
return name;
}

public Employee getEmployee(){
    return employee;
}

@Override
public String toString(){
    return "DepartmentID : " + id + "\nDepartment name : " + name + "\n " + employee;
}

}