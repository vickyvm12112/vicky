//Name: Vignesh.M
//Batch:2576
class Table
{ 
synchronized void printTable(int n) //synchronized method 
{
 for(int i=1; i<=5; i++)
{ 
 System.out.println(n*i); 
 try
{ 
 Thread.sleep(400); 
 }
catch(Exception e)
{
System.out.println(e);
} 
 } 
 }