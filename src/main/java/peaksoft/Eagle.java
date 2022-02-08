package peaksoft;

public class Eagle implements Animal {

    private String name;
    private int age;
    private int weight;
    private String color;


    @Override
    public void animalPlus() {
        System.out.println(" Plus: -> Very useful for hunting ☺. ");
    }

    @Override
    public void animalMinus() {
        System.out.println(" Minus: -> May cause adverse effects on humans. ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
