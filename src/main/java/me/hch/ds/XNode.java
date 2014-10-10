package me.hch.ds;

import java.util.List;

/**
 * Created by huaichao on 10/10/14.
 */
public class XNode {
    private String nodeName;
    private List<String> expr;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public List<String> getExpr() {
        return expr;
    }

    public void setExpr(List<String> expr) {
        this.expr = expr;
    }
}
