public class StringOps 
{
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) 
    {
        //capVowelsLowRest("ALL YOU NEED IS LOVE");
        //camelCase(" tWo  wordS ");
        allIndexOf("MMM", 'M');
    }

    public static String capVowelsLowRest (String string) 
    {
        
        String newStr = "";
		char ch = string.charAt(0);
		int charAsc;
		for (int i = 0; i < string.length(); i++)
		{
			// Bad indentation 
			charAsc = string.charAt(i);
            ch = string.charAt(i);
			if (charAsc >= 65 && charAsc <= 90)

		/* 
  		why didn't you create a helper isVowel()?
		could be a lot cleaner
  		*/
			{
                if (!(string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U'))
                {
				    charAsc = charAsc + 32;
				    ch = (char)(charAsc);
                }
			}
			else
			{

                if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u')
                {
                    charAsc = charAsc - 32;
				    ch = (char)(charAsc);
                }
                else
                {
				    ch = (char)(string.charAt(i));
                }
			}
            newStr = newStr + ch;
		}
		return newStr;
    }

    public static String camelCase (String string) 
    {
        int wordLength = 0;
        int begWord = 0;
        int begCharAsc;
        String word = "";
        String newWord = "";
        String newString = "";
        for (int i = 0; i <= string.length(); i++)
        {
            if (i == string.length() || (string.charAt(i) == ' '))
            {
                begWord = i - wordLength;
                word = string.substring(begWord, i);
                word = lowerCase(word);
                if ((newString.length() > 0) && !(begWord == 0) && !(string.charAt(i-1) == ' ')) //if it's not the first word
                {
                    begCharAsc = word.charAt(0);
                    newWord += (char)(begCharAsc - 32);
                    for (int t = 1; t < wordLength; t++)
                    {
                        newWord += word.charAt(t);
                    }
		/*
  		for inside an if inside an if-else inside a for, to complex.
   		 */
                }
                else
                {
                    newString += word;
                }
                newString += newWord;
                wordLength = 0;
                newWord = "";
            }
            else
            {
                wordLength++;
            }
        }
        return newString;
    }

    public static int[] allIndexOf (String string, char chr) 
    {
        int arrLength = 0;
        int[] tempArr = new int[string.length()];
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == chr)
            {
                tempArr[arrLength] = i;
                arrLength++;
            }
        }
        int[] arr = new int[arrLength];
        arr[0] = tempArr[0];
        for (int j = 1; (j < tempArr.length) && (tempArr[j] != 0); j++)
        {
            arr[j] = tempArr[j];
        }
        return arr;
    }

       /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) 
	{
		String newStr = "";
		char ch;
		int charAsc;
		int i;
		for (i = 0; i < s.length(); i++)
		{
			charAsc = s.charAt(i);
			/* 
	  		why didn't you create a helper isLetter()?
			could be a lot more readable.
	  		*/
			if (charAsc >= 65 && charAsc <= 90)
			{
				charAsc = charAsc + 32;
				ch = (char)(charAsc);
				newStr = newStr + ch;
			}
			else
			{
				ch = (char)(s.charAt(i));
				newStr = newStr + ch;
			}
		}
		return newStr;
    }
}
