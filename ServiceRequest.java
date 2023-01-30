public class ServiceRequest{

private int id;
private String description;
private String priorityLevel;
private String issueType;

public ServiceRequest(){}

public ServiceRequest(int id, String description, String priorityLevel, String issueType){
this.id=id;
this.description=description;
this.priorityLevel=priorityLevel;;
this.issueType=issueType;
}

public void setId(int id){
    this.id=id;
}

public int getId(){
    return id;
}

public void setDescription(String description){
    this.description=description;
}

public String getDescription(){
    return description;
}

public void setPriorityLevel(String priorityLevel){
    this.priorityLevel=priorityLevel;
}

public String getPriorityLevel(){
    return priorityLevel;
}

public void setIssueType(String issueType){
    this.issueType=issueType;
}

public String getIssueType() {
    return issueType;
}

@Override
public String toString() {
    return "RequestID : " + id + "\nRequest Description : " + description + "\nPriority Level : " + priorityLevel + "\nIssue Type : " + issueType;
}


}