package passwordCheck;
import java.util.*;
public class Password{
        Character a=new Character('g');
        public int validp(String pass){
                int i=0;
                int k=0;
                if(pass.length()>6)
                        i++;
                for(int j=0;j<pass.length();j++)
                {
                if(a.isUpperCase(pass.charAt(j)) || a.isDigit(pass.charAt(j)))
                        k++;
                else
                        break;
                }
                if(k==pass.length())
                        i++;
                int d=0;
                for(int p=0;p<pass.length();p++){
                        if(pass.charAt(p)>=48 && pass.charAt(p)<=57)
                                d++;
                if(d==3)
                        i++;
                }
                return i;
        }
}