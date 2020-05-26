/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst4;

/**
 *
 * @author AdminSC
 */
public class ListNode<T> {

    private T data;
    private ListNode listNode;

    public ListNode() {
        data = null;
        listNode = null;
    }

    public ListNode(T t, ListNode listNode) {
        data = t;
        this.listNode = listNode;
    }

    public void setData(T t) {
        data = t;
    }

    public T getData() {
        return data;
    }

    public void setLink(ListNode listNode) {
        this.listNode = listNode;
    }

    public ListNode getLink() {
        return listNode;
    }

    @Override
    public String toString() {
        return data + " --> ";
    }
}
