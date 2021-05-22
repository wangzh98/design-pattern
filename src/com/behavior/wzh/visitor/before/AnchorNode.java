package com.behavior.wzh.visitor.before;

public class AnchorNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("hightlight-anchor");
    }
}
