
public class Stack {
    private int top;
    private int[] items;

    public Stack(int n) {
        this.top = -1;
        this.items = new int[n];
    }

    public int length() {
        return this.top + 1;
    }

    public int peek() {
        if (this.top + 1 > 0) {
            return this.items[this.top];
        } else {
            System.out.println("Warning! peeking an empty stack!");
            return -1;
        }
    }

    public boolean push(int key) {
        if (this.top < this.items.length - 1) {
            // Stack is not full
            this.top += 1;
            this.items[this.top] = key;
            return true;
        } else {
            // stack is full
            System.out.println("Warning! Failed to push to a full Stack!");
            return false;
        }
    }

    public int pop() {
        if (this.top + 1 > 0) {
            // Stack is not empty
            int key = this.items[this.top];
            this.top -= 1;
            return key;
        } else {
            // Stack is empty
            System.out.println("Warning! Cannot pop from an empty Stack!");
            return -1;
        }
    }

    public void print() {
        System.out.printf("Stack (%d/%d): ", this.top + 1, this.items.length);

        for (int i = 0; i <= this.top; i++) {
            System.out.printf("%d ", this.items[i]);
        }

        System.out.println("<--- Top");
    }

    public void debug() {
        System.out.println("Debugging Stack:");

        for (int i = 0; i < this.items.length; i++) {
            System.out.printf("  [%d] %d", i, this.items[i]);

            if (i == this.top) {
                System.out.print(" <-- Top");
            }

            System.out.println();
        }
    }
}
