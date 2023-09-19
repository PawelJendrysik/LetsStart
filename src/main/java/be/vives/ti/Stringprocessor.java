package be.vives.ti;

import org.apache.commons.lang3.StringUtils;

public class Stringprocessor {

    public String appendIfMissing(String str, String suffix){
        return StringUtils.appendIfMissing(str,suffix);
    }
}
