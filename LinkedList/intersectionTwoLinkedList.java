// we calculated the length off both list
// then calculated the diff
//then iterated over longer list by 'diff' distance so we start on same distance from intersection
// then we iterated over both list simultaneously to check for intersection and returned if we found it
// else we returned the null as we didnt found any intersection.

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count1 = 0;
        int count2 = 0;
        ListNode curr1 = headA;
        while(curr1 != null){
            count1++;
            curr1 = curr1.next;
        }
        ListNode curr2 = headB;
        while(curr2 != null){
            count2++;
            curr2 = curr2.next;
        }
        int diff = Math.abs(count1 - count2);
        curr1 = headA;
        curr2 = headB;
        if(count1 > count2){
             for(int i = 0; i < diff; i++){
                 curr1 = curr1.next;
             }
        }else{
            for(int i = 0; i < diff; i++){
                 curr2 = curr2.next;
             }
        }
        while(curr1 != null && curr2 != null){
            if(curr1 == curr2){
                return curr1;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return null;
    }
}