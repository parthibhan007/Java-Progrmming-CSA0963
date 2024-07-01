class GrandFather {
    int age;
    String name;

    public GrandFather(int a, String n) {
        this.age = a;
        this.name = n;
        System.out.println("The Name of the Grand Father: " + name);
        System.out.println("The Age of the Grand Father: " + age);
        System.out.println("------------------------------------");
        System.out.println();
    }
}

class Father extends GrandFather {
    int amount;
    String ask;

    public Father(int age, String name, int am, String ask) {
        super(age, name);
        this.amount = am;
        this.ask = ask;
        System.out.println("He will Ask the Amount in: " + ask);
        System.out.println("The Amount is: " + am + " " + ask);
        System.out.println("----------------------------------");
        System.out.println();
    }
}

class Son extends Father {
    public Son(int age, String name, int am, String ask) {
        super(age, name, am, ask);
    }

    public void wantMoney() {
        System.out.println("I want all the Money, paa...");
    }
}

public class Basic {
    public static void main(String[] args) {
        GrandFather o = new GrandFather(70, "Ram");
        Father o1 = new Father(45, "Shyam", 12000, "Dollar");
        Son o2 = new Son(20, "Mohan", 12000, "Dollar");
        o2.wantMoney();
    }
}
