#include<stdio.h>
#include<stdlib.h>

struct Node
{
    struct Node* prev;
    int data;
    struct Node* next;
}*head,*last;
void createlist(int n){
    struct Node* newnode;
    int i,data;
    if(n>=1){
        head=(struct Node*)malloc(sizeof(struct Node));
        printf("enter the 1st data in list =");
        scanf("%d",&head->data);
        head->prev=NULL;
        last=head;
        for(i=2;i<=n;i++){
            newnode=(struct Node*)malloc(sizeof(struct Node));
            newnode->prev=last;
            newnode->next=NULL;
            printf("enter the %d data in list",i);
            scanf("%d",&newnode->data);
            last->next=newnode;
            last=newnode;
        }


    }
}
void displayformstart(){
    int n=1;
    struct Node* tem;
    if (head==NULL) printf("\nlist is empty");
    else{
        tem=head;
        printf("\ndata in linked list is ");
        do{
            printf("\n%d data %d",n,tem->data);
            n++;
            tem=tem->next;
        }
        while(tem!=NULL);
    }
}
void displayformlast(){
    int n=1;
    struct Node* tem;
    if (head==NULL) printf("\nlist is empty");
    else{
        tem=last;
        printf("\ndata in linked list from last is ");
        do{
            printf("\n%d data %d",n,tem->data);
            n++;
            tem=tem->prev;
        }
        while(tem!=NULL);
    }
}
void insertfromstart(){
    struct Node *newnode;
    if (head==NULL){
        printf("\nlist is empty");
    }
    else{
    newnode==(struct Node*)malloc(sizeof(struct Node));
    printf("\ndata you want to insert in start");
    scanf("%d",&newnode->data);
    newnode->next=head;
    newnode->prev=NULL;
    head->prev=newnode;
    head=newnode;
    printf("\nadded succesfully");
    }

}

void insertfromlast(){
    struct Node *newnode;
    if (head==NULL){
        printf("\nlist is empty");
    }
    else{
    newnode==(struct Node*)malloc(sizeof(struct Node));
    printf("\ndata you want to insert in start");
    scanf("%d",&newnode->data);
    newnode->next=NULL;
    newnode->prev=last;
    last->next=newnode;
    last=newnode;
    printf("\nadded succesfully");
    }
}
void insertatN(int n){
    struct Node *newnode;
    struct Node *tem;
    if (head==NULL) printf("\nlist is empty");
    else{
        tem=head;
        for(int i=1;i<n-1 && tem!=NULL;i++) tem=tem->next;
        if(tem==head) insertfromstart();
        else if(tem==last)insertfromlast();
        else if(tem!=NULL){
            newnode=(struct Node*)malloc(sizeof(struct Node));
            printf("\n\nEnter the data for %d postion = ",n);
            scanf("%d",&newnode->data);
            newnode->prev=tem;
            newnode->next=tem->next;
            tem->next->prev=newnode;
            tem->next=newnode;
            printf("\n succenfully added ");
        }

    }
}
void deletefromstart(){
    struct Node *todelete;
    if (head==NULL) printf("\nlist is empty");
    else{
        todelete=head;
        head=head->next;
        head->prev=NULL;
        free(todelete);
        printf("\nsuccesfully deleted");
    }
}
void deletefromend(){
    struct Node *todelete;
    if (head==NULL) printf("\nlist is empty");
    else{
        todelete=last;
        last=last->prev;
        last->next=NULL;
        free(todelete);
        printf("\nsuccesfully deleted");
    }
}
void deleteatN(int n){
    struct Node *tem;
    tem=head;
    for(int i=1;i<n-1 &&tem!=NULL;i++)tem=tem->next;
    if(tem==head) deletefromstart();
    else if(tem==last) displayformlast();
    else{
        tem->prev->next=tem->next;
        tem->next->prev=tem->prev;
        free(tem);
        printf("\nthe position %d is deleted",n);
    }
}
int main(){
    int n,choice,tem;
    printf("Enter the size of list you want to create =");
    scanf("%d",&n);
    createlist(n);
    while(head!=NULL){
        printf("\n\n\n\n\n\n\nenter the operation you want to perform\n");
        printf("1.to display list from start \n2.to display list from end\n3.to insert from the list\n4.to delete somthing\n5.Exit ");
        printf("\nEnter your choice=");
        scanf("%d",&choice);
        switch (choice)
        {
        case 1:
            displayformstart();
            break;
        case 2:
            displayformlast();
            break;
        case 3:
            printf("\n\nenter the postion you want to insert data=");
            scanf("%d",&tem);
            insertatN(tem);
            break;
        case 4:
            printf("\n\nenter the postion oyou want to delete=");
            scanf("%d",&tem);
            deleteatN(tem);
            break;
        case 5:
            return 1;
        default:
            printf("enter the valid input");
            break;
        }
    }
    return 0;
}
