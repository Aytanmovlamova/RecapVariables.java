package day22_tasks;

import java.util.Arrays;

public class AWSZones {
    //  Create a class called AWSZones in your Practice_Programming project and inside the day22_tasks package
    //
    //        Task:
    //            Given an app name and a String of zones in the following format
    //
    //			us-east-1,us-west-1,us-west-2,us-west-3
    //
    //			print the app deploying to each zone
    //
    //		Ex:
    //			app = etsy
    //    			zones = us-east-1,us-west-2,us-west-1
    //
    //
    //    			output:
    //				Deploying etsy to us-east-1...
    //				Deployment completed for us-east-1
    //
    //				Deploying etsy to us-west-1...
    //				Deployment completed for us-west-1
    //
    //				Deploying etsy to us-west-2...
    //				Deployment completed for us-west-2

    public static void main(String[] args) {
        String[] name = {"us-east-1","us-west-1","us-west-2","us-west-3"};
        String str = "etsy";
        for (String word:name) {
            System.out.println("Deploying "+ str+ " to "+ word);
            System.out.println("Deployment completed for  "+ str+ " to "+ word);

            System.out.println();


        }
    }
}
