abstract class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }


    public abstract int calculateSalary();

    public int calculateSalary(boolean withBonus) {
        if (withBonus) {
            return calculateSalary() + 1000000;
        } else {
            return calculateSalary();
        }
    }

    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Gaji Bulanan (tanpa bonus): Rp" + calculateSalary());
    }
}

class SoftwareEngineer extends Employee {

    public SoftwareEngineer(String name) {
        super(name);
    }

    @Override
    public int calculateSalary() {
        return 7000000;
    }

    @Override
    public int calculateSalary(boolean withBonus) {
        if (withBonus) {
            return 7000000 + 1500000;
        } else {
            return 7000000;
        }
    }
}

class DataScientist extends Employee {

    public DataScientist(String name) {
        super(name);
    }

    @Override
    public int calculateSalary() {
        return 8000000;
    }

    @Override
    public int calculateSalary(boolean withBonus) {
        if (withBonus) {
            return 8000000 + 1200000;
        } else {
            return 8000000;
        }
    }
}

class Intern extends Employee {

    public Intern(String name) {
        super(name);
    }

    @Override
    public int calculateSalary() {
        return 2000000;
    }

    @Override
    public int calculateSalary(boolean withBonus) {
        if (withBonus) {
            return 2000000 + 300000;
        } else {
            return 2000000;
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Employee[] employees = {
            new SoftwareEngineer("Kaka"),
            new DataScientist("Kiki"),
            new Intern("Diva")
        };

        for (Employee emp : employees) {
            emp.displayInfo(); 
            System.out.println();
        }


        System.out.println("Gaji Bulanan dengan Bonus:");
        for (Employee emp : employees) {
            System.out.println(emp.name + ": Rp" + emp.calculateSalary(true));
        }
    }
}
