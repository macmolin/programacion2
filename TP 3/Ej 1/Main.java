public class Main {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();

        System.out.println("Elemento en la cima: " + stack.peek());
        System.out.println("Tamaño actual: " + stack.size());

        stack.clear();
        stack.printStack();
    }
}