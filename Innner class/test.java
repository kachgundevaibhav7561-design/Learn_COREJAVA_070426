class outer{
    int x=10;

    class inner{
        void display(){
            System.out.println(x);
        }

    }
}



public class test {
    public static void main(String[] args) {
        outer obj=new outer();
        outer.inner inobj=obj.new inner();

        inobj.display();
    }
}
