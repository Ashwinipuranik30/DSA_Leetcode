class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        number=""
        
        for i in digits:
            number = number + str(i)

        numberint= int(number)
        numberint= numberint+1
        digits.clear()

        number1 = str(numberint)
        for i in number1:
            digit=int(i)
            digits.append(digit)

        return digits       

        


            

            
        