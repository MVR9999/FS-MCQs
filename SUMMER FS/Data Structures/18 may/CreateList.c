/*#include<stdio.h>
#include<string.h>
#include<stdlib.h>

#define MAX 3

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

void display()
{
  struct Node *t;
  for(t=hptr;t!=NULL;t=t->next)
    printf("%s\n",t->name);
}

void displayFromEnd(struct Node *ptr)
{
  struct Node *t;
  if(!ptr)
    return;
  displayFromEnd(ptr->next);
  printf("%s\n",ptr->name);
}

void main()
{
  int i;
  createList("ravi");
  createList("ajay");
  createList("subbu");
  createList("indira");
  display();
  printf("\n");
  displayFromEnd(hptr);
}*/



#include <stdio.h>
#include <stdlib.h>
 
struct node
{
    int num;
    struct node *next;
};
 
int create(struct node **);
int palin_check (struct node *, int);

 
int main()
{
    struct node *p = NULL;
    int result, count;
 

    count = create(&p);
    result = palin_check(p, count);
    if (result == 1)
    {
        printf("yes");
    }
    else
    {
        printf("no");
    }
    release (&p);
 
    return 0;
}
 
int palin_check (struct node *p, int count)
{
    int i = 0, j;
    struct node *front, *rear;
 
    while (i != count / 2)
    {
        front = rear = p;
        for (j = 0; j < i; j++)
        {
            front = front->next;
        }
        for (j = 0; j < count - (i + 1); j++)
        {
            rear = rear->next;
        }
        if (front->num != rear->num)
        {
            return 0;
        }
        else
        {
            i++;
        }
    }
 
    return 1;
}
 
int create (struct node **head)
{
    int c, ch, count = 0;
    struct node *temp;
    int n,i;
	scanf("%d",&n);
    for( i=0;i<n;i++)
    {
    
        scanf("%d", &c);
        count++;
        temp = (struct node *)malloc(sizeof(struct node));
        temp->num = c;
        temp->next = *head;
        *head = temp;
       
    }
    
 
    return count;
}
 


