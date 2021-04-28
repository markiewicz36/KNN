import org.apache.commons.math3.linear.RealMatrix;
import java.util.ArrayList;

public class KNearestNeighbor {
    RealMatrix x;
    ArrayList<String> y;

    public KNearestNeighbor(RealMatrix x, ArrayList<String> y) {
        this.x = x;
        this.y = y;
    }
}
