/* WEB_COMPILERTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. WEB_COMPILERTokenManager.java */
import java.io.*;

/** Token Manager. */
@SuppressWarnings ("unused")
public class WEB_COMPILERTokenManager implements WEB_COMPILERConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1ffc0L) != 0L)
         {
            jjmatchedKind = 2;
            return -1;
         }
         return -1;
      case 1:
         if ((active0 & 0x1ffc0L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 2;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 2:
         if ((active0 & 0x1ffc0L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 2;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 3:
         if ((active0 & 0x1ffc0L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 2;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 4:
         if ((active0 & 0x1ff80L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 2;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 5:
         if ((active0 & 0x4e80L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 2;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 6:
         if ((active0 & 0xe00L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 2;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0xc00L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 2;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x800L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 2;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 5);
      case 32:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 34:
         return jjStopAtPos(0, 1);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 72:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x100L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x10800L);
      case 68:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x2400L);
      case 73:
         return jjMoveStringLiteralDfa2_0(active0, 0x1100L);
      case 77:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0xc200L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa3_0(active0, 0x480L);
      case 68:
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 78:
         return jjMoveStringLiteralDfa3_0(active0, 0x19000L);
      case 82:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 84:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 85:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 88:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 32:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(3, 6);
         break;
      case 65:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 68:
         return jjMoveStringLiteralDfa4_0(active0, 0x10400L);
      case 71:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 72:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 75:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 79:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 82:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 84:
         return jjMoveStringLiteralDfa4_0(active0, 0xa000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 32:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(4, 8);
         else if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(4, 12);
         else if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(4, 13);
         else if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(4, 15);
         else if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(4, 16);
         break;
      case 67:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 69:
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      case 71:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 73:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 82:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 32:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(5, 7);
         else if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(5, 14);
         break;
      case 69:
         return jjMoveStringLiteralDfa6_0(active0, 0x200L);
      case 78:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 82:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 32:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(6, 9);
         break;
      case 65:
         return jjMoveStringLiteralDfa7_0(active0, 0x800L);
      case 71:
         return jjMoveStringLiteralDfa7_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 32:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(7, 10);
         break;
      case 80:
         return jjMoveStringLiteralDfa8_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 72:
         return jjMoveStringLiteralDfa9_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 32:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(9, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 1;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7ffc00100000000L & l) != 0L)
                     kind = 2;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     kind = 2;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\42", null, null, null, "\12", "\101\104\104\40", 
"\111\115\101\107\105\40", "\127\111\124\110\40", "\123\117\125\122\103\105\40", 
"\110\105\101\104\111\116\107\40", "\120\101\122\101\107\122\101\120\110\40", "\114\111\116\113\40", 
"\124\105\130\124\40", "\103\117\114\117\122\40", "\106\117\116\124\40", "\40\101\116\104\40", };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {0
};

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 13 && (0x2200L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public WEB_COMPILERTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public WEB_COMPILERTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  static public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 1; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public static void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x1ffe7L, 
};
static final long[] jjtoSkip = {
   0x18L, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[1];
    static private final int[] jjstateSet = new int[2 * 1];
    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    static protected int curChar;
}
