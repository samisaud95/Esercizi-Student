public class Student {
    private String name;
    private   String lastName;
    private int id;

    public Student(String name, String lastName, int id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    public String getName(){
    return name;
    }
    public void setName(String Name){
        this.name= name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public int getId(){
        return id;
    }
    public void setId(int Id){
        this.id=id;
    }

}
