package org.practice.lombok.singletone;

import com.sun.tools.javac.tree.JCTree;
import lombok.core.AnnotationValues;
import lombok.javac.Javac8BasedLombokOptions;
import lombok.javac.JavacAnnotationHandler;
import lombok.javac.JavacNode;
import com.sun.tools.javac.util.Context;
import lombok.javac.JavacTreeMaker;
import lombok.javac.handlers.JavacHandlerUtil;

public class SingleToneHandler extends JavacAnnotationHandler {
    public void handle(AnnotationValues annotions, JCTree.JCAnnotation ast, JavacNode annNodes) {
        Context context = annNodes.getContext();
        Javac8BasedLombokOptions options = Javac8BasedLombokOptions.replaceWithDelombokOptions(context);
        options.deleteLombokAnnotations();
        JavacHandlerUtil.deleteAnnotationIfNeccessary(annNodes,Single.class);
        JavacHandlerUtil.deleteImportFromCompilationUnit(annNodes,"lombok.AccessLevel");
        JavacNode singleToneClass = annNodes.up();
        JavacTreeMaker singleToneClassMaker = singleToneClass.getTreeMaker();

    }

    private void addPrivateCons(){

    }
}
