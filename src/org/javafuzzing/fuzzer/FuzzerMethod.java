package org.javafuzzing.fuzzer;

import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.math.BigInteger;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public class FuzzerMethod {

    private static int testLength;

    public static int etternalLoop = 0;
    public static int Exceed = 0;
    //Global Overflowing Data
    public static int ExceedInt = 0;// Integer.MAX_VALUE;
    public static double ExceedDouble = 0;// Double.MAX_VALUE;
    public static float ExceedFloat = 0;// Float.MAX_VALUE;
    public static short ExceedShort = 0;// Short.MAX_VALUE;
    public static long ExceedLong = 0;// Short.MAX_VALUE;
    //Recursion
    public static int Recursion = 23;// Default

    /**
     * Creates a new instance of edu.cmu.iot.org.javafuzzing.fuzzer.FuzzerMethod
     */
    public FuzzerMethod() {
    }

    /**
     * @param args the command line arguments
     */

    //Static Values Init 

    //String starting text
    public static String Start = "";
    //Methods Attack
    public static int attackMethods = 0;
    //Enumerate Constant's position
    public static int oo = 0;
    //Enforced Constant
    public static Object pp = null;
    //Create edu.cmu.iot.org.javafuzzing.fuzzer.Helper class
    public static Helper help = new Helper();
    //MAX or MIN Values
    public static String limit = "";
    //Filter Out - IgnoreMethod
    public static String[] im;
    //Filter In - Fuzz only these methods
    public static String[] nim;
    //Check Filter-in and Filter-out
    public static int checkFI = 0;
    public static int checkFO = 0;
    //Attack and Construct Abstracts
    public static int ANCA = 0;
    //Replace Class ArrayLists
    public static ArrayList findThisClass = new ArrayList();
    public static ArrayList replaceItWithThisClass = new ArrayList();
    //Collect all interfaces and Abstracts
    public static String InterfacesAndAbstracts = "";
    //Auto Break
    public static int AutoBreak = 0;
    //String Global

    public static int exceptionsThrown = 0;
    public static HashMap<Results, Integer> results = new HashMap<>();
    public static String ff = "", ee = "", cc = "", ss = "", ii = "";
    public static int vv = 0, rr = 0;

    public static Map<Results, Integer> Fuzz(String className, Integer testNumber) {
        cc = className;
        testLength = testNumber;
        initialize();
        results.put(Results.NUMBER_OF_TESTS, testNumber);
        results.put(Results.FAILED_TESTS, exceptionsThrown);
        return results;
    }

    public static void initialize() {

        //initialise variables

        vv= 1;
        if (ee.equals("int")) {
            ExceedInt = Integer.MAX_VALUE;
        } else if (ee.equals("double")) {
            ExceedDouble = Double.MAX_VALUE;
        } else if (ee.equals("float")) {
            ExceedFloat = Float.MAX_VALUE;
        } else if (ee.equals("short")) {
            ExceedShort = Short.MAX_VALUE;
        } else if (ee.equals("long")) {
            ExceedLong = Long.MAX_VALUE;
        }

        if ((!ff.equals("") && !cc.equals("")) || (ff.equals("") && cc.equals("")) || (checkFI != 0 && checkFO != 0)) {
            usage();
        } else {

            if (!cc.equals("")) {
                try {
                    summarize(cc, vv);

                    if (vv == 1 && (!InterfacesAndAbstracts.equals(""))) {
                        System.out.println("\n************************");
                        System.out.println("The following classes may not have been instantiated");
                        System.out.println("************************\n\nTry replacing classes with -g");
                        System.out.println(InterfacesAndAbstracts + "\n");
                    }

                } catch (Exception ex) {
                    usage();
                    System.out.println("+Invalid Class");
                }
            } else if (!ff.equals("")) {
                try {
                    recursiveAttack(ff, vv);

                    if (vv == 1 && (!InterfacesAndAbstracts.equals(""))) {
                        System.out.println("\n************************");
                        System.out.println("The following classes may not have been instantiated");
                        System.out.println("************************\n\nTry replacing classes with -g");
                        System.out.println(InterfacesAndAbstracts + "\n");
                    }

                } catch (Exception ex) {
                    usage();
                    System.out.println("+Classes File ERROR");
                }
            }
        }
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String[] argv = args;
        cc = args[0];
        testLength = Integer.valueOf(args[1]);
        initialize();
        System.exit(1);
    }


    public static Object Constant = null;
    public static int enumerateConstant = 1;

    public static void summarize(String className, int v)

    {
        try {
            Exceed = 1;
            Class cls = null;
            try {
                cls = Class.forName(className);
            } catch (Error e) {
                System.out.println(e);
            }
            if (pp == null) {
                Constant = help.returnConsant(cls);
            } else {
                Constant = pp;
            }

            if (Constant != null) {
                System.out.println("\nNOTE: This class takes Constant values. Try -o flag\n");
            }
            //Check if we have interface
            if (cls.isInterface()) {
                System.out.println("\n* " + cls.getName() + " is an Interface");


            }

            if (Modifier.isAbstract(cls.getModifiers())) {
                System.out.println("\n* " + cls.getName() + ": Is an Abstract\n");

            }


            Constructor[] a = cls.getConstructors();
            Object[] args;
            System.out.println("--------------------------------------");
            int previousException = 0;
            exceptionsThrown = 0;
            for (int f = 0; f < a.length; f++) {
                previousException = exceptionsThrown;
                Class[] ff = a[f].getParameterTypes();
                Class[] types = ff;
                System.out.print("Constructor -> \t" + a[f].getName() + "\nTypes -> \t(");

                for (int k = 0; k < ff.length; k++) {
                    System.out.print(" " + ff[k].getName());
                }
                System.out.print(" )\n");
                System.out.println("Invoke -> \t" + className);
                Constructor cons = cls.getConstructor(types);
                for (int i = 0; i < testLength; i++) {
                    //High Values - No Methods
                    etternalLoop = 0;
                    if (limit.equals("high") | limit.equals("")) {
                        args = slapObject(ff, i, Exceed);
                        System.out.print("\n[MAX] Status -> \t");
                        help.BeefConstructor(cons, args, Constant, v, oo);
                        System.out.print("\n");
                    }
//                    //Low Values - No Methods
//                    if (limit.equals("low") | limit.equals("")) {
//                        args = slapObject(ff, 0, Exceed);
//                        System.out.print("[MIN] Status -> \t");
//                        help.BeefConstructor(cons, args, Constant, v, oo);
//                        System.out.print("\n");
//                    }
                    //Method Attack
                    if (attackMethods == 1) {
                        //Hi Values
                        if (limit.equals("high") | limit.equals("")) {
                            args = slapObject(ff, 1, Exceed);
                            methodSlap(a[f], cls, args, 1, v);
                        }
                        //Low Values
                        if (limit.equals("low") | limit.equals("")) {
                            args = slapObject(ff, 0, Exceed);
                            methodSlap(a[f], cls, args, 0, v);
                        }
                    }
                }


                System.out.println("--------------------------------------");
                System.out.println("#############TEST RESULT##############");
                System.out.println("Number of tests:\t" + testLength + "\nNumber of failures:\t" + (exceptionsThrown - previousException));
                System.out.println("######################################");
                System.out.println("--------------------------------------");


            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void DoIt(Constructor cons, Object[] args, int v) {
        try {
            cons.newInstance(args);
            System.out.print(" No Problem\n");
        } catch (Exception e) {
            exceptionsThrown++;
            if (v == 1) {
                System.out.print("Exception(" + e.getCause() + ")\n");
            } else {
                System.out.print("Exception\n");
            }
        }
    }

    public static void DoIt(Constructor cons, int v) {
        try {
            cons.newInstance();
            System.out.print(" No Problem\n");
        } catch (Exception e) {
            exceptionsThrown++;
            if (v == 1) {
                System.out.print("Exception(" + e.getCause() + ")\n");
            } else {
                System.out.print("Exception\n");
            }
        }
    }


    //Expand Methods and throw Slaped Objects in
    public static void methodSlap(Constructor cs, Class cls, Object[] args, int hilo, int v) {
        try {
            Method[] allMethods = cls.getDeclaredMethods();
            String hilow;
            System.out.println("\n~~ Methods Fuzzing ~~");

            Object tmpCLS = help.returnConsant(cls);
            if (pp != null) {
                tmpCLS = pp;
            }

            for (int a = 0; a < allMethods.length; a++) {
                Class[] cc = allMethods[a].getParameterTypes();
                etternalLoop = 0;
                Object[] MethodArgs = slapObject(cc, hilo, Exceed);

                int Justincase = 0;
                if (checkFO == 1) {
                    try {

                        for (int checkIgnore = 0; checkIgnore < im.length; checkIgnore++) {
                            if (allMethods[a].getName().equals(im[checkIgnore])) {
                                Justincase = 1;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } else if (checkFI == 1) {
                    try {

                        for (int checkIgnore = 0; checkIgnore < nim.length; checkIgnore++) {
                            if (!allMethods[a].getName().equals(nim[checkIgnore])) {
                                Justincase = 1;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }


                if (Justincase == 1) {
                    if (checkFI == 0)
                        System.out.print("\nMethod -> \t" + allMethods[a].getName() + " [" + cls.getName() + "]: -=IGNORED=-\n");
                } else {
                    System.out.print("\nMethod -> \t" + allMethods[a].getName() + " [" + cls.getName() + "]\nTypes -> \t(");
                    for (int k = 0; k < cc.length; k++) {
                        System.out.print(" " + cc[k].getName());
                    }
                    System.out.print(" )\n");
                    help.BeefConstructor(cs, args, allMethods[a], tmpCLS, MethodArgs, v, oo);
                }


            }
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~");
        } catch (Exception e) {
            System.out.println(e);
        }

    }


    public static Object[] slapObject(Class[] cls, int hilow, int E) {
        etternalLoop++;
        ;
        Object[] list = new Object[cls.length];
        String ArrayOfOtherStuff = "";
        try {
            E = 0;
            for (int k = 0; k < cls.length; k++) {
                String current = cls[k].getName();
                boolean max = false;
                if (hilow == 1) {
                    max = true;
                }
                if (current.equals("int")) {
                    if (max) {
                        list[k] = (Constants.imax + ExceedInt);
                    } else {
                        list[k] = Constants.imin - (ExceedInt);
                    }
                } else if (current.equals("[I")) {
                    list[k] = Constants.ai;
                } else if (current.equals("[[I")) {
                    list[k] = Constants.aii;
                } else if (current.equals("char")) {
                    if (max) {
                        list[k] = Constants.cmax;
                    } else {
                        list[k] = Constants.cmin;
                    }
                } else if (current.equals("[C")) {
                    list[k] = Constants.ac;
                } else if (current.equals("[[C")) {
                    list[k] = Constants.acc;
                } else if (current.equals("float")) {
                    if (max) {
                        list[k] = Constants.fmax + ExceedFloat;
                    } else {
                        list[k] = Constants.fmin - (ExceedFloat);
                    }
                } else if (current.equals("[F")) {
                    list[k] = Constants.af;
                } else if (current.equals("[[F")) {
                    list[k] = Constants.aff;
                } else if (current.equals("short")) {
                    if (max) {
                        list[k] = Constants.smax + ExceedShort;
                    } else {
                        list[k] = Constants.smin - (ExceedShort);
                    }
                } else if (current.equals("[S")) {
                    list[k] = Constants.as;
                } else if (current.equals("[[S")) {
                    list[k] = Constants.ass;
                } else if (current.equals("boolean")) {
                    if (max) {
                        list[k] = Constants.bomax;
                    } else {
                        list[k] = Constants.bomin;
                    }
                } else if (current.equals("[Z")) {
                    list[k] = Constants.abo;
                } else if (current.equals("[[Z")) {
                    list[k] = Constants.aboo;
                } else if (current.equals("double")) {
                    if (max) {
                        list[k] = Constants.dmax + ExceedDouble;
                    } else {
                        list[k] = Constants.dmin - (ExceedDouble);
                    }
                } else if (current.equals("[D")) {
                    list[k] = Constants.ad;
                } else if (current.equals("[[D")) {
                    list[k] = Constants.add;
                } else if (current.equals("long")) {
                    if (max) {
                        list[k] = Constants.lmax + ExceedLong;
                    } else {
                        list[k] = Constants.lmin - (ExceedLong);
                    }
                } else if (current.equals("[J")) {
                    list[k] = Constants.al;
                } else if (current.equals("[[J")) {
                    list[k] = Constants.all;
                } else if (current.equals("byte")) {
                    if (max) {
                        list[k] = Constants.bmax;
                    } else {
                        list[k] = Constants.bmin;
                    }
                } else if (current.equals("[B")) {
                    list[k] = Constants.ab;
                } else if (current.equals("[[B")) {
                    list[k] = Constants.abb;
                } else if (current.equals("java.lang.String")) {
                    switch (hilow) {
                        case 0:
                            list[k] = Constants.stmax;
                            break;
                        case 1:
                            list[k] = Constants.stmin;
                            break;
                        case 2:
                            list[k] = Constants.stSmallMax;
                            break;
                        case 3:
                            list[k] = Constants.stSymbols;
                            break;
                        case 4:
                            list[k] = Constants.stUTF;
                            break;
                        case 5:
                            list[k] = "";
                            break;
                        case 6:
                            list[k] = new String("تعطي يونيكود رقما فريدا لكل حرف".getBytes(), "UTF-8");
                            break;
                        case 7:
                            list[k] = "\u062a\u0639\u0637\u064a \u064a\u0648\u0646\u064a\u0643\u0648\u062f \u0631\u0642\u0645\u0627 \u0641\u0631\u064a\u062f\u0627 \u0644\u0643\u0644 \u062d\u0631\u0641";
                            break;
                        case 8:
                            list[k] = Constants.stescapeSequence;
                            break;
                        case 9:
                            list[k] = "0123456789234768346671234768123476823476823476823417682347681234768123476812345768345762356023689235760";
                            break;
                        case 10:
                            list[k] = null;
                            break;
                        default:
                            if (hilow % 2 == 0) {
                                list[k] = UUID.randomUUID().toString();
                            } else {
                                SecureRandom random = new SecureRandom();
                                list[k] = new BigInteger(500, random).toString(32);
                            }
                    }
                } else if (current.equals("[Ljava/lang/String")) {
                    list[k] = Constants.ast;
                } else if (current.equals("[[Ljava/lang/String")) {
                    list[k] = Constants.astt;
                } else if (current.indexOf("[L") != -1 && current.indexOf(";") != -1) {
                    list[k] = Array.newInstance(Class.forName(current.substring(2, current.length() - 1)), Constants.ArraySize);
                }
                //Construct - Uknown Object
                else {

                    try {
                        Class clsa = Class.forName(current);

                        //Replace abstract with a constructor that can implement it
                        if (ANCA == 1) {

                            for (int lookThroughAndCheck = 0; lookThroughAndCheck < findThisClass.size(); lookThroughAndCheck++) {
                                if (findThisClass.get(lookThroughAndCheck).equals(clsa.getName())) {
                                    clsa = Class.forName("" + replaceItWithThisClass.get(lookThroughAndCheck));
                                }
                            }


                        }

                        if (AutoBreak == 1) {
                            if (clsa.isInterface()) {
                                clsa = Class.forName(findSubclass(clsa.getName(), "FindSubs.txt"));
                            }
                            if (Modifier.isAbstract(clsa.getModifiers())) {
                                clsa = Class.forName(findSupers(clsa.getName(), "FindSubs.txt"));
                            }
                        }

                        if (clsa.isInterface()) {

                            if (InterfacesAndAbstracts.indexOf(clsa.getName() + " is an Interface") == -1) {
                                InterfacesAndAbstracts = InterfacesAndAbstracts + "\n* " + clsa.getName() + " is an Interface";
                            }
                        }


                        if (Modifier.isAbstract(clsa.getModifiers())) {

                            if (InterfacesAndAbstracts.indexOf(clsa.getName() + " is an Abstract") == -1)
                                InterfacesAndAbstracts = InterfacesAndAbstracts + "\n* " + clsa.getName() + " is an Abstract";
                        }

                        Object Constant1 = help.returnConsant(clsa);

                        if (pp != null) {
                            Constant1 = pp;
                        }

                        Constructor[] a = clsa.getConstructors();
                        Object[] args;
                        int check = 0;
                        for (int f = 0; f < a.length; f++) {
                            Class[] ff = a[f].getParameterTypes();
                            Constructor cons = clsa.getConstructor(ff);
                            if (etternalLoop < Recursion) {
                                args = slapObject(ff, 1, 0);
                            } else {
                                System.out.println("\n****Infinite Loop detected (use -r)****");
                                args = null;
                            }

                            if (args.length > 0) {
                                for (int h = 0; h < args.length; h++) {
                                    Object[] tmpr = new Object[args.length];
                                    for (int p = 0; p < args.length; p++) {
                                        tmpr[p] = args[p];
                                    }
                                    //Show Submitted Values
                                    System.out.print("\nSubmit Values - Sub-constructor (" + clsa.getName() + "):\n\t ");
                                    if (h > 0) {
                                        tmpr[h - 1] = pp;
                                    }
                                    for (int display = 0; display < args.length; display++) {
                                        System.out.print(tmpr[display] + " ");
                                    }
                                    try {
                                        list[k] = cons.newInstance(tmpr);
                                        System.out.print(":No Problem\n");
                                        check = 1;
                                        break;
                                    } catch (Exception e) {
                                        exceptionsThrown++;
                                        System.out.print("" + e.getCause());
                                        try {
                                            list[k] = cons.newInstance(args);
                                            System.out.print(":No Problem\n");
                                            check = 1;
                                            break;
                                        } catch (Exception ea) {
                                            exceptionsThrown++;
                                            System.out.println(ea);
                                        }
                                    }
                                }
                            } else {
                                try {
                                    list[k] = cons.newInstance();
                                    check = 1;
                                    break;
                                } catch (Exception e) {
                                    System.out.println(e);
                                    list[k] = null;
                                    break;
                                }
                            }

                            if (check == 1) {
                                break;
                            }
                        }

                        if (check != 1) {
                            list[k] = null;
                        }

                    } catch (Exception e) {
                        System.out.println("hat?" + e);
                    }


                }//Major ELSE

            }

            return list;
        } catch (Exception e) {/*Not able to construct types*/ }
        return list;
    }


    static String BigString(String str, int size) {
        String tmp = "";
        for (int a = 0; a < size; a++) {
            tmp = tmp + str;
        }
        return tmp;
    }


    public static String findSubclass(String Pclass, String FileName) {
        String subClass = "", tryS = "";
        try {
            InputStream fstream = (FuzzerMethod.class.getResourceAsStream(FileName));
            DataInputStream in = new DataInputStream(fstream);
            while (in.available() != 0) {
                try {
                    tryS = in.readLine();
                    Class Tester = Class.forName(tryS);
                    Class[] inter = Tester.getInterfaces();
                    for (int a = 0; a < inter.length; a++) {
                        if ((inter[a].getName()).equals(Pclass)) {
                            if (!Modifier.isAbstract(Tester.getModifiers())) {
                                return tryS;
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return subClass;
    }

    public static String findSupers(String Pclass, String FileName) {
        String subClass = "", tryS = "";
        try {
            InputStream fstream = (FuzzerMethod.class.getResourceAsStream(FileName));
            DataInputStream in = new DataInputStream(fstream);
            while (in.available() != 0) {
                try {
                    tryS = in.readLine();
                    Class Tester = Class.forName(tryS);
                    Class inter = Tester.getSuperclass();

                    if ((inter.getName()).equals(Pclass)) {
                        if (!Modifier.isAbstract(Tester.getModifiers()) && !Tester.isInterface()) {
                            return tryS;
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return subClass;
    }


    static void recursiveAttack(String FileName, int v) throws Exception {


        FileInputStream fstream = new FileInputStream(FileName);
        DataInputStream in = new DataInputStream(fstream);
        while (in.available() != 0) {
            try {
                FuzzerMethod.summarize(in.readLine(), v);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        in.close();

    }

    public static String version = "0.7.5";

    private static void usage() {
        System.out.println("\n= =============================================== =");
        System.out.println("= JavaFuzzer - Classes Fuzzing (Reflection Based) =");
        System.out.println("= =============================================== =\n");
        System.out.println("= Version " + version + " =\n");
        String output =
                "\n" + "FLAGS" +
                        "\n" + "-v: Verbose - Fully Print Exceptions" +
                        "\n" + "-m: Fuzz methods of a Class, Can take Long time to finish" +
                        "\n" + "-f: Read Class names from a file" +
                        "\n" + "-c: Input is Class name, you cannot use -f at the same time" +
                        "\n" + "-s: You can set the fuzzing String, for example http://www.example.com" +
                        "\n" + "    if you dont want repeats, use it with -l1 " +
                        "\n" + "-e: You can set the type you want to overflow with the MAX_VALUE on top " +
                        "\n" + "    Values can be : int or double or float or long or short" +
                        "\n" + "-r: Number of recursions until constructs the class [Default 20]" +
                        "\n" + "    If needs more it will set type to null and consider it Infinite" +
                        "\n" + "-k: Set the value for int,float,long,short,double" +
                        "\n" + "    e.g. -k int=100  or -k double=20000 or -k int=19,float=49 and so on." +
                        "\n" + "-a: Set size of used array when fuzzing  [Default 800]" +
                        "\n" + "-l: Set size of String when fuzzing [Default 1024], if -s is not defined A is default" +
                        "\n" + "-o: Enumerate possible constructor's Constant parameters" +
                        "\n" + "    Bruteforce's all possible positions for the constant (extra delay)" +
                        "\n" + "-i: JavaFuzz will ignore the specified method(s) helpful when you found a bug " +
                        "\n" + "    in a method but you want to dig deeper. (Seperate methods with commas)" +
                        "\n" + "    e.g. for java.awt.Image you could use -i getGraphics,getScaledInstance  " +
                        "\n" + "-n: JavaFuzz will fuzz the specified method(s) only, for a given class" +
                        "\n" + "    e.g. for java.awt.Font you could use -n applySize,pDispose  " +
                        "\n" + "    NOTE: You cannot use -i at the same time" +
                        "\n" + "-u: Fuzz only positive or negative values respectively e.g. Integer high is +MAX_VALUE" +
                        "\n" + "    and low value is -MAX_VALUE (or MIN_VALUE). -u low or -u high " +
                        "\n" + "-p: Enforce a Constant and bruteforce the position  " +
                        "\n" + "    type can be int,double,float,short,string   e.g. -p double=1 " +
                        "\n" + "-g: Use it when you want to replace a class, for example it could be used to replace" +
                        "\n" + "    abstract classes or interfaces -g org.replace.this=org.with.this" +
                        "\n" + "    the auto replacement mode can be invoked using -g org.replace.this={A}" +
                        "\n" + "    and for complete automation use -ga " +
                        "\n\n" + "EXAMPLES" +
                        "" + "" +
                        "\n" + "java -jar JavaFuzz.jar -c java.lang.String -v" +
                        "\n" + "java -jar JavaFuzz.jar -f classes.txt -v -e int" +
                        "\n" + "java -jar JavaFuzz.jar -c java.net.URL -e int -s http://www.example.com\n\n";
        System.out.println(output);
        System.exit(1);

    }


}