package org.tnsif.capgemini.c2tc.lambda_expression;
import java.util.*;  
public class LambdaExpressionExample6{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("Navya");  
        list.add("Reshma");  
        list.add("Lavanya");  
        list.add("Lakshmi");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  