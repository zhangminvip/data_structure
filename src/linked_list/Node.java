package linked_list;

/*
 * 节点类
 */
public class Node<E> {
	private Node<E> next;// 指向下一个节点
	private E e;// 数据域

	/*
	 * 头尾节点构造器
	 */
	public Node() {

	}

	// 节点构造器
	public Node(E e) {
		this.e = e;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	// 获得数据域
	public E getE() {
		return e;
	}

	// 设置数据域
	public void setE(E e) {
		this.e = e;
	}

}
