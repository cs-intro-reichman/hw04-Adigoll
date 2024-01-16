public class ArrayOps 
{
    public static void main(String[] args) 
    {
        //int[] array = {9,8,7,7,1};
        //int[] array1 = {4,3,2,1,5};
        //secondMaxValue(array);
        //containsTheSameElements(array, array1);
        //isSorted(array);
    }
    
    public static int findMissingInt (int [] array) 
    {
        boolean isNum = false;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                if (array[j] == i)
                {
                    isNum = true;
                }
            }
            if (!isNum)
            {
                return i;
            }
            isNum = false;
        }
        return 1;
    }

    public static int secondMaxValue(int [] array) 
    {
        int max = 0;
        int secMax = 0;
         for (int i = 0; i < array.length; i++)
        {
            if (array[i] >= max)
            {
                secMax = max;
                max = array[i];
            }
            else
            {
                if (array[i] >= secMax)
                {
                    secMax = array[i];
                }
            }
        }
        return secMax;
        
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) 
    {
        boolean isEqual = false;
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if (array1[i] == array2[j])
                {
                    isEqual = true; 
                    j = array2.length - 1;
                }
            }
            if (!isEqual)
            {
                return false;
            }
            isEqual = false;
        }
        for (int i = 0; i < array2.length; i++)
        {
            for (int j = 0; j < array1.length; j++)
            {
                if (array2[i] == array1[j])
                {
                    isEqual = true; 
                    j = array1.length - 1;
                }
            }
            if (!isEqual)
            {
                return false;
            }
            isEqual = false;
        }
        return true;
    }

    public static boolean isSorted(int [] array) 
    {
        boolean isInc = false;
        boolean isDec = false;
        for (int i = 0; i < (array.length - 1); i++)
        {
            if ((array[i+1] >= array[i]) && !isDec)
            {
                isInc = true;
            }
            else
            {
                if ((array[i+1] <= array[i]) && !isInc)
                {
                    isDec = true;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }

}
