import threading ,queue

class Account:
  def __init__(self,number,bal):
    self.number = number
    self.balance = bal

  def __lt__(self,other):
    if self.balance < other.balance:
      return True
    return False
 
  def __str__(self):
    return ("number: "+str(self.number)+", "+"Balance: "+str(self.balance))

def run(oQ,*acc):
  for i in acc:
    oQ.put(i)

outQueue = queue.PriorityQueue()
acc1=Account('1',100)
acc2=Account('2',20)
acc3=Account('3',250)
acc4=Account('4',1000)
acc5=Account('5',10)

t1=threading.Thread(target=run,name="t1",args=(outQueue,acc1,acc2,acc3,acc4,acc5))
t1.start()
t1.join()

for i in range(outQueue.qsize()):
  print(outQueue.get())