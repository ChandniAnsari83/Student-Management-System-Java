// package src;
public class Student {
    private int id;
    private String name;
    private int age;
    private String course;
    public Student(int id, String name, int age, String course){
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Course: " + course;
    }
    //getter methods to get the values from another class;
    public int get_id() {
        return id;
    }
    public String get_name() {
        return name;
    }
    public int get_age(){
        return age;
    }
    public String get_course(){
        return course;
    }

    //setter methods;
    public void set_id(int id){
        this.id = id;
    }
    public void set_name(String name){
        this.name = name;
    }
    public void set_age(int age){
        this.age = age;
    }
    public void set_course(String course){
        this.course = course;
    }
    // public static void main(String[] args) {

    // }
}
