public class DynamicSequence {
    private int[] items;
    private int count;

    public DynamicSequence(int size) {
        this.items = new int[size];
        this.count = 0;
    }

    public int getCount() {
        return this.count;
    }

    public int getSize() {
        return this.items.length;
    }

    public void insertAt(int item, int idx) {
        if (this.count < this.items.length) {
            for (int i = this.count; i > idx; i--) {
                this.items[i] = this.items[i - 1];
            }

            this.items[idx] = item;
            this.count++;
        }
    }

    public int deleteAt(int idx) {
        int item = this.items[idx];
        for (int i = idx; i < this.count - 1; i++) {
            this.items[i] = this.items[i + 1];
        }
        this.count--;
        return item;
    }

    public void print() {
        System.out.printf("Sequence (%d/%d): ", this.count, this.items.length);

        for (int i = 0; i < this.count; i++) {
            System.out.print(this.items[i]);

            if (i < this.count - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    public void debugPrint() {
        Utils.printArray(this.items);
    }
}
