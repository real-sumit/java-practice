package Theory;
class str_fnctns
{
    public static void main(String str)
    {
        str_fnctns ob=new str_fnctns();
        
        str=ob.concatenate(str);
        System.out.println(str);
                
        str=ob.lastindexof(str);
        System.out.println(str);
        
        str=ob.trimmer(str);
        System.out.println(str);
        
        str=ob.substr(str);
        System.out.println(str);
        
        str=ob.lowerCase(str);
        System.out.println(str);
        
        str=ob.upperCase(str);
        System.out.println(str);
    }
    public String concatenate(String str)
    {
        str=str.concat(" Applications      ");
        return str;
    }
    public String lastindexof(String str)
    {
        System.out.println(str.lastIndexOf(32));                         //ascii value of b is 98
        System.out.println(str.lastIndexOf(' '));
        return str;
    }
    public String trimmer(String str)
    {
        return str.trim();
    }
    public String substr(String str)
    {
        str=str.substring(0,str.length()-4);
        return str;
    }
    public String lowerCase(String str)
    {
        str=str.toLowerCase();
        return str;
    }
    public String upperCase(String str)
    {
        str=str.toUpperCase();
        return str;
    }
}
