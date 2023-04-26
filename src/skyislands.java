import java.util.*;

public class skyislands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int islands = sc.nextInt();
        int bridges = sc.nextInt();
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < islands; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < bridges; i++) {
            int island = sc.nextInt() - 1;
            int bridge = sc.nextInt() - 1;
            adjList.get(island).add(bridge);
            adjList.get(bridge).add(island);
        }
        boolean[] visited = new boolean[islands];
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited[node]) {
                visited[node] = true;
                for (int neighbor : adjList.get(node)) {
                    stack.push(neighbor);
                }
            }
        }
        boolean allVisited = true;
        for (boolean v : visited) {
            if (!v) {
                allVisited = false;
                break;
            }
        }
        if (allVisited) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
