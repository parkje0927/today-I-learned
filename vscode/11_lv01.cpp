#include <string>
#include <vector>

using namespace std;

vector<string> solution(vector<string> strings, int n) {
    vector<string> answer;

    //선택정렬
    for (int i=0;i<strings.size()-1;i++) {
        for (int j=i+1;j<strings.size();j++) {
            if (strings[i].substr(n, 1).compare(strings[j].substr(n, 1)) > 0) {
                string temp = strings[i];
                strings[i] = strings[j];
                strings[j] = temp;
            }
            
            else if (strings[i].substr(n, 1).compare(strings[j].substr(n, 1)) == 0) {     
                if (strings[i].compare(strings[j]) > 0) {
                    string temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        } 
        answer.push_back(strings[i]);
    }
    
    //마지막 값 넣어주기
    answer.push_back(strings[strings.size()-1]);
    
    return answer;
}