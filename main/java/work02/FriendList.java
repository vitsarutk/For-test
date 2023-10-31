/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work02;


public class FriendList {
    private final String friend;
    private FriendList next;

    public FriendList(String friend) {
        this.friend = friend;
    }
    public static FriendList newList(){
        return new FriendList("");
    }
    public boolean addFriend(String friend){
        if(friend == null || friend.isBlank()){
            return false;
        }
        var current = this;
        while (current.next != null) {
            current = current.next;
            if (current.friend.equals(friend)) return false;
        }
        current.next = new FriendList(friend);
        return true;
    }

    @Override
    public String toString() {
        var current = this.next;
        if (current == null) return "";
        var s = new StringBuilder();
        s.append(current.friend);
        while ((current=current.next) != null) {
        s.append(", ").append(current.friend);
        }
        return s.toString();

    }
    
}
