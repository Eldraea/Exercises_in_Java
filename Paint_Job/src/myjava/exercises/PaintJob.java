/*
PaintJob.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: Bob is a painter and he needs your help. You have to write a program that helps Bob calculate how many
           buckets of paint he needs to buy before going to work. Bob might also have some extra buckets at home. He
           also knows the area he can cover with one bucket of paint.
           1. Write a method named getBucketCount with 4 parameters.
                - The first parameter represents the width of the wall
                - The second parameter should be named height of type double. This parameter represents the height of
                  the wall
                - The third parameter should be named areaPerBucket. This parameter represents the area that can be
                  covered with one bucket of paint.
                - The fourth parameter should be named extraBuckets. This parameter represents the bucket count that Bob
                  has at home.
               The method needs to return a value of type int that represents the number of bucket that Bob needs to buy
               before going to work. To calculate the bucket count, refer to the notes below.
               If one of the parameters width, height or areaPerBucket is less or equal to 0 or if extraBuckets is less
               than 0, the methods needs to return -1 to indicate an invalid value.
               If all parameters are valid, the method needs to calculate the number of buckets and return it.
            2. Bob does not like to enter 0 for the extraBuckets parameter so he needs another method.
               Write another overloaded method named getBucketCount with 3 parameters namely width, height, and
               areaBucket (all of type double).
               This method needs to return a value of type int that represents the number of buckets that Bob needs to
               buy before going to work. To calculate the bucket count, refer to the notes below.
               If one of the parameter width, height, or areaPerBucket is less or equal to 0, the method needs to return
               -1. to indicate an invalid value.
               If all parameters are valid, the methods needs to calculate the number of buckets and return it.
            3. In some cases, Bob does not know the width and height of the wall but he knows the area of a wall. He
               needs to write another method.
               Write another overloaded method named getBucketCount with 2 parameters namely, area and areaPerBucket
               (both of type double).
               The methods needs to return a value of type int that represents the number of buckets that Bob needs to
               buy before going to work. To calculate the bucket count, refer to the notes below.
               If one of the parameters area or areaPerBucket is less or equal to 0, the method needs to return -1 to
               indicate an invalid value.
               If all parameters are valid, the method needs to calculate the number of buckets and return it.
               Do your best to help Bob.
------------------------------------------------------------------------------------------------------------------------
Created on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 25/05/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket)
    {
        if(width <=0 || height <=0 || areaPerBucket<=0 || extraBucket<0)
            return -1;
        else
            return (int)Math.ceil(((height*width) - (extraBucket*areaPerBucket))/areaPerBucket);


    }
    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if(width <=0 || height <=0 || areaPerBucket<=0)
            return -1;
        else
            return (int)Math.ceil((height*width) /areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket)
    {
        if(area <=0 || areaPerBucket<=0)
            return -1;
        else
        {
            return (int)Math.ceil(area /areaPerBucket);
        }

    }
}
