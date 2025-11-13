public class Graphing{

public static int n = 0;
  public static void generalGraph(String[][] arr){
  //  String [][] arr = new String[10][10];
    int xcount = 0;
    int count = 10;
  
      for(int r = arr.length-1; r>0; r--){
    System.out.print(count);
    for(int c = 0; c<arr[r].length;c++){
      System.out.print(arr[r][c]);
      xcount++;
    }
    count--;
    System.out.println();
  }
      int xaxis = 0;
   // int [] xArr =  new int[arr.length+1];
  System.out.print(" ");
  System.out.print(" ");
    for(int n = 1;n<arr.length-1; n++){
      if(n == 0){
        System.out.print(" ");
      }else{
     System.out.print(n+" ");
      }
    }
}
    public static String[][] initialGraph(){
    int yMax = 2;
    int xMax = 1;
    String [][] arr = new String[yMax][xMax];
    int xcount = 0;
    int count = 9;
    for(int r = 0; r<arr.length; r++){
    for(int c = 0; c<arr[r].length;c++){
      arr[r][c] = ". ";
    }
  }
      for(int r = arr.length-1; r>0; r--){
  //  System.out.print(count);
    for(int c = 0; c<arr[r].length;c++){
    //  System.out.print(arr[r][c]);
      xcount++;
    }
    count--;
    //System.out.println();
   
  }
      
      int xaxis = 0;
   // int [] xArr =  new int[arr.length+1];
  System.out.print(" ");
  System.out.print(" ");
    for(int n = 1;n<arr.length-1; n++){
      if(n == 0){
        System.out.print(" ");
      }else{
     System.out.print(n+" ");
      }
    }
      return arr;
}
public static double findEquationSoln(double value, int a){
  double equation = a*value;

  return equation; 
}
  public static void graphVelocity(int a){
    int xMax = 10;
    int yMax = 10; 
    String [][] arr = new String[yMax][xMax];
    int xcount = 0;
    int count = 9;
    for(int r = 0; r<arr.length; r++){
    for(int c = 0; c<arr[r].length;c++){
      arr[r][c] = ". ";
    }
      
  }
  for(int y = 0; y<arr.length; y++){


  for(int x = 0; x<(arr[y].length/2); x++){
      arr[a*x][x] = "/ ";
      
  }
}
  for(int r = arr.length-1; r>0; r--){
    System.out.print(count);
    for(int c = 0; c<arr[r].length;c++){
      System.out.print(arr[r][c]);
      xcount++;
    }
    count--;
    System.out.println();
  }
      int xaxis = 0;
   // int [] xArr =  new int[arr.length+1];
  System.out.print(" ");
  System.out.print(" ");
    for(int n = 1;n<arr.length-1; n++){
      if(n == 0){
        System.out.print(" ");
      }else{
     System.out.print(n+" ");
      }
    }
    
}

  public static double findPosition(int a,int x, int xO){
    
    // int x = 0;
    double position = ((a)*(Math.pow(x,n+1))/(n+1)) +xO;
    n++;
    return position;
    
    
  }



  public static void graphDisplacement(int a, int xO){
    String arr[][] = initialGraph();
    for(int y = 0; y<arr.length; y++){
     for(int x = 0; x<arr[y].length;x++){
        arr[(int)findPosition(a,x,xO)][x] =  "* ";
        
     }
    generalGraph(arr);
      
    }
  }

  
  public void firstGraphVelocity(double a){
    String [][] arr = new String[10][10];
    int xcount = 0;
    int count = 9;
   //  int ro = 0;
    for(int ro = 0; ro<arr.length;ro++){
      arr[ro][0] = "|";
      
    }
    for(int r = 0; r<arr.length; r++){
    for(int c = 1; c<arr[r].length;c++){
      arr[r][c] = ". ";
    }
      
  }
  for(int y = 0; y<arr.length; y++){


  for(int x = 0; x<(arr[y].length/2); x++){
      arr[(int)a*x][x] = "* ";
      
  }
}
  for(int r = arr.length-1; r>0; r--){
    System.out.print(count);
    for(int c = 0; c<arr[r].length;c++){
      System.out.print(arr[r][c]);
      xcount++;
    }
    count--;
    System.out.println();
  }
      int xaxis = 0;
   // int [] xArr =  new int[arr.length+1];
  System.out.print(" ");
  System.out.print(" ");
    for(int n = 1;n<arr.length-1; n++){
      if(n == 0){
        System.out.print(" ");
      }else{
     System.out.print(n+" ");
      }
    }
    
}
}
