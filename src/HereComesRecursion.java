public class HereComesRecursion {
    public static void recursionPractice(String message, int times){
        //base case to let method know when to stop
        if(times == 0 ){
            System.out.println("Done!");
        } else{
            System.out.println(message);

            //decrement
            times--;

            //call method within itself
            recursionPractice(message, times);
        }

    }
}
