import java.util.*;

class TestMix {
  public static void main(String[] args) {
    List<Integer> lst = new ArrayList<Integer>();
    lst.add(4);
    lst.add(new Integer(8));
    nonGeneric ng = new nonGeneric();
    int total = ng.addAll(lst);
    System.out.println(total);
    ng.insert(lst);
    System.out.println(lst);
    total = ng.addAll(lst);
    System.out.println(total);
  }
}

class nonGeneric {
  int addAll(List list) {
    Iterator it = list.iterator();
    int total = 0;
    while (it.hasNext()) {
      int i = ((Integer)it.next()).intValue();
      total += i;
    }
    return total;
  }

  void insert(List list) {
    list.add(22); 
    list.add(new Integer(32)); 
  }
}