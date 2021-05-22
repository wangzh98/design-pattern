package com.behavior.wzh.visitor.after;

public interface HtmlNode {
    // 依赖这个操作（访问者）
    void execute(Operation operation);
}
