package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class is_lexical_sort_0_0 extends Strategy 
{ 
  public static is_lexical_sort_0_0 instance = new is_lexical_sort_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_lexical_sort_0_0");
    Fail46:
    { 
      IStrategoTerm term15 = term;
      Success10:
      { 
        Fail47:
        { 
          IStrategoTerm u_59 = null;
          u_59 = term;
          term = equal_0_1.instance.invoke(context, u_59, extraction.constSortNoArgs1);
          if(term == null)
            break Fail47;
          if(true)
            break Success10;
        }
        term = term15;
        IStrategoTerm term16 = term;
        Success11:
        { 
          Fail48:
          { 
            IStrategoTerm s_59 = null;
            s_59 = term;
            term = equal_0_1.instance.invoke(context, s_59, extraction.constSortNoArgs2);
            if(term == null)
              break Fail48;
            if(true)
              break Success11;
          }
          term = term16;
          IStrategoTerm term17 = term;
          Success12:
          { 
            Fail49:
            { 
              IStrategoTerm q_59 = null;
              q_59 = term;
              term = equal_0_1.instance.invoke(context, q_59, extraction.constSortNoArgs3);
              if(term == null)
                break Fail49;
              if(true)
                break Success12;
            }
            term = term17;
            IStrategoTerm term18 = term;
            Success13:
            { 
              Fail50:
              { 
                IStrategoTerm o_59 = null;
                o_59 = term;
                term = equal_0_1.instance.invoke(context, o_59, extraction.constSortNoArgs4);
                if(term == null)
                  break Fail50;
                if(true)
                  break Success13;
              }
              term = term18;
              IStrategoTerm term19 = term;
              Success14:
              { 
                Fail51:
                { 
                  IStrategoTerm m_59 = null;
                  m_59 = term;
                  term = equal_0_1.instance.invoke(context, m_59, extraction.constSortNoArgs2);
                  if(term == null)
                    break Fail51;
                  if(true)
                    break Success14;
                }
                term = term19;
                IStrategoTerm term20 = term;
                Success15:
                { 
                  Fail52:
                  { 
                    IStrategoTerm k_59 = null;
                    k_59 = term;
                    term = equal_0_1.instance.invoke(context, k_59, extraction.constSortNoArgs5);
                    if(term == null)
                      break Fail52;
                    if(true)
                      break Success15;
                  }
                  term = term20;
                  IStrategoTerm term21 = term;
                  Success16:
                  { 
                    Fail53:
                    { 
                      IStrategoTerm i_59 = null;
                      i_59 = term;
                      term = equal_0_1.instance.invoke(context, i_59, extraction.constSortNoArgs6);
                      if(term == null)
                        break Fail53;
                      if(true)
                        break Success16;
                    }
                    term = term21;
                    IStrategoTerm term22 = term;
                    Success17:
                    { 
                      Fail54:
                      { 
                        IStrategoTerm g_59 = null;
                        g_59 = term;
                        term = equal_0_1.instance.invoke(context, g_59, extraction.constSortNoArgs7);
                        if(term == null)
                          break Fail54;
                        if(true)
                          break Success17;
                      }
                      term = term22;
                      IStrategoTerm term23 = term;
                      Success18:
                      { 
                        Fail55:
                        { 
                          IStrategoTerm e_59 = null;
                          e_59 = term;
                          term = equal_0_1.instance.invoke(context, e_59, extraction.constSortNoArgs8);
                          if(term == null)
                            break Fail55;
                          if(true)
                            break Success18;
                        }
                        term = term23;
                        IStrategoTerm term24 = term;
                        Success19:
                        { 
                          Fail56:
                          { 
                            IStrategoTerm c_59 = null;
                            c_59 = term;
                            term = equal_0_1.instance.invoke(context, c_59, extraction.constSortNoArgs9);
                            if(term == null)
                              break Fail56;
                            if(true)
                              break Success19;
                          }
                          term = term24;
                          IStrategoTerm term25 = term;
                          Success20:
                          { 
                            Fail57:
                            { 
                              IStrategoTerm a_59 = null;
                              a_59 = term;
                              term = equal_0_1.instance.invoke(context, a_59, extraction.constSortNoArgs10);
                              if(term == null)
                                break Fail57;
                              if(true)
                                break Success20;
                            }
                            term = term25;
                            IStrategoTerm term26 = term;
                            Success21:
                            { 
                              Fail58:
                              { 
                                IStrategoTerm w_58 = null;
                                w_58 = term;
                                term = equal_0_1.instance.invoke(context, w_58, extraction.constSortNoArgs11);
                                if(term == null)
                                  break Fail58;
                                if(true)
                                  break Success21;
                              }
                              term = term26;
                              IStrategoTerm term27 = term;
                              Success22:
                              { 
                                Fail59:
                                { 
                                  IStrategoTerm u_58 = null;
                                  u_58 = term;
                                  term = equal_0_1.instance.invoke(context, u_58, extraction.constSortNoArgs12);
                                  if(term == null)
                                    break Fail59;
                                  if(true)
                                    break Success22;
                                }
                                term = term27;
                                IStrategoTerm term28 = term;
                                Success23:
                                { 
                                  Fail60:
                                  { 
                                    IStrategoTerm r_58 = null;
                                    r_58 = term;
                                    term = equal_0_1.instance.invoke(context, r_58, extraction.constSortNoArgs13);
                                    if(term == null)
                                      break Fail60;
                                    if(true)
                                      break Success23;
                                  }
                                  term = term28;
                                  IStrategoTerm term29 = term;
                                  Success24:
                                  { 
                                    Fail61:
                                    { 
                                      IStrategoTerm m_58 = null;
                                      m_58 = term;
                                      term = equal_0_1.instance.invoke(context, m_58, extraction.constSortNoArgs14);
                                      if(term == null)
                                        break Fail61;
                                      if(true)
                                        break Success24;
                                    }
                                    term = term29;
                                    IStrategoTerm term30 = term;
                                    Success25:
                                    { 
                                      Fail62:
                                      { 
                                        IStrategoTerm k_58 = null;
                                        k_58 = term;
                                        term = equal_0_1.instance.invoke(context, k_58, extraction.constSortNoArgs15);
                                        if(term == null)
                                          break Fail62;
                                        if(true)
                                          break Success25;
                                      }
                                      term = term30;
                                      IStrategoTerm term31 = term;
                                      Success26:
                                      { 
                                        Fail63:
                                        { 
                                          IStrategoTerm h_58 = null;
                                          h_58 = term;
                                          term = equal_0_1.instance.invoke(context, h_58, extraction.constSortNoArgs16);
                                          if(term == null)
                                            break Fail63;
                                          if(true)
                                            break Success26;
                                        }
                                        term = term31;
                                        IStrategoTerm term32 = term;
                                        Success27:
                                        { 
                                          Fail64:
                                          { 
                                            IStrategoTerm e_58 = null;
                                            e_58 = term;
                                            term = equal_0_1.instance.invoke(context, e_58, extraction.constSortNoArgs10);
                                            if(term == null)
                                              break Fail64;
                                            if(true)
                                              break Success27;
                                          }
                                          term = term32;
                                          IStrategoTerm term33 = term;
                                          Success28:
                                          { 
                                            Fail65:
                                            { 
                                              IStrategoTerm b_58 = null;
                                              b_58 = term;
                                              term = equal_0_1.instance.invoke(context, b_58, extraction.constSortNoArgs17);
                                              if(term == null)
                                                break Fail65;
                                              if(true)
                                                break Success28;
                                            }
                                            term = term33;
                                            IStrategoTerm term34 = term;
                                            Success29:
                                            { 
                                              Fail66:
                                              { 
                                                IStrategoTerm y_57 = null;
                                                y_57 = term;
                                                term = equal_0_1.instance.invoke(context, y_57, extraction.constSortNoArgs18);
                                                if(term == null)
                                                  break Fail66;
                                                if(true)
                                                  break Success29;
                                              }
                                              term = term34;
                                              IStrategoTerm term35 = term;
                                              Success30:
                                              { 
                                                Fail67:
                                                { 
                                                  IStrategoTerm w_57 = null;
                                                  w_57 = term;
                                                  term = equal_0_1.instance.invoke(context, w_57, extraction.constSortNoArgs19);
                                                  if(term == null)
                                                    break Fail67;
                                                  if(true)
                                                    break Success30;
                                                }
                                                term = term35;
                                                IStrategoTerm term36 = term;
                                                Success31:
                                                { 
                                                  Fail68:
                                                  { 
                                                    IStrategoTerm u_57 = null;
                                                    u_57 = term;
                                                    term = equal_0_1.instance.invoke(context, u_57, extraction.constSortNoArgs20);
                                                    if(term == null)
                                                      break Fail68;
                                                    if(true)
                                                      break Success31;
                                                  }
                                                  term = term36;
                                                  IStrategoTerm term37 = term;
                                                  Success32:
                                                  { 
                                                    Fail69:
                                                    { 
                                                      IStrategoTerm s_57 = null;
                                                      s_57 = term;
                                                      term = equal_0_1.instance.invoke(context, s_57, extraction.constSortNoArgs21);
                                                      if(term == null)
                                                        break Fail69;
                                                      if(true)
                                                        break Success32;
                                                    }
                                                    term = term37;
                                                    IStrategoTerm term38 = term;
                                                    Success33:
                                                    { 
                                                      Fail70:
                                                      { 
                                                        IStrategoTerm q_57 = null;
                                                        q_57 = term;
                                                        term = equal_0_1.instance.invoke(context, q_57, extraction.constSortNoArgs8);
                                                        if(term == null)
                                                          break Fail70;
                                                        if(true)
                                                          break Success33;
                                                      }
                                                      term = term38;
                                                      IStrategoTerm term39 = term;
                                                      Success34:
                                                      { 
                                                        Fail71:
                                                        { 
                                                          IStrategoTerm o_57 = null;
                                                          o_57 = term;
                                                          term = equal_0_1.instance.invoke(context, o_57, extraction.constSortNoArgs22);
                                                          if(term == null)
                                                            break Fail71;
                                                          if(true)
                                                            break Success34;
                                                        }
                                                        term = term39;
                                                        IStrategoTerm term40 = term;
                                                        Success35:
                                                        { 
                                                          Fail72:
                                                          { 
                                                            IStrategoTerm m_57 = null;
                                                            m_57 = term;
                                                            term = equal_0_1.instance.invoke(context, m_57, extraction.constSortNoArgs23);
                                                            if(term == null)
                                                              break Fail72;
                                                            if(true)
                                                              break Success35;
                                                          }
                                                          term = term40;
                                                          IStrategoTerm term41 = term;
                                                          Success36:
                                                          { 
                                                            Fail73:
                                                            { 
                                                              IStrategoTerm k_57 = null;
                                                              k_57 = term;
                                                              term = equal_0_1.instance.invoke(context, k_57, extraction.constSortNoArgs22);
                                                              if(term == null)
                                                                break Fail73;
                                                              if(true)
                                                                break Success36;
                                                            }
                                                            term = term41;
                                                            IStrategoTerm term42 = term;
                                                            Success37:
                                                            { 
                                                              Fail74:
                                                              { 
                                                                IStrategoTerm i_57 = null;
                                                                i_57 = term;
                                                                term = equal_0_1.instance.invoke(context, i_57, extraction.constSortNoArgs24);
                                                                if(term == null)
                                                                  break Fail74;
                                                                if(true)
                                                                  break Success37;
                                                              }
                                                              term = term42;
                                                              IStrategoTerm term43 = term;
                                                              Success38:
                                                              { 
                                                                Fail75:
                                                                { 
                                                                  IStrategoTerm g_57 = null;
                                                                  g_57 = term;
                                                                  term = equal_0_1.instance.invoke(context, g_57, extraction.constSortNoArgs8);
                                                                  if(term == null)
                                                                    break Fail75;
                                                                  if(true)
                                                                    break Success38;
                                                                }
                                                                term = term43;
                                                                IStrategoTerm term44 = term;
                                                                Success39:
                                                                { 
                                                                  Fail76:
                                                                  { 
                                                                    IStrategoTerm c_57 = null;
                                                                    c_57 = term;
                                                                    term = equal_0_1.instance.invoke(context, c_57, extraction.constSortNoArgs25);
                                                                    if(term == null)
                                                                      break Fail76;
                                                                    if(true)
                                                                      break Success39;
                                                                  }
                                                                  term = term44;
                                                                  IStrategoTerm term45 = term;
                                                                  Success40:
                                                                  { 
                                                                    Fail77:
                                                                    { 
                                                                      IStrategoTerm a_57 = null;
                                                                      a_57 = term;
                                                                      term = equal_0_1.instance.invoke(context, a_57, extraction.constSortNoArgs26);
                                                                      if(term == null)
                                                                        break Fail77;
                                                                      if(true)
                                                                        break Success40;
                                                                    }
                                                                    term = term45;
                                                                    IStrategoTerm term46 = term;
                                                                    Success41:
                                                                    { 
                                                                      Fail78:
                                                                      { 
                                                                        IStrategoTerm y_56 = null;
                                                                        y_56 = term;
                                                                        term = equal_0_1.instance.invoke(context, y_56, extraction.constSortNoArgs8);
                                                                        if(term == null)
                                                                          break Fail78;
                                                                        if(true)
                                                                          break Success41;
                                                                      }
                                                                      term = term46;
                                                                      IStrategoTerm term47 = term;
                                                                      Success42:
                                                                      { 
                                                                        Fail79:
                                                                        { 
                                                                          IStrategoTerm v_56 = null;
                                                                          v_56 = term;
                                                                          term = equal_0_1.instance.invoke(context, v_56, extraction.constSortNoArgs24);
                                                                          if(term == null)
                                                                            break Fail79;
                                                                          if(true)
                                                                            break Success42;
                                                                        }
                                                                        term = term47;
                                                                        IStrategoTerm term48 = term;
                                                                        Success43:
                                                                        { 
                                                                          Fail80:
                                                                          { 
                                                                            IStrategoTerm t_56 = null;
                                                                            t_56 = term;
                                                                            term = equal_0_1.instance.invoke(context, t_56, extraction.constSortNoArgs25);
                                                                            if(term == null)
                                                                              break Fail80;
                                                                            if(true)
                                                                              break Success43;
                                                                          }
                                                                          term = term48;
                                                                          IStrategoTerm term49 = term;
                                                                          Success44:
                                                                          { 
                                                                            Fail81:
                                                                            { 
                                                                              IStrategoTerm q_56 = null;
                                                                              q_56 = term;
                                                                              term = equal_0_1.instance.invoke(context, q_56, extraction.constSortNoArgs26);
                                                                              if(term == null)
                                                                                break Fail81;
                                                                              if(true)
                                                                                break Success44;
                                                                            }
                                                                            term = term49;
                                                                            IStrategoTerm term50 = term;
                                                                            Success45:
                                                                            { 
                                                                              Fail82:
                                                                              { 
                                                                                IStrategoTerm o_56 = null;
                                                                                o_56 = term;
                                                                                term = equal_0_1.instance.invoke(context, o_56, extraction.constSortNoArgs27);
                                                                                if(term == null)
                                                                                  break Fail82;
                                                                                if(true)
                                                                                  break Success45;
                                                                              }
                                                                              term = term50;
                                                                              IStrategoTerm term51 = term;
                                                                              Success46:
                                                                              { 
                                                                                Fail83:
                                                                                { 
                                                                                  IStrategoTerm m_56 = null;
                                                                                  m_56 = term;
                                                                                  term = equal_0_1.instance.invoke(context, m_56, extraction.constSortNoArgs28);
                                                                                  if(term == null)
                                                                                    break Fail83;
                                                                                  if(true)
                                                                                    break Success46;
                                                                                }
                                                                                term = term51;
                                                                                IStrategoTerm term52 = term;
                                                                                Success47:
                                                                                { 
                                                                                  Fail84:
                                                                                  { 
                                                                                    IStrategoTerm k_56 = null;
                                                                                    k_56 = term;
                                                                                    term = equal_0_1.instance.invoke(context, k_56, extraction.constSortNoArgs29);
                                                                                    if(term == null)
                                                                                      break Fail84;
                                                                                    if(true)
                                                                                      break Success47;
                                                                                  }
                                                                                  term = term52;
                                                                                  IStrategoTerm term53 = term;
                                                                                  Success48:
                                                                                  { 
                                                                                    Fail85:
                                                                                    { 
                                                                                      IStrategoTerm i_56 = null;
                                                                                      i_56 = term;
                                                                                      term = equal_0_1.instance.invoke(context, i_56, extraction.constSortNoArgs30);
                                                                                      if(term == null)
                                                                                        break Fail85;
                                                                                      if(true)
                                                                                        break Success48;
                                                                                    }
                                                                                    term = term53;
                                                                                    IStrategoTerm term54 = term;
                                                                                    Success49:
                                                                                    { 
                                                                                      Fail86:
                                                                                      { 
                                                                                        IStrategoTerm e_56 = null;
                                                                                        e_56 = term;
                                                                                        term = equal_0_1.instance.invoke(context, e_56, extraction.constSortNoArgs31);
                                                                                        if(term == null)
                                                                                          break Fail86;
                                                                                        if(true)
                                                                                          break Success49;
                                                                                      }
                                                                                      term = term54;
                                                                                      IStrategoTerm term55 = term;
                                                                                      Success50:
                                                                                      { 
                                                                                        Fail87:
                                                                                        { 
                                                                                          IStrategoTerm c_56 = null;
                                                                                          c_56 = term;
                                                                                          term = equal_0_1.instance.invoke(context, c_56, extraction.constSortNoArgs32);
                                                                                          if(term == null)
                                                                                            break Fail87;
                                                                                          if(true)
                                                                                            break Success50;
                                                                                        }
                                                                                        term = term55;
                                                                                        IStrategoTerm term56 = term;
                                                                                        Success51:
                                                                                        { 
                                                                                          Fail88:
                                                                                          { 
                                                                                            IStrategoTerm a_56 = null;
                                                                                            a_56 = term;
                                                                                            term = equal_0_1.instance.invoke(context, a_56, extraction.constSortNoArgs33);
                                                                                            if(term == null)
                                                                                              break Fail88;
                                                                                            if(true)
                                                                                              break Success51;
                                                                                          }
                                                                                          term = term56;
                                                                                          IStrategoTerm term57 = term;
                                                                                          Success52:
                                                                                          { 
                                                                                            Fail89:
                                                                                            { 
                                                                                              IStrategoTerm y_55 = null;
                                                                                              y_55 = term;
                                                                                              term = equal_0_1.instance.invoke(context, y_55, extraction.constSortNoArgs34);
                                                                                              if(term == null)
                                                                                                break Fail89;
                                                                                              if(true)
                                                                                                break Success52;
                                                                                            }
                                                                                            term = term57;
                                                                                            IStrategoTerm term58 = term;
                                                                                            Success53:
                                                                                            { 
                                                                                              Fail90:
                                                                                              { 
                                                                                                IStrategoTerm u_55 = null;
                                                                                                u_55 = term;
                                                                                                term = equal_0_1.instance.invoke(context, u_55, extraction.constSortNoArgs35);
                                                                                                if(term == null)
                                                                                                  break Fail90;
                                                                                                if(true)
                                                                                                  break Success53;
                                                                                              }
                                                                                              term = term58;
                                                                                              IStrategoTerm term59 = term;
                                                                                              Success54:
                                                                                              { 
                                                                                                Fail91:
                                                                                                { 
                                                                                                  IStrategoTerm s_55 = null;
                                                                                                  s_55 = term;
                                                                                                  term = equal_0_1.instance.invoke(context, s_55, extraction.constSortNoArgs36);
                                                                                                  if(term == null)
                                                                                                    break Fail91;
                                                                                                  if(true)
                                                                                                    break Success54;
                                                                                                }
                                                                                                term = term59;
                                                                                                IStrategoTerm term60 = term;
                                                                                                Success55:
                                                                                                { 
                                                                                                  Fail92:
                                                                                                  { 
                                                                                                    IStrategoTerm q_55 = null;
                                                                                                    q_55 = term;
                                                                                                    term = equal_0_1.instance.invoke(context, q_55, extraction.constSortNoArgs19);
                                                                                                    if(term == null)
                                                                                                      break Fail92;
                                                                                                    if(true)
                                                                                                      break Success55;
                                                                                                  }
                                                                                                  term = term60;
                                                                                                  IStrategoTerm term61 = term;
                                                                                                  Success56:
                                                                                                  { 
                                                                                                    Fail93:
                                                                                                    { 
                                                                                                      IStrategoTerm o_55 = null;
                                                                                                      o_55 = term;
                                                                                                      term = equal_0_1.instance.invoke(context, o_55, extraction.constSortNoArgs37);
                                                                                                      if(term == null)
                                                                                                        break Fail93;
                                                                                                      if(true)
                                                                                                        break Success56;
                                                                                                    }
                                                                                                    term = term61;
                                                                                                    IStrategoTerm term62 = term;
                                                                                                    Success57:
                                                                                                    { 
                                                                                                      Fail94:
                                                                                                      { 
                                                                                                        IStrategoTerm k_55 = null;
                                                                                                        k_55 = term;
                                                                                                        term = equal_0_1.instance.invoke(context, k_55, extraction.constSortNoArgs38);
                                                                                                        if(term == null)
                                                                                                          break Fail94;
                                                                                                        if(true)
                                                                                                          break Success57;
                                                                                                      }
                                                                                                      term = term62;
                                                                                                      IStrategoTerm term63 = term;
                                                                                                      Success58:
                                                                                                      { 
                                                                                                        Fail95:
                                                                                                        { 
                                                                                                          IStrategoTerm i_55 = null;
                                                                                                          i_55 = term;
                                                                                                          term = equal_0_1.instance.invoke(context, i_55, extraction.constSortNoArgs30);
                                                                                                          if(term == null)
                                                                                                            break Fail95;
                                                                                                          if(true)
                                                                                                            break Success58;
                                                                                                        }
                                                                                                        term = term63;
                                                                                                        IStrategoTerm g_55 = null;
                                                                                                        g_55 = term;
                                                                                                        term = equal_0_1.instance.invoke(context, g_55, extraction.constSortNoArgs39);
                                                                                                        if(term == null)
                                                                                                          break Fail46;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}