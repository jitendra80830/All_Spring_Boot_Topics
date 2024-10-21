package Maths;

import java.util.Arrays;
import java.util.List;
/*3

        5

        10111*/

public class RubbleRover {
    public static void main(String[] args) {
        int p  = 3;
        List<Integer> list = Arrays.asList(1,0,1,1,1);

        int solve = solve3(p, list);
        System.out.println(solve);
    }
    public static int solve3(int P, List<Integer> a) {
        int N = a.size();
        int collectedGarbage = 0;
        // Convert P to 0-based index
        P = P - 1;
        // Check the initial position
        if (a.get(P) == 1) {
            collectedGarbage++;
        }
        // Expand outwards from position P
        int left = P - 1;
        int right = P + 1;
        while (left >= 0 || right < N) {
            if (left >= 0 && right < N) {
                // Both sides are within bounds
                if (a.get(left) == 1 && a.get(right) == 1) {
                    collectedGarbage += 2; // Collect from both sides
                } else if (a.get(left) == 1) {
                    collectedGarbage += 1; // Collect from left only
                } else if (a.get(right) == 1) {
                    collectedGarbage += 1; // Collect from right only
                }
            } else if (left >= 0) {
                // Only the left side is within bounds
                if (a.get(left) == 1) {
                    collectedGarbage += 1;
                }
            } else if (right < N) {
                // Only the right side is within bounds
                if (a.get(right) == 1) {
                    collectedGarbage += 1;
                }
            }

            left--;
            right++;
        }

        return collectedGarbage-1;
    }
    public static int solve2(int P, List<Integer> a) {
        int N = a.size();
        int collectedGarbage = 0;

        // Convert P to 0-based index
        P = P - 1;

        // Check the initial position
        if (a.get(P) == 1) {
            collectedGarbage++;
        }

        // Expand outwards from position P
        int left = P - 1;
        int right = P + 1;

        while (left >= 0 || right < N) {
            if (left >= 0 && right < N) {
                // Both sides are within bounds
                if (a.get(left) == 1 && a.get(right) == 1) {
                    collectedGarbage += 2;
                } else if (a.get(left) == 1 || a.get(right) == 1) {
                    collectedGarbage += 1;
                }
            } else if (left >= 0) {
                // Only the left side is within bounds
                if (a.get(left) == 1) {
                    collectedGarbage += 1;
                }
            } else if (right < N) {
                // Only the right side is within bounds
                if (a.get(right) == 1) {
                    collectedGarbage += 1;
                }
            }

            left--;
            right++;
        }

        return collectedGarbage;
    }

    public static int solve(int P, List<Integer> a) {
        int collect = 0;
        int curr = P;
        int n = a.size();
        boolean left = true;

        while (collect < n && curr >= 1 && curr <= n) {
            if (a.get(curr - 1) == 1) {
                collect++;
                a.set(curr - 1, 0);
            } else if (left) {
                curr++;
                left = false;
            } else {
                curr--;
                left = true;
            }
        }

        return collect;
    }
}
