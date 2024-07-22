from collections import deque
class Node:
    def __init__(self, data = 0):
        self.data = data
        self.left = None
        self.right = None

def LevelOrder(self, root):
    list_of_levels = []
    queue = deque()
    
    if not root:
        return []
    
    queue.append(root)

    while queue:
        sub_list = []
        size = len(queue)
        

        for _ in range(size):
            node = queue.popleft()

            if node.left:
                queue.append(node.left)
            
            if node.right:
                queue.append(node.right)

            sub_list.append(node)
        
        list_of_levels.append(sub_list)
    
    return list_of_levels

LevelOrder()