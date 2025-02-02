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

### Connected Components: 
- for any traversal use a visited array of the size node+1.
- pseudocode:
  <pre><code>for(int i = 0; i < node + 1; i++) { 
  if(!vis[i]) { 
      traversal(i); 
     } 
  } </code></pre>

### Breadth-First Search(BFS):
- Level breadth wise height.
- We have to see the distance from each node breadth wise.
- [Code Implementation:]()