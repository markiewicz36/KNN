import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

import java.util.stream.IntStream;

public class MatrixHelper {
    static RealMatrix div(RealMatrix matrix1, RealMatrix matrix2) {
        double[][] returnData = new double[matrix1.getData().length][matrix1.getData()[0].length];
        IntStream.range(0, matrix1.getData().length).forEach(r ->
            IntStream.range(0, matrix1.getData()[0].length).forEach(c ->
                    returnData[r][c] = matrix1.getEntry(r, c)/matrix2.getEntry(r, c)));

        return MatrixUtils.createRealMatrix(returnData);
    }
}
