package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SprinkHomeWorkApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person myPerson = context.getBean("myPerson", Person.class);
        System.out.println(myPerson);
        myPerson.getAnimal().animalPlus();
        myPerson.getAnimal().animalMinus();
        System.out.println(" ");
        Person person = context.getBean("myPersons", Person.class);
        System.out.println(person);
        person.getAnimal().animalPlus();
        person.getAnimal().animalMinus();
    }

}
