class Solution:
    
    def mergeAlternately(self, word1: str, word2: str) -> str:
        a , b = len(word1) , len(word2)
        result=''
        for i in range(min(a,b)):
            result+=word1[i]
            result+=word2[i]
        if a>b:
            result+=word1[b:]
        else:
            result+=word2[a:]
        return result
         

        