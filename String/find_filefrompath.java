package String;

class find_filefrompath
{
    public void file(String s)
    {
        int l=s.length();
  
        int d=s.lastIndexOf('\\');
        int d1=s.lastIndexOf('.');
        System.out.println("the file name is:"+s.substring(d+1,d1));
    }
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  