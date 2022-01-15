#Problem
`canConstruct(target,wordBank)` returns a boolean indicating whether or not the target can be constructed by concatenating elements of the word bank.

#Time Complexity
n=wordbank.length
m=target.length;
m=height of tree
n= branching factor
- Without DP
  - T.C.:`O(n^m*m)` *m for slicing target string
  - S.C: `O(m*m)` *m for extra space for storing the target string
- With DP
  - T.C.: `O(n*m*m)` *m for slicing target string
  - S.C:`O(m*m)`
