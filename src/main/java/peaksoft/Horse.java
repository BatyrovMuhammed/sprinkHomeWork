package peaksoft;

public class Horse implements Animal {

    private String name;
    private String bred;
    private int age;
    private String color;
    private int weight;


    public String getBred() {
        return bred;
    }

    public void setBred(String bred) {
        this.bred = bred;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void animalPlus() {
        System.out.println("Plus: -> An animal that brings good the home ☺.");
    }

    @Override
    public void animalMinus() {
        System.out.println("Minus: -> There is no minus.");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", bred='" + bred + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
