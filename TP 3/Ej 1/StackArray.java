public class StackArray {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public StackArray(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    // Método push (insertar)
    public void push(int value) {
        if (isFull()) {
            System.out.println("Error: La pila está llena.");
        } else {
            stack[++top] = value;
        }
    }

    // Método pop (eliminar el último)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Error: La pila está vacía.");
            return -1;
        } else {
            return stack[top--];
        }
    }

    // Método peek (ver el último sin eliminar)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Error: La pila está vacía.");
            return -1;
        } else {
            return stack[top];
        }
    }

    // Método isEmpty (verificar si está vacía)
    public boolean isEmpty() {
        return top == -1;
    }

    // Método isFull (verificar si está llena)
    public boolean isFull() {
        return top == capacity - 1;
    }

    // 🔹 Método adicional 1: cantidad de elementos en la pila
    public int size() {
        return top + 1;
    }

    // 🔹 Método adicional 2: vaciar completamente la pila
    public void clear() {
        top = -1;
    }

    // Método para imprimir el contenido de la pila (opcional, para pruebas)
    public void printStack() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.print("Contenido de la pila: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}