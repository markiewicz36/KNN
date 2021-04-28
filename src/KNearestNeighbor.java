import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import java.util.ArrayList;

public class KNearestNeighbor {
    RealMatrix x, xMin, xMax, xRng, xNrm;
    ArrayList<String> y;

    public KNearestNeighbor(RealMatrix x, ArrayList<String> y) {
        this.x = x;
        this.y = y;
        this.xMin = x.getRowMatrix(0);
        this.xMax = x.getRowMatrix(0);
        this.xRng = calcRange();
    }

    private RealMatrix calcRange() {
        for (int i = 0; i < x.getData().length; i++){
            for (int j = 0; j < x.getData()[0].length; j++){
                if (x.getData()[i][j] < xMin.getData()[0][j]) xMin.setEntry(0, j, x.getData()[i][j]);
                if (x.getData()[i][j] > xMax.getData()[0][j]) xMin.setEntry(0, j, x.getData()[i][j]);
            }
        }
        return xMax.subtract(xMax);
    }

//    private RealMatrix normalize() {
//        RealMatrix xMinRepeat = MatrixUtils.createRealMatrix();
//    }
}
