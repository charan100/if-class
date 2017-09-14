class GFG{
     
    /* function to check whether two strings are 
    anagram of each other */
    static boolean areAnagram(char[] str1, char[] str2)
    {
        // Get lenghts of both strings
        int n1 = str1.length;
        int n2 = str2.length;
  
        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;
  
        // Sort both strings
        quickSort(str1, 0, n1 - 1);
        quickSort(str2, 0, n2 - 1);
  
        // Compare sorted strings
        for (int i = 0; i < n1;  i++)
            if (str1[i] != str2[i])
                return false;
  
        return true;
    }