package linked_list;

/**
 * 测试类
 * 
 * @author minzhang
 *
 */

public class MyLinkedListTest {

	private static String x;

	public static void main(String[] args) {

		MyLinkedList<String> list = new MyLinkedList<String>();
		list.Add("one");
		list.Add("two");
		list.Add("three");
		list.Add("four");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.GetE(i));
		}

		System.out.println();
		System.out.println("测试删除");
		x = list.Delete(3);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.GetE(i));
		}
		System.out.println(x + "被删除了");

		System.out.println();
		System.out.println("测试修改");
		list.Modify("one被修改了", 0);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.GetE(i));
		}

		System.out.println();
		System.out.println("测试查找");
		x = list.GetE(2);
		System.out.println("index 2 is " + x);

	}

}
