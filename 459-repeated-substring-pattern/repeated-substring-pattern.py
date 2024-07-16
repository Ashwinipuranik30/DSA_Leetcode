class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        s1=s +s
        s2 = s[1:] +s[:-1]
        if s2.find(s)>=0:
        
           return True
        else:
            return False
        


        