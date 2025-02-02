# Java-DSA-Interview
Java, Data Structure and Algorithms questions along with solutions for Interviews.

## Graphs
### Implementation:
| Feature                | Adjacency Matrix | Adjacency List        |
|------------------------|-----------------|-----------------------|
| **Space Complexity**   | O(V²)           | O(V + E)              |
| **Best for**          | Dense graphs (many edges) | Sparse graphs (few edges) |
| **Edge insertion**     | O(1)             | O(1)                  |
| **Checking edge existence** | O(1)     | O(degree of vertex)   |
| **Traversing neighbors** | O(V)        | O(number of neighbors) |

**Adjacency List** is better for most real-world graphs because it **saves space**.  
**Adjacency Matrix** is better when **frequent edge lookups** are needed.
- [Implementation of Graph using adjacency matrix.](https://github.com/rajtejaswee/Java-DSA-Interview/blob/main/src/Graphs/GraphMatrix.java)
- [Implementation of Graph using adjacency list.](https://github.com/rajtejaswee/Java-DSA-Interview/blob/main/src/Graphs/GraphList.java)
### Graph Conversion:

| Conversion        | Steps |
|-------------------|------------------------------------------------------------------|
| **Matrix → List** | Traverse the matrix and for each `1`, add the corresponding index to the adjacency list. |
| **List → Matrix** | Iterate through the adjacency list and set `matrix[i][j] = 1` if an edge exists. |

This ensures **efficient** graph representations depending on whether the graph is dense (use a matrix) or sparse (use a list).

[Code Implementation]()
### Connected Components: 
- for any traversal use a visited array of the size node+1.
- pseudocode:
  <pre><code>for(int i = 0; i < node + 1; i++) { 
  if(!vis[i]) { 
      traversal(i); 
     } 
  } </code></pre>

### Breadth-First Search(BFS):
- In BFS, we start with a “starting” node, mark it as visited, and push it into the queue data structure.
  In every iteration, we pop out the node ‘v’ and put it in the solution vector, as we are traversing this node.
  All the unvisited adjacent nodes from ‘v’ are visited next and are pushed into the queue. The list of adjacent neighbors of the node can be accessed from the adjacency list.
- Level breadth wise height.
- We have to see the distance from each node breadth wise.
- [Code Implementation.](https://github.com/rajtejaswee/Java-DSA-Interview/blob/main/src/Graphs/BFS.java)

### Depth-First Search(DFS):
- DFS is a traversal technique which involves the idea of recursion and backtracking. DFS goes in-depth, i.e., traverses all nodes by going ahead, and when there are no further nodes to traverse in the current path, then it backtracks on the same path and traverses other unvisited nodes. 
- Algorithm: Recursion
- [Code Implementation.](https://github.com/rajtejaswee/Java-DSA-Interview/blob/main/src/Graphs/DFS.java)