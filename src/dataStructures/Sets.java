package dataStructures;
public class Sets {
    private final ArrayList arrayList = new ArrayList();
    public void add( int index, int element) {
        if(existIn(element))
            arrayList.add(index,element);
    }

    public void add(int element){
        if(existIn(element))
            arrayList.add(element);
    }

    public int size() {
        return arrayList.size();
    }

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

   private boolean existIn(int element){
       for (int i = 0; i < arrayList.size(); i++) {
           if(element == arrayList.get(i)){
               return false;
           }
       }

       return true;
   }


}

