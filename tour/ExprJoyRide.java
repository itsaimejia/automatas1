/*import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class ExprJoyRide {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ParseTree tree = parser.prog();
        System.out.println(tree.toStringTree(parser));
    }
}*/

import org.antlr.v4.runtime.*; 
import org.antlr.v4.runtime.tree.*; 
import org.antlr.v4.stringtemplate.*; 
import java.io.FileInputStream;
import java.io.InputStream;

public class ExprJoyRide { 
    public static void main(String[] args) throws Exception { 
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        ANTLRStringStream in = new ANTLRStringStream(inputFile); 
        ASTDemoLexer lexer = new ASTDemoLexer(in); 
        CommonTokenStream tokens = new CommonTokenStream(lexer); 
        ASTDemoParser parser = new ASTDemoParser(tokens); 
        ASTDemoParser.parse_return returnValue = parser.parse(); 
        CommonTree tree = (CommonTree)returnValue.getTree(); 
        DOTTreeGenerator gen = new DOTTreeGenerator(); 
        StringTemplate st = gen.toDOT(tree); 
        System.out.println(st); 
    } 
}