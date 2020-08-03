#include <stdio.h>

struct node 
{
int data;
struct node *next;
};
struct node *head=NULL,*tptr;

void create(int ele)
{
struct node *nptr;
nptr=(struct node *)malloc(sizeof(struct node *));
nptr->data = ele;
if(head==NULL)
	head=tptr=nptr;
else
	{
		tptr->next = nptr;
		tptr=nptr;
	}
	nptr->next = NULL;
}

void display()
{
	struct node *nptr;
for(nptr=head;nptr;nptr=nptr->next)
	printf("%d ", nptr->data);
}

struct node * createStack(struct node *t)
{
struct node *nptr,*tptr=NULL;
while(t!=NULL)
	{
	nptr=(struct node *)malloc(sizeof(struct node *));
	nptr->data = t->data;
    if(tptr==NULL)
		{
		nptr->next=tptr;
	    tptr = nptr;
		}
		else
		{
		  nptr->next = tptr;
		  tptr= nptr;
		}
	t=t->next;
	}
return nptr;
}


void  checkPalindorme(struct node *head,struct node *stack)
{
   struct node *t1=head,*t2=stack;
    for(t1=head,t2=stack; t1!=NULL || t2!=NULL ; t1=t1->next,t2=t2->next)
	{
	   if(t1->data!=t2->data)
		{
		   printf("no");
	       return;
	   }
	}
	printf("yes");
}




int main(int argc, char *argv[])
{
	int i,n,ele;
	struct node *stack;
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		scanf("%d",&ele);
	    create(ele);
	}

   stack = createStack(head);
    checkPalindorme(head,stack);
	return 0;
}
