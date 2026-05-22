package practicas;

//aqui lo que se ve es que se va a aplicar una herencia
class Person{
    private int age;

    int getAge(){
        return age;
    }

    void setAge(int age){
        this.age = age;
    }

}
//vemos el metodo main el cual se ve que aplica
// se ve que se esta aplicando el setter y el getter
public class Employee extends Person{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setAge(29);
        System.out.println(e.getAge());
    }
}
