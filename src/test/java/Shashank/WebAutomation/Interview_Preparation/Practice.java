package Shashank.WebAutomation.Interview_Preparation;



public class Practice {

  public static int getFactorial(int num){
      if(num == 0 || num == 1) return 1;
      if(num < 0) return -1;

      int result = 1;
//      for (int i = 1; i <= num; i++){
//          result *= i;
//      }
      int i = 2;
      while (i <= num){
          result *= i;
          i++;
      }

      return result;
  }

    public static void main(String[] args) {
        System.out.println(getFactorial(6));
    }




}
