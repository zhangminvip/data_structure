package linked_list;

/*
 * 单向链表类
 */
public class MyLinkedList<E> {

	private Node<E> head;
	private Node<E> last;
	private int size;

	public MyLinkedList() {
		head = new Node<E>();
		last = head;
	}

	// 获取链表长度
	public int size() {
		return size;
	}

	private Node<E> Select(int index) {
		Node<E> node = head.getNext();
		for (int i = 0; i < index; i++) {
			node = node.getNext();
		}
		return node;
	}

	/*
	 * 获得数据域
	 */
	public E GetE(int index) {
		if (index < 0 || index > size - 1)
			return null;
		Node<E> node = Select(index);
		return node.getE();
	}

	/*
	 * 添加节点
	 */
	public void Add(E e) {
		Node<E> node = new Node<E>(e);
		last.setNext(node);
		last = node;
		size++;
	}

	/**
	 * 
	 * @param index
	 * @return 返回删除的元素e
	 */

	public E Delete(int index) {

		if (index < 0 || index > size - 1)
			return null;
		if (index == 0) {
			Node<E> node2 = head.getNext();
			head.setNext(node2.getNext());
			size--;
			return node2.getE();
		}

		// 获取要删除节点的前一个节点
		Node<E> bNode = Select(index - 1);
//		System.out.println("next::"+bNode.getE());
		Node<E> Node = bNode.getNext();
		Node<E> nNode = Node.getNext();
		// 如果删除最后一个元素，nNode会等于null
//		System.out.println(nNode==null);

		bNode.setNext(nNode);
		Node.setNext(null);
		size--;
		return Node.getE();
	}

	/*
	 * 修改指定节点的数据域
	 * 
	 */
	public E Modify(E x, int index) {
		if (index < 0 || index > size - 1 || size == 0) {
			return null;
		}
		Node<E> xnode = new Node<E>(x);
		Node<E> node = Select(index);
		node.setE(xnode.getE());
		return node.getE();
	}

}
