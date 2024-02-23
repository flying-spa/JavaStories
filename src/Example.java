import greetings.Hello;
import greetings.Hola;

class Example {
    public static void main(String args[]){
        System.out.println("Hello All");
        Hello hello = new Hello();
        hello.getHello();

        Hola hola = new Hola();
        hola.getHola();
    }
}