class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& word1, vector<string>& word2) {
        string word;
        for (string s :word1){
            word += s;

        
        }
        string w2;
        for (string s2 :word2){
            w2+=s2;


        }
        return word==w2;
    }
};