import java.util.ArrayList;
import java.util.Objects;

public class EmployeeSystem {
    public ArrayList<Employee> Elist;
    public EmployeeSystem(){
        Elist=new ArrayList<Employee>();
    }
    public void CreateEmployee(int age,String name){
        for (Employee employee:Elist){
            if (Objects.equals(employee.getName(), name)){
                return;
            }
        }
        Employee NewEmp=new Employee(age,name);
        Elist.add(NewEmp);
        for (int i=Elist.size()-1;i>0;i--){
            if (Elist.get(i).getName().compareTo(Elist.get(i-1).getName())<0){
                Employee emp=Elist.get(i);
                Elist.set(i,Elist.get(i-1));
                Elist.set(i-1,emp);
            }
        }
    }
    public void DeleteEmployee(String name){
        Elist.removeIf(employee -> Objects.equals(employee.getName(), name));
    }
    public void PrintList(){
        for (Employee employee:Elist){
            System.out.printf("%s,Age=%d\n",employee.getName(),employee.getAge());
        }

    }
}
