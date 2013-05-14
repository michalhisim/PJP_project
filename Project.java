/* Generated By:JavaCC: Do not edit this line. Project.java */
import ir.BlockStatement;
import ir.*;
import utils.IRVisitor;
import utils.SymbolTable;
import utils.TypeChecking;
import utils.MyError;
import java.io.*;

public class Project implements ProjectConstants {
    static SymbolTable table = new SymbolTable();
    static int lineCounter = 0;
    static int columnCounter = 0;

    public static void main(String args[])
       throws ParseException
    {
        File myFile = new File("myfile.txt");
        FileReader fr;
        if(myFile.exists())
        {
            try
            {
                fr = new FileReader(myFile);
            } catch (FileNotFoundException ex) {
                    System.out.println("Nejde otevrit soubor!");
                    return;//Logger.getLogger(FileTest.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        else
        {
            System.out.println("Uvedeny soubor neexistuje!");
            return;
        }
        MyError.clearErrors();
        BlockStatement program = new BlockStatement();
        Project parser = new Project(fr);
        parser.start(program);


        try
            {
                fr.close();
            } catch (IOException ex) {
                    System.out.println("Soubor nejde zavrit!");
                    return;//Logger.getLogger(FileTest.class.getName()).log(Level.SEVERE, null, ex);
                }

        //tisk
        System.out.println(program.toString());
        //BlockStatement program = new BlockStatement();
        TypeChecking t = new TypeChecking();
        program.accept(t);
        if (MyError.noErrors()) {
            System.out.println("Program is correct.");
        }else {
            MyError.printErrors();
        }
    }

/* syntakticky analyzator */
  final public void start(BlockStatement node) throws ParseException {
    label_1:
    while (true) {
      assign(node);
      jj_consume_token(SEMICOLON);

      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SEMICOLON:
      case STATEMENT:
      case PRINT:
      case READ:
      case TYPE:
      case ID:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
    }
    jj_consume_token(0);
  }

  final public void assign(BlockStatement node) throws ParseException {
    Token name;
    Token var2;
    Token type;
    Expression value;
    Expression e;
    Statement tmp;
    PrintStatement print;
    ReadStatement read;
    if (jj_2_1(2147483647)) {
      statement(node);
    } else if (jj_2_2(2147483647)) {
      jj_consume_token(PRINT);
      e = expr();
                print = new PrintStatement();
                print.getExpressions().add(e);
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 51:
          ;
          break;
        default:
          jj_la1[1] = jj_gen;
          break label_2;
        }
        jj_consume_token(51);
        value = expr();
            print.getExpressions().add(value);
      }
             node.getStatements().add(print);
    } else if (jj_2_3(2147483647)) {
      jj_consume_token(READ);
      name = jj_consume_token(ID);
                    read = new ReadStatement();
                    read.getVariables().add(table.getVariable(lineCounter, columnCounter, name.toString()));
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 51:
          ;
          break;
        default:
          jj_la1[2] = jj_gen;
          break label_3;
        }
        jj_consume_token(51);
        var2 = jj_consume_token(ID);
                    read.getVariables().add(table.getVariable(lineCounter, columnCounter, var2.toString()));
      }
                     node.getStatements().add(read);
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case TYPE:
        type = jj_consume_token(TYPE);
        name = jj_consume_token(ID);
        table.declareVariable(lineCounter,columnCounter,name.toString(),type.toString());
        node.getStatements().add( new DeclarationStatement(table.getVariable(lineCounter,columnCounter,name.toString())));
        break;
      default:
        jj_la1[3] = jj_gen;
        if (jj_2_4(2147483647)) {
          name = jj_consume_token(ID);
          jj_consume_token(EQ);
          value = expr();
        tmp = new AssigmentStatement(table.getVariable(lineCounter,columnCounter,name.toString()),value, lineCounter, columnCounter);
        node.getStatements().add(tmp);
        } else {
       {if (true) return;}
        }
      }
    }
  }

  final public void statement(BlockStatement node) throws ParseException {
    Expression cond;
    BlockStatement tmp1 = new BlockStatement();
    BlockStatement tmp2 = new BlockStatement();
    if (jj_2_5(2147483647)) {
      jj_consume_token(STATEMENT);
      jj_consume_token(52);
      cond = expr();
      jj_consume_token(53);
      jj_consume_token(DO);
      label_4:
      while (true) {
        assign(tmp1);
        jj_consume_token(SEMICOLON);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case SEMICOLON:
        case STATEMENT:
        case PRINT:
        case READ:
        case TYPE:
        case ID:
          ;
          break;
        default:
          jj_la1[4] = jj_gen;
          break label_4;
        }
      }
      jj_consume_token(END);
        node.getStatements().add(new WhileStatement(tmp1, cond, lineCounter, columnCounter));
    } else if (jj_2_6(3)) {
      jj_consume_token(STATEMENT);
      cond = expr();
      jj_consume_token(THEN);
      label_5:
      while (true) {
        assign(tmp1);
        jj_consume_token(SEMICOLON);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case SEMICOLON:
        case STATEMENT:
        case PRINT:
        case READ:
        case TYPE:
        case ID:
          ;
          break;
        default:
          jj_la1[5] = jj_gen;
          break label_5;
        }
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ELSE:
        jj_consume_token(ELSE);
        label_6:
        while (true) {
          assign(tmp2);
          jj_consume_token(SEMICOLON);
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case SEMICOLON:
          case STATEMENT:
          case PRINT:
          case READ:
          case TYPE:
          case ID:
            ;
            break;
          default:
            jj_la1[6] = jj_gen;
            break label_6;
          }
        }
        break;
      default:
        jj_la1[7] = jj_gen;
        ;
      }
      jj_consume_token(END);
            node.getStatements().add(new IfStatement(cond, tmp1, tmp2, lineCounter, columnCounter));
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

// MAIN EXPR
  final public Expression expr() throws ParseException {
    Token t;
    Expression e1;
    Expression e2;
    Expression e3;
    if (jj_2_7(2147483647)) {
      e1 = exprOR();
      jj_consume_token(TERMAL_OPERATOR);
      e2 = expr();
      jj_consume_token(CHOOSE_OPERATOR);
      e3 = expr();
        {if (true) return new ConditionalExpression(e1, e2, e3, lineCounter, columnCounter);}
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SUB:
      case NOT:
      case INTEGER_LITERAL:
      case FLOATING_POINT_LITERAL:
      case STRING_LITERAL:
      case BOOLEAN_LITERAL:
      case ID:
      case 52:
        e1 = exprOR();
                   {if (true) return e1;}
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    throw new Error("Missing return statement in function");
  }

// OR Expr
  final public Expression exprOR() throws ParseException {
    Token t;
    Expression e1;
    Expression e2;
    e1 = exprAnd();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case OR:
      t = jj_consume_token(OR);
      e2 = expr();
        {if (true) return new BinaryExpression(t.toString(), e1, e2, lineCounter, columnCounter);}
      break;
    default:
      jj_la1[9] = jj_gen;
      ;
    }
           {if (true) return e1;}
    throw new Error("Missing return statement in function");
  }

// AND && EXPR   
  final public Expression exprAnd() throws ParseException {
    Token t;
    Expression e1;
    Expression e2;
    e1 = exprRel();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case AND:
      t = jj_consume_token(AND);
      e2 = exprAnd();
        {if (true) return new BinaryExpression(t.toString(), e1, e2, lineCounter, columnCounter);}
      break;
    default:
      jj_la1[10] = jj_gen;
      ;
    }
           {if (true) return e1;}
    throw new Error("Missing return statement in function");
  }

// RELATIONAL EXPR  
  final public Expression exprRel() throws ParseException {
    Token t;
    Expression e1;
    Expression e2;
    e1 = exprMath();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case REL_OPERATOR:
      t = jj_consume_token(REL_OPERATOR);
      e2 = exprRel();
        {if (true) return new BinaryExpression(t.toString(), e1, e2, lineCounter, columnCounter);}
      break;
    default:
      jj_la1[11] = jj_gen;
      ;
    }
           {if (true) return e1;}
    throw new Error("Missing return statement in function");
  }

// MATH EXPR
  final public Expression exprMath() throws ParseException {
    Token t;
    Expression e1;
    Expression e2;
    e1 = term();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ADD:
    case SUB:
    case CONCAT:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ADD:
        t = jj_consume_token(ADD);
        break;
      case SUB:
        t = jj_consume_token(SUB);
        break;
      case CONCAT:
        t = jj_consume_token(CONCAT);
        break;
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      e2 = exprMath();
        {if (true) return new BinaryExpression(t.toString(), e1, e2, lineCounter, columnCounter);}
      break;
    default:
      jj_la1[13] = jj_gen;
      ;
    }
           {if (true) return e1;}
    throw new Error("Missing return statement in function");
  }

// TERM
  final public Expression term() throws ParseException {
    Token t;
    Expression e1;
    Expression e2;
    e1 = Uterm();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MUL:
    case DIV:
    case MOD:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MUL:
        t = jj_consume_token(MUL);
        break;
      case DIV:
        t = jj_consume_token(DIV);
        break;
      case MOD:
        t = jj_consume_token(MOD);
        break;
      default:
        jj_la1[14] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      e2 = term();
        {if (true) return new BinaryExpression(t.toString(), e1, e2, lineCounter, columnCounter);}
      break;
    default:
      jj_la1[15] = jj_gen;
      ;
    }
       {if (true) return e1;}
    throw new Error("Missing return statement in function");
  }

// UNARY OPERATOR
  final public Expression Uterm() throws ParseException {
    Token t;
    Expression e1;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SUB:
    case NOT:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NOT:
        t = jj_consume_token(NOT);
        break;
      case SUB:
        t = jj_consume_token(SUB);
        break;
      default:
        jj_la1[16] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      e1 = factor();
        {if (true) return new UnaryExpression(t.toString(), e1, lineCounter, columnCounter);}
      break;
    case INTEGER_LITERAL:
    case FLOATING_POINT_LITERAL:
    case STRING_LITERAL:
    case BOOLEAN_LITERAL:
    case ID:
    case 52:
      e1 = factor();
        {if (true) return e1;}
      break;
    default:
      jj_la1[17] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

// SYMBOL
  final public Expression factor() throws ParseException {
    Token t;
    Expression e;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case BOOLEAN_LITERAL:
      t = jj_consume_token(BOOLEAN_LITERAL);
        {if (true) return new Literal(Boolean.getBoolean(t.toString()));}
      break;
    case ID:
      t = jj_consume_token(ID);
               {if (true) return table.getVariable(lineCounter, columnCounter, t.toString());}
      break;
    case STRING_LITERAL:
      t = jj_consume_token(STRING_LITERAL);
        {if (true) return new Literal(t.toString());}
      break;
    case FLOATING_POINT_LITERAL:
      t = jj_consume_token(FLOATING_POINT_LITERAL);
        {if (true) return new Literal(Float.parseFloat(t.toString()));}
      break;
    case INTEGER_LITERAL:
      t = jj_consume_token(INTEGER_LITERAL);
        {if (true) return new Literal(Integer.decode(t.toString()).intValue());}
      break;
    case 52:
      jj_consume_token(52);
      e = expr();
      jj_consume_token(53);
        {if (true) return e;}
        //return new UnaryExpression("(", new BinaryExpression(")",e,new Variable(")")));

      break;
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  private boolean jj_2_5(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  private boolean jj_2_6(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_6(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  private boolean jj_2_7(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_7(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(6, xla); }
  }

  private boolean jj_3R_26() {
    if (jj_scan_token(STRING_LITERAL)) return true;
    return false;
  }

  private boolean jj_3R_25() {
    if (jj_scan_token(ID)) return true;
    return false;
  }

  private boolean jj_3R_14() {
    if (jj_scan_token(AND)) return true;
    if (jj_3R_11()) return true;
    return false;
  }

  private boolean jj_3_2() {
    if (jj_scan_token(PRINT)) return true;
    return false;
  }

  private boolean jj_3R_24() {
    if (jj_scan_token(BOOLEAN_LITERAL)) return true;
    return false;
  }

  private boolean jj_3R_23() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_24()) {
    jj_scanpos = xsp;
    if (jj_3R_25()) {
    jj_scanpos = xsp;
    if (jj_3R_26()) {
    jj_scanpos = xsp;
    if (jj_3R_27()) {
    jj_scanpos = xsp;
    if (jj_3R_28()) {
    jj_scanpos = xsp;
    if (jj_3R_29()) return true;
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3_1() {
    if (jj_scan_token(STATEMENT)) return true;
    return false;
  }

  private boolean jj_3R_13() {
    if (jj_3R_15()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_16()) jj_scanpos = xsp;
    return false;
  }

  private boolean jj_3_5() {
    if (jj_scan_token(STATEMENT)) return true;
    if (jj_scan_token(52)) return true;
    return false;
  }

  private boolean jj_3R_22() {
    if (jj_3R_23()) return true;
    return false;
  }

  private boolean jj_3_6() {
    if (jj_scan_token(STATEMENT)) return true;
    if (jj_3R_7()) return true;
    if (jj_scan_token(THEN)) return true;
    return false;
  }

  private boolean jj_3R_12() {
    if (jj_scan_token(OR)) return true;
    if (jj_3R_7()) return true;
    return false;
  }

  private boolean jj_3R_11() {
    if (jj_3R_13()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_14()) jj_scanpos = xsp;
    return false;
  }

  private boolean jj_3R_20() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(9)) {
    jj_scanpos = xsp;
    if (jj_scan_token(10)) {
    jj_scanpos = xsp;
    if (jj_scan_token(11)) return true;
    }
    }
    if (jj_3R_17()) return true;
    return false;
  }

  private boolean jj_3R_21() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(15)) {
    jj_scanpos = xsp;
    if (jj_scan_token(7)) return true;
    }
    if (jj_3R_23()) return true;
    return false;
  }

  private boolean jj_3R_19() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_21()) {
    jj_scanpos = xsp;
    if (jj_3R_22()) return true;
    }
    return false;
  }

  private boolean jj_3_4() {
    if (jj_scan_token(ID)) return true;
    if (jj_scan_token(EQ)) return true;
    return false;
  }

  private boolean jj_3R_8() {
    if (jj_3R_11()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_12()) jj_scanpos = xsp;
    return false;
  }

  private boolean jj_3R_18() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(6)) {
    jj_scanpos = xsp;
    if (jj_scan_token(7)) {
    jj_scanpos = xsp;
    if (jj_scan_token(12)) return true;
    }
    }
    if (jj_3R_15()) return true;
    return false;
  }

  private boolean jj_3R_17() {
    if (jj_3R_19()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_20()) jj_scanpos = xsp;
    return false;
  }

  private boolean jj_3_7() {
    if (jj_3R_8()) return true;
    if (jj_scan_token(TERMAL_OPERATOR)) return true;
    return false;
  }

  private boolean jj_3R_29() {
    if (jj_scan_token(52)) return true;
    if (jj_3R_7()) return true;
    if (jj_scan_token(53)) return true;
    return false;
  }

  private boolean jj_3R_10() {
    if (jj_3R_8()) return true;
    return false;
  }

  private boolean jj_3R_16() {
    if (jj_scan_token(REL_OPERATOR)) return true;
    if (jj_3R_13()) return true;
    return false;
  }

  private boolean jj_3R_28() {
    if (jj_scan_token(INTEGER_LITERAL)) return true;
    return false;
  }

  private boolean jj_3_3() {
    if (jj_scan_token(READ)) return true;
    return false;
  }

  private boolean jj_3R_15() {
    if (jj_3R_17()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_18()) jj_scanpos = xsp;
    return false;
  }

  private boolean jj_3R_27() {
    if (jj_scan_token(FLOATING_POINT_LITERAL)) return true;
    return false;
  }

  private boolean jj_3R_7() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_9()) {
    jj_scanpos = xsp;
    if (jj_3R_10()) return true;
    }
    return false;
  }

  private boolean jj_3R_9() {
    if (jj_3R_8()) return true;
    if (jj_scan_token(TERMAL_OPERATOR)) return true;
    if (jj_3R_7()) return true;
    if (jj_scan_token(CHOOSE_OPERATOR)) return true;
    if (jj_3R_7()) return true;
    return false;
  }

  /** Generated Token Manager. */
  public ProjectTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[19];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0xa2008080,0x4000,0x2000,0x10000,0x10c0,0x10c0,0xe00,0xe00,0x8080,0xa2008080,0xa2000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x10e06,0x80000,0x80000,0x800,0x10e06,0x10e06,0x10e06,0x10,0x110001,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x110001,0x110001,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[7];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public Project(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Project(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ProjectTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public Project(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ProjectTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public Project(ProjectTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(ProjectTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[54];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 19; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 54; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 7; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
            case 5: jj_3_6(); break;
            case 6: jj_3_7(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
