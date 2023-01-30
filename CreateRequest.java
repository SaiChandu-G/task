import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class CreateRequest{

    public static void main(String[] args)  {
        List<ServiceRequest> requests = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        Employee employee = new Employee();
        System.out.println("Create an Empoloyee");
        System.out.println();
        System.out.print("Enter employee id : ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter employee name : ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter employee email : ");
        String employeeEmail = scanner.next();
        System.out.print("Enter employee address : ");
        String employeeAddress = scanner.next();
        System.out.print("Enter employee phone : ");
        long employeePhone = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Enter employee designation : ");
        String employeeDesignation = scanner.nextLine();
        employee.setId(employeeId);
        employee.setName(employeeName);
        employee.setEmail(employeeEmail);
        employee.setAddress(employeeAddress);
        employee.setPhone(employeePhone);
        employee.setDesignation(employeeDesignation);


        System.out.println("Create a Service Request");
        while(loop){
            System.out.println();
            ServiceRequest request = new ServiceRequest();
            try{
            System.out.print("Enter request ID : ");
            int requestId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter request description : ");
            String requestDescription = scanner.nextLine();
            //scanner.nextLine();

            System.out.print("Enter request priority level(p1/p2/p3) : ");
            String requestPriorityLevel = scanner.next();
            //scanner.nextLine();

            System.out.print("Enter issue type(IT/HR/Admin) : ");
            String requestIssueType = scanner.next();
            //scanner.nextLine();

            List<ServiceRequest> one = requests.stream().filter(a -> a.getId() == requestId).collect(Collectors.toList());
            if(one.size() == 1) {
                //throw new Exception("Item already exists");
                System.out.println("Sorry! Request already exists with id " + requestId);
                break;
            }

            request.setId(requestId);
            request.setDescription(requestDescription);
            request.setPriorityLevel(requestPriorityLevel);
            request.setIssueType(requestIssueType);
            requests.add(request);

            System.out.print("Would you like to create another request?(y/n) ");
            char dec = scanner.next().charAt(0);
            if(dec == 'n'){
                loop = false;
            }
            if(dec == 'y'){
                loop = true;
            }else{
                break;
            }
            } catch(Exception e){
                System.out.println("Please enter valid input");
                scanner.next();
                continue;
            }
        }
        employee.setRequests(requests);
        System.out.println();
        System.out.println("Your details are :");
        System.out.println(employee);
        // for(ServiceRequest request : requests){
        //     System.out.println(request);
        //     System.out.println();
        // }
        
    }

}