class Solution {
public:
    int calPoints(vector<string>& operations) {
        vector<int> resultados;
        int k = 0; 
        int total = 0;
        int aux = 0;
        for(string s : operations){
            if(s == "+"){
                aux = resultados[k-1]+resultados[k-2];
                resultados.push_back(aux);
                total +=aux;
                k++;
            }else if(s == "C"){
                total -= resultados[k-1];
                resultados.pop_back();
                k--;
            }else if(s == "D"){
                aux = resultados[k-1]*2;
                resultados.push_back(aux);
                total+=aux;
                k++;
            }else{
                aux = std::stoi(s);
                resultados.push_back(aux);
                total += aux;
                k++;
            }
            
        }

        return total;
    }
};