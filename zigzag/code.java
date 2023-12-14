class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1||numRows>s.length()){
            return s;
        }
        char[][] board=new char[n][n];
        int row=0;
        int col=0;
        boolean down=false;
        for(char c:s.toCharArray()){
            board[row][col]=c;
            if(row==0||row==numRows-1){
                down=!down;

            }
            row+=down?1:-1;
            col++;


        }
        StringBuilder sb=new StringBuilder();
        for (char[] arr:board){
            for(char c: arr){
                if(c!='\0'){
                    sb.append(c);
                }
            }
        }
        return sb.toString();


        
        
    }
}