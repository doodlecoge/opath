package me.hch;

import me.hch.ds.XNode;
import me.hch.text.OPath;
import me.hch.text.ParseException;

import java.io.StringReader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by huaichao on 10/5/14.
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        // /name/a/b/c

        Hospital hospital = new Hospital();
        hospital.setName("苏州大学附属第一医院");

        Department dpt = new Department();
        dpt.setName("神经内科");
        hospital.addDepartment(dpt);



        Pattern ptn = Pattern.compile("^([a-zA-Z_][0-9a-zA-Z_]*)(\\[@([a-zA-Z_][0-9a-zA-Z_]*)='([^']*)'\\])?");
        String str = "/hospital[@name='hos-a' and (@xx='bb' or @cc='n][]][ono')]/department[@name='dpt-a']/doctor";


        OPath parser = new OPath(new StringReader(str));
        List<XNode> xnodes = parser.parse();

        for (XNode xnode : xnodes) {
            System.out.println(xnode.getNodeName());
            List<String> els = xnode.getExpr();
            if(els == null) continue;
            for (String el : els) {
                System.out.print(el);
            }
            System.out.println();
        }

    }
}
