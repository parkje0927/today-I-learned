#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<int>> board, vector<int> moves) {
    int answer = 0;
    vector <int> container;
    int top = 0;
    
    for (int i=0;i<moves.size();i++) {        
        int idx = moves[i] - 1;
        
        int value = 0;
        for (int j=0;j<board.size();j++) {
            if (board[j][idx] != 0) {
                value = board[j][idx];
                board[j][idx] = 0;
                break;
            }  
        }    
        
        if (value != 0) {
            if (top == 0) {
                container.push_back(value);
                top++;
            }
            else {

                if (container[top-1] == value) {
                    container.pop_back();
                    answer += 2;
                    top--;
                }

                else {
                    container.push_back(value);
                    top++;
                }
            }
        }                     
    }

    return answer;
}