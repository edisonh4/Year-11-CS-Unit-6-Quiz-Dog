public class Dog {
    private int age;
    private String name;
    private String colour;

    public Dog(){
        age = 0;
    }
    public Dog(int age, String name, String colour){
        this.age = age;
        this.name = name;
        this.colour = colour;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getColour(){
        return colour;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    private int addOneAge(){
        age++;
        return age;
    }
    public int birthday(int age){
        age = addOneAge();
        return age;
    }
    public String toString(){
        return "The dog is named "+ name +" and is "+age+" years old. This dog is "+colour+".";
    }

}
