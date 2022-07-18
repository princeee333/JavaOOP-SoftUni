package test;


public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age,double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary=salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }



    public void increaseSalary(double bonus) {
        if (this.age < 30) {
            this.setSalary(this.getSalary()+(this.getSalary()*bonus/200));
        }else {
            this.setSalary(this.getSalary()+(this.getSalary()*bonus/100));
        }
    }
    @Override
    public String toString() {
        return String.format("%s %s gets %.1f leva",firstName,lastName,salary);
    }

}