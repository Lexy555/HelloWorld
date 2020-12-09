public class ClassesAndObjects {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setNameAndAge("Sasha" , 26);
        person2.setNameAndAge("Ваня", 30);
        person1.speak();
        person2.speak();
        person2.calculatedYearsToRetiremnt();
        int years =person1.calculatedYearsToRetiremnt();
        System.out.println("До пенсии осталось " +years + " лет");


    }
}
class Person {
    private   String name;//ограничиваем доступ к полям
    private  int age;
    void setNameAndAge(String username, int usersage){
        name =username;
        age =usersage;

    }
    int calculatedYearsToRetiremnt(){
        int years  =65 -age;
        return years;
    }

    void speak() {
        System.out.println("Я " + name + " мне " + age);
    }
    void sayHello(){
        System.out.println("Привет");

    }
}
