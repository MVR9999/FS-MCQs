/*Given a Linked List which contains names write a function to 
print last n elements 
*/

#include<stdio.h>
#include<string.h>

struct Node
{
  char name[20];
  struct Node *next;
};

struct Node *hptr=NULL,*tptr;

void createList(char *s)
{
    struct Node *nptr;    
    nptr=(struct Node *)malloc(sizeof(struct Node));    
    strcpy(nptr->name,s);
    
    if(hptr==NULL)
       hptr=nptr;
    else
       tptr->next=nptr;
    tptr=nptr;
    nptr->next=NULL;
}

// Print last N elements
void printLastNElements(int num)
{
  struct Node *t1;
  struct Node *t2;
  
  int count = 1;
  t2 = hptr;  
  for(t1 = hptr; t1 != NULL; t1 = t1->next)
  {
    if(count > num)
      t2 = t2->next;
    count++;
  }
  for(;t2 != NULL; t2 = t2->next)
    printf("%s\n",t2->name);
}

// Print all the elements from the number specified (N)
void printFromNElements(int num)
{
  struct Node *t;
  int count = 1;
  for(t = hptr; t != NULL; t = t->next)
  {
    if(count >= num)
      printf("%s\n",t->name);
    count++;
  }
}

void main(int argc, char * argv[])
{
  int num;
  int i = 1;
  for(; i < argc; i++)
    createList(argv[i]);

  printf("Enter number to print last n elements\n");
  scanf("%d", &num);
  printf("\n");
  if(num > 0)
  {
    printLastNElements(num);
    printf("\n");
    printFromNElements(num);
  }
}