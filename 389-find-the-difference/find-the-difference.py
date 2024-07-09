class Solution:
    def findTheDifference(self, s: str, t: str) -> str:

        
        count = {}
        for j in t: 
            if j in count:
                count[j] = count[j]+1
            else:
                count[j] = 1
        for j in s:
            count[j] = count[j] - 1
        for i in count:
            if count[i] == 1:
                return i
        return None


        

            
        
        