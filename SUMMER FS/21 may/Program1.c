//program1

#include <stdio.h>

struct node 
{
int data;
struct node *next;
};
struct node *head=NULL,*tptr,*first=NULL,*second=NULL;

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

void firstList()
{
	struct node *nptr=first;
for(nptr=first;nptr!=NULL;nptr=nptr->next)
	printf("%d ", nptr->data);
}

void secondList()
{
	struct node *nptr=second;
for(nptr=second;nptr!=NULL;nptr=nptr->next)
	printf("%d ", nptr->data);
}
void breakList()
{
     struct node *ft=NULL,*st=NULL,*t=head,*spt,*fpt;
     
	 while(t!=NULL)
	{
	        if(t->data > 0)
		    {
			if(first ==NULL) 
				first = ft= t;
			else 
				{
				      ft->next=t;
					  ft = t;
				}
		    }
		  else
		   {
			  if(second == NULL)
				  second = st=t;
			  else
			   {
			         st->next = t;
					 st = t;
			   }
		   }

       t=t->next;
	}
  if(ft!=NULL)
	ft->next=NULL;
  if(st!=NULL)
	st->next=NULL;
	


	}




int main(int argc, char *argv[])
{
	int i,n,ele;
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		scanf("%d",&ele);
	    create(ele);
	}

	breakList();
	firstList();
	secondList();

	return 0;
}
