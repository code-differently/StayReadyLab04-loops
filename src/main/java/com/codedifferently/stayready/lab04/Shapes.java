package com.codedifferently.stayready.lab04;


public class Shapes {

        private String buildRow(int x , int length){
            String builder = "| ";
            for (int j = 1; j < length; j++){
                int l = x * j;
                builder += Integer.toString(l) + " | ";
            }
            return builder+"\n";
    
        }
    
        public String triangle(){
            String empString = "";
            for(int i = 1; i<6; i++){
                empString += "*".repeat(i)+"\n";
            }
            return empString;
        }
    
        public String tableSquare(){
            String table = "";
            for(int x = 1; x <= 4; x++){
                table += buildRow(x, 4+1);
            }
            return table;
        }
    
        public String tableSquares(int n){
            String table = "";
            for(int x = 1; x <= n; x++ ){
                table += buildRow(x, n+1);
    
            }
            return table;
        }
}
