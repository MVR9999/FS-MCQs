import java.io.File;

class io4
{
  public static void main(String args[]) {
    String dirname = "/tmp1/test1/junk1";
    File d = new File(dirname);
    d.mkdir();
  }
}