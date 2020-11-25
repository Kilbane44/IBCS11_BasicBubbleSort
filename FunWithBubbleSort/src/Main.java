public class Main {
    public static void main(String[] args)
    {

        int[] Numbers = {12,55,34,90,32,91,65,4,18};


        //Loop the Arrays length # of times
        for (int i = 0; i < Numbers.length; i++)
        {
            //For each one of those loops we loop again, through the array
            //to "bubble" the largest value to the end of the array
            //We loop till < length -1 because our algorithm checks index and index +1
            for (int j = 0; j < Numbers.length - 1; j++)
            {
                //If the current index (j) is larger than the one to the right (j+1)
                if(Numbers[j] > Numbers[j+1])
                {
                    //SWAP
                    int temp = Numbers[j];
                    Numbers[j] = Numbers[j+1];
                    Numbers[j+1] = temp;
                }

            }

        }



    }
}
