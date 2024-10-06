public class ConstructorOverloading {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher("Halim", "Male", 123);
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher("Rifat", "Male", 124);
        teacher3.displayInformation();
    }
}

class Teacher{
    public String name, gender;
    public int roll;
    public Teacher(){
        System.out.println("No information");
    }

    public Teacher(String n, String g, int r){
        name = n;
        gender = g;
        roll = r;
    }

    public void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Roll: "+roll);
        System.out.println();
    }
}
