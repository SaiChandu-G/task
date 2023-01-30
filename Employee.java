import java.util.List;

public class Employee{

private int id;
private String name;
private String email;
private String address;
private long phone;
private String designation;
private List<ServiceRequest> requests;

public Employee(){}

public Employee(int id, String name, String email, String address, long phone, String designation, List<ServiceRequest> requests){
this.id=id;
this.name=name;
this.email=email;
this.address=address;
this.phone=phone;
this.designation=designation;
this.requests=requests;
}

public void setId(int id){
this.id=id;
}

public void setName(String name){
this.name=name;
}

public void setEmail(String email){
this.email=email;
}

public void setAddress(String address){
this.address=address;
}

public void setPhone(long phone){
this.phone=phone;
}

public void setDesignation(String designation){
this.designation=designation;
}

public void setRequests(List<ServiceRequest> requests){
this.requests=requests;
}

@Override
public String toString(){
    String result = "EmployeeID : " +id + "\nEmployee name " + name + "\nEmployee email : " +  email + "\nEmployee address : " + address + " \nEmployee Phone" + phone + "\nEmployee designation " + designation + "\n " + requests;
    return result;
}

}