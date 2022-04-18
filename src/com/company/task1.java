package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

interface Salary{
    double salaryToPayArslan57056(double hours, double rate);

    default double salaryForOvertimeArslan57056(double overtimeHours, double rate){
        return 1;
    }

    static int bonus(int yearsOfExperience){
        if(yearsOfExperience >= 5){
            return 400;
        } else{
            return 0;
        }
    }
}
public class task1 {
    public static void main(String[] args) throws IOException{
        Staff person = new Staff();
        person.initialize1Arslan57056();
        person.print1Arslan57056();

        double salary = person.salaryToPayArslan57056(180, 25);
        System.out.println("The salary which was received by employee is " + salary);

        double salaryForOvertimeArslan57056 = person.salaryForOvertimeArslan57056(10, 40);
        System.out.println("The salary for overtime which was received by employee is " + salaryForOvertimeArslan57056);

        int bonus = Salary.bonus(6);
        System.out.println("The bonus which was received by employee is " + bonus);
    }
}
class Staff extends Person implements Salary{
    String educationArslan57056;
    String positionArslan57056;
    public void initialize1Arslan57056() throws IOException{
        Scanner sc = new Scanner(System.in);
        initializeArslan57056();
        System.out.println("Education: ");
        educationArslan57056 = sc.nextLine();
        System.out.println("Position: ");
        positionArslan57056 = sc.nextLine();
    }

    public void print1Arslan57056()
    {
        printArslan57056();
        System.out.println("Education: " + educationArslan57056);
        System.out.println("Position: " + positionArslan57056);
    }

    @Override
    public double salaryToPayArslan57056(double hours, double rate) {
        return hours * rate;
    }
}

class Person {
    String surnameArslan57056;
    String firstNameArslan57056;
    String streetArslan57056;
    String zipCodeArslan57056;
    String cityArslan57056;

    public void initializeArslan57056() throws IOException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Surname:");
        surnameArslan57056 = sc.nextLine();
        System.out.println("FirstName:");
        firstNameArslan57056 = sc.nextLine();
        System.out.println("Street:");
        streetArslan57056 = sc.nextLine();
        System.out.println("zipCode:");
        zipCodeArslan57056 = sc.nextLine();
        System.out.println("City:");
        cityArslan57056 = sc.nextLine();
    }
    public void printArslan57056()
    {
        System.out.println("Surname: " + surnameArslan57056);
        System.out.println("Surname: " + surnameArslan57056);
        System.out.println("FirstName: " + firstNameArslan57056);
        System.out.println("Street: " + streetArslan57056);
        System.out.println("zipCode: " + zipCodeArslan57056);
        System.out.println("City: " + cityArslan57056);
    }
}