package com.example.customer_mangement_system;

public class ArraycustomerList {
    private final int max_size=1000;
    private Customer[] customer_array;
    int num;

    public ArraycustomerList() {
        this.customer_array=new Customer[max_size];
        num=0;
    }
    public void insert(Customer customer){
        if(num==max_size){System.out.println("The array is full");}
        else{
            customer_array[num++]=customer;}
    }


    public int findcoustomerby_id(int id){
        for(int i=0;i<num;i++)
        {if(customer_array[i].getContract_ID()==id)
        {   System.out.println("Found");
            return i;

        }
        }
        System.out.println("nOT Found");
        return -1;
    }



    public void delete(int value){
        int a=findcoustomerby_id(value);
        if(value==-1)
        {System.out.println("The item not found");}
        else
        {
            for(int i=a+1;i<num;i++){
                customer_array[i-1]=customer_array[i];
            }
            num--;
        }
    }

    public String display(){
        String result="";
        for(int i=0;i<num;i++)
        {
           result+= "[ID = "+customer_array[i].getContract_ID() +"     ,      Name = "+customer_array[i].getName()+"     ,      Nationality = "+customer_array[i].getNationality()+"     ,      phone = "+customer_array[i].getPhone()+"     ,      Current ="+customer_array[i].getCurrent_Bill_Amount()+"     ,      Accumulated = "+customer_array[i].getAccumulated_Bill_Amount()+"]"+"\n";

        }

        return result;
    }

}
