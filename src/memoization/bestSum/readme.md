#Problem
`int[] bestSum(targetSum, numbers[]);`: Retrieve an array containing the shortest combination of elements that add up to exactly the target sum.
- You may use an element of the array as many times as needed.
- assume all input numbers are non negative.
- if not present return null.
- if there is a tie present, return any one.

#Time Complexity
m=target sum
n=array length
Height of tree= `m` where m can be decreased by 1 in worst case
Branching factor=`n` where n is the number of options a number can take.
- Without DP:
    - T.C.: `O(n^m)`
    - S.C.: `O(m)`
- With DP:
    - T.C: `O(m*n)`
    - S.C.: `O(m*m)`The extra *m is due to the space taken by an list of elements into memo object

** extra copying of array is not included into T.C.