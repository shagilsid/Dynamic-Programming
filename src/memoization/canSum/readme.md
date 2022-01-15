#Problem
`boolean canSum(targetSum, numbers[]);`
- You may use an element of the array as many times as needed.
- assume all input numbers are non negative.

# Complexity
m=target sum
n=array length
Height of tree= `m` where m can be decreased by 1 in worst case
Branching factor=`n` where n is the number of options a number can take.
- Without DP
  - T.C.:`O(n^m)` max number of branches a node can have ^ height of tree.
  - Here number of branches a node can have = number of elements in array.
  - S.C.: `O(m)`
- With DP
  - T.C. `O(m*n)`: A target number can be operated using all numbers present in an array. Only 1 time this operation is required for particular target sum.
  - S.C: `O(m)`