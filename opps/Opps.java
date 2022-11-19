package opps;

public class Opps {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // created pen object called p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        // BankAccount myAccount = new BankAccount();
        // myAccount.userName = "Dharmesh";
        // myAccount.setPassword("dhar123");
    }
}

class BankAccount {
    public String userName;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPersentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}