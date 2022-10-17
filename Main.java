import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


         System.out.println(Math.abs(2021-2042));
        Scanner sc = new Scanner(System.in);

        System.out.println("Name : ");
        String name = sc.next();

        System.out.println("Salary : ");
        int salary = sc.nextInt();

        System.out.println("Work Hours : ");
        int workHours = sc.nextInt();

        System.out.println("Hire Year : ");
        int hiredYear = sc.nextInt();

        Employee emp = new Employee(name,salary,workHours,hiredYear);
        System.out.println(emp.raiseSalary());

        System.out.println(emp.toString());
    }
}

class Employee{
    static String name;
    static int salary;
    static int workHours;
    static int hireYear;

    public Employee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int tax(){
        int returnVal = 0;
        if(salary > 1000){
            returnVal = (salary/100)*3;
        }
        return returnVal;
    }

    public int bonus(){
        int returnVal = 0;
        if(workHours > 40){
            returnVal = Math.abs(workHours - 40)*30;
        }
        return returnVal;
    }
    public int raiseSalary(){
        int raiseAmount = 0;
        int workedYear = Math.abs(2021-hireYear);

        if(workedYear <10){
            raiseAmount = salary + (salary/100)*5;
        }else if(workedYear>9 && workedYear< 20 ){
            raiseAmount = salary + (salary/100)*10;
        }else{
            raiseAmount = salary + (salary/100)*15;
        }
        return raiseAmount+bonus()+tax();
    }
    public String toString(){

        return " Name : " + name + " Salary : " + raiseSalary() + " Work Hours : " + workHours + " Hiring Year : " + hireYear;
    }
}