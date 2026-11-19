class Solution:
    def calPoints(self, operations: List[str]) -> int:

        resultados = []

        for i in operations:
            match i:
                case "+":
                    resultados.append(resultados[-1]+resultados[-2])
                case "D":
                    resultados.append(resultados[-1]*2)
                case "C":
                    resultados.pop()
                case _ :
                    resultados.append(int(i))                
        
        return sum(resultados)
        