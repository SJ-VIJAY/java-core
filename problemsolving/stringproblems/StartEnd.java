package problemsolving.stringproblems;

import java.sql.*;

public class StartEnd {
    public static void main(String[] args) {
        int [] ar = {13,33,44,343,343};

         for(int n : ar){
             String s = String.valueOf(n);
             if(s.charAt(0) == '3' && !s.contains("2")) {
                 System.out.println(n);
             }
         }
    }
}
