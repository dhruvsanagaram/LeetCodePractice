#1/2/23 - Longest Common Prefix - Strings - Easy
class Solution(object):
    def longestCommonPrefix(self, strs):
        if(len(strs) == 0):
            return ""
        prefix = strs[0]
        for i in range(len(strs)):
            print(strs[i].find(prefix))
            while(strs[i].find(prefix) != 0):
                prefix = prefix[0:len(prefix)-1]
                if(prefix == ""):
                    return ""
        return prefix

