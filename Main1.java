//package com.aniket;

public class Main1
{
    public static void main(String[] args) 
    {   int index;
        int[] nums={23,45,1,2,8,19,-3,16,-11,28};
        int target=19;
        int ans=linearsearch(nums,target);
        System.out.println(ans);
    }

static int linearsearch(int[]arr , int target)
{

    if(arr.length==0)
    {
    return -1;

    }
for(int index=0;index<arr.length;index++)
{
    int element=arr[index];
    if(element==target)
    {
        return index;
    }
}
    return -1;
}
}

