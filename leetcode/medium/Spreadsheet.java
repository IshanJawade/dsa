package leetcode.medium;

import java.util.*;

public class Spreadsheet {

    


// A trap by leetcode
// public class Spreadsheet { 
    
//     // data structure for storing Spreadsheet
//     // <col <row> >
//     List<List<Integer>> sheet;

//     public Spreadsheet(int rows) {
//         int cols = 26;

//         // just make room for 26 elements 
//         this.sheet = new ArrayList<>(cols);
        
//         // adding 26 empty lists (columns) in arrayList
//         for(int i=0; i<cols; i++){
//             // make a col of rows 
//             List<Integer> col = new ArrayList<>(Collections.nCopies(rows+1, null));
//             sheet.add(col);
//         }
//     }

//     // fucntion to decode cell address
//     List<Integer> decode(String cell){

//         if (cell == null || cell.isEmpty() )
//             return null;

//         StringBuilder sb = new StringBuilder(cell);
//         sb.deleteCharAt(0);
//         String str = sb.toString(); // row in String

//         char a = cell.charAt(0);
//         int row = Integer.parseInt(str); // row in int
      
//         int col = a - ('A');
//         List<Integer> list = new ArrayList<>();
//         list.add(row);
//         list.add(col);

//         return list; // { row, col }
//     }

    
//     public void setCell(String cell, int value) {
       
//        // this returns {row, col}
//        List<Integer> list = decode(cell);

//         // we are putting values : col <row>
//         sheet.get(list.get(1)).set(list.get(0), value);

//     }
    
//     public void resetCell(String cell) {

//         // this returns {row, col}
//         List<Integer> list = decode(cell);

//         // first col then row
//         sheet.get(list.get(1)).set(list.get(0), 0);
//     }
    
//     public int getValue(String formula) {

//         int plus = formula.indexOf('+');
//         String left = formula.substring(1, plus);  // skip '='
//         String right = formula.substring(plus + 1);

//         List<Integer> list1 = decode(left);
//         List<Integer> list2 = decode(right);

//         // clo -> row
//         int num1 = sheet.get(list1.get(1)).get(list1.get(0));
//         int num2 = sheet.get(list2.get(1)).get(list2.get(0));

//         return num1+num2;
//     }

    public static void main(String[] args) {
        
    }
}
