/*C program to read and print employee's record using structure*/
 
#include <stdio.h>
 
/*structure declaration*/
struct employee{
    char    name[30],des[50];
    int     empId,age,salary;
};
 
int main()
{
    /*declare structure variable*/
    struct employee emp;
     
   
    printf("Enter name:\n");          
  scanf("%s",&emp.name);
    printf("Enter ID:\n");            
  scanf("%d",&emp.empId);
  printf("Enter age:\n");
  scanf("%d",&emp.age);
  printf("Enter designation:\n");
  scanf("%s",&emp.des);
    printf("Enter Salary:");        
  scanf("%d",&emp.salary);

     
    /*print employee details*/
    printf("\nEmployee Details\n");
    printf("Name of the Employee : %s",emp.name);
    printf("\nID of the Employee : %d",emp.empId);
    printf("\nAge of the Employee : %d",emp.age);
    printf("\nDesignation of the Employee : %s",emp.des);
    printf("\nSalary of the Employee : %d\n",emp.salary);
    return 0;
}