import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Q1:
        //1.Write a Java program to test
        // if the first and the last element of an array of integers are same.
        // The length of the array must be greater than or equal to 2
        int[] nums = {50, -20, 0, 30, 40, 60, 10};
        System.out.println (nums.length >= 2 && nums[0] ==  nums[nums.length-1]);

        //Q2:
        //2.Write a Java program to find the largest elements in a given array.
        // Elements in the array can be in any order.

        int[] largestnum ={1, 4, 17, 7, 25, 3, 100};

        int max = largestnum[0];
        //Loop through the array
        for (int i = 0; i < largestnum.length; i++) {
            //Compare elements of array with max
            if(largestnum[i] > max)
                max = largestnum[i];
        }
        System.out.println("Q2: Largest element present in given array: " + max);

        //Q3:
        //3.Write a Java program to find the numbers greater than the average of the numbers of a given array.

        int[] avgnum ={1, 4, 17, 7, 25, 3, 100};
        int len=avgnum.length;
        int sum=0;
        for (int z=0; z< avgnum.length; z++)
        {
            sum+= avgnum[z];
        }
        int avg= sum/len;
        System.out.print(" Q3: Average is: "+avg+" ");

        int maximum= avg;
        //Loop through the array
        for (int i = 0; i < avgnum.length; i++) {
            //Compare elements of array with maximum
            if(avgnum[i] > maximum)
                maximum = avgnum[i];
        }
        System.out.println(" Largest num is: "+maximum);


        //-----------
        //4.Write a Java program to get the larger value between first and last element of an array of integers.

        int[] LargeBetween = {20, 30, 40};
        int max_val = LargeBetween[0];
        for (int i = 0; i < LargeBetween.length; i++) {
            //Compare elements of array with max
            if(LargeBetween[i] > max_val)
                max_val = LargeBetween[i];

        }
        System.out.println("Q4: Larger value between first and last element: "+max_val);

        //------------
        //5.Write a Java program to swap the first and last elements of an array and create a new array.
        int[] Swap = {20, 30, 40};
        System.out.println("Q5: Original Array: "+Arrays.toString(Swap));
        int sv = Swap[0];
        Swap[0] = Swap[Swap.length-1];
        Swap[Swap.length-1] = sv;
        System.out.println("After Swapping: "+Arrays.toString(Swap));

        //----------
        //Q6:6.Write a Java program to find all of the longest word in a given dictionary

        String[] words = { "cat", "dog", "red", "is", "am"};
        System.out.println(" Q6: Original Array: "+Arrays.toString(words));
        int w = 0;
        for (w = 0; w <= words.length; w++) {
            if (words[w].length() > words[w + 1].length()) {
                System.out.println("Longest word is: "+(words[w]));
            }}


        //----------
            //8. Write a program thats displays the number of occurrences of an element in the array.

        int [] occarr = new int [] {1,1,1,3,3,5};

        int [] fr = new int [occarr.length];
        int visited = -1;
        for(int f = 0; f < occarr.length; f++){
            int countt = 1;
            for(int h = f+1; h < occarr.length; h++){
                if(occarr[f] == occarr[h]){
                    countt++;
                    fr[h] = visited;
                }
            }
            if(fr[f] != visited)
                fr[f] = countt;
        }

        System.out.println("--------------Q8-----------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int f = 0; f < fr.length; f++){
            if(fr[f] != visited)
                System.out.println("    " + occarr[f] + "    |    " + fr[f]);
        }
        System.out.println("----------------------------------------");


        //----------
        //9. Write a program that places the odd elements of an array before the even elements.

        int[] eveodd = {3,40,1,5,9,4,10,7};

        int i = 0;
        System.out.println("Original Array: "+Arrays.toString(eveodd));
        while(i < eveodd.length && eveodd[i] % 2 == 0)
            i++;

        for(int j = i + 1; j < eveodd.length; j++) {
            if(eveodd[j] % 2 != 0) {
                int temp = eveodd[i];
                eveodd[i] = eveodd[j];
                eveodd[j] = temp;
                i++;
            }
        }

        System.out.println("New Array: "+Arrays.toString(eveodd));

        //10. Write a program that test the equality of two arrays.

        int [] FirstArray = new int [] {2,3,6,6,4};
        int [] SecArray = new int [] {2,3,6,6,4};
        System.out.println(Arrays.equals(FirstArray, SecArray));

        //---------
        //7.Write a menu driven Java program with following option:
        //Accept elements of an array
        //
        //Display elements of an array
        //
        //Search the element within array
        //
        //Sort the array
        //
        //To Stop
        //
        //the size of the array should be entered by the user.
        int thearr_size = 0;

        int[] thearray = new int[thearr_size];

        Scanner scanner=new Scanner(System.in);
        System.out.println("(1): Accept elements of an array");
        System.out.println("(2): Display elements of an array");
        System.out.println("(3): Search the element within array");
        System.out.println("(4): Sort the array");
        System.out.println("(5): Exit");
        System.out.println("Choose your Service From The List: ");

        int choice= scanner.nextInt();

        if(choice==1)
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of the array: ");
            if (sc.hasNextInt()) {
                thearr_size = sc.nextInt();
            }

            // Initialize the array's
            // size using user input

            // Take user elements for the array
            System.out.println(
                    "Enter the elements of the array: ");
            for (int y = 0; y < thearr_size; y++) {
                if (sc.hasNextInt()) {
                    thearray[y] = sc.nextInt();
                }
            }


        }

        else if (choice ==2)
        {
            System.out.println(
                    "The elements of the array are: ");
            for (int y = 0; y < thearr_size; y++) {
                // prints the elements of an array
                System.out.print(thearray[y] + " ");
            }

        }

        else if (choice ==3)
        {

        }

        else if (choice ==4)
        {
            System.out.println("Elements of array sorted in ascending order: "+Arrays.sort(thearray);

        }

        else
        {
            System.out.println(" u chose to exit");
        }

    }
}













