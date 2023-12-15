import java.util.ArrayList;
import java.util.PriorityQueue;

class Pair {
    int dist;
    int node;

    Pair(int s, int n) {
        this.dist = s;
        this.node = n;
    }
}

class Solution {
    
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.dist - y.dist);
        int[] dist = new int[V];
        
        for (int i = 0; i < V; i++) {
            dist[i] = (int) 1e9;
        }
        
        dist[S] = 0;
        pq.add(new Pair(0, S));
        
        while (!pq.isEmpty()) {
            int dis = pq.peek().dist;
            int node = pq.peek().node;
            pq.remove();
            
            for (int i = 0; i < adj.get(node).size(); i++) {
                int adjw = adj.get(node).get(i).get(1);
                int adjn = adj.get(node).get(i).get(0);
                
                if (dis + adjw < dist[adjn]) {
                    dist[adjn] = dis + adjw;
                    pq.add(new Pair(dist[adjn], adjn));
                }
            }
        }
        
        return dist;
    }
}
