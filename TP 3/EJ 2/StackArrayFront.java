public class StackArrayFront {
    private int[] stack;
    private int size;
    private int capacity;

    // Constructor
    public StackArrayFront(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.size = 0;
    }

    // push: inserta en la posición 0, desplazando hacia la derecha
    public void push(int value) {
        if (isFull()) {
            System.out.println("Error: La pila está llena.");
            return;
        }

        // Desplazar elementos hacia la derecha
        for (int i = size; i > 0; i--) {
            stack[i] = stack[i - 1];
        }

        // Insertar el nuevo elemento en la posición 0
        stack[0] = value;
        size++;
    }

    // pop: elimina el elemento en la posición 0, desplazando hacia la izquierda
    public int pop() {
        if (isEmpty()) {
            System.out.println("Error: La pila está vacía.");
            return -1;
        }

        int value = stack[0];

        // Desplazar elementos hacia la izquierda
        for (int i = 0; i < size - 1; i++) {
            stack[i] = stack[i + 1];
        }

        size--;
        return value;
    }

    // peek: retorna el elemento en la posición 0 sin eliminar
    public int peek() {
        if (isEmpty()) {
            System.out.println("Error: La pila está vacía.");
            return -1;
        }
        return stack[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    // Método adicional para mostrar la pila
    public void printStack() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.print("Contenido de la pila (de cima a base): ");
            for (int i = 0; i < size; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}