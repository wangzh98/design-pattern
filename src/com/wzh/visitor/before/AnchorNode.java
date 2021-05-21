package com.wzh.visitor;

public class AnchorNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("hightlight-anchor");
    }
}
