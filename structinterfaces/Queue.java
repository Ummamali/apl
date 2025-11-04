public class Queue {
    private int front;
    private int length;
    private int[] items;

    public Queue(int n) {
        this.front = 0;
        this.length = 0;
        this.items = new int[n];
    }

    public int length() {
        return this.length;
    }

    public boolean enque(int key) {
        if (this.length < this.items.length) {
            // queue has space in it
            int k = (this.front + this.length) % this.items.length;
            this.items[k] = key;
            this.length += 1;
            return true;
        } else {
            // queue is full
            System.out.println("Warning! Failed to enque to a full queue.");
            return false;
        }
    }

    public int deque() {
        if (this.length > 0) {
            // queue has items in it
            int key = this.items[this.front];
            this.front = (this.front + 1) % this.items.length;
            this.length -= 1;
            return key;
        } else {
            // queue is empty
            System.out.println("Warning! Deque from an empty queue, bogus value returned!");
            return -1;
        }
    }

    public int peek() {
        if (this.length > 0) {
            // queue has items in it
            return this.items[this.front];
        } else {
            // queue is empty
            System.out.println("Warning! Peeking an empty queue, bogus value returned!");
            return -1;
        }
    }

    public void print() {
        System.out.printf("Queue (%d/%d): ", this.length, this.items.length);

        for (int i = 0; i < this.length; i++) {
            int k = (this.front + i) % this.items.length;
            System.out.printf(" <-- %d", this.items[k]);
        }

        System.out.println(" <--");
    }

    public void debug() {
        System.out.println("Debugging Queue:");
        for (int i = 0; i < this.items.length; i++) {
            System.out.printf("  [%d] %d", i, this.items[i]);
            if (this.length > 0 && i == this.front) {
                System.out.print(" <-- front");
            }
            if (this.length > 0 && (i == (this.front + this.length - 1) % this.items.length)) {
                System.out.print(" <-- Rear");
            }
            System.out.println();
        }
    }
}
