#Problem
You are a traveller on a 2D grid. You begin top-left corner and your goal is to travel to the bottom-right corner. You may move down or right.

In how many ways can you travel to the goal on a grid with dimensions m*n?

#Approach
1. Make a small case. 
  - eg. make 1x1 grid will give 1 way to travel.
  - 0X1 or 1x0 will give 0 way to travel.
2. Use these small cases as base cases.
3. Now use the options the traveller can move i.e. down or right.
4. Take a bigger example and use the options of movement to solve the part of problem until base cases is reached.
5. Code the problem without DP
6. Add a DS to change it into DP

#Complexity
Number of levels: `n+m` as either m decrease or n decrease at each level
- Without DP: 
  - T.C.: `O(2^(n+m))`
  - S.C.: `O(n+m)`

- With DP:
  - Number of possible combinations having dimension m and n = `m*n`
  - T.C:`O(m*n)`
  - S.C.:`O(m+n)`