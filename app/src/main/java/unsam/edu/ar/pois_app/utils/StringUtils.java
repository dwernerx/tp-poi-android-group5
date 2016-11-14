package unsam.edu.ar.pois_app.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;


public class StringUtils {
    //join para elementos de un array
    static public String join(String delimiter, List tokens){ //o Iterable?
        StringBuilder sb = new StringBuilder();
        Iterator<?> it = tokens.iterator();
        if (it.hasNext()) {
            sb.append(it.next());
            while (it.hasNext()) {
                sb.append(delimiter);
                sb.append(it.next());
            }
        }
        return sb.toString();
    }

    public static /*String[]*/String splitUsingTokenizer(String delimiters, String subject) {
        StringTokenizer strTkn = new StringTokenizer(subject, delimiters);
        ArrayList<String> arrLis = new ArrayList<String>(subject.length());

        while(strTkn.hasMoreTokens())
            arrLis.add(strTkn.nextToken());

//        System.out.println(arrLis.get(0));
//        System.out.println(arrLis.get(1));

//        return arrLis.toArray(new String[0]);

//        return arrLis.get(0) + "\n" + arrLis.get(1);
        String string="";
        for(int i=0; i<arrLis.size();i++){
            string = string + ",\n" + arrLis.get(i);
        }
        return string;
    }

//    public static String[]
}
