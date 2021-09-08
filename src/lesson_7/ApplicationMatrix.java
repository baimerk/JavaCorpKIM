package lesson_7;

public class ApplicationMatrix {
    public static void main(String[] args) {
        MMatrix mMatrix = new MMatrix(8,5);
        mMatrix.displayArray();
        //mMatrix.multiplex(2);
        //System.out.println("------------");
        //mMatrix.displayArray();
        //Вывод ниже матрицы сложения
        mMatrix.sumArray(mMatrix.generateArray());
        System.out.println("----------");
        mMatrix.displayArray();
        //Вывод ниже матрицы умножения
        double[][]array1 = mMatrix.generateArray();
        mMatrix.sumArray(array1);
        mMatrix.displayArray();
        System.out.println("********");
        //mMatrix.multiplex(array1);
        //mMatrix.displayArray();
    }
}
