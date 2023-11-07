package dima;

public class Human {
    //inheritance - keyword extends, hierarchy
    // int age = 10;//initialize
    int age;//declare
    int height;
    int weight;
    String nationality;
    String name;
    String introduce(){
//        System.out.println("Hello");
         String introduction= "Hello, I'm " + name +"my age is " + age + ", my weight is " + weight;

        return introduction;

    }

    int massIndex(int height, int weight){
        return height*weight;
    }

//    public void introduce(String n){
//        System.out.println("Hello, I'm " + n);
//    }
    void introduce(String n, int a, int w){
        System.out.println("Hello, I'm " + n +"my age is " + a + ", my weight is " + w);
    }
    public Human(int age, int height, int weight, String nationality, String name){
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    @Override
    // to string name
    public String toString() {
        return name;
    }
}
