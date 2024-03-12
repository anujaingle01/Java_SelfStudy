package com.example.Recursion_3;
public class TilesRecursion {                                    // Need Practice for Loop Flow

    public static  int tiles(int n,int m){
        if(n==m){
            return 2;                                             // 2 Ways to Place a Tile
        }
        if(n<m){
            return 1;                                             // 1 Ways to Place a Tile
        }

         int verticalplaced = tiles( n-m, m);                 // Tile placed Vertically
         int horizontalplaced = tiles( n-1, m);               // Tile placed Horizontally
         return verticalplaced + horizontalplaced;
    }

    public static void main(String[] args) {
      int n=4,m=2;
      System.out.println("Rows : "+n);
      System.out.println("Columns : "+m);
      System.out.println(tiles(n,m)+" = Possibilities to Place a Tiles");
    }
}
