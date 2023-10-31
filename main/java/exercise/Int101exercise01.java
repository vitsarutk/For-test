package exercise;
import work01.Tool;
import work02.FriendList;
public class Int101exercise01 {

    public static void main(String[] args) {
        testMedian();
        testDigitProduct();
        testCompute();
        testFriendList();
    }
    static void testMedian(){
        System.out.println(Tool.median(4, 3, 2));
    }
    static void testDigitProduct(){
        System.out.println(Tool.digitProduct(230412));
    }
    static void testCompute(){
        System.out.println(Tool.compute(2, 3, "produc"));
    }
    static void testFriendList(){
        FriendList f = FriendList.newList();
        System.out.println(f.addFriend(""));
    }
}
