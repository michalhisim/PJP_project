/* Generated By:JavaCC: Do not edit this line. ProjectTokenManager.java */
import ir.BlockStatement;
import ir.*;
import utils.IRVisitor;
import utils.SymbolTable;
import utils.TypeChecking;
import utils.MyError;
import java.io.*;

/** Token Manager. */
public class ProjectTokenManager implements ProjectConstants
{
    void CommonTokenAction(Token t)
    {
        Project.columnCounter++;
    }

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x400L) != 0L)
            return 0;
         if ((active0 & 0x6d000000000L) != 0L)
         {
            jjmatchedKind = 48;
            return 47;
         }
         if ((active0 & 0x8100L) != 0L)
            return 6;
         if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 48;
            return 26;
         }
         return -1;
      case 1:
         if ((active0 & 0x4000000000L) != 0L)
            return 47;
         if ((active0 & 0x79000000000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 1;
            return 47;
         }
         return -1;
      case 2:
         if ((active0 & 0x8000000000L) != 0L)
            return 47;
         if ((active0 & 0x71000000000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 2;
            return 47;
         }
         return -1;
      case 3:
         if ((active0 & 0x20000000000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 3;
            return 47;
         }
         if ((active0 & 0x51000000000L) != 0L)
            return 47;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 5);
      case 33:
         return jjStartNfaWithStates_0(0, 15, 6);
      case 37:
         return jjStopAtPos(0, 11);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 40:
         return jjStopAtPos(0, 52);
      case 41:
         return jjStopAtPos(0, 53);
      case 42:
         return jjStopAtPos(0, 9);
      case 43:
         return jjStopAtPos(0, 6);
      case 44:
         return jjStopAtPos(0, 51);
      case 45:
         return jjStopAtPos(0, 7);
      case 46:
         return jjStopAtPos(0, 12);
      case 47:
         return jjStartNfaWithStates_0(0, 10, 0);
      case 58:
         return jjStopAtPos(0, 24);
      case 59:
         return jjStopAtPos(0, 33);
      case 61:
         return jjStartNfaWithStates_0(0, 8, 6);
      case 63:
         return jjStopAtPos(0, 23);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x9000000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      default :
         return jjMoveNfa_0(5, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000000L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000L);
      case 111:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 38, 47);
         break;
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000000L);
      case 124:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(1, 14);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000000L);
      case 100:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 39, 47);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 42, 47);
         break;
      case 101:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 36, 47);
         break;
      case 110:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 40, 47);
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 116:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 41, 47);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 79;
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
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 6);
                  else if ((0x5000000000000000L & l) != 0L)
                  {
                     if (kind > 16)
                        kind = 16;
                  }
                  else if (curChar == 34)
                     jjCheckNAddStates(7, 9);
                  else if (curChar == 33)
                     jjCheckNAdd(6);
                  else if (curChar == 61)
                     jjCheckNAdd(6);
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 0;
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 25)
                        kind = 25;
                     jjCheckNAddTwoStates(13, 14);
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 25)
                        kind = 25;
                     jjCheckNAddStates(10, 12);
                  }
                  else if (curChar == 60)
                     jjCheckNAdd(6);
                  else if (curChar == 62)
                     jjCheckNAdd(6);
                  break;
               case 26:
               case 47:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjCheckNAdd(47);
                  break;
               case 0:
                  if (curChar != 47)
                     break;
                  if (kind > 4)
                     kind = 4;
                  jjCheckNAddStates(13, 15);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 4)
                     kind = 4;
                  jjCheckNAddStates(13, 15);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 4)
                     kind = 4;
                  break;
               case 3:
                  if (curChar == 10 && kind > 4)
                     kind = 4;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 6:
                  if (curChar == 61 && kind > 16)
                     kind = 16;
                  break;
               case 7:
                  if (curChar == 61)
                     jjCheckNAdd(6);
                  break;
               case 8:
                  if (curChar == 33)
                     jjCheckNAdd(6);
                  break;
               case 9:
                  if ((0x5000000000000000L & l) != 0L && kind > 16)
                     kind = 16;
                  break;
               case 10:
                  if (curChar == 62)
                     jjCheckNAdd(6);
                  break;
               case 11:
                  if (curChar == 60)
                     jjCheckNAdd(6);
                  break;
               case 12:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAddTwoStates(13, 14);
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAddTwoStates(13, 14);
                  break;
               case 15:
                  if (curChar == 34)
                     jjCheckNAddStates(7, 9);
                  break;
               case 16:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(7, 9);
                  break;
               case 18:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(7, 9);
                  break;
               case 19:
                  if (curChar == 34 && kind > 31)
                     kind = 31;
                  break;
               case 20:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(16, 19);
                  break;
               case 21:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(7, 9);
                  break;
               case 22:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 23:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(21);
                  break;
               case 48:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 6);
                  break;
               case 49:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(49, 50);
                  break;
               case 50:
                  if (curChar != 46)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAddStates(20, 22);
                  break;
               case 51:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAddStates(20, 22);
                  break;
               case 53:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(54);
                  break;
               case 54:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAddTwoStates(54, 55);
                  break;
               case 56:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(56, 57);
                  break;
               case 58:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(59);
                  break;
               case 59:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAddTwoStates(59, 55);
                  break;
               case 60:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(23, 25);
                  break;
               case 62:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(63);
                  break;
               case 63:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(63, 55);
                  break;
               case 64:
                  if (curChar != 48)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAddStates(10, 12);
                  break;
               case 66:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAddTwoStates(66, 14);
                  break;
               case 67:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAddTwoStates(67, 14);
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
               case 5:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 48)
                        kind = 48;
                     jjCheckNAdd(47);
                  }
                  if (curChar == 105)
                     jjAddStates(26, 27);
                  else if (curChar == 102)
                     jjAddStates(28, 29);
                  else if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 44;
                  else if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 38;
                  else if (curChar == 119)
                     jjstateSet[jjnewStateCnt++] = 31;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 26:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 48)
                        kind = 48;
                     jjCheckNAdd(47);
                  }
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 1:
                  if (kind > 4)
                     kind = 4;
                  jjAddStates(13, 15);
                  break;
               case 14:
                  if ((0x100000001000L & l) != 0L && kind > 25)
                     kind = 25;
                  break;
               case 16:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(7, 9);
                  break;
               case 17:
                  if (curChar == 92)
                     jjAddStates(30, 32);
                  break;
               case 18:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(7, 9);
                  break;
               case 24:
                  if (curChar == 101 && kind > 32)
                     kind = 32;
                  break;
               case 25:
                  if (curChar == 117)
                     jjCheckNAdd(24);
                  break;
               case 27:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if (curChar == 101 && kind > 34)
                     kind = 34;
                  break;
               case 29:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if (curChar == 119)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 33:
                  if (curChar == 110 && kind > 43)
                     kind = 43;
                  break;
               case 34:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 35:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 36:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 37:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 38:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 39:
                  if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 40:
                  if (curChar == 103 && kind > 43)
                     kind = 43;
                  break;
               case 41:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 42:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 43:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 42;
                  break;
               case 44:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 43;
                  break;
               case 45:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 46:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjCheckNAdd(47);
                  break;
               case 47:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjCheckNAdd(47);
                  break;
               case 52:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(33, 34);
                  break;
               case 55:
                  if ((0x5000000050L & l) != 0L && kind > 29)
                     kind = 29;
                  break;
               case 57:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(35, 36);
                  break;
               case 61:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(37, 38);
                  break;
               case 65:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(66);
                  break;
               case 66:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAddTwoStates(66, 14);
                  break;
               case 68:
                  if (curChar == 102)
                     jjAddStates(28, 29);
                  break;
               case 69:
                  if (curChar == 115)
                     jjCheckNAdd(24);
                  break;
               case 70:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 69;
                  break;
               case 71:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 70;
                  break;
               case 72:
                  if (curChar == 116 && kind > 43)
                     kind = 43;
                  break;
               case 73:
                  if (curChar == 97)
                     jjCheckNAdd(72);
                  break;
               case 74:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 73;
                  break;
               case 75:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 74;
                  break;
               case 76:
                  if (curChar == 105)
                     jjAddStates(26, 27);
                  break;
               case 77:
                  if (curChar == 102 && kind > 34)
                     kind = 34;
                  break;
               case 78:
                  if (curChar == 110)
                     jjCheckNAdd(72);
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
               case 1:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 4)
                     kind = 4;
                  jjAddStates(13, 15);
                  break;
               case 16:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(7, 9);
                  break;
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
      if ((i = jjnewStateCnt) == (startsAt = 79 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   49, 50, 56, 57, 60, 61, 55, 16, 17, 19, 65, 67, 14, 1, 2, 4, 
   16, 17, 21, 19, 51, 52, 55, 60, 61, 55, 77, 78, 71, 75, 18, 20, 
   22, 53, 54, 58, 59, 62, 63, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\53", "\55", "\75", "\52", "\57", "\45", 
"\56", "\46\46", "\174\174", "\41", null, null, null, null, null, null, null, "\77", 
"\72", null, null, null, null, null, null, null, null, "\73", null, null, 
"\145\154\163\145", null, "\144\157", "\145\156\144", "\164\150\145\156", "\160\162\151\156\164", 
"\162\145\141\144", null, null, null, null, null, null, null, null, "\54", "\50", "\51", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x390fd7a381ffc1L, 
};
static final long[] jjtoSkip = {
   0x3eL, 
};
static final long[] jjtoSpecial = {
   0x30L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[79];
private final int[] jjstateSet = new int[158];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public ProjectTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public ProjectTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 79; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
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

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      CommonTokenAction(matchedToken);
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002200L & (1L << curChar)) != 0L)
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
         matchedToken.specialToken = specialToken;
         CommonTokenAction(matchedToken);
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
            SkipLexicalActions(matchedToken);
         }
         else
            SkipLexicalActions(null);
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

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 5 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                   Project.lineCounter++; Project.columnCounter = 0;
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
