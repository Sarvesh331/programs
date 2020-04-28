
class RunTimeError(Exception):
    pass
class Stack():
    def __init__(self):
        self.ls=[]

    def push(self,nm):
        self.ls.append(nm)

    def pop(self):
       try:
        if(len(self.ls)==0):
            raise RunTimeError("stack empty")
       except RunTimeError as err:
           print("error")
       else:    
        return self.ls.pop()
    def __str__(self):
        return (f"{tuple(self.ls)}")



def test_stack():
    s=Stack()
    s.push(10)
    s.push(20)
    s.push(30)
    s.push(40)
    s.push(50)
    print(s)
    print(s.pop())
    print(s.pop())
    print(s.pop())
    print(s.pop())
    print(s.pop())
    print(s.pop())
    print(s.pop())

test_stack()    
