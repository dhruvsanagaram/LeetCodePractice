#1/3/23 - Remove Duplicates from Sorted Array - Arrays - Essay
class Solution(object):
    def removeDuplicates(self, nums):
        # my_dict = dict()
        # for i in range(len(nums)):
        #     if(nums[i] in my_dict.keys()):
        #         my_dict[nums[i]] += 1
        #     else:
        #         my_dict[nums[i]] = 1
        # nums = my_dict.keys()
        # return len(my_dict.keys()) 
        if len(nums) == 0:
            return 0
        
        addIdx = 1
        for i in range (len(nums)-1):
            if(nums[i] < nums[i+1]):
                nums[addIdx] = nums[i+1]
                addIdx+=1
        return addIdx

