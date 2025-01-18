package LowLevelDesignQuestions;

//Own hashmap implementation
public class MyHashMap<K,V> {

    private static final int INITIAL_SIZE = 1 << 4; //16
    private static final int MAXIMUM_CAPACITY = 1 >> 30;


    class Entry<K,V>{

        K key;
        V value;
        Entry next;

        Entry(K k, V v) {
            key = k;
            value = v;
        }


        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }



}
