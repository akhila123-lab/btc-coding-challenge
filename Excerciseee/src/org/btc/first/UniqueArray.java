package org.btc.first;

import java.util.Scanner;

public class UniqueArray {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements");
        int[] salesDepartmentEmpIds = new int[5];
        for (int i=0;i<salesDepartmentEmpIds.length;i++)
        {
            salesDepartmentEmpIds[i]= sc.nextInt();
        }
        boolean b=uniquArray(salesDepartmentEmpIds);
        System.out.print(b);
    }

    private static boolean uniquArray(int[] salesDepartmentEmpIds) {
        //boolean b[]=new boolean[salesDepartmentEmpIds.length];
        for (int i=0;i<salesDepartmentEmpIds.length;i++)
        {int count =0;
            for(int j=i+1;j<salesDepartmentEmpIds.length;j++)
            {
                if(salesDepartmentEmpIds[i]==salesDepartmentEmpIds[j])
                    count++;
                break;
            }
            if(count==1)
            {
                return false;
            }
        }
        return true;

    }
}
