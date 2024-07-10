class StackNode:
    def __init__(self,val):
        self.val = val
        self.next = None
class Stack:
    def __init__(self):
        self.head = None
    def push(self,val):
        newNode = StackNode(val)
        if self.head != None:
            newNode.next = self.head
            self.head = newNode
        else:
            self.head = newNode
    def pop(self):
        if self.head != None:
            popVal = self.head.val
            delNode = self.head
            self.head = self.head.next
            del delNode
            return popVal
        else:
            return -1
    def isEmpty(self):
        return not bool(self.head)
    
    def diplay(self):
        root = self.head
        while root!=None:
            k="| "+str(root.val)+" |"
            print(k)
            print("-"*len(k))
            root = root.next

if __name__ == '__main__':

    Stk = Stack()
    while True:
        print("Welcome to Stack Console ...!")
        print("-----------------------------")
        print("1.Push to the Stack ")
        print("2.Pop in The Stack ")
        print("3.Check if Stack is Empty")
        print("4.Display Values of Stack ")
        print("5.Exit")
        print("-----------------------------")
        print()

        userChoice = int(input("Enter your Choice : "))
        if userChoice == 1:
            val = int(input("Enter a Value : "))
            Stk.push(val)
            print("Value has Been Pushed into the Stack")
        elif userChoice == 2:
            popval = Stk.pop()
            if popval == -1:
                print("No Value inside Stack ..!")
            else:
                print(f'The Value {popval} has been Poped out of The Stack ..!')
        elif userChoice == 3:
            if Stk.isEmpty():
                print("The Stack is Empty ..!")
            else:
                print("The Stack is Not Empty ..!")
        elif userChoice == 4:
            print("The Stack is : ")
            print()
            Stk.diplay()
        elif userChoice == 5:
            break
        else:
            print("Please Provide a Valid Choice ")
        
