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
  - T.C.:`O(n^m)`
  - S.C.: `O(m)`