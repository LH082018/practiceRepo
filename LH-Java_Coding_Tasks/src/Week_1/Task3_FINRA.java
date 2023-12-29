package Week_1;

public class Task3_FINRA {

    public static void finRa(){

        for (int i = 3; i <=30 ; i+=1) {

            // if i is divisible by 3 or 5 and returns 0
            if(i%3==0 && i%5==0){
                System.out.println("FinRa");
            }
            //if the value is a multiple of 3
            else if (i % 3==0){
                System.out.println("Fin");
                //if the value is a multiple of 5
            }else if(i%5==0){
                System.out.println("Ra");
            }else{
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
    finRa();

    }
}

/* TASK
Write a method that prints out the numbers 1 to 30
BUT for numbers that are a multiple of 3 print "FIN"
For numbers that are multiples of 5 print "RA"
For numbers that are multiples of 3 and 5 print "FINRA"
 */
