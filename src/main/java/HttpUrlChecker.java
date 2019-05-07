/*
 * Copyright ©2016. Created by P. Bauer (p.bauer@htl-leonding.ac.at),
 * Department of Informatics and Media Technique, HTBLA Leonding, 
 * Limesstr. 12 - 14, 4060 Leonding, AUSTRIA. All Rights Reserved. Permission
 * to use, copy, modify, and distribute this software and its documentation
 * for educational, research, and not-for-profit purposes, without fee and
 * without a signed licensing agreement, is hereby granted, provided that the
 * above copyright notice, this paragraph and the following two paragraphs
 * appear in all copies, modifications, and distributions. Contact the Head of
 * Informatics and Media Technique, HTBLA Leonding, Limesstr. 12 - 14,
 * 4060 Leonding, Austria, for commercial licensing opportunities.
 * 
 * IN NO EVENT SHALL HTBLA LEONDING BE LIABLE TO ANY PARTY FOR DIRECT,
 * INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST
 * PROFITS, ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION,
 * EVEN IF HTBLA LEONDING HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 * HTBLA LEONDING SPECIFICALLY DISCLAIMS ANY WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE. THE SOFTWARE AND ACCOMPANYING DOCUMENTATION, IF ANY,
 * PROVIDED HEREUNDER IS PROVIDED "AS IS". HTBLA LEONDING HAS NO OBLIGATION
 * TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author P. Bauer (p.bauer@htl-leonding.ac.at)
 */
public class HttpUrlChecker {

    //URL:
    //https://TEXT.TEXT.TEXT.TEXT
    private static final String TEXT = "([^-.]([^-.]|-+[^-.])*)";
    private static final String URL_REGEX = "^https?://((" + TEXT + ")+\\.)+(" + TEXT + ")+$";
    
    private static final String GOLFED_REGEX = ".+(b|ac|go|\\/37\\.).+"; //#RegexGolf
    
    private static final String EXPANDED_URL_REGEX = "^https?://(([^-.]([^-.]|-+[^-.])*)+\\.)+([^-.]([^-.]|-+[^-.])*)+$";
        
    public static Matcher getMatcher(String url) {
        Pattern pattern = Pattern.compile(EXPANDED_URL_REGEX);
        return pattern.matcher(url);
    }
}
