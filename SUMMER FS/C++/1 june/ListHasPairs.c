#include<stdio.h>
#include<stdlib.h>

#define bool int

struct Node
{
  int value;
  struct Node *next;
};

struct Node *hptr=NULL,*tptr;

void createList(int data)
{
    struct Node *nptr;    
    nptr=(struct Node *)malloc(sizeof(struct Node));    
    nptr->value = data;
    
    if(hptr==NULL)
       hptr=nptr;
    else
       tptr->next=nptr;
    tptr=nptr;
    nptr->next=NULL;
}

/*
Function to check if elements of linked list are present in pair 

Initialise a temp node pointing to head.
Take a variable to calculate XOR of all elements.
Start traversing linked list and keep calculating the XOR with node->data.
Return true if XOR is 0, else return false.
*/
bool isPair() 
{   
  int xxor = 0;   
  struct Node* temp = hptr; 

  while (temp != NULL) { 
    xxor ^= temp->value; 
    temp = temp->next; 
    printf("%d  ", xxor);
  } 
  // If it has pairs we return 1, else 0
  return !xxor; 
} 

void main()
{
  int result;
  createList(1);
  createList(2);
  createList(3);
  createList(3);
  createList(1);
  createList(2);

  result = isPair();
  printf("\nis pair %s", result == 0 ? "false" : "true");
}