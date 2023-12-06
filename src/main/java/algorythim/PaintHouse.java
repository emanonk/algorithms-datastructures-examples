package algorythim;

public class PaintHouse {

    int n=10;
    int maxCost;
    int k = 15;

    void paint(int i, int cost, int[] mark, int[][] costs) {
        if (i == n) {
            if (cost < maxCost) maxCost = cost;
            return;
        }
        for (int j = 0; j < k; j++) {
            if (i > 0 && mark[i - 1] == i) continue;
            mark[i] = j;
            paint(i + 1, cost + costs[i][j], mark, costs);
            mark[i] = -1;
        }
    }



    public static void main(String[] args) {
//        paint(0, 0, )
    }
}
