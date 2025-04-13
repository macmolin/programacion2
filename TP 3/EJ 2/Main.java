public class Main {
    public static void main(String[] args) {
        StackArrayFront pila = new StackArrayFront(5);

        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.printStack();

        System.out.println("Elemento eliminado: " + pila.pop());
        pila.printStack();

        System.out.println("Cima actual: " + pila.peek());
    }
}