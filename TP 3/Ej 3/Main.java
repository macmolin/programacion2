public class Main {
    public static void main(String[] args) {
        StackLinkedList pila = new StackLinkedList();

        pila.push(5);
        pila.push(15);
        pila.push(25);
        pila.printStack(); // Contenido: 25 15 5

        System.out.println("Cima de la pila: " + pila.peek()); // 25

        System.out.println("Elemento eliminado: " + pila.pop()); // 25
        pila.printStack(); // Contenido: 15 5

        System.out.println("¿Está vacía?: " + pila.isEmpty()); // false
    }
}