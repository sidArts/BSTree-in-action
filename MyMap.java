package org.sidarts.test;

import java.util.Arrays;

class Node<K,V> {
	public Node(K key, V data) {
		this.data = data;
		this.key = key;
		this.next = null;
	}
	public V data;
	public K key;
	public Node<K,V> next;
	@Override
	public String toString() {
		return "[key = "+ key +", data = "+ data +", "+ next +"]";
	}
}

class MyMap<K,V> {
	@SuppressWarnings("unchecked")
	Node<K,V> ar[] = new Node[15];
	public int getHashValue(K key) {
		return key.hashCode() % 10;
	}
	public void put(K key, V value) {
		int hv = getHashValue(key);		
		if(ar[hv] != null) {
			if(ar[hv].key.equals(key)) {
				ar[hv].data = value;
				return;
			} else {
				Node<K,V> current = ar[hv];
				while(current.next != null) {
					current = current.next;
					if(current.key.equals(key)) {
						current.data = value;
						return;
					}
				}
				current.next = new Node<K,V>(key, value);
			}
		} else {
			ar[hv] = new Node<K,V>(key, value);
			return;
		}				
	}
	public V get(K key) {
		int hv = getHashValue(key);
		if(ar[hv] != null) {
			Node<K,V> current = ar[hv];
			while(current != null && !current.key.equals(key)) {
				current = current.next;
			}
			return (current != null) ? current.data : null;
		}
		return null;
	}
	public void display() {
		System.out.println(Arrays.toString(ar));		
	}
}
