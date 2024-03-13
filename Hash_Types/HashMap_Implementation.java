package com.example.Hash_Types;
import java.util.*;

public class HashMap_Implementation {

    // User Defined Class = HashMap
    static class HashMap<K,V>{      // generics (Key & Value of any Datatype)
        private class Node{
            K key;
            V value;

            private Node(K key,V value){        // Node constructor
                this.key = key;
                this.value = value;
            }
        }


        private int n;      // n = Nodes == Circles
        private int N;      // N = Buckets == Index Box
        private LinkedList<Node> buckets[];     // N = buckets.length

        @SuppressWarnings("unchecked")      // Remove warnings from Console
        public HashMap(){                   // HashMap constructor
            this.N = 4;
            this.buckets = new LinkedList[4];

            for (int i=0;i<4;i++){
                this.buckets[i]= new LinkedList<>();  // Making index = new box, For easy adding
            }
        }


        private int hashFunction(K key){    // Bucket Index
            int bi = key.hashCode();        // hashCode() = Built in Code, gives Output
            return Math.abs(bi)%N;          // Gives Index Value Between  0-N     (N = Bucket Index)
        }

        private int searchInLL(K key,int bi){       // Node Index (Search Key)
            LinkedList<Node> ll = buckets[bi];      // ll == Node Loop

            for (int i=0;i<ll.size();i++){
                if (ll.get(i).key == key){
                    return i;       // di
                }
            }
            return -1;              // No Same Key
        }


        @SuppressWarnings("unchecked")          // Remove warnings from Console
        // rehash = Increase Array Length
        private void rehash(){                  // Updating LinkedList
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];      // 2 = Double Size of Array

            for (int i=0;i<N*2;i++){
                buckets[i] = new LinkedList<>();        // Making index = new box, For easy adding
            }

            for (int i=0;i<oldBucket.length;i++){
                LinkedList<Node> ll = oldBucket[i];
                for (int j=0;j<ll.size();j++){
                    Node node = ll.get(j);

                    put(node.key,node.value);       // Call Put Function
                }
            }
        }


        public void put(K key,V value){         // add K,V
            int bi = hashFunction(key);         // Bucket Index
            int di = searchInLL(key,bi);        // Node Index

            if (di==-1){        // key doesn't exist
                buckets[bi].add(new Node(key,value));
                n++;
            }
            else {      // key exist
                Node node = buckets[bi].get(di);
                node.value =value;              // Value Update
            }

            double lambda =(double)n/N;
            if(lambda > 2.0) {
                rehash();                       // Increase Array Length
            }
        }


        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1) { //key doesn't exist
                return false;
            } else { //key exists
                return true;
            }
        }


        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1) { //key doesn't exist
                return null;
            } else { //key exists
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }


        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1) { //key doesn't exist
                return null;
            } else { //key exists
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }


        public ArrayList<K> keySet() {                      // Key Value
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<buckets.length; i++) { //bi
                LinkedList<Node> ll = buckets[i];

                for(int j=0; j<ll.size(); j++) { //di
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }


        public boolean isEmpty() {
            return n == 0;               // n = Nodes == Circles
        }

    }



    public static void main(String args[]) {

        // Key Value
        HashMap<String, Integer> map = new HashMap<>();     // Key = String ,Value = Integer
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);

        // Keys
        ArrayList<String> keys = map.keySet();          // Call keySet
        for(int i=0; i<keys.size(); i++) {
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));       // Key Value
        }

        map.remove("India");
        System.out.println(map.get("India"));           // India Key is removed
    }


}