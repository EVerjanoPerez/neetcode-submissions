class Solution {
    public int calPoints(String[] operations) {
        int[] resultados = new int[operations.length];
        int k = 0;
        int total = 0;
        int aux = 0;

        for(String s : operations) {
            switch (s){
                case "+":
                    aux = resultados[k-1] + resultados[k-2];
                    total = total + aux;
                    resultados[k] = aux;
                    k++;
                    break;
                case "C":
                    total = total - resultados[k-1];
                    k--;
                    break;
                case "D":
                    aux =  resultados[k-1]*2;
                    total = total + aux;
                    resultados[k] = aux;
                    k++;
                    break;
                default:
                    resultados[k] = (Integer.parseInt(s));
                    total +=resultados[k];
                    k++;
                    break;
            }
        }
        return total;
    }
}