package work_26_03_2025;

public class MyStack {
    private int[] arr; // [0, 0, 0]
    private int capacity;
    private int top;

    public MyStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value){
        if(top == capacity -1){
            System.out.println("Стек переполнен");
            return;
        }
        top = top + 1;
        arr[top] = value;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Стек уже пустой");
            return -1;
        }
        int result = arr[top];
        top = top - 1;

        return result;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Стек уже пустой");
            return -1;
        }
        return arr[top];
    }


    public boolean isEmpty(){
        return top == -1;
    }

    public void print(){
        System.out.println("Стек: ");
        for (int i = 0; i<= top; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
