class Main {
    static int strength;
    int EID;
    String Name, Course;
    
    Main(String Name, String Course) {
        this.Name = Name;
        this.Course = Course;
        strength++;
        this.EID = strength;
        System.out.println("Name: " + this.Name + ", Course: " + this.Course + ", EID: " + this.EID);
    }
    
    public static void main(String[] args) {
        Main m1 = new Main("Rayaan", "BCA");
        Main m2 = new Main("ayaan", "BCA");
        Main m3 = new Main("yaan", "BCA");
        Main m4 = new Main("an", "BCA");
    }
}

