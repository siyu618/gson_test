package com.yahoo.pt.json;

public class Utils {

    public static String unquote( String str )
    {
        int length = str == null ? -1 : str.length();
        if( str == null || length == 0 )
            return str;
        if( length > 1 && str.charAt( 0 ) == '\"' && str.charAt( length - 1 ) == '\"' )
        {
            str = str.substring( 1, length - 1 );
        }
        return str;
    }

}
