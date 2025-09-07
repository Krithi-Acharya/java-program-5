package Stack;

public class Stack {
	private Person[] arr;
	private int top;
	private int capacity; 
	
	Stack(int size){
		this.capacity=size;
		this.top=-1;
		this.arr=new Person[capacity];
	}
	Stack(Person[] inputArr) {
        capacity = inputArr.length;
        arr = new Person[capacity];
        top = -1;
        for (Person p : inputArr) {
            push(p);
        }
    }
	public void push (Person p) {
		if(top==capacity-1)
		{
			System.out.println("Stack overflow!: cannot push");
			return;
		}
		arr[++top]=p;
	}	
	public void push(Person p1,Person p2) {
		push(p1);
		push(p2);
	}
	public Person pop() {
		if(top==-1) {
			System.out.println("stack underflow!");
			return null;
		}
		return arr[top--];
	}
	void pop(int n) {
        for (int i = 0; i < n; i++) {
            Person p = pop();
            if (p != null) {
                System.out.print("Popped: ");
                p.displayPerson();
            } else {
                break;
            }
        }
    }
	public void display() {
		System.out.println(" ");
		for (int i = top; i >= 0; i--) {
			arr[i].displayPerson();
		}
	}
	void display(int n) {
	    System.out.println("Top " + n + " Person(s):");
	    for (int i = top; i >= 0 && n > 0; i--, n--) {
	        arr[i].displayPerson();
	    }
	}
}
