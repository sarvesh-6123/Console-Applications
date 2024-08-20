class ListNode:
    def __init__(self,data = 0,next = None):
        self.data = data
        self.next = next
class CircularQueue:
    def __init__(self):
        self.head = None
    def enqueue(data):
        Node = ListNode(data)
        if self.head == None:
            self.head = Node
            self.head.next = head
        elif self.head.next == self.head:
            self.head.next = Node
            Node.next = self.head
        else:
            temp = self.head
            while temp.next != head:
                temp = temp.next
            temp.next = Node
            Node.next = self.head
            
    def dequeue():
        if self.head == None:
            return -1
        
