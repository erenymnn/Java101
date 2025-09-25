package org.example;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary<1000){ System.out.println(salary);
        return 0;}
        else {
           return this.salary*0.03;
        }
    }


    public double bonus(){
        if(this.workHours>40)  {
           return (this.workHours-40)*30;
        }
        return 0;
    }


    public double raiseSalary(){
       int yearsworked=2021-this.hireYear;
        if(yearsworked<10){
            return  this.salary*0.05;
        }else if(yearsworked<20){
           return this.salary*0.1;
        }else {
            return this.salary*0.15;
        }
    }

    @Override
    public String toString() {
        double tax=tax();//vergi
        double bonus=bonus();
        double raise=raiseSalary();

        double salaryWithTaxAndBonus=this.salary-tax+bonus;
        double totalSalary=this.salary + raise;
        return "Adi : " + this.name +
                "\nMaasi : " + this.salary +
                "\nCalisma Saati : " + this.workHours +
                "\nBaslangic Yili : " + this.hireYear +
                "\nVergi : " + tax +
                "\nBonus : " + bonus +
                "\nMaas Artisi : " + raise +
                "\nVergi ve Bonuslar ile birlikte Maas : " + salaryWithTaxAndBonus +
                "\nToplam Maas : " + totalSalary;
    }
}
