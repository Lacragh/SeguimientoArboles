public class ABB {

    private Node root;
    private int count;


    public void insert(Node n) {

        insert(n, root);
    }

    private void insert(Node n, Node current) {

        if (root == null) {
            this.root = n;
        }else{
            if (n.getCitizen().getCedula() > current.getCitizen().getCedula()) {
                if (current.getRight() != null) {
                    insert(n,current.getRight());
                } else {
                    current.setRight(n);
                }
            }

            if (n.getCitizen().getCedula() < current.getCitizen().getCedula()) {
                if (current.getLeft() != null) {
                    insert(n, current.getLeft());
                } else {
                    current.setLeft(n);
                }

            }
        }
        }

    public String search(int goal){

         String info = "";
        if (search(goal,root) != null){
            count = 1;
            info += "*****************";
            info += search(goal,root).info();
            info += "\n*****************";
            info +="\nEncontrado en "+(count)+"   ";
            info +="\n*****************";
            return info;
        }else{
            return "No se encontro ningun persona";
        }

    }

    private Citizen search (int goal,Node current) {

        if (current == null) {
            return null;
        }

            if (current.getCitizen().getCedula() == goal) {
                
                return current.getCitizen();
            }else{

                if (goal < current.getCitizen().getCedula()) {
                    count++;
                    return search(goal, current.getLeft());
                } else {
                    count++;
                    return search(goal, current.getRight());
                }
            }




        }

    public Node delete(int goal){
        return delete(goal, root);
    }

    private Node delete(int goal, Node current){
        if(current == null){
            return null;
        }
        if(current.getCitizen().getCedula() == goal){
            //1. Nodo Hoja
            if(current.getLeft() == null && current.getRight() == null){
                if(current == root){
                    root = null;
                }else{

                }
                return null;
            }
            //2. Nodo solo hijo izquierdo
            else if (current.getRight() == null){
                if(current == root){
                    root = current.getLeft();
                }
                return current.getLeft();
            }
            //3. Nodo solo hijo derecho
            else if(current.getLeft() == null){
                if(current == root){
                    root = current.getRight();
                }
                return current.getRight();
            }
            //4. Nodo con dos hijos
            else{
                Node min = getMin(current.getRight());
                //Transferencia de valores, NUNCA de conexiones
                current.getCitizen().setCedula(min.getCitizen().getCedula());
                //Hacer eliminación a partir de la derecha
                Node subarbolDER = delete(min.getCitizen().getCedula(), current.getRight());
                current.setRight( subarbolDER );
                return current;
            }


        }else if(goal < current.getCitizen().getCedula()){
            Node subArbolIzquierdo = delete(goal, current.getLeft());
            current.setLeft(subArbolIzquierdo);
            return current;
        }else{
            Node subArbolDerecho = delete(goal, current.getRight());
            current.setRight(subArbolDerecho);
            return current;
        }
    }

    public Node getMin(Node current){
        if(current.getLeft() == null){
            return current;
        }
        return getMin(current.getLeft());
    }





    }

