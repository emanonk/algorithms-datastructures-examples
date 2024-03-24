package datastructureexamples;


import java.util.*;

//10 Graph Algorithms You Must Know
//
//Graph algorithms are computational procedures designed to analyze and manipulate graph structures, facilitating tasks such as pathfinding, connectivity analysis, and optimization in various applications like network routing and social network analysis.
//
//1. Breadth-first search: Traverses a graph level by level, exploring all neighbors of a node before moving on to the next level.
//
//2. Depth-first search: Explores as far as possible along each branch before backtracking, often implemented using recursion.
//
//3. Shortest path: Finds the most efficient path between two nodes in terms of the sum of edge weights.
//
//4. Cycle detection: Identifies the presence of cycles (loops) in a graph, crucial for detecting dependencies and avoiding infinite loops.
//
//5. Minimum spanning tree: Finds the subset of edges that connects all vertices with the minimum total edge weight, forming a tree.
//
//6. Strongly connected components: Divides a directed graph into strongly connected subgraphs, where each vertex is reachable from every other vertex.
//
//7. Topological sorting: Orders the vertices of a directed acyclic graph in such a way that for every directed edge, the destination vertex comes after the source vertex.
//
//8. Graph Colouring: Assigns colors to vertices of a graph such that no two adjacent vertices share the same color, often used in scheduling and resource allocation.
//
//9. Maximum flow: Determines the maximum amount of flow that can be sent from a designated source to a designated sink in a flow network.
//
//10. Matching: Identifies edges in a graph such that no two edges share a common vertex, often used in bipartite graph matching or assignment problems.

class Graph {
    int v;
    LinkedList<Integer> adj[];

    Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<Integer>();
    }


    void addEdge(int u, int v) {
        adj[u].add(v);
    }

    void BFS(int s) {
        boolean[] visited = new boolean[v];
        LinkedList<Integer> q = new LinkedList<Integer>();
        q.add(s);
        visited[s] = true;

        while (!q.isEmpty()) {
            int x = q.poll();
            System.out.print(x + " ");

            Iterator<Integer> itr = adj[x].listIterator();
            while (itr.hasNext()) {
                int p = itr.next();
                if (visited[p] == false) {
                    visited[p] = true;
                    q.add(p);
                }
            }
        }
    }


    void DFSUtil(int s, boolean[] visited) {
        visited[s] = true;
        System.out.println(s);

        Iterator<Integer> itr = adj[s].listIterator();
        while (itr.hasNext()) {
            int x = itr.next();
            if (visited[x] == false) {
                //visited[x]=true;

                DFSUtil(x, visited);
            }
        }
    }


    void DFS(int s) {
        boolean visited[] = new boolean[v];
        DFSUtil(s, visited);
    }
}

public class GraphExample {
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.BFS(2);
        g.DFS(2);

    }
}

/*
Graph
-Basically it is a group of edges and vertices
-Graph representation
--G(V, E); where V(G) represents a set of vertices and E(G) represents a set of edges
-The graph can be directed or undirected
-The graph can be connected or disjoint
Advantages
-finding connectivity
-Shortest path
-min cost to reach from 1 pt to other
-Min spanning tree
Disadvantages
-Storing graph(Adjacency list and Adjacency matrix) can lead to complexities
Applications
-Suitable for a circuit network
-Suitable for applications like Facebook, LinkedIn, etc
-Medical science
 */


