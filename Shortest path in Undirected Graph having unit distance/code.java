class Pair{
    int node;
    int dist;
    Pair(int s,int n){
        this.node=n;
        this.dist=s;
    }
}
class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        PriorityQueue pq=new PriorityQueue((x,y)->x.dist-y.dist);
        pq.add(0,src);

        int[] dist=new int[m];
        for(int i=0;i<m;i++){
            dist[i]=1e9;
        }

    }
}