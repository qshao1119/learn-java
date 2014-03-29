package learn.java.linked.list;

/**
 * Created with IntelliJ IDEA.
 * User: qshao
 * Date: 3/5/14
 * Time: 10:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Node {
    private String name ;//node name
    private Node next ;// next node

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

