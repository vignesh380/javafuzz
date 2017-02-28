package org.javafuzzing.fuzzer;

import java.io.UnsupportedEncodingException;

/**
 * Created by vicky on 2/27/2017.
 */
public class Constants {

    public static String IamBigString = new String("Original by Markus Kuhn, adapted for HTML by Martin Dürst.\n" +
            "\n" +
            "\n" +
            "UTF-8 encoded sample file for Postscript plain-text file formatters\n" +
            "-------------------------------------------------------------------\n" +
            "\n" +
            "Markus Kuhn <mkuhn@acm.org> — 1999-09-15\n" +
            "\n" +
            "The following 271 Unicode characters are a minimum repertoire that any\n" +
            "modern Postscript printer driver receiving plaintext should be able to\n" +
            "render using the default Postscript fonts (Adobe Courier, etc.). This\n" +
            "repertoire contains all characters of ISO 8859-1, ISO 8859-2, and\n" +
            "Microsoft Code Page 1252.\n" +
            "\n" +
            "The following table contains in its three columns\n" +
            "\n" +
            "  - the hexadecimal Unicode value\n" +
            "  - the Unicode character itself (UTF-8 encoded)\n" +
            "  - the Unicode name for the character\n" +
            "\n" +
            "The ASCII compatible UTF-8 encoding of ISO 10646 and Unicode\n" +
            "plain-text files is defined in RFC 2279 and in ISO 10646-1 Annex R.\n" +
            "\n" +
            "For further information that might be useful to extend a Postscript\n" +
            "driver to display these character, please consult\n" +
            "\n" +
            "  http://partners.adobe.com/asn/developer/typeforum/unicodegn.html\n" +
            "  http://partners.adobe.com/asn/developer/typeforum/glyphlist.txt\n" +
            "  ftp://ftp.unicode.org/Public/MAPPINGS/VENDORS/ADOBE/\n" +
            "  ftp://ftp.funet.fi/mirrors/nic.nordu.net/rfc/rfc2279.txt\n" +
            "  http://www.cl.cam.ac.uk/~mgk25/ucs/ISO-10646-UTF-8.html\n" +
            "  http://www.cl.cam.ac.uk/~mgk25/unicode.html\n" +
            "  http://www.dcs.ed.ac.uk/home/jec/programs/ogonkify/\n" +
            "\n" +
            "\n" +
            "0020   SPACE\n" +
            "0021 ! EXCLAMATION MARK\n" +
            "0022 \" QUOTATION MARK\n" +
            "0023 # NUMBER SIGN\n" +
            "0024 $ DOLLAR SIGN\n" +
            "0025 % PERCENT SIGN\n" +
            "0026 & AMPERSAND\n" +
            "0027 ' APOSTROPHE\n" +
            "0028 ( LEFT PARENTHESIS\n" +
            "0029 ) RIGHT PARENTHESIS\n" +
            "002A * ASTERISK\n" +
            "002B + PLUS SIGN\n" +
            "002C , COMMA\n" +
            "002D - HYPHEN-MINUS\n" +
            "002E . FULL STOP\n" +
            "002F / SOLIDUS\n" +
            "0030 0 DIGIT ZERO\n" +
            "0031 1 DIGIT ONE\n" +
            "0032 2 DIGIT TWO\n" +
            "0033 3 DIGIT THREE\n" +
            "0034 4 DIGIT FOUR\n" +
            "0035 5 DIGIT FIVE\n" +
            "0036 6 DIGIT SIX\n" +
            "0037 7 DIGIT SEVEN\n" +
            "0038 8 DIGIT EIGHT\n" +
            "0039 9 DIGIT NINE\n" +
            "003A : COLON\n" +
            "003B ; SEMICOLON\n" +
            "003C < LESS-THAN SIGN\n" +
            "003D = EQUALS SIGN\n" +
            "003E > GREATER-THAN SIGN\n" +
            "003F ? QUESTION MARK\n" +
            "0040 @ COMMERCIAL AT\n" +
            "0041 A LATIN CAPITAL LETTER A\n" +
            "0042 B LATIN CAPITAL LETTER B\n" +
            "0043 C LATIN CAPITAL LETTER C\n" +
            "0044 D LATIN CAPITAL LETTER D\n" +
            "0045 E LATIN CAPITAL LETTER E\n" +
            "0046 F LATIN CAPITAL LETTER F\n" +
            "0047 G LATIN CAPITAL LETTER G\n" +
            "0048 H LATIN CAPITAL LETTER H\n" +
            "0049 I LATIN CAPITAL LETTER I\n" +
            "004A J LATIN CAPITAL LETTER J\n" +
            "004B K LATIN CAPITAL LETTER K\n" +
            "004C L LATIN CAPITAL LETTER L\n" +
            "004D M LATIN CAPITAL LETTER M\n" +
            "004E N LATIN CAPITAL LETTER N\n" +
            "004F O LATIN CAPITAL LETTER O\n" +
            "0050 P LATIN CAPITAL LETTER P\n" +
            "0051 Q LATIN CAPITAL LETTER Q\n" +
            "0052 R LATIN CAPITAL LETTER R\n" +
            "0053 S LATIN CAPITAL LETTER S\n" +
            "0054 T LATIN CAPITAL LETTER T\n" +
            "0055 U LATIN CAPITAL LETTER U\n" +
            "0056 V LATIN CAPITAL LETTER V\n" +
            "0057 W LATIN CAPITAL LETTER W\n" +
            "0058 X LATIN CAPITAL LETTER X\n" +
            "0059 Y LATIN CAPITAL LETTER Y\n" +
            "005A Z LATIN CAPITAL LETTER Z\n" +
            "005B [ LEFT SQUARE BRACKET\n" +
            "005C \\ REVERSE SOLIDUS\n" +
            "005D ] RIGHT SQUARE BRACKET\n" +
            "005E ^ CIRCUMFLEX ACCENT\n" +
            "005F _ LOW LINE\n" +
            "0060 ` GRAVE ACCENT\n" +
            "0061 a LATIN SMALL LETTER A\n" +
            "0062 b LATIN SMALL LETTER B\n" +
            "0063 c LATIN SMALL LETTER C\n" +
            "0064 d LATIN SMALL LETTER D\n" +
            "0065 e LATIN SMALL LETTER E\n" +
            "0066 f LATIN SMALL LETTER F\n" +
            "0067 g LATIN SMALL LETTER G\n" +
            "0068 h LATIN SMALL LETTER H\n" +
            "0069 i LATIN SMALL LETTER I\n" +
            "006A j LATIN SMALL LETTER J\n" +
            "006B k LATIN SMALL LETTER K\n" +
            "006C l LATIN SMALL LETTER L\n" +
            "006D m LATIN SMALL LETTER M\n" +
            "006E n LATIN SMALL LETTER N\n" +
            "006F o LATIN SMALL LETTER O\n" +
            "0070 p LATIN SMALL LETTER P\n" +
            "0071 q LATIN SMALL LETTER Q\n" +
            "0072 r LATIN SMALL LETTER R\n" +
            "0073 s LATIN SMALL LETTER S\n" +
            "0074 t LATIN SMALL LETTER T\n" +
            "0075 u LATIN SMALL LETTER U\n" +
            "0076 v LATIN SMALL LETTER V\n" +
            "0077 w LATIN SMALL LETTER W\n" +
            "0078 x LATIN SMALL LETTER X\n" +
            "0079 y LATIN SMALL LETTER Y\n" +
            "007A z LATIN SMALL LETTER Z\n" +
            "007B { LEFT CURLY BRACKET\n" +
            "007C | VERTICAL LINE\n" +
            "007D } RIGHT CURLY BRACKET\n" +
            "007E ~ TILDE\n" +
            "00A0   NO-BREAK SPACE\n" +
            "00A1 ¡ INVERTED EXCLAMATION MARK\n" +
            "00A2 ¢ CENT SIGN\n" +
            "00A3 £ POUND SIGN\n" +
            "00A4 ¤ CURRENCY SIGN\n" +
            "00A5 ¥ YEN SIGN\n" +
            "00A6 ¦ BROKEN BAR\n" +
            "00A7 § SECTION SIGN\n" +
            "00A8 ¨ DIAERESIS\n" +
            "00A9 © COPYRIGHT SIGN\n" +
            "00AA ª FEMININE ORDINAL INDICATOR\n" +
            "00AB « LEFT-POINTING DOUBLE ANGLE QUOTATION MARK\n" +
            "00AC ¬ NOT SIGN\n" +
            "00AD \u00AD SOFT HYPHEN\n" +
            "00AE ® REGISTERED SIGN\n" +
            "00AF ¯ MACRON\n" +
            "00B0 ° DEGREE SIGN\n" +
            "00B1 ± PLUS-MINUS SIGN\n" +
            "00B2 ² SUPERSCRIPT TWO\n" +
            "00B3 ³ SUPERSCRIPT THREE\n" +
            "00B4 ´ ACUTE ACCENT\n" +
            "00B5 µ MICRO SIGN\n" +
            "00B6 ¶ PILCROW SIGN\n" +
            "00B7 · MIDDLE DOT\n" +
            "00B8 ¸ CEDILLA\n" +
            "00B9 ¹ SUPERSCRIPT ONE\n" +
            "00BA º MASCULINE ORDINAL INDICATOR\n" +
            "00BB » RIGHT-POINTING DOUBLE ANGLE QUOTATION MARK\n" +
            "00BC ¼ VULGAR FRACTION ONE QUARTER\n" +
            "00BD ½ VULGAR FRACTION ONE HALF\n" +
            "00BE ¾ VULGAR FRACTION THREE QUARTERS\n" +
            "00BF ¿ INVERTED QUESTION MARK\n" +
            "00C0 À LATIN CAPITAL LETTER A WITH GRAVE\n" +
            "00C1 Á LATIN CAPITAL LETTER A WITH ACUTE\n" +
            "00C2 Â LATIN CAPITAL LETTER A WITH CIRCUMFLEX\n" +
            "00C3 Ã LATIN CAPITAL LETTER A WITH TILDE\n" +
            "00C4 Ä LATIN CAPITAL LETTER A WITH DIAERESIS\n" +
            "00C5 Å LATIN CAPITAL LETTER A WITH RING ABOVE\n" +
            "00C6 Æ LATIN CAPITAL LETTER AE\n" +
            "00C7 Ç LATIN CAPITAL LETTER C WITH CEDILLA\n" +
            "00C8 È LATIN CAPITAL LETTER E WITH GRAVE\n" +
            "00C9 É LATIN CAPITAL LETTER E WITH ACUTE\n" +
            "00CA Ê LATIN CAPITAL LETTER E WITH CIRCUMFLEX\n" +
            "00CB Ë LATIN CAPITAL LETTER E WITH DIAERESIS\n" +
            "00CC Ì LATIN CAPITAL LETTER I WITH GRAVE\n" +
            "00CD Í LATIN CAPITAL LETTER I WITH ACUTE\n" +
            "00CE Î LATIN CAPITAL LETTER I WITH CIRCUMFLEX\n" +
            "00CF Ï LATIN CAPITAL LETTER I WITH DIAERESIS\n" +
            "00D0 Ð LATIN CAPITAL LETTER ETH\n" +
            "00D1 Ñ LATIN CAPITAL LETTER N WITH TILDE\n" +
            "00D2 Ò LATIN CAPITAL LETTER O WITH GRAVE\n" +
            "00D3 Ó LATIN CAPITAL LETTER O WITH ACUTE\n" +
            "00D4 Ô LATIN CAPITAL LETTER O WITH CIRCUMFLEX\n" +
            "00D5 Õ LATIN CAPITAL LETTER O WITH TILDE\n" +
            "00D6 Ö LATIN CAPITAL LETTER O WITH DIAERESIS\n" +
            "00D7 × MULTIPLICATION SIGN\n" +
            "00D8 Ø LATIN CAPITAL LETTER O WITH STROKE\n" +
            "00D9 Ù LATIN CAPITAL LETTER U WITH GRAVE\n" +
            "00DA Ú LATIN CAPITAL LETTER U WITH ACUTE\n" +
            "00DB Û LATIN CAPITAL LETTER U WITH CIRCUMFLEX\n" +
            "00DC Ü LATIN CAPITAL LETTER U WITH DIAERESIS\n" +
            "00DD Ý LATIN CAPITAL LETTER Y WITH ACUTE\n" +
            "00DE Þ LATIN CAPITAL LETTER THORN\n" +
            "00DF ß LATIN SMALL LETTER SHARP S\n" +
            "00E0 à LATIN SMALL LETTER A WITH GRAVE\n" +
            "00E1 á LATIN SMALL LETTER A WITH ACUTE\n" +
            "00E2 â LATIN SMALL LETTER A WITH CIRCUMFLEX\n" +
            "00E3 ã LATIN SMALL LETTER A WITH TILDE\n" +
            "00E4 ä LATIN SMALL LETTER A WITH DIAERESIS\n" +
            "00E5 å LATIN SMALL LETTER A WITH RING ABOVE\n" +
            "00E6 æ LATIN SMALL LETTER AE\n" +
            "00E7 ç LATIN SMALL LETTER C WITH CEDILLA\n" +
            "00E8 è LATIN SMALL LETTER E WITH GRAVE\n" +
            "00E9 é LATIN SMALL LETTER E WITH ACUTE\n" +
            "00EA ê LATIN SMALL LETTER E WITH CIRCUMFLEX\n" +
            "00EB ë LATIN SMALL LETTER E WITH DIAERESIS\n" +
            "00EC ì LATIN SMALL LETTER I WITH GRAVE\n" +
            "00ED í LATIN SMALL LETTER I WITH ACUTE\n" +
            "00EE î LATIN SMALL LETTER I WITH CIRCUMFLEX\n" +
            "00EF ï LATIN SMALL LETTER I WITH DIAERESIS\n" +
            "00F0 ð LATIN SMALL LETTER ETH\n" +
            "00F1 ñ LATIN SMALL LETTER N WITH TILDE\n" +
            "00F2 ò LATIN SMALL LETTER O WITH GRAVE\n" +
            "00F3 ó LATIN SMALL LETTER O WITH ACUTE\n" +
            "00F4 ô LATIN SMALL LETTER O WITH CIRCUMFLEX\n" +
            "00F5 õ LATIN SMALL LETTER O WITH TILDE\n" +
            "00F6 ö LATIN SMALL LETTER O WITH DIAERESIS\n" +
            "00F7 ÷ DIVISION SIGN\n" +
            "00F8 ø LATIN SMALL LETTER O WITH STROKE\n" +
            "00F9 ù LATIN SMALL LETTER U WITH GRAVE\n" +
            "00FA ú LATIN SMALL LETTER U WITH ACUTE\n" +
            "00FB û LATIN SMALL LETTER U WITH CIRCUMFLEX\n" +
            "00FC ü LATIN SMALL LETTER U WITH DIAERESIS\n" +
            "00FD ý LATIN SMALL LETTER Y WITH ACUTE\n" +
            "00FE þ LATIN SMALL LETTER THORN\n" +
            "00FF ÿ LATIN SMALL LETTER Y WITH DIAERESIS\n" +
            "0102 Ă LATIN CAPITAL LETTER A WITH BREVE\n" +
            "0103 ă LATIN SMALL LETTER A WITH BREVE\n" +
            "0104 Ą LATIN CAPITAL LETTER A WITH OGONEK\n" +
            "0105 ą LATIN SMALL LETTER A WITH OGONEK\n" +
            "0106 Ć LATIN CAPITAL LETTER C WITH ACUTE\n" +
            "0107 ć LATIN SMALL LETTER C WITH ACUTE\n" +
            "010C Č LATIN CAPITAL LETTER C WITH CARON\n" +
            "010D č LATIN SMALL LETTER C WITH CARON\n" +
            "010E Ď LATIN CAPITAL LETTER D WITH CARON\n" +
            "010F ď LATIN SMALL LETTER D WITH CARON\n" +
            "0110 Đ LATIN CAPITAL LETTER D WITH STROKE\n" +
            "0111 đ LATIN SMALL LETTER D WITH STROKE\n" +
            "0118 Ę LATIN CAPITAL LETTER E WITH OGONEK\n" +
            "0119 ę LATIN SMALL LETTER E WITH OGONEK\n" +
            "011A Ě LATIN CAPITAL LETTER E WITH CARON\n" +
            "011B ě LATIN SMALL LETTER E WITH CARON\n" +
            "0139 Ĺ LATIN CAPITAL LETTER L WITH ACUTE\n" +
            "013A ĺ LATIN SMALL LETTER L WITH ACUTE\n" +
            "013D Ľ LATIN CAPITAL LETTER L WITH CARON\n" +
            "013E ľ LATIN SMALL LETTER L WITH CARON\n" +
            "0141 Ł LATIN CAPITAL LETTER L WITH STROKE\n" +
            "0142 ł LATIN SMALL LETTER L WITH STROKE\n" +
            "0143 Ń LATIN CAPITAL LETTER N WITH ACUTE\n" +
            "0144 ń LATIN SMALL LETTER N WITH ACUTE\n" +
            "0147 Ň LATIN CAPITAL LETTER N WITH CARON\n" +
            "0148 ň LATIN SMALL LETTER N WITH CARON\n" +
            "0150 Ő LATIN CAPITAL LETTER O WITH DOUBLE ACUTE\n" +
            "0151 ő LATIN SMALL LETTER O WITH DOUBLE ACUTE\n" +
            "0152 Œ LATIN CAPITAL LIGATURE OE\n" +
            "0153 œ LATIN SMALL LIGATURE OE\n" +
            "0154 Ŕ LATIN CAPITAL LETTER R WITH ACUTE\n" +
            "0155 ŕ LATIN SMALL LETTER R WITH ACUTE\n" +
            "0158 Ř LATIN CAPITAL LETTER R WITH CARON\n" +
            "0159 ř LATIN SMALL LETTER R WITH CARON\n" +
            "015A Ś LATIN CAPITAL LETTER S WITH ACUTE\n" +
            "015B ś LATIN SMALL LETTER S WITH ACUTE\n" +
            "015E Ş LATIN CAPITAL LETTER S WITH CEDILLA\n" +
            "015F ş LATIN SMALL LETTER S WITH CEDILLA\n" +
            "0160 Š LATIN CAPITAL LETTER S WITH CARON\n" +
            "0161 š LATIN SMALL LETTER S WITH CARON\n" +
            "0162 Ţ LATIN CAPITAL LETTER T WITH CEDILLA\n" +
            "0163 ţ LATIN SMALL LETTER T WITH CEDILLA\n" +
            "0164 Ť LATIN CAPITAL LETTER T WITH CARON\n" +
            "0165 ť LATIN SMALL LETTER T WITH CARON\n" +
            "016E Ů LATIN CAPITAL LETTER U WITH RING ABOVE\n" +
            "016F ů LATIN SMALL LETTER U WITH RING ABOVE\n" +
            "0170 Ű LATIN CAPITAL LETTER U WITH DOUBLE ACUTE\n" +
            "0171 ű LATIN SMALL LETTER U WITH DOUBLE ACUTE\n" +
            "0178 Ÿ LATIN CAPITAL LETTER Y WITH DIAERESIS\n" +
            "0179 Ź LATIN CAPITAL LETTER Z WITH ACUTE\n" +
            "017A ź LATIN SMALL LETTER Z WITH ACUTE\n" +
            "017B Ż LATIN CAPITAL LETTER Z WITH DOT ABOVE\n" +
            "017C ż LATIN SMALL LETTER Z WITH DOT ABOVE\n" +
            "017D Ž LATIN CAPITAL LETTER Z WITH CARON\n" +
            "017E ž LATIN SMALL LETTER Z WITH CARON\n" +
            "0192 ƒ LATIN SMALL LETTER F WITH HOOK\n" +
            "02C6 ˆ MODIFIER LETTER CIRCUMFLEX ACCENT\n" +
            "02C7 ˇ CARON\n" +
            "02D8 ˘ BREVE\n" +
            "02D9 ˙ DOT ABOVE\n" +
            "02DB ˛ OGONEK\n" +
            "02DC ˜ SMALL TILDE\n" +
            "02DD ˝ DOUBLE ACUTE ACCENT\n" +
            "2013 – EN DASH\n" +
            "2014 — EM DASH\n" +
            "2018 ‘ LEFT SINGLE QUOTATION MARK\n" +
            "2019 ’ RIGHT SINGLE QUOTATION MARK\n" +
            "201A ‚ SINGLE LOW-9 QUOTATION MARK\n" +
            "201C “ LEFT DOUBLE QUOTATION MARK\n" +
            "201D ” RIGHT DOUBLE QUOTATION MARK\n" +
            "201E „ DOUBLE LOW-9 QUOTATION MARK\n" +
            "2020 † DAGGER\n" +
            "2021 ‡ DOUBLE DAGGER\n" +
            "2022 • BULLET\n" +
            "2026 … HORIZONTAL ELLIPSIS\n" +
            "2030 ‰ PER MILLE SIGN\n" +
            "2039 ‹ SINGLE LEFT-POINTING ANGLE QUOTATION MARK\n" +
            "203A › SINGLE RIGHT-POINTING ANGLE QUOTATION MARK\n" +
            "20AC € EURO SIGN\n" +
            "2122 ™ TRADE MARK SIGN");
    public static String stSmallMax = new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit.Nunc commodo, nunc ut interdum tristique, nulla nisl pulvinar ante, id placerat elit elit ac elit.Sed ex mi, elementum vel tincidunt non, rutrum ac lectus.Sed malesuada dictum velit eget placerat.Integer iaculis rutrum ex eu pulvinar.Suspendisse cursus lacus nibh, vel porttitor dolor malesuada vel.Phasellus ornare gravida libero quis tincidunt.Curabitur pulvinar urna orci, sit amet volutpat odio hendrerit eu.\n" +
            "\n" +
            "Aliquam non faucibus diam. Etiam magna est, bibendum at velit id, dignissim auctor lorem. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nullam at sapien tempor, feugiat risus et, fermentum turpis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Sed maximus porttitor ex eleifend euismod. Suspendisse congue orci ut sem feugiat, vitae rhoncus eros viverra. Nam sollicitudin sapien vitae risus eleifend congue. Pellentesque eu aliquet odio, convallis ultrices nulla. Phasellus et tellus sit amet lorem pellentesque sagittis dictum sit amet augue. Morbi eget luctus purus, nec dictum lectus. Praesent ornare, sapien convallis aliquet convallis, arcu mi elementum ligula, at tempor metus orci vel ante. Mauris egestas elit sit amet elit sodales, et fermentum urna interdum. Cras finibus massa id libero bibendum, ut mollis justo feugiat. Morbi fringilla lorem vitae congue tincidunt.\n" +
            "\n" +
            "Ut sit amet nibh viverra, facilisis libero eget, tincidunt magna. Duis orci urna, porta et finibus sed, iaculis vel nibh. Praesent sit amet mauris lacus. Sed ante neque, sollicitudin nec leo sit amet, viverra imperdiet odio. In tempus commodo euismod. Praesent eget bibendum est. Morbi consequat mattis varius. Sed pharetra maximus erat, ac faucibus mi sollicitudin sed. Sed varius sagittis quam sit amet vestibulum. Duis eget nisl nec ex posuere suscipit. Integer vulputate pellentesque efficitur. Phasellus eu convallis elit, in feugiat urna. Cras fermentum felis diam, vel cursus libero maximus ut. Ut porttitor mollis congue.\n" +
            "\n" +
            "Nunc vel eros neque. Sed aliquam tempus blandit. Nullam maximus non nulla nec rutrum. Sed at mauris id tellus suscipit luctus. Vestibulum dapibus bibendum ipsum nec pretium. Morbi in porta sem. Donec et ligula eget libero dignissim euismod. Vestibulum erat velit, viverra at felis at, ultrices finibus augue. Nam scelerisque sed urna in posuere. Nulla facilisi. Morbi commodo eu erat sit amet volutpat. Pellentesque tellus est, sodales ac ante et, aliquet egestas lacus.\n" +
            "\n" +
            "Phasellus fermentum erat justo, ut ullamcorper nunc dictum nec. Suspendisse potenti. Fusce sagittis, eros quis accumsan ultricies, nulla augue sagittis augue, non consectetur nibh sem at dui. Fusce nec vehicula nibh. Morbi tempus suscipit semper. Duis ac ante quis neque vulputate blandit ut eu enim. Donec vel pretium nulla, et elementum justo. Etiam id magna a ex volutpat pulvinar. Nullam metus turpis, rutrum sit amet tempor sed, varius ac sem. Phasellus sem ante, feugiat eu felis non, hendrerit vehicula ante. Pellentesque vulputate eros sit amet hendrerit facilisis. Donec fringilla urna purus, rhoncus maximus lectus auctor nec. Integer interdum lorem eget ligula sollicitudin, vel scelerisque ligula auctor. Sed a maximus risus, id auctor nibh. Suspendisse dapibus turpis sit amet elit lobortis efficitur. Morbi augue lectus, posuere vel tortor quis, pharetra congue mauris.\n" +
            "\n" +
            "Sed sed hendrerit ligula. Maecenas consequat tempus libero eu ultricies. Sed mattis est nisl, eu commodo ante luctus quis. Curabitur eu libero nec arcu euismod suscipit sed vitae sem. Fusce placerat libero sed nisi placerat, vitae molestie odio auctor. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Cras non vulputate lectus, non dapibus nisi. Proin luctus quis augue eget malesuada. Cras ut metus tristique, tempor augue vitae, ullamcorper dolor. Nunc feugiat feugiat diam vitae imperdiet. Etiam facilisis viverra quam.\n" +
            "\n" +
            "In dignissim ornare urna vitae auctor. Mauris rhoncus congue odio non rhoncus. In hac habitasse platea dictumst. Quisque et neque sit amet orci volutpat vehicula. Nulla facilisi. Phasellus quis diam in magna facilisis ornare. Aliquam elementum tortor ut mi posuere, quis pulvinar nulla efficitur. Praesent imperdiet est at elit tincidunt, a sodales eros tempus. Donec leo massa, malesuada et turpis sed, commodo rhoncus eros. Donec volutpat, quam vitae condimentum posuere, lectus turpis semper risus, eget faucibus diam ligula eget ante. Donec luctus pharetra lectus, id finibus nibh aliquam ac. Pellentesque non risus id turpis commodo euismod. Donec molestie sed elit in interdum.\n" +
            "\n" +
            "Donec id mauris dui. Aenean eu dui quis libero viverra lobortis eget quis orci. Fusce volutpat nunc finibus leo congue auctor. Nunc iaculis mollis orci, in placerat elit suscipit sit amet. Ut vitae sagittis turpis, et lobortis velit. Duis quis vulputate sapien. Donec sit amet commodo nibh, non convallis est. In vehicula molestie hendrerit. Suspendisse auctor sollicitudin viverra. Duis finibus urna ac diam accumsan pretium. Proin sed porta ipsum. Ut rutrum odio sed scelerisque egestas.\n" +
            "\n" +
            "Nullam rhoncus ultrices cursus. Morbi nec facilisis nibh. Interdum et malesuada fames ac ante ipsum primis in faucibus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis varius vel erat vitae euismod. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc laoreet ut lectus a egestas. Quisque a nisl turpis. Cras congue vitae erat vel bibendum. Aenean cursus tellus id quam congue, laoreet cursus nisi dignissim. Praesent et faucibus lacus, tempor rutrum erat. Donec vel nibh ipsum.\n" +
            "\n" +
            "Fusce consequat sapien sapien, nec scelerisque dolor pellentesque sed. Quisque dignissim egestas risus, non mattis purus maximus quis. Aliquam pulvinar nunc sit amet sagittis euismod. Duis blandit risus ac gravida elementum. Nam ornare pharetra odio a facilisis. Duis ac sagittis odio. Pellentesque fringilla dolor magna, sed eleifend velit sagittis et. Maecenas quis quam in justo lacinia laoreet in id dui. Cras in vulputate libero. Integer commodo purus nisl, nec tincidunt justo maximus vel. Phasellus posuere tortor ligula, porta elementum erat accumsan in. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Mauris augue dui, commodo eget eros eu, pretium vestibulum magna. Ut ullamcorper consectetur odio.\n" +
            "\n" +
            "In hac habitasse platea dictumst. Sed auctor congue tellus pulvinar euismod. Suspendisse luctus lobortis odio in pellentesque. Duis luctus vulputate augue, quis molestie purus congue molestie. Praesent molestie nunc metus, vel facilisis ante malesuada a. Nullam semper quam quis purus dictum, vitae faucibus augue scelerisque. In sit amet placerat dui. Aliquam nulla mauris, pulvinar in venenatis et, dapibus vitae purus. Aenean hendrerit, enim ut sollicitudin commodo, nulla urna suscipit nibh, et finibus nibh tellus quis nunc. Nam interdum massa in metus faucibus, quis tempor sapien ornare. Fusce et mauris cursus, luctus urna nec, lobortis augue. Morbi imperdiet risus a elit tristique dictum aliquam ut tellus. Integer aliquam congue vehicula. Maecenas vehicula, ipsum sodales tincidunt commodo, orci orci aliquam nisl, eu commodo arcu nisl ut mi. Nam condimentum quam nec maximus varius. Quisque quis sagittis nibh, quis ultricies dui.\n" +
            "\n" +
            "Donec congue fringilla eros, quis dignissim urna rhoncus sit amet. Phasellus ultrices augue turpis, in iaculis arcu vulputate at. Proin non ex eget tortor ullamcorper dapibus at et tortor. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Fusce aliquam arcu non faucibus fringilla. Nunc euismod odio purus, sed congue massa feugiat a. Donec magna diam, dictum in leo vitae, iaculis dapibus diam. Suspendisse dictum a ipsum eget posuere. Duis turpis est, varius in massa ac, porttitor euismod metus. Suspendisse a purus lorem. Sed sed nunc quis neque bibendum dictum eu molestie leo. Donec vehicula sed tortor eget convallis. Etiam vel faucibus diam. In semper nec dui non accumsan.\n" +
            "\n" +
            "Suspendisse commodo leo est, a malesuada nunc consectetur quis. Aliquam iaculis pretium scelerisque. Nullam eget justo commodo, venenatis leo ac, pulvinar tortor. Nullam dapibus augue at nisl convallis consequat. Integer a augue sit amet libero viverra pretium eget sit amet lacus. Maecenas venenatis ullamcorper lacus, vitae lacinia metus consectetur a. Maecenas quis arcu odio. Curabitur eleifend maximus sagittis. Vestibulum mattis turpis nec sapien facilisis, sed ornare justo convallis. Donec tincidunt, risus et luctus cursus, risus dui mattis lacus, in venenatis metus sapien ut nulla. Ut vulputate accumsan euismod.\n" +
            "\n" +
            "Vestibulum velit dolor, semper vel lectus et, dictum sollicitudin odio. Aliquam erat volutpat. Fusce pharetra mi sit amet sapien venenatis, in tristique risus tempor. Suspendisse sapien odio, dignissim ut vehicula sit amet, convallis pellentesque urna. Aliquam vitae elit dui. Aenean sit amet libero eu felis mollis sollicitudin ut sit amet urna. Nullam ut metus ut massa rhoncus consequat id quis elit. Integer gravida sapien sed gravida accumsan. Proin convallis eget mi et mattis. Donec tincidunt sit amet quam eget dapibus. Sed placerat tempor venenatis. Ut nec congue arcu, a pharetra arcu. Nunc sapien quam, lacinia non lectus nec, consequat tincidunt ipsum. Ut viverra, velit in laoreet porta, purus leo imperdiet nunc, non lobortis dui enim non arcu. Mauris accumsan at erat et ullamcorper. Vivamus in nibh maximus, congue leo et, tristique magna.\n" +
            "\n" +
            "Suspendisse massa odio, interdum a convallis in, dapibus in ante. Sed id felis suscipit, facilisis magna sit amet, mollis purus. Donec eu nisl condimentum, venenatis ligula et, pulvinar ligula. Etiam interdum ipsum urna, eget pulvinar nulla dignissim quis. Etiam porttitor diam quam, sit amet imperdiet magna pellentesque ut. Quisque sit amet sem vulputate tortor molestie lacinia. Etiam tellus ex, vulputate vehicula lorem a, lacinia gravida diam. Curabitur et malesuada turpis.\n" +
            "\n" +
            "Suspendisse potenti. Nullam maximus scelerisque laoreet. In fringilla lectus lacus, at pellentesque lectus scelerisque in. Sed pharetra euismod enim, vitae euismod felis semper ac. Fusce a diam sit amet ex blandit faucibus. In sodales felis sit amet diam vulputate, in porttitor metus feugiat. In sem tellus, elementum sed ultricies at, posuere id nisl. Donec varius lorem nibh, nec scelerisque enim aliquet in. Nullam quis erat in odio maximus maximus. Cras sodales, quam ut aliquet rutrum, nulla dui scelerisque arcu, id rhoncus sem risus id ex. Ut pellentesque pharetra nunc, sit amet ornare leo lobortis nec. Maecenas ut sem ante. Integer vitae lacinia elit. Nam auctor molestie felis, eu tincidunt lacus tempus sed. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed eu mi a tortor auctor mattis in at lacus.\n" +
            "\n" +
            "Phasellus sed efficitur neque. Curabitur sed ornare justo. Phasellus ac auctor dolor. Nullam convallis posuere lorem, sit amet facilisis augue maximus id. Nam malesuada vitae dolor ac aliquam. Sed facilisis enim nec felis vulputate tincidunt eu id ex. Morbi pulvinar feugiat purus id porttitor.\n" +
            "\n" +
            "Nunc malesuada, odio vitae porttitor gravida, massa mi cursus dolor, eget ullamcorper tortor ante sed arcu. Etiam dapibus sapien mauris, suscipit lobortis risus pretium sed. Aenean non arcu aliquam, lacinia est eu, aliquet velit. Morbi odio diam, molestie a ultrices quis, hendrerit quis ipsum. In hac habitasse platea dictumst. Donec placerat volutpat vestibulum. Praesent ac vehicula elit. Aenean sagittis ipsum ipsum, eu mollis purus interdum eget.\n" +
            "\n" +
            "Nunc eget augue turpis. Suspendisse bibendum tempor ultricies. Phasellus venenatis nunc ut tortor dictum rhoncus. Nulla facilisi. Etiam condimentum augue sed odio consequat varius. Nunc vel pulvinar metus. Vestibulum dignissim rhoncus nunc eu tempor. Morbi vitae sapien tortor. Fusce sed justo ac ipsum tincidunt facilisis. Nullam blandit a purus ut sollicitudin. Nam condimentum dignissim mi sit amet semper.\n" +
            "\n" +
            "Maecenas a metus suscipit, pharetra dui vitae, tempus nibh. Curabitur rutrum, nisl sit amet tincidunt gravida, augue justo egestas lorem, ac ultricies mi nisi ut nulla. Fusce tempor risus vitae neque blandit elementum. Donec tincidunt elit ac mollis feugiat. Integer venenatis, nibh imperdiet vulputate bibendum, metus arcu interdum turpis, rhoncus tempor mi arcu in nisi. Morbi eu nulla ac ante finibus bibendum. Maecenas at dignissim nisi. Suspendisse convallis, purus id lobortis molestie, nisl mauris posuere nunc, ut convallis ipsum magna at enim. Cras tincidunt sem commodo, ullamcorper nunc eu, interdum leo. Etiam fermentum pretium sapien, a pharetra dolor. Praesent aliquam nisl in sagittis sodales. Nunc in dui vel sem ornare feugiat quis vitae dui. Quisque nibh velit, consequat a imperdiet eu, semper nec nisl. In ac varius tortor. Nam ultrices vel ipsum quis pulvinar.\n" +
            "\n" +
            "Praesent in lorem eget urna molestie congue sit amet nec nulla. Aliquam porta vehicula iaculis. Integer id ultrices lorem. Maecenas commodo id ligula id varius. Integer in tristique libero, ut pretium ante. Pellentesque semper eget sem vel tristique. Sed mattis enim eget augue tempus, vitae congue quam euismod. In imperdiet odio non lectus scelerisque ultrices. Aliquam et libero at risus interdum accumsan. Cras lorem quam, efficitur in diam a, lacinia porta lorem. Pellentesque dictum, purus et molestie accumsan, purus ex consequat neque, quis malesuada tellus metus eget est.\n" +
            "\n" +
            "Donec viverra, odio nec pellentesque ultrices, elit ipsum vestibulum ex, sit amet sollicitudin massa dui vitae tortor. Nunc fringilla lorem diam, eleifend fermentum ex vehicula mollis. Mauris ultricies egestas aliquet. Suspendisse quis rutrum arcu. Duis tincidunt arcu risus, dignissim finibus nunc sodales id. Maecenas eros ante, viverra nec gravida nec, fringilla a lorem. Nulla consequat ullamcorper urna. Donec sit amet vestibulum turpis.\n" +
            "\n" +
            "Mauris arcu nunc, tristique vel elit sodales, congue bibendum arcu. Curabitur non lorem fringilla, tempus odio facilisis, posuere leo. Nulla et pellentesque ex, mollis luctus erat. Donec laoreet auctor lorem vel tristique. Duis quis elit eget ante posuere faucibus nec non magna. Nullam viverra eros eu purus vulputate, imperdiet dapibus tortor ultrices. Proin consectetur semper dapibus. Nam vestibulum tortor enim. Duis tristique sapien cursus nisl vulputate tincidunt. Aliquam non interdum felis, non malesuada erat. In fringilla sem eget erat imperdiet, efficitur sagittis turpis consectetur. Donec dictum dui ex, ac euismod urna viverra sit amet. Vivamus pretium enim et porta blandit.\n" +
            "\n" +
            "Morbi vitae ante at nibh laoreet accumsan. Nam metus felis, congue sit amet consectetur vitae, luctus sed mi. Curabitur semper ipsum et tortor facilisis, a faucibus magna ultrices. Vivamus ex libero, malesuada in nulla eget, maximus ultrices purus. Vestibulum tristique dui sit amet nisl congue consectetur. Quisque bibendum nunc sit amet ex ullamcorper, porttitor consequat orci gravida. Morbi sit amet quam ultricies, congue massa semper, accumsan tellus. Cras congue finibus viverra. Praesent viverra posuere nulla et euismod. Fusce sodales neque sed mauris rutrum, ut congue massa scelerisque. In hendrerit dui non sollicitudin dignissim.\n" +
            "\n" +
            "Morbi ut maximus turpis, a faucibus erat. Quisque massa nisi, dapibus eget leo id, aliquam maximus sapien. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec sed augue vestibulum, tempus nulla in, euismod dui. Morbi pretium sodales dolor et volutpat. Curabitur ex urna, lobortis a ex ut, ultricies accumsan orci. Morbi quis scelerisque libero, sit amet malesuada ante. Nulla at felis ante. Donec in enim facilisis, luctus nunc in, aliquet erat. Proin ultricies dolor tortor. Aenean mollis ac elit id efficitur. Maecenas ullamcorper eget ipsum eget gravida.\n" +
            "\n" +
            "Fusce nisl nibh, congue vel orci posuere, dictum pretium leo. Pellentesque nec arcu non nisi tincidunt auctor quis a tortor. Integer malesuada quis ante ac imperdiet. In tincidunt arcu nec dolor semper hendrerit. Mauris pellentesque metus eu diam tristique, a suscipit tellus congue. Quisque ultrices quam ac consequat posuere. Sed purus nulla, aliquam vitae tempor sed, ullamcorper vel nisi. Nullam a nulla nisi. Sed dictum a mi ac rutrum.\n" +
            "\n" +
            "Fusce congue ullamcorper turpis, sit amet dapibus mi pulvinar cursus. Curabitur dapibus vitae libero sit amet iaculis. Quisque at tortor eu lorem consequat tincidunt. Proin bibendum, risus eu molestie finibus, dolor ipsum luctus massa, eu auctor ipsum justo at mi. Aliquam posuere in mauris rutrum vestibulum. Mauris pretium nisl at tristique sodales. Proin porttitor semper ex non pretium. Quisque quis sapien gravida, semper magna ac, pretium urna. Cras semper mi eget consectetur malesuada.\n" +
            "\n" +
            "Duis euismod tincidunt cursus. Pellentesque at sem tincidunt, varius erat bibendum, consequat nulla. In commodo lacus at tortor varius cursus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam gravida semper justo quis vehicula. Vivamus urna tortor, blandit eu nisi sed, scelerisque ullamcorper felis. Nullam at augue id nibh dapibus tincidunt. Curabitur ultricies arcu ligula, et molestie dolor tristique molestie. Quisque ac mollis purus. Ut tincidunt, ex eu feugiat lacinia, erat erat hendrerit enim, eu tincidunt risus mi at nisl. Donec pellentesque neque a congue ornare. Donec euismod volutpat ex. Vivamus viverra est a vulputate malesuada. Nullam convallis nibh ac tempus pharetra. Integer pharetra felis at libero fringilla convallis.\n" +
            "\n" +
            "Phasellus ut ante congue, finibus turpis ac, vulputate lorem. Quisque suscipit luctus felis. Vivamus euismod auctor augue. Aliquam vel ligula nunc. Cras ut sodales ligula, ac laoreet magna. In vel odio in sem porta tempus. Maecenas ornare, lectus nec lobortis condimentum, sem tortor rhoncus justo, sit amet sagittis mi leo viverra tortor. Praesent ac suscipit arcu. Nullam vestibulum ut lorem ut dapibus. Phasellus ac nulla aliquet metus commodo elementum ut at lorem.\n" +
            "\n" +
            "Nullam nec interdum tortor, finibus tincidunt nisi. Vestibulum vel lacus finibus, eleifend lacus ut, fringilla nisi. Morbi vehicula accumsan faucibus. Duis bibendum in orci ut ultrices. Pellentesque porta mi nec felis tristique tempus. Aliquam sed ante a nibh blandit efficitur. Praesent eget iaculis leo. Nulla imperdiet purus sit amet auctor condimentum. Fusce dapibus porttitor porta.\n" +
            "\n" +
            "Curabitur tempus a nunc a tincidunt. Aliquam vel tincidunt sapien. Aliquam interdum nisi arcu, in semper leo euismod et. Suspendisse et sodales enim. Praesent nec ex eros. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Aliquam dapibus interdum metus sed consectetur. Vivamus malesuada egestas elit, eu sollicitudin risus blandit quis. Suspendisse ornare euismod nulla, non rhoncus ligula gravida quis. Sed porta eget tellus vitae ultrices. Donec interdum consequat enim, id congue metus convallis sit amet. In diam nisi, auctor vitae felis vitae, blandit sollicitudin odio.\n" +
            "\n" +
            "Nullam vel enim id lacus convallis volutpat sed a metus. Fusce pulvinar turpis metus, sed efficitur leo blandit quis. Fusce auctor erat sit amet fermentum mattis. Proin tempor odio sit amet ante pretium luctus. Vestibulum at diam aliquet, sollicitudin lacus non, efficitur mi. Aenean quis feugiat sem. Fusce eu sapien lobortis, rhoncus diam accumsan, iaculis felis. Donec elementum vehicula consectetur. Vivamus accumsan vel magna vitae cursus. Quisque hendrerit fringilla nisl vel pharetra. Quisque ultrices nunc sem, vitae consequat elit molestie sit amet.\n" +
            "\n" +
            "Morbi ornare massa consequat nunc euismod scelerisque. Vestibulum dolor libero, maximus non lacinia sit amet, dictum nec sem. Aliquam sollicitudin arcu nibh, sit amet varius velit congue et. Nam eu hendrerit mi. Pellentesque vestibulum est in ante condimentum ornare. Maecenas vestibulum convallis nibh, eget rutrum augue commodo vel. Cras rutrum ultricies dui id ultricies. Etiam condimentum lacus ac magna finibus imperdiet.\n" +
            "\n" +
            "Quisque pretium tortor urna, ac sodales lectus auctor ac. Sed mollis sapien in nunc venenatis ultricies. Donec lacinia eget mi eleifend tempus. Fusce vel lobortis ex, vitae lobortis nulla. Nam id leo vel risus lacinia imperdiet at eget nisl. Cras rhoncus rhoncus elit, sit amet rutrum arcu mattis eget. Mauris ac consequat lacus. Proin vitae sollicitudin metus. Pellentesque non dui metus. Cras cursus gravida nisl vitae suscipit. Ut accumsan nulla id nunc pretium, vitae ultricies turpis pretium.\n" +
            "\n" +
            "Mauris non lacus tortor. Praesent porta eleifend sodales. Donec mauris lacus, commodo ut dolor ac, pretium aliquet elit. Donec ac tempor mauris, quis eleifend enim. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec malesuada sodales consequat. Morbi convallis laoreet urna, vitae euismod dui facilisis quis. Nunc non nisl luctus ligula eleifend aliquam quis eu justo. Nullam gravida nisl ac turpis fringilla mattis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Suspendisse potenti. Integer a aliquet purus. Proin fringilla felis vel nibh ultrices, sit amet porttitor dui pellentesque. Aenean nulla nisl, interdum nec accumsan non, sodales vel mauris. In vehicula, ipsum ut auctor feugiat, risus lacus pellentesque justo, nec egestas augue erat sit amet orci. Mauris id massa eu felis accumsan dapibus sit amet id quam.\n" +
            "\n" +
            "Nullam vel tempus nunc. Maecenas pretium sodales felis, id maximus ante imperdiet eget. Integer faucibus ut purus vitae tincidunt. Morbi ac dui nec ipsum feugiat mattis id at elit. Sed ac orci aliquet ipsum ultricies congue id at lectus. Donec placerat nisi leo, sed gravida neque ornare viverra. Suspendisse nec lorem vitae justo luctus varius. In at dictum sem. In porta sapien quis mattis pellentesque. Cras imperdiet placerat dui at aliquet. Interdum et malesuada fames ac ante ipsum primis in faucibus.\n" +
            "\n" +
            "Ut in mattis orci, quis elementum eros. Sed at nisl hendrerit, pellentesque velit sed, sodales ligula. Cras vel nisi sem. Suspendisse potenti. Ut gravida felis orci, sit amet elementum magna pellentesque id. Nam sed mauris sollicitudin ex scelerisque consectetur. Vestibulum accumsan dui justo, at rutrum dui vulputate in. Sed malesuada ipsum ut massa lacinia sollicitudin. Curabitur consectetur ex et purus lobortis, ac hendrerit mi gravida. Interdum et malesuada fames ac ante ipsum primis in faucibus.\n" +
            "\n" +
            "Morbi molestie ipsum a metus commodo tempus. Duis consectetur tellus dapibus, accumsan leo vulputate, accumsan augue. Vivamus in fermentum nunc. Phasellus massa ligula, porttitor vel convallis in, eleifend non arcu. Aenean finibus pulvinar nibh ut hendrerit. Morbi eget justo sagittis odio fringilla tincidunt. In vitae quam risus. Etiam et tellus non tellus condimentum condimentum. Aenean quis augue ut ex aliquam porta. Quisque rhoncus, ex non ornare accumsan, libero ligula dignissim diam, vel semper mi nulla sit amet quam. Etiam eu tincidunt ante. Maecenas venenatis sem risus. Fusce maximus, nisl congue euismod pretium, velit lacus venenatis diam, ac laoreet massa nunc sed diam. Mauris elit tortor, iaculis eu enim ac, mollis luctus tellus. Quisque pretium tempor mauris id dignissim.\n" +
            "\n" +
            "Curabitur lobortis lacinia varius. Donec congue dolor lectus, at feugiat erat feugiat at. Sed nec felis consequat, semper purus ut, mattis elit. Nam quis feugiat lacus. Integer aliquet tellus libero, vitae semper nulla porta ac. Proin tincidunt, est vel malesuada tristique, neque turpis aliquet augue, a porttitor enim ante et justo. Suspendisse consectetur vehicula risus vel sagittis. Vivamus id consectetur tortor, ac commodo enim. Nulla ut felis eget mauris sagittis ultricies. Maecenas lobortis arcu nec neque fringilla, at venenatis metus ultricies. In nec orci lobortis, scelerisque orci nec, ullamcorper orci. Nunc finibus iaculis cursus. Ut at dictum massa. Donec pulvinar ligula ut purus finibus tempus.\n" +
            "\n" +
            "Aenean dolor diam, tempor et tincidunt ut, pellentesque sed orci. Etiam auctor viverra mauris vel vehicula. Ut volutpat sed eros sit amet egestas. Vestibulum lorem libero, pretium ac lobortis sit amet, euismod id nibh. Vestibulum lobortis est varius fermentum tristique. Ut ut suscipit justo, sed molestie libero. Vestibulum aliquet et nisl et maximus. Etiam ultricies, massa nec consequat fringilla, velit risus ullamcorper dui, sit amet imperdiet sapien purus vel ipsum. Ut ac ipsum ac risus tristique tincidunt. Praesent risus metus, vehicula in scelerisque quis, molestie vitae dui. Aliquam non dolor facilisis, tincidunt nibh at, elementum nisi. Vestibulum ac molestie diam.\n" +
            "\n" +
            "Vestibulum vestibulum, augue vitae posuere gravida, arcu lacus dictum eros, id mattis turpis purus id lorem. Integer et massa vel sem fringilla placerat. Donec condimentum congue gravida. In augue libero, dapibus quis ex in, lobortis condimentum metus. Pellentesque viverra congue est, a accumsan sapien consectetur elementum. Phasellus placerat feugiat euismod. Phasellus eget commodo dolor. Sed ut elementum arcu. Sed nec blandit velit. Suspendisse eu congue lacus. Maecenas nec est at purus ultrices rutrum. Etiam ornare odio non est consectetur condimentum.\n" +
            "\n" +
            "Nullam fermentum, erat quis tempor rhoncus, elit elit cursus enim, sed efficitur nunc dolor sit amet lectus. Curabitur placerat at massa in congue. Vivamus eu est accumsan, laoreet mauris in, feugiat tortor. Duis non massa lectus. Nam porta placerat erat nec semper. Mauris vel dictum orci. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec eleifend, quam eu semper elementum, nisi mauris egestas eros, sit amet rutrum ex metus ac neque.\n" +
            "\n" +
            "Proin vel pellentesque nisl, pharetra congue sapien. Integer suscipit vel purus sagittis blandit. Cras varius erat non velit sodales pulvinar. Vivamus nec commodo velit, ut auctor lacus. Aenean ultricies dictum nisl, in fringilla sem malesuada et. Sed varius nulla id est maximus tincidunt. Aliquam sed sapien elit. Integer non rhoncus turpis.\n" +
            "\n" +
            "Pellentesque egestas, sem vitae finibus lobortis, nisl nunc euismod odio, sit amet tincidunt enim elit lacinia nibh. Morbi nec odio sapien. Phasellus id eleifend odio, a pulvinar turpis. Nam dignissim tincidunt leo, vel porta elit scelerisque a. Nunc cursus suscipit egestas. Aliquam aliquet nunc porta sapien porttitor, eu cursus ipsum dictum. In varius, ligula nec tristique aliquam, ante tellus vulputate purus, et lobortis velit dolor quis urna.\n" +
            "\n" +
            "In feugiat nibh id metus consectetur sollicitudin. Nunc lacinia, justo id dapibus sollicitudin, diam nisi lacinia arcu, a sodales nunc elit at lorem. Etiam luctus vitae metus a bibendum. Nunc aliquam dolor sit amet massa facilisis, sed pellentesque justo accumsan. Curabitur velit est, posuere vitae orci iaculis, condimentum euismod risus. Nunc in orci imperdiet, convallis eros at, sollicitudin mauris. Proin sed vestibulum justo.\n" +
            "\n" +
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur commodo eleifend mi, sed molestie erat aliquet vel. Integer metus ligula, lobortis vitae tellus non, porta fringilla mi. Integer consequat felis at pretium maximus. Curabitur tempus euismod lectus vel vulputate. Fusce molestie maximus commodo. Integer porta leo magna, et porta enim imperdiet in. Phasellus at tortor mollis, aliquam velit vel, hendrerit justo. Praesent posuere accumsan justo a eleifend. Suspendisse tincidunt sapien ligula, sit amet auctor mauris ornare ac.\n" +
            "\n" +
            "Suspendisse potenti. Vivamus ultricies imperdiet ligula nec lacinia. Morbi mattis iaculis tincidunt. Mauris blandit libero ex, sit amet maximus justo sagittis et. Nam a suscipit libero. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Phasellus dignissim at arcu ut commodo. Etiam laoreet enim vitae nibh imperdiet iaculis. Vivamus aliquam metus et sagittis euismod. Pellentesque commodo enim sapien, non tempus lectus auctor non. Pellentesque consectetur augue velit, eu tempor quam luctus a. Maecenas vitae libero tellus. Maecenas ultrices iaculis dapibus. Vivamus nulla mauris, efficitur vitae iaculis in, congue non elit. Suspendisse metus mauris, scelerisque eget tortor suscipit, tempor facilisis massa.\n" +
            "\n" +
            "Integer vitae ligula ac orci placerat volutpat. Pellentesque tempus enim at tellus rutrum, vel ultricies massa varius. Duis id pretium ipsum. Praesent ac velit id turpis convallis laoreet ac et odio. Sed et lorem maximus libero commodo aliquam sed id odio. Proin nec erat blandit, fringilla erat id, ornare nibh. Duis efficitur mauris a nisi porttitor, quis dictum arcu ultricies. In consectetur elit a eros tincidunt, at vestibulum mauris fermentum. Interdum et malesuada fames ac ante ipsum primis in faucibus. Curabitur ut orci leo. Curabitur eget augue malesuada, rhoncus orci mollis, malesuada purus. Maecenas mauris nulla, sagittis sed leo nec, condimentum fringilla nibh. Pellentesque quis leo ac enim tincidunt malesuada.\n" +
            "\n" +
            "Ut congue tortor elit. Nunc ultrices lorem a maximus commodo. Nunc maximus est non nisi placerat blandit. Vestibulum iaculis odio ut pretium sollicitudin. Nullam urna turpis, molestie nec ligula eu, sollicitudin tristique neque. Sed condimentum, sapien nec ullamcorper rutrum, nisl lacus maximus lacus, sed sagittis ipsum purus non ante. Integer luctus feugiat elit in interdum. Donec quis pretium urna.\n" +
            "\n" +
            "Aenean sed lacinia leo. Vestibulum ac nisl eget nisi feugiat pellentesque. Ut ut libero mattis, convallis nibh non, porttitor lorem. Mauris mollis fringilla est volutpat porttitor. Nunc imperdiet sapien nunc, vitae consequat elit aliquet quis. Suspendisse maximus neque nunc. Mauris sed lectus feugiat lectus ornare eleifend. Aenean velit turpis, aliquet sit amet nulla id, eleifend pellentesque dolor. Vivamus eu feugiat elit. Phasellus ac faucibus mi. Mauris vitae mollis nisl, non blandit libero.\n" +
            "\n" +
            "Praesent vitae sapien lorem. Donec consectetur mi suscipit sodales lacinia. Donec ut arcu id ipsum sollicitudin volutpat. Phasellus luctus eros nec massa lacinia sodales. Donec a ante metus. Ut rutrum malesuada ex a commodo. Proin efficitur lacus quis nunc egestas finibus. Vestibulum sollicitudin consequat condimentum. Sed tempor dui viverra rutrum imperdiet.\n" +
            "\n" +
            "Morbi iaculis turpis vitae metus luctus, nec consequat sem bibendum. Ut in condimentum augue. Aenean id quam semper, varius orci ac, rhoncus magna. Phasellus vestibulum magna eros, eu ultricies enim consectetur vel. Donec bibendum mi sed ipsum tempus, sodales mattis magna iaculis. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ornare risus nisi, ac mollis tortor malesuada eu. Mauris vitae nulla et elit molestie viverra quis ac dolor. Maecenas sit amet cursus nunc. Aliquam erat volutpat.\n" +
            "\n" +
            "Sed tempor risus vel tortor viverra interdum. Mauris luctus magna eget urna condimentum varius. Nam sed lectus a arcu efficitur eleifend et ac diam. Mauris sollicitudin finibus quam, id posuere nisi sagittis non. Donec ante turpis, imperdiet a metus a, eleifend vestibulum lorem. Integer pretium ligula at varius ullamcorper. Fusce rhoncus neque nulla, sit amet tempor magna ornare rhoncus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Suspendisse mattis est at ornare euismod. Maecenas tellus odio, pellentesque eu consectetur eu, viverra ac leo. Curabitur pharetra sed sapien eu dignissim. Proin id nunc orci.\n" +
            "\n" +
            "Duis viverra lectus est. Aliquam fringilla elit leo, et varius nisi maximus a. Nam ipsum ex, dignissim eu justo id, euismod ullamcorper elit. Phasellus viverra ornare ligula, quis pretium diam eleifend id. Aliquam luctus pretium consectetur. Vivamus et nisl ac quam condimentum viverra. Etiam vitae eros ac est rutrum varius vitae in ligula. Morbi porta varius leo, in elementum odio mattis ut. Aliquam faucibus tempus turpis, vitae rhoncus elit rhoncus ut. Praesent vel dolor ac neque viverra convallis. Donec purus ante, elementum ac dapibus id, scelerisque eu risus. Fusce cursus bibendum libero, ut ultricies augue congue quis. Aenean ut justo ac massa tincidunt imperdiet id vitae lacus.\n" +
            "\n" +
            "Maecenas ut ipsum tincidunt, accumsan turpis condimentum, posuere est. Phasellus nec ullamcorper arcu. Nunc interdum metus arcu, volutpat ullamcorper dolor rutrum et. Morbi est mauris, pretium id egestas sit amet, accumsan eu elit. Ut interdum libero ac tincidunt cursus. Aliquam erat volutpat. Integer nunc nunc, vestibulum et ipsum id, porttitor cursus turpis. Interdum et malesuada fames ac ante ipsum primis in faucibus.\n" +
            "\n" +
            "Suspendisse commodo eu magna in commodo. Vestibulum dignissim nec velit eu suscipit. Integer id libero at metus venenatis varius eget sit amet nisl. Sed ac ex ut nisl ullamcorper tempor. Etiam elit mauris, finibus at felis vitae, commodo ultrices lectus. Nulla non neque hendrerit, dapibus ligula vitae, convallis ipsum. Nam sed arcu vitae elit placerat porttitor. In ultrices ornare metus eu malesuada. In elementum mauris ultricies, convallis purus eget, fermentum diam.\n" +
            "\n" +
            "Maecenas at lacus ex. Curabitur eu porttitor nisl, ac imperdiet ante. Cras ultrices velit vitae euismod tristique. Praesent at congue turpis, nec efficitur tortor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras consectetur non nisl in auctor. Vivamus vel odio ut mi auctor consectetur in eu enim. Donec tempus pharetra malesuada. In hac habitasse platea dictumst. Vestibulum tincidunt tempus lacus, ut dignissim ex cursus quis. Suspendisse placerat vehicula pretium. Duis convallis aliquam lacus, vel finibus odio efficitur vel. Donec laoreet rutrum odio, vel facilisis diam tincidunt sit amet. Aenean commodo mattis lectus id fringilla. Nulla erat velit, posuere nec commodo dictum, rutrum non erat.\n" +
            "\n" +
            "Aliquam erat volutpat. Pellentesque tincidunt consectetur eros, a ultrices ipsum consequat a. Etiam volutpat diam erat, ac volutpat arcu fermentum eget. Ut nibh turpis, scelerisque ut odio in, bibendum varius nibh. Nulla facilisi. Interdum et malesuada fames ac ante ipsum primis in faucibus. Ut eget fermentum urna. Donec id tortor metus. Suspendisse potenti. Nullam purus nisi, congue et ligula dignissim, condimentum lobortis mi. Quisque commodo non nibh ac consectetur. Nam hendrerit pretium bibendum. Quisque ut pharetra metus. Fusce porttitor quam at semper ultricies. Sed mollis gravida metus, at fringilla mauris viverra nec. Vivamus sit amet vulputate nulla.\n" +
            "\n" +
            "Phasellus a sem dapibus, mattis felis ac, sagittis augue. Fusce quis libero rutrum, semper lectus nec, faucibus massa. Proin ex turpis, molestie ut efficitur ut, tincidunt sit amet nisl. Sed nunc tortor, fermentum nec velit id, fringilla mollis quam. Nullam ut erat nunc. Maecenas at lectus neque. Proin tincidunt bibendum dolor, non rhoncus eros cursus in. Quisque vestibulum magna nec odio tempus sollicitudin. Ut mattis sem ut dui semper, at lobortis erat eleifend. In viverra ornare sapien, a mattis orci. Maecenas orci mi, molestie non sagittis ut, viverra eu ligula. Aenean eu sodales ligula, quis finibus libero. Proin nulla ligula, luctus id scelerisque a, vestibulum non sapien.\n" +
            "\n" +
            "Praesent in dignissim sapien. Nulla a nibh laoreet, vulputate magna ac, molestie velit. Proin sed augue sem. Suspendisse euismod orci vel purus faucibus maximus. Morbi a porta dui, eu condimentum neque. Ut vel est ac mauris convallis volutpat non eget leo. Duis ultricies et nisl ac varius. In a ante luctus, ullamcorper mauris eu, blandit lorem. Nunc pharetra maximus neque, sed luctus neque eleifend eu. Phasellus dapibus suscipit dui, eu hendrerit urna laoreet quis.\n" +
            "\n" +
            "Morbi non mi libero. Cras a faucibus sapien, in eleifend leo. Pellentesque elementum tempor scelerisque. Aliquam pharetra sem eget quam sollicitudin convallis. Donec accumsan blandit erat congue mollis. Suspendisse sit amet ultrices dui, quis fermentum mauris. Morbi pharetra eros in tempor congue. Praesent pharetra ullamcorper arcu vel finibus. Etiam pellentesque elementum enim, at ullamcorper quam fringilla eleifend. Donec quis accumsan sapien. Sed vitae arcu justo. Quisque ligula erat, sodales et congue in, elementum vitae neque. Aliquam semper sodales ornare.\n" +
            "\n" +
            "Nulla a tempus turpis. Nulla porta justo a est porta feugiat. Vivamus at augue aliquam, facilisis libero at, egestas mauris. Pellentesque bibendum, urna in auctor suscipit, ante magna luctus velit, non maximus mauris dui aliquam quam. Phasellus eget metus in massa mattis efficitur a sed risus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec vitae volutpat ipsum. In bibendum luctus nisl vitae viverra. In pharetra mauris vel sagittis tempor. Fusce sit amet auctor ante. Cras id eleifend sem. In hac habitasse platea dictumst. Duis sodales nec risus eget accumsan. Nullam vel congue nunc, sit amet ornare quam.\n" +
            "\n" +
            "Aliquam vel diam mattis, venenatis metus at, accumsan purus. Suspendisse quis imperdiet massa, in sodales arcu. Integer quis lobortis leo, pharetra placerat ex. Suspendisse mi risus, maximus at nunc vitae, fringilla vulputate lacus. Donec pharetra vehicula dapibus. Phasellus porttitor lorem vel fermentum tincidunt. Duis in aliquet ligula. Ut sit amet velit rutrum, tristique tortor pulvinar, rhoncus est. Vestibulum lobortis eu elit at egestas. Mauris sodales dui nisi, tempus pulvinar nunc ultricies sed.\n" +
            "\n" +
            "Quisque nec varius elit. Vivamus tristique fermentum arcu, non lacinia turpis euismod in. Vestibulum interdum arcu eget justo ullamcorper bibendum. Suspendisse ac orci eu metus porta venenatis vel sed eros. In at interdum libero, nec volutpat dui. Suspendisse fringilla mattis enim, eget elementum ante sagittis sed. Vivamus metus ante, fermentum et pharetra et, rutrum a tellus. Nulla eleifend eros non neque cursus, in elementum neque consectetur. Duis pretium tempor arcu. Donec malesuada, magna eget elementum dignissim, mauris mi semper velit, in vehicula purus massa sit amet turpis. Maecenas pulvinar maximus dui, ac suscipit purus rhoncus euismod. Mauris porta tristique luctus. Praesent ultrices enim vel consequat interdum. Nulla in tortor sed justo congue bibendum eget at tortor.\n" +
            "\n" +
            "Proin ac lorem id justo sagittis dignissim. Integer vel viverra ex. Ut vestibulum lectus id nibh dapibus sodales. Integer ullamcorper ante eget libero volutpat laoreet. Mauris ac tincidunt nisl, ac aliquet nunc. Sed vitae ornare velit. Duis porttitor tempor vestibulum. Mauris ut mattis dui. Donec elementum faucibus condimentum. Curabitur mattis ligula ut pretium pulvinar.\n" +
            "\n" +
            "Sed risus quam, ullamcorper at mauris sed, hendrerit dignissim tellus. Maecenas sagittis imperdiet vestibulum. Etiam a mauris in enim tristique ornare. Integer tincidunt at quam ut faucibus. Curabitur vehicula sit amet est sit amet faucibus. Donec sit amet elit lectus. Donec congue pharetra tincidunt. Donec mattis facilisis est in porta. Etiam justo dolor, egestas at tortor vel, blandit eleifend est. Quisque rutrum lorem a lobortis vestibulum. Ut facilisis gravida nunc, eget dignissim eros dictum vitae. Curabitur in lorem id quam placerat maximus. Sed turpis magna, ullamcorper in tortor in, ultrices pretium felis. Duis non venenatis risus, a sodales magna. Fusce aliquam tristique mi sit amet lobortis.\n" +
            "\n" +
            "Integer quis mauris nibh. Sed tincidunt augue massa, in congue arcu sodales quis. Morbi malesuada ante arcu, nec hendrerit odio volutpat eu. Integer quis nibh ut risus facilisis euismod. Fusce sagittis semper porttitor. Etiam ac purus diam. Nullam sodales, lacus ut aliquam eleifend, tellus dui tincidunt arcu, a mattis mi purus nec arcu.\n" +
            "\n" +
            "Maecenas non luctus ex. Donec eu orci quis arcu finibus laoreet rutrum at mauris. Mauris tincidunt viverra sollicitudin. Nulla et justo arcu. Nam rhoncus nisl ultricies, interdum elit non, cursus erat. Quisque pharetra at libero sit amet mollis. Pellentesque vitae tortor nec urna fringilla luctus. Vivamus luctus, mi id varius aliquam, diam tellus dictum libero, id mattis eros metus ut sapien. Aliquam sodales dapibus diam. Nulla at leo nisi. Curabitur posuere mauris quis mi lacinia pellentesque. Donec sit amet elit arcu. Mauris blandit sed dolor vitae condimentum.\n" +
            "\n" +
            "Integer velit magna, fringilla eget lacus non, convallis consequat eros. Duis faucibus eros in risus vestibulum volutpat. Vivamus quam velit, tincidunt at pulvinar sit amet, condimentum id enim. Vestibulum auctor hendrerit ligula, nec dapibus velit consequat vel. Aliquam auctor, ligula at finibus pulvinar, augue sapien cursus purus, at aliquam libero augue nec dui. Fusce vestibulum iaculis dolor at porta. Suspendisse potenti.\n" +
            "\n" +
            "Suspendisse at lacus risus. Aenean vehicula at odio quis accumsan. Duis viverra pretium arcu, eget luctus est. Curabitur dignissim tincidunt velit nec tincidunt. Fusce rhoncus ante in placerat ullamcorper. Nam condimentum dignissim magna vel ultricies. Maecenas blandit justo vel diam vulputate condimentum. Sed sagittis, lectus sit amet accumsan commodo, ligula metus eleifend nunc, volutpat tempus sem massa sit amet libero. Vivamus luctus enim id rhoncus aliquam. Quisque iaculis sem in porta tempus. Nunc ullamcorper leo in ligula pretium fermentum. Aliquam varius, lacus id porttitor porttitor, ex libero tincidunt eros, at varius tellus elit sagittis quam.\n" +
            "\n" +
            "Mauris in lectus risus. In quis tortor sit amet arcu rhoncus faucibus dapibus ut elit. Quisque semper ipsum augue, et fringilla justo iaculis quis. Mauris purus velit, facilisis vel finibus nec, feugiat quis turpis. Etiam condimentum libero eu dictum viverra. Curabitur at porttitor tellus. Quisque efficitur nulla at turpis tristique, et cursus nunc feugiat. Vivamus mi justo, efficitur eget congue et, commodo vel est. Duis risus nisi, consequat vel dui quis, placerat gravida neque. Suspendisse orci lacus, aliquet vel malesuada vitae, laoreet id dolor.\n" +
            "\n" +
            "Aenean vel rutrum erat. Proin vulputate eget urna sagittis laoreet. Proin in placerat metus, vitae cursus odio. Duis consequat dui vel turpis lacinia, elementum malesuada magna hendrerit. Duis vitae sem nec libero efficitur vestibulum. Phasellus aliquam felis sed augue volutpat convallis. Quisque ornare ipsum vel odio efficitur gravida.\n" +
            "\n" +
            "Maecenas magna orci, cursus eu aliquam et, malesuada id ligula. Donec vulputate commodo diam. Pellentesque consequat urna non urna ultrices mattis. Cras vel arcu commodo, semper nisi a, aliquam orci. Curabitur a dignissim nisl. Maecenas sed enim tincidunt, blandit dolor a, commodo nulla. Sed efficitur ligula at orci tempus finibus. Nulla aliquam bibendum nunc, at congue est placerat vitae. Donec dignissim gravida diam quis facilisis. Duis in ipsum non odio vehicula fermentum non vitae nibh. Ut vestibulum leo fringilla dolor sodales vestibulum. Phasellus a sapien at lectus finibus faucibus. Phasellus molestie cursus massa, sit amet varius neque elementum sollicitudin. Aenean efficitur purus semper nunc maximus tempus. Interdum et malesuada fames ac ante ipsum primis in faucibus.\n" +
            "\n" +
            "Nunc porta malesuada sem at tempus. Nunc eu rhoncus lorem. Pellentesque pharetra rhoncus augue, vel imperdiet tortor pharetra a. Praesent dapibus eros et bibendum convallis. Donec dapibus fermentum sapien, sed ultrices augue. Duis tincidunt risus volutpat interdum dictum. Quisque molestie urna vel orci vehicula, quis fringilla libero pellentesque. Proin nisi dui, aliquet eu vestibulum in, pharetra pellentesque sapien. Duis cursus sem sit amet odio dignissim, a porttitor dolor pellentesque. Quisque dignissim maximus tellus, nec feugiat augue viverra quis. Mauris mi eros, posuere nec lacus sed, sodales feugiat felis. Praesent pulvinar congue ligula, vel feugiat tortor efficitur quis.\n" +
            "\n" +
            "Nullam vitae est auctor, ultricies ex vitae, tincidunt purus. Quisque convallis, ante vel ultricies commodo, sem odio pretium erat, id viverra lorem risus nec ex. Aliquam in turpis vel nisl facilisis porta ac vel dui. Nulla egestas diam nisl, ac aliquet leo egestas in. Sed accumsan cursus sollicitudin. Aliquam tincidunt arcu nec quam sodales accumsan. Vivamus in libero nulla. Donec venenatis vitae metus vel gravida. Mauris et magna ac justo interdum luctus. Fusce porttitor suscipit lorem id consectetur. Pellentesque nec arcu aliquet, consectetur quam sed, varius est. Sed ullamcorper tempor lorem nec tempus.\n" +
            "\n" +
            "Aenean efficitur vitae nibh sed egestas. Nulla in hendrerit nisl, ac consectetur nibh. Maecenas posuere nisi in congue facilisis. Quisque aliquam vulputate ex eu congue. Nullam in commodo ante. Ut finibus venenatis felis eget volutpat. Nullam molestie felis vitae dolor accumsan, id facilisis ligula vestibulum. Cras tellus ipsum, semper vitae ligula vitae, egestas dapibus nibh. Pellentesque convallis nulla massa, sit amet tempor nisi cursus at. Aenean placerat dolor eget porta tincidunt. Sed accumsan congue tristique.\n" +
            "\n" +
            "Suspendisse tempor enim ac arcu auctor tincidunt. Nunc venenatis dignissim felis, posuere tempor mauris lacinia nec. Mauris volutpat nisi non tempus condimentum. Etiam condimentum enim metus, at scelerisque nibh ullamcorper non. Etiam vitae hendrerit metus, vitae finibus erat. Pellentesque tempus eros nec volutpat scelerisque. Nulla posuere pretium justo, a malesuada velit fermentum nec. Aliquam a posuere lorem. Mauris ac accumsan diam, eu consectetur velit. Proin in velit et ante feugiat placerat. Nunc condimentum ullamcorper nisl, eget dapibus ex dignissim eget. Donec justo augue, tincidunt sit amet arcu et, dictum rutrum purus. Donec fermentum, mauris et efficitur viverra, felis felis lobortis lacus, eu convallis ante nisi ut purus. Pellentesque sed elementum neque. Sed vel diam in urna gravida rhoncus.\n" +
            "\n" +
            "Vivamus interdum odio justo, at volutpat diam faucibus eget. Etiam sed est dui. Donec imperdiet elit vitae velit commodo, in malesuada augue molestie. Nulla facilisi. Nullam quis blandit elit, sit amet efficitur arcu. Fusce felis ante, gravida volutpat efficitur vel, accumsan quis purus. Sed gravida enim vitae lectus pulvinar, sed ultricies lacus pretium. Etiam posuere ante id tempus egestas. Duis nec erat hendrerit, condimentum turpis eleifend, dapibus velit. Vestibulum lacinia consequat velit. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed tempor varius enim, quis faucibus justo ullamcorper vel.\n" +
            "\n" +
            "Suspendisse sed congue massa. Nulla interdum augue blandit ligula molestie egestas. Quisque egestas tellus sed feugiat elementum. Suspendisse ut augue id ante mollis euismod at id orci. Aenean porttitor erat mi, sit amet luctus sem ultricies nec. In eget pulvinar metus. Nam eu feugiat velit, sed finibus mi. Curabitur tincidunt est ipsum, in luctus tortor ultrices sed. Curabitur leo turpis, varius a felis vel, cursus lacinia odio. Fusce ac ultrices nisl. Nullam sodales velit quis nunc ullamcorper, ut condimentum justo sollicitudin. Vivamus nec enim vitae dui venenatis placerat iaculis ac felis. Duis ornare, sapien scelerisque malesuada aliquam, nunc urna volutpat enim, commodo volutpat tortor felis non lacus. Integer viverra et quam in vulputate. Nam a urna vestibulum mauris elementum tincidunt. Aenean finibus, arcu vel faucibus ultricies, elit augue mattis sem, at efficitur arcu nisl vitae mi.\n" +
            "\n" +
            "Pellentesque quis elementum eros, ac porttitor orci. Pellentesque vehicula a neque a iaculis. Maecenas vehicula turpis egestas lorem luctus, id hendrerit metus pulvinar. Quisque vestibulum, ligula sit amet sollicitudin rutrum, turpis nisi volutpat neque, id placerat erat massa nec massa. Donec aliquam rhoncus ipsum, at finibus neque semper at. Mauris in vehicula ex, at tempor arcu. Cras nibh augue, vehicula mollis rutrum vitae, consequat et enim. Maecenas sagittis ornare risus, nec aliquam elit tempus quis. Aliquam erat volutpat. Praesent eu congue metus. Quisque ullamcorper ultricies molestie.\n" +
            "\n" +
            "Praesent faucibus urna vitae ipsum posuere, at fringilla enim suscipit. Nam nec interdum lacus. Donec dictum purus eget tortor faucibus, et tincidunt felis viverra. Nullam posuere dictum lectus, eu fermentum sapien placerat id. Donec non elit sed urna varius accumsan. Aliquam tincidunt dignissim magna in vestibulum. Suspendisse fringilla ex nec sapien dapibus, id consequat dui ultrices. Morbi pretium a ex vel auctor. Vivamus nisl augue, lacinia sit amet tellus eu, condimentum dignissim lectus. Sed tincidunt congue sodales. Curabitur sagittis sodales erat at commodo. Curabitur ligula arcu, tincidunt et vestibulum a, scelerisque et nunc.\n" +
            "\n" +
            "Vestibulum mattis enim quis mi dapibus, sit amet imperdiet lectus viverra. Curabitur eu justo et mi vehicula tempus. Aenean sem nulla, placerat sed ornare a, commodo ut neque. Vestibulum quis tincidunt elit. Proin quis nunc gravida, aliquam magna sed, sollicitudin metus. Etiam hendrerit maximus dolor, sit amet fermentum ligula eleifend vel. Mauris vehicula gravida neque, ut pellentesque tortor posuere ut. Etiam ut dui elit. Nam et erat pretium, rutrum orci et, lacinia lorem. Nunc vitae tortor molestie, congue mi nec, tempus nulla. Sed molestie arcu pellentesque, tincidunt eros sit amet, semper ipsum. Fusce euismod facilisis velit ac tincidunt. Phasellus vitae nunc sit amet lorem aliquet placerat ut a diam.\n" +
            "\n" +
            "Donec commodo tristique odio eu efficitur. Nam hendrerit tortor nec ex iaculis, pharetra gravida ligula fringilla. Phasellus ut pellentesque ipsum. Mauris ipsum augue, rhoncus et tellus lobortis, euismod rutrum est. Duis id augue magna. In ornare velit id est vehicula commodo. Sed eleifend magna vitae sem pellentesque, at ultrices metus lacinia.\n" +
            "\n" +
            "Sed massa risus, consequat eu lorem eleifend, luctus suscipit tellus. Maecenas convallis mauris justo, vel feugiat augue laoreet sit amet. Duis convallis purus lectus, et varius dolor volutpat eu. Nam a arcu in est tincidunt blandit. Nunc scelerisque sem vitae lorem condimentum maximus eu vel diam. Curabitur hendrerit lorem eu augue posuere, eu interdum velit elementum. Fusce consequat urna id arcu porttitor, at semper nisl ultricies. Mauris tincidunt magna sit amet tellus sagittis molestie. Mauris ultricies augue sit amet dolor luctus, in finibus dolor sagittis.\n" +
            "\n" +
            "Donec eget nisl sit amet sem varius ornare. Fusce sit amet porttitor nulla. Nam iaculis turpis faucibus ex ullamcorper tempor. Suspendisse id est vel tellus faucibus gravida id et magna. Aenean facilisis mauris eget sapien rutrum fermentum. Nunc bibendum ultricies aliquet. Suspendisse viverra odio mauris. Suspendisse potenti. Quisque non neque leo. Duis sed malesuada mauris, eu fermentum urna. Morbi a velit tempus libero eleifend bibendum.\n" +
            "\n" +
            "Cras erat orci, ornare vel urna sed, gravida porta tellus. Nunc a neque odio. Morbi ligula justo, tincidunt a tempus ac, mattis nec diam. Sed feugiat ligula nec ultricies tincidunt. Quisque ac urna eget augue efficitur tempus vehicula eu purus. Fusce enim odio, porta sed vestibulum rutrum, maximus vel eros. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed a nulla metus. Suspendisse placerat ac arcu et fringilla. Suspendisse vitae scelerisque quam, a dapibus nunc. Integer facilisis sed justo sit amet scelerisque. Donec venenatis venenatis faucibus. Nullam lorem nulla, varius eget elit quis, elementum mattis tortor.\n" +
            "\n" +
            "Quisque sodales leo commodo elit lobortis, eget malesuada tellus mollis. Proin aliquet lobortis erat, sit amet consectetur magna. Fusce vel nisl dui. Donec sit amet fringilla leo, placerat fermentum lacus. Aliquam interdum felis non leo pretium, vel euismod lorem scelerisque. Aliquam ac quam augue. Cras eu neque lectus. Pellentesque id nisi neque.\n" +
            "\n" +
            "Pellentesque ullamcorper, augue quis mollis sollicitudin, urna orci rutrum sapien, sed porta eros metus vel purus. Pellentesque sodales aliquam turpis, non sagittis ligula rutrum a. Maecenas id nisl augue. Praesent ut felis ac dolor porttitor dignissim vitae ut lectus. Duis quis ligula varius, rutrum leo vel, vulputate neque. Nullam volutpat, elit sit amet consectetur dictum, massa ligula elementum quam, in hendrerit metus nisi in lectus. Maecenas eu tortor sed erat vehicula posuere. Pellentesque sollicitudin pretium neque, et convallis risus ultrices ut. Vestibulum quam erat, euismod quis laoreet sit amet, egestas sit amet enim. Phasellus ut est justo. Proin tempus metus sit amet quam varius mattis. Praesent vulputate et nulla sodales varius.\n" +
            "\n" +
            "Curabitur tempor, mauris et euismod convallis, ante neque commodo justo, vitae consectetur lacus dolor quis sapien. Donec non ipsum sapien. Morbi egestas auctor diam, vitae ornare sem facilisis vel. Nulla eget eleifend erat, ut lobortis lacus. Integer sed volutpat orci, non elementum leo. Proin iaculis sapien mauris, pellentesque rhoncus risus luctus ut. Praesent sit amet ornare nisl, hendrerit pellentesque magna. Proin odio tortor, consequat eu fermentum id, scelerisque vitae augue. Aenean non augue in leo pulvinar imperdiet et hendrerit felis. In quis nisl vitae lacus vehicula lobortis ut id augue. Morbi laoreet ante lorem, et rhoncus lectus finibus at. Vivamus vestibulum mauris vel tortor molestie, nec interdum est dignissim. Suspendisse gravida tristique arcu, non scelerisque libero dictum sit amet. Integer ut tempus nunc, ut hendrerit mauris. Morbi luctus leo ac pretium consequat.\n" +
            "\n" +
            "Nullam viverra dui non velit pretium, sit amet ultrices odio facilisis. Maecenas a libero a enim vulputate cursus. Vestibulum a turpis id neque viverra mollis in in ex. Vestibulum placerat vitae lorem a rhoncus. In hac habitasse platea dictumst. Integer efficitur ex non massa pretium ornare. Integer eu rhoncus erat. Donec nec nisi volutpat, interdum purus nec, laoreet nibh.\n" +
            "\n" +
            "Aliquam tempor urna vel enim feugiat aliquet. Mauris ac dui mauris. Etiam pharetra dolor eu ornare maximus. Sed tincidunt id mi ut imperdiet. Sed condimentum cursus suscipit. Praesent sollicitudin elit in augue sollicitudin, non pellentesque orci laoreet. Ut vitae orci malesuada, scelerisque libero id, pellentesque dolor. Suspendisse feugiat lectus vitae aliquam vehicula. Vivamus in lorem arcu.\n" +
            "\n" +
            "Proin volutpat lacinia mi, eu eleifend sapien. Mauris eu ligula at nibh fringilla pretium vel sed sem. Integer sodales mauris non lorem egestas, consectetur imperdiet lorem ornare. Nulla a sagittis diam. Sed rhoncus ultrices tincidunt. Mauris dapibus tellus dui, eu feugiat nisl bibendum at. Mauris tempus at diam dictum placerat. Morbi facilisis nisi eget dictum pulvinar. Pellentesque scelerisque consectetur nibh, quis eleifend est condimentum porta. Sed eu leo eu massa interdum vestibulum ac iaculis tellus. Ut commodo aliquam pretium. Nam vehicula, magna a fermentum finibus, massa turpis imperdiet nisi, sed fringilla quam nisi sit amet lorem. Quisque ornare, sapien at elementum consequat, enim nibh sollicitudin urna, quis commodo sapien enim tincidunt elit. Praesent eget odio laoreet felis aliquam ultricies.\n" +
            "\n" +
            "In lacinia est et est elementum congue. Curabitur placerat hendrerit dapibus. Nullam ut facilisis magna. Vivamus sollicitudin in magna eu rutrum. Cras ultricies elit turpis, quis porttitor libero euismod non. Pellentesque nec nibh quis turpis maximus lobortis. In nec scelerisque lorem. Mauris in facilisis nisl. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec consequat congue eros vel pulvinar. Integer consectetur commodo faucibus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed metus ex, euismod in pharetra non, posuere at sem. Morbi ultrices placerat ligula, eu scelerisque risus semper non.\n" +
            "\n" +
            "Integer congue eros nulla, ac auctor ipsum dignissim eget. In venenatis tellus at blandit posuere. Suspendisse laoreet posuere justo. Quisque volutpat sed diam vitae sollicitudin. Praesent in viverra mauris. Ut eu nulla ac ex condimentum venenatis. Sed iaculis nibh a nulla congue, id fringilla mi pulvinar. Donec ornare mauris quis rutrum venenatis.\n" +
            "\n" +
            "Nulla eget diam quis quam posuere efficitur. Aliquam sit amet lobortis turpis, eget scelerisque nibh. Donec auctor tempor tortor nec cursus. Aenean est nulla, faucibus sed rutrum id, pellentesque sit amet ligula. Mauris ac tortor mattis, mollis dui vitae, consectetur nisl. Aenean sagittis nibh ac malesuada feugiat. Mauris nisl libero, imperdiet ut rhoncus et, condimentum nec lorem. Maecenas dapibus lacinia massa, ornare imperdiet purus ornare vel. Nam eget dignissim dolor.\n" +
            "\n" +
            "Aenean tincidunt consequat ultrices. Pellentesque ante sem, ultricies a rhoncus nec, feugiat placerat risus. Mauris ante velit, vestibulum et tincidunt id, ultrices ac metus. Praesent nec odio ante. Quisque laoreet lacus sit amet ullamcorper pellentesque. Vestibulum at euismod diam. Nullam quis ultrices quam. Nulla molestie tortor id convallis bibendum.\n" +
            "\n" +
            "Nunc euismod lorem vitae elit lobortis finibus. Cras sit amet arcu massa. Quisque sit amet diam ante. Aliquam posuere, ipsum ut dignissim dignissim, eros ante commodo odio, nec placerat odio ipsum vel metus. Donec vehicula pretium augue, blandit convallis leo volutpat eu. Etiam malesuada blandit libero ac varius. Aenean suscipit felis viverra, pellentesque ipsum vitae, imperdiet dolor. Maecenas turpis dolor, iaculis a nisi at, posuere sollicitudin quam. Aenean rhoncus felis ac libero venenatis, ac condimentum odio aliquet. Quisque et mauris congue, eleifend turpis mattis, iaculis nibh. Aliquam at lacus ex. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris finibus, nibh vitae elementum convallis, elit risus pellentesque ante, sed laoreet sapien mauris non turpis. Maecenas vitae augue volutpat, semper sapien eget, rutrum metus. Sed molestie vel tortor in pharetra. Integer quis dui vehicula, sollicitudin turpis euismod, semper ipsum.\n" +
            "\n" +
            "Maecenas iaculis purus et nisl pretium, malesuada varius purus viverra. Nullam dignissim viverra mi sit amet suscipit. Vivamus sodales magna sed fermentum auctor. Aliquam urna quam, porta sit amet iaculis tincidunt, congue eu urna. Nulla luctus vitae nisi ac aliquet. Nulla facilisi. Suspendisse semper vel quam vel laoreet. Quisque nisl metus, venenatis a lectus aliquam, bibendum suscipit lectus. Vestibulum id diam vestibulum risus efficitur elementum at vitae metus. Integer vel nisi vestibulum, vulputate lacus eget, dapibus arcu. Nulla dapibus fermentum odio nec scelerisque. Nam volutpat porta nisi.\n" +
            "\n" +
            "Phasellus vitae odio eget risus vehicula condimentum non ac sapien. Etiam iaculis lacinia mi in sollicitudin. Nulla vel velit lectus. Curabitur bibendum tellus vel lectus rutrum faucibus ut vel tortor. Praesent ac orci eu nunc imperdiet lacinia ut quis lorem. Curabitur tincidunt libero dolor, ut scelerisque dolor feugiat ut. Maecenas eget nibh est. Integer ac dapibus tortor, ac maximus magna. Donec lacinia laoreet mattis. Nullam ullamcorper, ex id eleifend sodales, eros orci posuere sapien, sed facilisis massa lacus ac eros. Vestibulum scelerisque facilisis accumsan. Aenean nec laoreet augue. Morbi varius arcu in mi lacinia fermentum.\n" +
            "\n" +
            "Cras nibh sem, vestibulum eu justo in, tempus posuere nulla. Maecenas sit amet tortor a sem bibendum vehicula. Proin congue, metus in bibendum interdum, ligula elit hendrerit ex, et ornare neque orci rutrum erat. Curabitur convallis, ligula ut porta vehicula, arcu lectus faucibus sapien, vitae facilisis libero nulla at ipsum. Quisque sit amet tortor tellus. Vivamus sollicitudin mauris nec elit elementum, et finibus augue lobortis. Maecenas ut nibh non lorem porttitor elementum. Sed ac laoreet massa. Curabitur vitae viverra purus, et consectetur massa. In varius est arcu, et efficitur velit suscipit pellentesque. Mauris nec sollicitudin nunc. Morbi nec mauris risus. Morbi tincidunt eros et leo pellentesque, a ultricies dolor pretium. Donec efficitur a est eu bibendum.\n" +
            "\n");


    //Set Values
    static public short smin = Short.MIN_VALUE;
    static public short smax = Short.MAX_VALUE;
    static public int imin = Integer.MIN_VALUE;
    static public int imax = Integer.MAX_VALUE;
    static public long lmin = Long.MIN_VALUE;
    static public long lmax = Long.MAX_VALUE;
    static public float fmin = Float.MIN_VALUE;
    static public float fmax = Float.MIN_VALUE;
    static public double dmin = Double.MIN_VALUE;
    static public double dmax = Double.MAX_VALUE;
    static public byte bmin = -128;

    static public byte bmax = 127;

    static public char cmin = '\u0000';

    static public char cmax = '\uffff';

    //Limits : boolean true/false - this one doesnt make much sense but anyways
    static public boolean bomin = false;
    static public boolean bomax = true;

    static public String stmin = IamBigString.substring(0, 1);
    static public String stmax = IamBigString;
    static public String stMix = "A&^%HQ p8oy 3t98 8pNEF9";
    static public String stSmallMin = IamBigString.toLowerCase().substring(0, 1);
    static public String stSymbols = "!@#$%^&*()(*&^%$#@:{}:>/\\/[]{},./<>?";
    static public String stescapeSequence = "\\\r\t\f\'\b\n";
    static public String stUTF;

    static {
        try {
            stUTF = new String(stMix.getBytes(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    //Array Size
    public static int ArraySize = 800;// Default
    //String size
    public static int StringSize = 1024;// Default

    public static byte[] ab = new byte[ArraySize];
    public static byte[][] abb = new byte[ArraySize][ArraySize];
    ;
    public static short[] as = new short[ArraySize];//{smax,smin};
    public static short[][] ass = new short[ArraySize][ArraySize];//{smax,smin};
    public static int[] ai = new int[ArraySize];

    public static int[][] aii = new int[ArraySize][ArraySize];//{imax,imin};
    public static long[] al = new long[ArraySize]; //{lmax,lmin};
    public static long[][] all = new long[ArraySize][ArraySize];
    public static float[] af = new float[ArraySize];
    ;
    public static float[][] aff = new float[ArraySize][ArraySize];
    public static double[] ad = new double[ArraySize];//{dmax,dmin};
    public static double[][] add = new double[ArraySize][ArraySize];
    ;
    public static boolean[] abo = new boolean[ArraySize];//{bomax,bomin}
    public static boolean[][] aboo = new boolean[ArraySize][ArraySize];//{bomax,bomin};
    public static char[] ac = new char[ArraySize];//{cmax,cmin};
    public static char[][] acc = new char[ArraySize][ArraySize];//{cmax,cmin};
    public static String[] ast = new String[ArraySize];//{stmin,stmax};
    public static String[][] astt = new String[ArraySize][ArraySize];//{stmin,stmax};
}
