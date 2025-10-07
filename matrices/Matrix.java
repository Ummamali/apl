public class Matrix {

    private int[][] mtrx;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.mtrx = new int[rows][columns];
        this.rows = rows;
        this.columns = columns;
    }

    public void print() {
        int[] widths = new int[this.columns];

        for (int col = 0; col < this.columns; col++) {
            widths[col] = columnWidth(col);
        }

        for (int r = 0; r < this.rows; r++) {
            for (int c = 0; c < this.columns; c++) {
                String item = String.format("%" + widths[c] + "s", this.mtrx[r][c]);
                System.out.printf("%s%c", item, c < this.columns - 1 ? ' ' : '\0');
            }
            System.out.println();
        }
    }

    public int getAt(int r, int c) {
        return this.mtrx[r][c];
    }

    public void setAt(int r, int c, int item) {
        this.mtrx[r][c] = item;
    }

    public void swapItems(int[] indexOne, int[] indexTwo) {
        int temp = this.mtrx[indexTwo[0]][indexTwo[1]];

        this.mtrx[indexTwo[0]][indexTwo[1]] = this.mtrx[indexOne[0]][indexOne[1]];

        this.mtrx[indexOne[0]][indexOne[1]] = temp;
    }

    public void populateRow(int[] rItems, int row) {
        for (int i = 0; i < rItems.length; i++) {
            this.mtrx[row][i] = rItems[i];
        }
    }

    public void populateColumn(int[] cItems, int column) {
        for (int i = 0; i < cItems.length; i++) {
            this.mtrx[i][column] = cItems[i];
        }
    }

    public void populate() {
        int count = 1;
        for (int r = 0; r < this.rows; r++) {
            for (int c = 0; c < this.columns; c++) {
                this.mtrx[r][c] = count;
                count++;
            }
        }
    }

    public int columnWidth(int column) {
        int maxWidth = 0;

        for (int r = 0; r < this.rows; r++) {
            int digits = Integer.toString(this.mtrx[r][column]).length();
            if (digits > maxWidth) {
                maxWidth = digits;
            }
        }
        return maxWidth;
    }

    public void swapColumns(int colOne, int colTwo) {
        for (int r = 0; r < this.rows; r++) {
            int temp = this.mtrx[r][colTwo];
            this.mtrx[r][colTwo] = this.mtrx[r][colOne];
            this.mtrx[r][colOne] = temp;
        }
    }

    public void swapRows(int rowOne, int rowTwo) {
        for (int c = 0; c < this.columns; c++) {
            int temp = this.mtrx[rowTwo][c];
            this.mtrx[rowTwo][c] = this.mtrx[rowOne][c];
            this.mtrx[rowOne][c] = temp;
        }
    }

    public int[] getDiagonal() {
        int[] dg = new int[this.rows];

        for (int r = 0; r < this.rows; r++) {
            dg[r] = this.mtrx[r][r];
        }

        return dg;
    }

    public int[] getReverseDiagonal() {
        int[] dg = new int[this.rows];

        for (int r = 0; r < this.rows; r++) {
            dg[r] = this.mtrx[r][this.columns - 1 - r];
        }

        return dg;
    }

    public int[] getMax() {
        int[] maxIndices = { -1, -1 };
        int max = 0;

        for (int r = 0; r < this.rows; r++) {
            for (int c = 0; c < this.columns; c++) {
                if (maxIndices[0] == -1 || this.mtrx[r][c] > max) {
                    max = this.mtrx[r][c];
                    maxIndices[0] = r;
                    maxIndices[1] = c;
                }
            }
        }
        return maxIndices;
    }

    public int[] getMin() {
        int[] minIndices = { -1, -1 };
        int min = 0;

        for (int r = 0; r < this.rows; r++) {
            for (int c = 0; c < this.columns; c++) {
                if (minIndices[0] == -1 || this.mtrx[r][c] < min) {
                    min = this.mtrx[r][c];
                    minIndices[0] = r;
                    minIndices[1] = c;
                }
            }
        }
        return minIndices;
    }

}
