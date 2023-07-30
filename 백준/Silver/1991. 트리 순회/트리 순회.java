import java.util.*;

public class Main {

    static class Node{
        String value;
        Node lt, rt;

        Node(String value){
            this.value = value;
            lt = rt = null;
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 노드 개수

        Node rootNode = new Node("A");

        for(int i=0; i<N; i++){
            String parentNode = sc.next();
            String ltNode = sc.next();
            String rtNode = sc.next();

            insertNode(rootNode, parentNode, ltNode, rtNode);
        }

        // 전위순회
        previousSearch(rootNode);
        System.out.println();

        // 중위순회
        middleSearch(rootNode);
        System.out.println();

        // 후위순회
        lastSearch(rootNode);
        System.out.println();

    }

    static void insertNode(Node current, String parent, String lt, String rt){
        if(current.value.equals(parent)){
            if(!lt.equals(".")){
                current.lt = new Node(lt);
            }
            if(!rt.equals(".")){
                current.rt = new Node(rt);
            }
        } else {
            if(current.lt != null){
                insertNode(current.lt, parent, lt, rt);
            }
            if(current.rt != null){
                insertNode(current.rt, parent, lt, rt);
            }
        }

    }


    // 전위순회
    static void previousSearch(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value);
        previousSearch(node.lt);
        previousSearch(node.rt);
    }

    // 중위순회
    static void middleSearch(Node node){
        if(node == null){
            return;
        }
        middleSearch(node.lt);
        System.out.print(node.value);
        middleSearch(node.rt);
    }


    // 후위순회
    static void lastSearch(Node node){
        if(node == null){
            return;
        }
        lastSearch(node.lt);
        lastSearch(node.rt);
        System.out.print(node.value);
    }






}
