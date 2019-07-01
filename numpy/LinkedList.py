class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def prnt_data(self):
        n = self.head
        while(n):
            print(n.data)
            n = n.next


if __name__ == "__main__":
    lis  = LinkedList()
    lis.head = Node(1)
    n2  = Node(2)
    n3 = Node(3)
    n4 = Node(4)
    lis.head.next = n2
    n2.next = n3
    n3.next =n4
    n4.next =None
    lis.prnt_data()





