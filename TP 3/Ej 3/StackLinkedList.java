public class StackLinkedList {
    private Node top;

    // Constructor
    public StackLinkedList() {
        top = null;
    }

    // push: agrega un nuevo nodo al inicio (cima de la pila)
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // pop: elimina el nodo en la cima y retorna su valor
    public int pop() {
        if (isEmpty()) {
            System.out.println("Error: La pila está vacía.");
            return -1;
        }

        int value = top.data;
        top = top.next;
        return value;
    }

    // peek: retorna el valor de la cima sin eliminarlo
    public int peek() {
        if (isEmpty()) {
            System.out.println("Error: La pila está vacía.");
            return -1;
        }

        return top.data;
    }

    // isEmpty: verifica si la pila está vacía
    public boolean isEmpty() {
        return top == null;
    }

    // Método para imprimir el contenido de la pila
    public void printStack() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }

        System.out.print("Contenido de la pila (de cima a base): ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}