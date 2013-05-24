package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class has_subsort_of_trans_0_0_fragment_0 extends Strategy 
{ 
  public static has_subsort_of_trans_0_0_fragment_0 instance = new has_subsort_of_trans_0_0_fragment_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("has_subsort_of_trans_0_0_fragment_0");
    Fail113:
    { 
      IStrategoTerm term77 = term;
      Success70:
      { 
        Fail114:
        { 
          IStrategoTerm s_67 = null;
          IStrategoTerm e_68 = null;
          IStrategoTerm f_68 = null;
          e_68 = term;
          s_67 = extraction.constSortNoArgs0;
          f_68 = e_68;
          term = has_subsort_of_inject_0_2.instance.invoke(context, f_68, s_67, extraction.constSortNoArgs40);
          if(term == null)
            break Fail114;
          if(true)
            break Success70;
        }
        term = term77;
        IStrategoTerm term78 = term;
        Success71:
        { 
          Fail115:
          { 
            IStrategoTerm h_67 = null;
            IStrategoTerm j_67 = null;
            IStrategoTerm k_67 = null;
            j_67 = term;
            h_67 = extraction.constSortNoArgs41;
            k_67 = j_67;
            term = has_subsort_of_inject_0_2.instance.invoke(context, k_67, h_67, extraction.constSortNoArgs0);
            if(term == null)
              break Fail115;
            if(true)
              break Success71;
          }
          term = term78;
          IStrategoTerm term79 = term;
          Success72:
          { 
            Fail116:
            { 
              IStrategoTerm x_66 = null;
              IStrategoTerm b_67 = null;
              IStrategoTerm c_67 = null;
              b_67 = term;
              x_66 = extraction.constSortNoArgs41;
              c_67 = b_67;
              term = has_subsort_of_inject_0_2.instance.invoke(context, c_67, x_66, extraction.constSortNoArgs0);
              if(term == null)
                break Fail116;
              if(true)
                break Success72;
            }
            term = term79;
            IStrategoTerm term80 = term;
            Success73:
            { 
              Fail117:
              { 
                IStrategoTerm t_66 = null;
                IStrategoTerm v_66 = null;
                IStrategoTerm w_66 = null;
                v_66 = term;
                t_66 = extraction.constSortNoArgs0;
                w_66 = v_66;
                term = has_subsort_of_inject_0_2.instance.invoke(context, w_66, t_66, extraction.constSortNoArgs42);
                if(term == null)
                  break Fail117;
                if(true)
                  break Success73;
              }
              term = term80;
              IStrategoTerm term81 = term;
              Success74:
              { 
                Fail118:
                { 
                  IStrategoTerm p_66 = null;
                  IStrategoTerm r_66 = null;
                  IStrategoTerm s_66 = null;
                  r_66 = term;
                  p_66 = extraction.constSortNoArgs43;
                  s_66 = r_66;
                  term = has_subsort_of_inject_0_2.instance.invoke(context, s_66, p_66, extraction.constSortNoArgs44);
                  if(term == null)
                    break Fail118;
                  if(true)
                    break Success74;
                }
                term = term81;
                IStrategoTerm term82 = term;
                Success75:
                { 
                  Fail119:
                  { 
                    IStrategoTerm l_66 = null;
                    IStrategoTerm n_66 = null;
                    IStrategoTerm o_66 = null;
                    n_66 = term;
                    l_66 = extraction.constSortNoArgs45;
                    o_66 = n_66;
                    term = has_subsort_of_inject_0_2.instance.invoke(context, o_66, l_66, extraction.constSortNoArgs46);
                    if(term == null)
                      break Fail119;
                    if(true)
                      break Success75;
                  }
                  term = term82;
                  IStrategoTerm term83 = term;
                  Success76:
                  { 
                    Fail120:
                    { 
                      IStrategoTerm h_66 = null;
                      IStrategoTerm j_66 = null;
                      IStrategoTerm k_66 = null;
                      j_66 = term;
                      h_66 = extraction.constSortNoArgs47;
                      k_66 = j_66;
                      term = has_subsort_of_inject_0_2.instance.invoke(context, k_66, h_66, extraction.constSortNoArgs46);
                      if(term == null)
                        break Fail120;
                      if(true)
                        break Success76;
                    }
                    term = term83;
                    IStrategoTerm term84 = term;
                    Success77:
                    { 
                      Fail121:
                      { 
                        IStrategoTerm d_66 = null;
                        IStrategoTerm f_66 = null;
                        IStrategoTerm g_66 = null;
                        f_66 = term;
                        d_66 = extraction.constSortNoArgs45;
                        g_66 = f_66;
                        term = has_subsort_of_inject_0_2.instance.invoke(context, g_66, d_66, extraction.constSortNoArgs48);
                        if(term == null)
                          break Fail121;
                        if(true)
                          break Success77;
                      }
                      term = term84;
                      IStrategoTerm term85 = term;
                      Success78:
                      { 
                        Fail122:
                        { 
                          IStrategoTerm z_65 = null;
                          IStrategoTerm b_66 = null;
                          IStrategoTerm c_66 = null;
                          b_66 = term;
                          z_65 = extraction.constSortNoArgs49;
                          c_66 = b_66;
                          term = has_subsort_of_inject_0_2.instance.invoke(context, c_66, z_65, extraction.constSortNoArgs48);
                          if(term == null)
                            break Fail122;
                          if(true)
                            break Success78;
                        }
                        term = term85;
                        IStrategoTerm term86 = term;
                        Success79:
                        { 
                          Fail123:
                          { 
                            IStrategoTerm v_65 = null;
                            IStrategoTerm x_65 = null;
                            IStrategoTerm y_65 = null;
                            x_65 = term;
                            v_65 = extraction.constSortNoArgs49;
                            y_65 = x_65;
                            term = has_subsort_of_inject_0_2.instance.invoke(context, y_65, v_65, extraction.constSortNoArgs45);
                            if(term == null)
                              break Fail123;
                            if(true)
                              break Success79;
                          }
                          term = term86;
                          IStrategoTerm term87 = term;
                          Success80:
                          { 
                            Fail124:
                            { 
                              IStrategoTerm r_65 = null;
                              IStrategoTerm t_65 = null;
                              IStrategoTerm u_65 = null;
                              t_65 = term;
                              r_65 = extraction.constSortNoArgs47;
                              u_65 = t_65;
                              term = has_subsort_of_inject_0_2.instance.invoke(context, u_65, r_65, extraction.constSortNoArgs45);
                              if(term == null)
                                break Fail124;
                              if(true)
                                break Success80;
                            }
                            term = term87;
                            IStrategoTerm term88 = term;
                            Success81:
                            { 
                              Fail125:
                              { 
                                IStrategoTerm n_65 = null;
                                IStrategoTerm p_65 = null;
                                IStrategoTerm q_65 = null;
                                p_65 = term;
                                n_65 = extraction.constSortNoArgs8;
                                q_65 = p_65;
                                term = has_subsort_of_inject_0_2.instance.invoke(context, q_65, n_65, extraction.constSortNoArgs44);
                                if(term == null)
                                  break Fail125;
                                if(true)
                                  break Success81;
                              }
                              term = term88;
                              IStrategoTerm term89 = term;
                              Success82:
                              { 
                                Fail126:
                                { 
                                  IStrategoTerm j_65 = null;
                                  IStrategoTerm l_65 = null;
                                  IStrategoTerm m_65 = null;
                                  l_65 = term;
                                  j_65 = extraction.constSortNoArgs50;
                                  m_65 = l_65;
                                  term = has_subsort_of_inject_0_2.instance.invoke(context, m_65, j_65, extraction.constSortNoArgs51);
                                  if(term == null)
                                    break Fail126;
                                  if(true)
                                    break Success82;
                                }
                                term = term89;
                                IStrategoTerm term90 = term;
                                Success83:
                                { 
                                  Fail127:
                                  { 
                                    IStrategoTerm f_65 = null;
                                    IStrategoTerm h_65 = null;
                                    IStrategoTerm i_65 = null;
                                    h_65 = term;
                                    f_65 = extraction.constSortNoArgs50;
                                    i_65 = h_65;
                                    term = has_subsort_of_inject_0_2.instance.invoke(context, i_65, f_65, extraction.constSortNoArgs41);
                                    if(term == null)
                                      break Fail127;
                                    if(true)
                                      break Success83;
                                  }
                                  term = term90;
                                  IStrategoTerm term91 = term;
                                  Success84:
                                  { 
                                    Fail128:
                                    { 
                                      IStrategoTerm b_65 = null;
                                      IStrategoTerm d_65 = null;
                                      IStrategoTerm e_65 = null;
                                      d_65 = term;
                                      b_65 = extraction.constSortNoArgs52;
                                      e_65 = d_65;
                                      term = has_subsort_of_inject_0_2.instance.invoke(context, e_65, b_65, extraction.constSortNoArgs51);
                                      if(term == null)
                                        break Fail128;
                                      if(true)
                                        break Success84;
                                    }
                                    term = term91;
                                    IStrategoTerm term92 = term;
                                    Success85:
                                    { 
                                      Fail129:
                                      { 
                                        IStrategoTerm w_64 = null;
                                        IStrategoTerm z_64 = null;
                                        IStrategoTerm a_65 = null;
                                        z_64 = term;
                                        w_64 = extraction.constSortNoArgs52;
                                        a_65 = z_64;
                                        term = has_subsort_of_inject_0_2.instance.invoke(context, a_65, w_64, extraction.constSortNoArgs41);
                                        if(term == null)
                                          break Fail129;
                                        if(true)
                                          break Success85;
                                      }
                                      term = term92;
                                      IStrategoTerm term93 = term;
                                      Success86:
                                      { 
                                        Fail130:
                                        { 
                                          IStrategoTerm s_64 = null;
                                          IStrategoTerm u_64 = null;
                                          IStrategoTerm v_64 = null;
                                          u_64 = term;
                                          s_64 = extraction.constSortNoArgs53;
                                          v_64 = u_64;
                                          term = has_subsort_of_inject_0_2.instance.invoke(context, v_64, s_64, extraction.constSortNoArgs54);
                                          if(term == null)
                                            break Fail130;
                                          if(true)
                                            break Success86;
                                        }
                                        term = term93;
                                        IStrategoTerm term94 = term;
                                        Success87:
                                        { 
                                          Fail131:
                                          { 
                                            IStrategoTerm o_64 = null;
                                            IStrategoTerm q_64 = null;
                                            IStrategoTerm r_64 = null;
                                            q_64 = term;
                                            o_64 = extraction.constSortNoArgs0;
                                            r_64 = q_64;
                                            term = has_subsort_of_inject_0_2.instance.invoke(context, r_64, o_64, extraction.constSortNoArgs42);
                                            if(term == null)
                                              break Fail131;
                                            if(true)
                                              break Success87;
                                          }
                                          term = term94;
                                          IStrategoTerm term95 = term;
                                          Success88:
                                          { 
                                            Fail132:
                                            { 
                                              IStrategoTerm k_64 = null;
                                              IStrategoTerm m_64 = null;
                                              IStrategoTerm n_64 = null;
                                              m_64 = term;
                                              k_64 = extraction.constSortNoArgs55;
                                              n_64 = m_64;
                                              term = has_subsort_of_inject_0_2.instance.invoke(context, n_64, k_64, extraction.constSortNoArgs54);
                                              if(term == null)
                                                break Fail132;
                                              if(true)
                                                break Success88;
                                            }
                                            term = term95;
                                            IStrategoTerm term96 = term;
                                            Success89:
                                            { 
                                              Fail133:
                                              { 
                                                IStrategoTerm g_64 = null;
                                                IStrategoTerm i_64 = null;
                                                IStrategoTerm j_64 = null;
                                                i_64 = term;
                                                g_64 = extraction.constSort0;
                                                j_64 = i_64;
                                                term = has_subsort_of_inject_0_2.instance.invoke(context, j_64, g_64, extraction.constSortNoArgs57);
                                                if(term == null)
                                                  break Fail133;
                                                if(true)
                                                  break Success89;
                                              }
                                              term = term96;
                                              IStrategoTerm term97 = term;
                                              Success90:
                                              { 
                                                Fail134:
                                                { 
                                                  IStrategoTerm c_64 = null;
                                                  IStrategoTerm e_64 = null;
                                                  IStrategoTerm f_64 = null;
                                                  e_64 = term;
                                                  c_64 = extraction.constSort1;
                                                  f_64 = e_64;
                                                  term = has_subsort_of_inject_0_2.instance.invoke(context, f_64, c_64, extraction.constSortNoArgs59);
                                                  if(term == null)
                                                    break Fail134;
                                                  if(true)
                                                    break Success90;
                                                }
                                                term = term97;
                                                IStrategoTerm term98 = term;
                                                Success91:
                                                { 
                                                  Fail135:
                                                  { 
                                                    IStrategoTerm y_63 = null;
                                                    IStrategoTerm a_64 = null;
                                                    IStrategoTerm b_64 = null;
                                                    a_64 = term;
                                                    y_63 = extraction.constSortNoArgs60;
                                                    b_64 = a_64;
                                                    term = has_subsort_of_inject_0_2.instance.invoke(context, b_64, y_63, extraction.constSortNoArgs61);
                                                    if(term == null)
                                                      break Fail135;
                                                    if(true)
                                                      break Success91;
                                                  }
                                                  term = term98;
                                                  IStrategoTerm term99 = term;
                                                  Success92:
                                                  { 
                                                    Fail136:
                                                    { 
                                                      IStrategoTerm u_63 = null;
                                                      IStrategoTerm w_63 = null;
                                                      IStrategoTerm x_63 = null;
                                                      w_63 = term;
                                                      u_63 = extraction.constSortNoArgs61;
                                                      x_63 = w_63;
                                                      term = has_subsort_of_inject_0_2.instance.invoke(context, x_63, u_63, extraction.constSortNoArgs62);
                                                      if(term == null)
                                                        break Fail136;
                                                      if(true)
                                                        break Success92;
                                                    }
                                                    term = term99;
                                                    IStrategoTerm term100 = term;
                                                    Success93:
                                                    { 
                                                      Fail137:
                                                      { 
                                                        IStrategoTerm q_63 = null;
                                                        IStrategoTerm s_63 = null;
                                                        IStrategoTerm t_63 = null;
                                                        s_63 = term;
                                                        q_63 = extraction.constSort2;
                                                        t_63 = s_63;
                                                        term = has_subsort_of_inject_0_2.instance.invoke(context, t_63, q_63, extraction.constSortNoArgs64);
                                                        if(term == null)
                                                          break Fail137;
                                                        if(true)
                                                          break Success93;
                                                      }
                                                      term = term100;
                                                      IStrategoTerm term101 = term;
                                                      Success94:
                                                      { 
                                                        Fail138:
                                                        { 
                                                          IStrategoTerm m_63 = null;
                                                          IStrategoTerm o_63 = null;
                                                          IStrategoTerm p_63 = null;
                                                          o_63 = term;
                                                          m_63 = extraction.constSort3;
                                                          p_63 = o_63;
                                                          term = has_subsort_of_inject_0_2.instance.invoke(context, p_63, m_63, extraction.constSortNoArgs66);
                                                          if(term == null)
                                                            break Fail138;
                                                          if(true)
                                                            break Success94;
                                                        }
                                                        term = term101;
                                                        IStrategoTerm term102 = term;
                                                        Success95:
                                                        { 
                                                          Fail139:
                                                          { 
                                                            IStrategoTerm g_63 = null;
                                                            IStrategoTerm k_63 = null;
                                                            IStrategoTerm l_63 = null;
                                                            k_63 = term;
                                                            g_63 = extraction.constSort4;
                                                            l_63 = k_63;
                                                            term = has_subsort_of_inject_0_2.instance.invoke(context, l_63, g_63, extraction.constSortNoArgs68);
                                                            if(term == null)
                                                              break Fail139;
                                                            if(true)
                                                              break Success95;
                                                          }
                                                          term = term102;
                                                          IStrategoTerm term103 = term;
                                                          Success96:
                                                          { 
                                                            Fail140:
                                                            { 
                                                              IStrategoTerm c_63 = null;
                                                              IStrategoTerm e_63 = null;
                                                              IStrategoTerm f_63 = null;
                                                              e_63 = term;
                                                              c_63 = extraction.constSort5;
                                                              f_63 = e_63;
                                                              term = has_subsort_of_inject_0_2.instance.invoke(context, f_63, c_63, extraction.constSortNoArgs70);
                                                              if(term == null)
                                                                break Fail140;
                                                              if(true)
                                                                break Success96;
                                                            }
                                                            term = term103;
                                                            IStrategoTerm term104 = term;
                                                            Success97:
                                                            { 
                                                              Fail141:
                                                              { 
                                                                IStrategoTerm y_62 = null;
                                                                IStrategoTerm a_63 = null;
                                                                IStrategoTerm b_63 = null;
                                                                a_63 = term;
                                                                y_62 = extraction.constSort6;
                                                                b_63 = a_63;
                                                                term = has_subsort_of_inject_0_2.instance.invoke(context, b_63, y_62, extraction.constSortNoArgs72);
                                                                if(term == null)
                                                                  break Fail141;
                                                                if(true)
                                                                  break Success97;
                                                              }
                                                              term = term104;
                                                              IStrategoTerm term105 = term;
                                                              Success98:
                                                              { 
                                                                Fail142:
                                                                { 
                                                                  IStrategoTerm s_62 = null;
                                                                  IStrategoTerm w_62 = null;
                                                                  IStrategoTerm x_62 = null;
                                                                  w_62 = term;
                                                                  s_62 = extraction.constSort7;
                                                                  x_62 = w_62;
                                                                  term = has_subsort_of_inject_0_2.instance.invoke(context, x_62, s_62, extraction.constSortNoArgs74);
                                                                  if(term == null)
                                                                    break Fail142;
                                                                  if(true)
                                                                    break Success98;
                                                                }
                                                                term = term105;
                                                                IStrategoTerm term106 = term;
                                                                Success99:
                                                                { 
                                                                  Fail143:
                                                                  { 
                                                                    IStrategoTerm o_62 = null;
                                                                    IStrategoTerm q_62 = null;
                                                                    IStrategoTerm r_62 = null;
                                                                    q_62 = term;
                                                                    o_62 = extraction.constSortNoArgs75;
                                                                    r_62 = q_62;
                                                                    term = has_subsort_of_inject_0_2.instance.invoke(context, r_62, o_62, extraction.constSortNoArgs76);
                                                                    if(term == null)
                                                                      break Fail143;
                                                                    if(true)
                                                                      break Success99;
                                                                  }
                                                                  term = term106;
                                                                  IStrategoTerm term107 = term;
                                                                  Success100:
                                                                  { 
                                                                    Fail144:
                                                                    { 
                                                                      IStrategoTerm j_62 = null;
                                                                      IStrategoTerm m_62 = null;
                                                                      IStrategoTerm n_62 = null;
                                                                      m_62 = term;
                                                                      j_62 = extraction.constSortNoArgs75;
                                                                      n_62 = m_62;
                                                                      term = has_subsort_of_inject_0_2.instance.invoke(context, n_62, j_62, extraction.constSortNoArgs77);
                                                                      if(term == null)
                                                                        break Fail144;
                                                                      if(true)
                                                                        break Success100;
                                                                    }
                                                                    term = term107;
                                                                    IStrategoTerm term108 = term;
                                                                    Success101:
                                                                    { 
                                                                      Fail145:
                                                                      { 
                                                                        IStrategoTerm f_62 = null;
                                                                        IStrategoTerm h_62 = null;
                                                                        IStrategoTerm i_62 = null;
                                                                        h_62 = term;
                                                                        f_62 = extraction.constSortNoArgs16;
                                                                        i_62 = h_62;
                                                                        term = has_subsort_of_inject_0_2.instance.invoke(context, i_62, f_62, extraction.constSortNoArgs77);
                                                                        if(term == null)
                                                                          break Fail145;
                                                                        if(true)
                                                                          break Success101;
                                                                      }
                                                                      term = term108;
                                                                      IStrategoTerm b_62 = null;
                                                                      IStrategoTerm d_62 = null;
                                                                      IStrategoTerm e_62 = null;
                                                                      d_62 = term;
                                                                      b_62 = extraction.constSortNoArgs78;
                                                                      e_62 = d_62;
                                                                      term = has_subsort_of_inject_0_2.instance.invoke(context, e_62, b_62, extraction.constSortNoArgs79);
                                                                      if(term == null)
                                                                        break Fail113;
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