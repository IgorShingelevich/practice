package dima;

public class Human {
    //inheritance - keyword extends, hierarchy
    // int age = 10;//initialize
    int age;//declare
    int height;
    int weight;
    String nationality;
    String name;
    public void introduce(){
        System.out.println("Hello");
    }
    public Human(int age, int height, int weight, String nationality, String name){
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }
}
