public class MaximumLoot {
    // MaximumLoot is a knapsack-style problem where items have a weight (constraint variable)
    // and a cost (target variable) and the total cost must be optimized to meet the constraint
    // of the total weight.
    public static int maximumLoot (int W, int[] weight, int[] cost) {
        if (W == 0 || weight.length == 0) {
            return 0;
        }

        int m = indexOfMaxArray(cost);
        int amount = Math.min(weight[m], W);
        int value = cost[m] * (amount);
        int newW = W - amount;


        int[] newWeights = new int[weight.length - 1];
        int[] newCosts = new int[weight.length - 1];

        for (int i = 0, j = 0; i <= newWeights.length; i++) {
            if (i != m) {
                newWeights[j++] = weight[i];
            }
        }

        for (int i = 0, j = 0; i <= newCosts.length; i++) {
            if (i != m) {
                newCosts[j++] = cost[i];
            }
        }


        return value + maximumLoot(newW, newWeights, newCosts);
    }

    public static int indexOfMaxArray(int[] array) {
        int max = array[0];
        int idx = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[idx];
                idx = i;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] weights = new int[]{4, 3, 5};
        int[] costs = new int[]{5000, 200, 10};

        int maxLoot = maximumLoot(9, weights, costs);
        System.out.println(maxLoot);
    }
}
