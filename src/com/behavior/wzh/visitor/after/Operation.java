package com.behavior.wzh.visitor.after;

public interface Operation {
    void apply(HeadingNode heading);
    void apply(AnchorNode anchor);
}
