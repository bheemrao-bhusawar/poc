package com.app.poc.netcracker.interview;

import java.util.HashMap;
import java.util.Map;

public class LRUMap<K, V> {

	class Node {

		Node next;
		Node prev;
		K key;
		V value;

		public Node(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	private Integer capacity;
	Map<K, Node> map;
	Node head;
	Node tail;

	public LRUMap(int capacity) {

		map = new HashMap<>();

		this.capacity = capacity;

		head = new Node(null, null);
		tail = new Node(null, null);

		head.next = tail;
		tail.prev = head;

	}

	public void addNode(Node node) {

		map.put(node.key, node);

		Node headNext = head.next;

		head.next = node;
		node.prev = head;

		headNext.prev = node;
		node.next = headNext;

	}

	public void removeNode(Node node) {

		map.remove(node.key);

		node.prev.next = node.next;
		node.next.prev = node.prev;

	}

	public void put(K key, V value) { // TC: O(1)

		if (map.containsKey(key)) {

			removeNode(map.get(key));

		} else if (map.size() == capacity) {

			removeNode(tail.prev);

		}

		addNode(new Node(key, value));

	}

	public V get(K key) { // TC: O(1)

		if (map.containsKey(key)) {

			Node node = map.get(key);

			removeNode(node);

			addNode(node);

			return node.value;

		} else {

			return null;
		}
	}

	public void display() {

		Map<K, V> tempMap = new HashMap<>();

		Node node = head.next;
		System.out.print("{");
		while (node != null && node.key != null) {

			System.out.print(node.key + "=" + node.value + ",");

			node = node.next;
		}

		System.out.print("}");

		System.out.println();

	}
}
