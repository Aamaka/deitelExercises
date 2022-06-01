package personalFun;

public class HashTable {
    private  Employee[] hashTable;

    public  HashTable(){
        hashTable = new Employee[10];
    }


    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        if(hashTable[hashedKey] != null){

        }
    }

    private int hashKey(String key){
        return key.length() % hashTable.length;
    }
}
