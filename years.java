class NormyYear {
    int days;

    NormyYear(int d) {
        days = d;
    }

    void display() {
        System.out.println("Number of Days In Year " + days);
    }
}

class LeapYear extends NormyYear {
    LeapYear(int d) {
        super(d);
    }

    void display() {
         
        System.out.println("The Number of Days In Leap Year: " + days);
    }
}

class Main {
    public static void main(String[] args) {
        NormyYear Ny = new NormyYear(365);
        LeapYear LP = new LeapYear(366);

        Ny.display();
        LP.display();
    }
}
