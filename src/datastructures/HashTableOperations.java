package datastructures;

public interface HashTableOperations<K, V> {
	
	 public int getSize();
	 public GenericArray<HashTableNode<K, V>> getGenericArray();
	 public int hashFunction(K k);
	 public void insert(K k, V v);
	 public V get(K k);
}
