package lab3_matrix;

import java.util.Random;

public class Matrix {
    private int[][] data;

    // Constructor: initializes matrix with given dimensions
    public Matrix(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Rows and columns must be positive integers.");
        }
        data = new int[rows][cols];
    }

    // Constructor: initializes matrix with pre-existing 2D array
    public Matrix(int[][] data) {
        if (data == null || data.length == 0 || data[0].length == 0) {
            throw new IllegalArgumentException("Data array cannot be null or empty.");
        }

        int rows = data.length;
        int cols = data[0].length;
        this.data = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            if (data[i].length != cols) {
                throw new IllegalArgumentException("All rows must have the same number of columns.");
            }
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = data[i][j]; // manual copy
            }
        }
    }

    // Fills the matrix with random integers between 1 and 10
    public void populateRandom() {
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = rand.nextInt(10) + 1; // 1 to 10
            }
        }
    }

    // Adds this matrix to another matrix
    public Matrix add(Matrix other) {
        if (other == null) {
            throw new IllegalArgumentException("Other matrix cannot be null.");
        }
        if (this.data.length != other.data.length || this.data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions to add.");
        }

        int rows = data.length;
        int cols = data[0].length;
        Matrix result = new Matrix(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }

        return result;
    }

    // Multiplies this matrix by another matrix
    public Matrix multiply(Matrix other) {
        if (other == null) {
            throw new IllegalArgumentException("Other matrix cannot be null.");
        }
        if (this.data[0].length != other.data.length) {
            throw new IllegalArgumentException(
                    "Number of columns of first matrix must equal number of rows of second matrix.");
        }

        int rows = this.data.length;
        int cols = other.data[0].length;
        int common = this.data[0].length;

        Matrix result = new Matrix(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }

        return result;
    }

    // String representation of the matrix
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : data) {
            for (int val : row) {
                sb.append(val).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
