public class SetterAndGetter {
    public static void main(String[] args) {
        Identity id = new Identity();
        id.setName("Ahtasham Halim Rifat");
        id.setAge(603158);
        System.out.println(id.getName());
        System.out.println(id.getAge());
    }
}

class Identity{

    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }


}
