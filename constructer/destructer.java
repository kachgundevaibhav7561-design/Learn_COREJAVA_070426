class FileHandling{
    public FileHandling(){
        System.out.println("file Handling Constructer");
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("file Handling Finalize");
    }
}


public class destructer {
    public static void main(String[] args) {
        FileHandling fh=new FileHandling();

        
    }
}
