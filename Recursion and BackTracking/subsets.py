'''
Given an integer array nums of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.
 
Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:
Input: nums = [0]
Output: [[],[0]]
'''

class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res=[]
        def subSets(arr,index):
            #when index is greater than the length of list then print the subset
            #base condition
            if(index>=len(nums)):
                res.append(arr.copy())
                return 
              
            #add the current element
            arr.append(nums[index])
            #including the current element
            subSets(arr,index+1)
            
            #removing the current index element
            arr.pop()
            
            #not including the current element
            subSets(arr,index+1)
        
        subSets([],0)
        return res
