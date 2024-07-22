class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    node1 = Node(200)
    node2 = Node(500)
    node1.next = node2
    
    print(node1.next.data)