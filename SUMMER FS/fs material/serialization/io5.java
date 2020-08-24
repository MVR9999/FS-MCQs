import java.io.File;

class io5
{
   public static void main(String[] args) {
      File file = null;
      String[] paths;
  
      try {      
        // create new file object
        file = new File(".");

        // array of files and directory
        paths = file.list();

        // for each name in the path array
        for(String path:paths) {
          System.out.println(path);
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
   }
}