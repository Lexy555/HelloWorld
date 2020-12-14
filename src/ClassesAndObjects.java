public class ClassesAndObjects {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Какое то имя");
        person1.setAge(-12);
        System.out.println("Выводим  значение в main методе: " +person1.getName());
       System.out.println(" Выводим значение в методе main: "+ person1.getAge());
    }
}
class Person {
    private   String name;//ограничиваем доступ к полям
    private  int age;
   public void setName(String username){
       if(username.isEmpty()){
           System.out.println("Ты ввел пустое имя");
       }else
        name =username;}

     public String getName(){
    return name;
    }
    public void setAge(int userage) {
        if (userage < 0) {
            System.out.println("Возраст должен быть положительным");
        } else {
        age = userage;}
    }
    public int getAge() {
        return age;
    }
    int calculatedYearsToRetiremnt(){
        int years  =65 -age;
        return years;
    }

    void speak(){
        System.out.println("Я " + name + " мне " + age);
    }
    void sayHello(){
        System.out.println("Привет");

    }
}
