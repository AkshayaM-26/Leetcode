class LRUCache {
    int capacity;
    Queue<Integer>q;
    HashMap<Integer,Integer>map;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        q=new LinkedList<>();
        map=new HashMap<>();
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        q.remove(key);
        q.add(key);
        return map.get(key);
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            q.remove(key);
        }
        else if(q.size()==capacity){
            int lru=q.poll();
            map.remove(lru);
        }
        q.add(key);
        map.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */