// code for removing nth node from end of the list
// It is function only main class is not added in any of the code
/*
  public class linklist {
  class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
  if(head == null)
  return null;
  
  ListNode fast=head;
  ListNode slow=head;
  for(int i=0;i<n;i++){
  fast=fast.next;
  }
  if(fast == null)
  return head.next;
  while(fast.next != null){
  fast = fast.next;
 slow = slow.next;
  }
  slow.next = slow.next.next;
  return head;
  }
  }
  }
 */
