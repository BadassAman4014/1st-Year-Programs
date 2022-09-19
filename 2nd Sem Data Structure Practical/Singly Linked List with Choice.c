#include <stdio.h>
#include <stdlib.h>
struct Node
{
    int data;
    struct Node *next;
} * head, *last;
void printList(struct Node *head)//printing
{
    struct Node *temp;
    if (head == NULL)
        printf("empty");
    else
    {
        temp = head;
        while (temp != NULL)
        {
            printf(" %d ", temp->data);
            temp = temp->next; // traverse forward
        }
    }
}
void create(int n)//creation
{
    int i = 1, data;
    struct Node *newnode;
    struct Node *temp;
    temp = (struct Node *)malloc(sizeof(struct Node));
    if (n >= 1)
    {
        head = (struct Node *)malloc(sizeof(struct Node));
        if (head != NULL)
        {
            printf("Enter Data of position 1=");
            scanf("%d", &data);
            head->data = data;
            head->next = NULL;
            temp = head;
            for (i = 2; i <= n; i++)
            {
                newnode = (struct Node *)malloc(sizeof(struct Node));
                if (newnode != NULL)
                {
                    printf("Enter Data of position %d=", i);
                    scanf("%d", &data);
                    newnode->data = data;
                    newnode->next = NULL;
                    temp->next = newnode;
                    temp = newnode;
                    last = temp;
                }
                else
                {
                    printf("Unable to allocate memory");
                    break;
                }
            }
            printf("Singly Linked list successfully created:\n");
        }
        else
            printf("Unable to allocate memory ");
    }
}
void check(int a, struct Node *n)
{
    int flag, index = 0;
    while (n != NULL)
    {
        if (a == n->data)
        {
            flag = 1;
            break;
        }
        index++;
        n = n->next;
    }
    if (flag == 1)
        printf("%d found at position %d", a, index + 1);
    else
        printf("not found");
}
void insertstart(struct Node *head, int data)//beg
{
    struct Node *newnode;
    if (head == NULL)
    {
        printf("List is empty");
    }
    else
    {
        newnode = (struct Node *)malloc(sizeof(struct Node));
        newnode->data = data;
        newnode->next = head;
        head = newnode;
        printf("Node is successfully added at Beginging");
        printList(head);
    }
}
void insertend(struct Node *head, int data)//end
{
    struct Node *newnode;
    if (last == NULL)
    {
        printf("empty");
    }
    else
    {
        newnode = (struct Node *)malloc(sizeof(struct Node));
        newnode->data = data;
        newnode->next = NULL;
        last->next = newnode;
        last = newnode;
        printf("Node is successfully added at Ending");
        printList(head);
    }
}
void insertion(int n)//at N
{
    int a, data, position, c;
    int i = 1;
    struct Node *temp;
    temp = (struct Node *)malloc(sizeof(struct Node));
    struct Node *newnode;
    printf("\nEnter data to insert:");
    scanf("%d", &data);
    printf("press 1 to insert at start\npress 2 to insert at end\npress 3 to insert at a position N\n");
    scanf("%d", &c);
    if (head == NULL)
        printf("List is empty");
    else
    {
        switch (c)
        {
        case 1:
        {
            insertstart(head, data);
            break;
        }
        case 2:
        {
            insertend(head, data);
            break;
        }
        case 3:
        {
            printf("Enter position to insert Node:\n");
            scanf("%d", &position);
            if(position==1)
            {
                insertstart(head, data);
            break;
            }
            else if(position==n+1)
            {
                insertend(head, data);
            break;
            }
            else
            {
            temp = head;
            newnode = (struct Node *)malloc(sizeof(struct Node));
            while (i < position - 1 && temp != NULL)
            {
                temp = temp->next;
                i++;
            }
            if (temp != NULL)
            {
                struct Node *newnode;
                newnode = (struct Node *)malloc(sizeof(struct Node));
                newnode->data = data;
                newnode->next = temp->next;
                if (temp->next != NULL)
                {
                    temp->next = newnode;
                    printf("Node succesfully inserted\n");
                }
            }
            }
            printList(head);
            break;
        }
        default:
        {
            printf("Invalid choice");
        }
        break;
        }
    }
}
void deletion(struct Node *head, int n)//deletion
{
    struct Node *temp;
    struct Node *x;
    temp = (struct Node *)malloc(sizeof(struct Node));
    int c, posi;
    printf("press 1 to delete from start\npress 2 to delte from end\npress 3 to delete at n position\n");
    scanf("%d", &c);
    switch (c)
    {
    case 1://beg
    {
        head = head->next;
        printf("List after deletion :\n");
        printList(head);
        break;
    }
    case 2://end
    {
        temp = head;
        for (int i = 1; i < n - 1; i++)
        {
            temp = temp->next;
        }
        temp->next = NULL;
        printf("List after deletion :\n");
        printList(head);
        break;
    }
    case 3://end
    {
        printf("Position of Node you want delete :");
        scanf("%d", &posi);
        temp = head;
        for (int i = 1; i < posi; i++)
        {
            temp = temp->next;
        }
        x = temp->next;
        temp = head;
        for (int i = 1; i < posi - 1; i++)
        {
            temp = temp->next;
        }
        temp->next = x;
        printf("List after deletion :\n");
        printList(head);
    }
    default:
        break;
    }
}
int main()
{
    int a, data, position, n, o, e;
        printf("Enter number of nodes :");
        scanf("%d", &n);
        create(n);
        printList(head);
        while (1)
    {
        printf("\nEnter Your choice :\n1)Searching\n2)Insertion \n3)Deletion\nChoice = ");
        scanf("%d", &o);
        switch (o)
        {
        case 1:
        {
            printf("\nEnter number to search :");
            scanf("%d", &a);
            check(a, head);
            break;
        }
        case 2:
        {
            insertion(n);
            break;
        }
        case 3:
        {
            deletion(head, n);
            break;
        }
        default:
        {
            printf("Enter correct choice");
            break;
        }
        }
        printf("\nEnter any number to continue or 0 to exit : ");
        scanf("%d", &e);
        if (e == 0)
            exit(0);
    }
    return 0;
}
