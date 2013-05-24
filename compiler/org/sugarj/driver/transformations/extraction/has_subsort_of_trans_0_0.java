package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class has_subsort_of_trans_0_0 extends Strategy 
{ 
  public static has_subsort_of_trans_0_0 instance = new has_subsort_of_trans_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("has_subsort_of_trans_0_0");
    Fail146:
    { 
      IStrategoTerm term109 = term;
      Success102:
      { 
        Fail147:
        { 
          IStrategoTerm g_73 = null;
          IStrategoTerm j_73 = null;
          IStrategoTerm k_73 = null;
          j_73 = term;
          g_73 = extraction.constSort8;
          k_73 = j_73;
          term = has_subsort_of_inject_0_2.instance.invoke(context, k_73, g_73, extraction.constSortNoArgs81);
          if(term == null)
            break Fail147;
          if(true)
            break Success102;
        }
        term = term109;
        IStrategoTerm term110 = term;
        Success103:
        { 
          Fail148:
          { 
            IStrategoTerm c_73 = null;
            IStrategoTerm e_73 = null;
            IStrategoTerm f_73 = null;
            e_73 = term;
            c_73 = extraction.constSort9;
            f_73 = e_73;
            term = has_subsort_of_inject_0_2.instance.invoke(context, f_73, c_73, extraction.constSortNoArgs83);
            if(term == null)
              break Fail148;
            if(true)
              break Success103;
          }
          term = term110;
          IStrategoTerm term111 = term;
          Success104:
          { 
            Fail149:
            { 
              IStrategoTerm x_72 = null;
              IStrategoTerm z_72 = null;
              IStrategoTerm b_73 = null;
              z_72 = term;
              x_72 = extraction.constSortNoArgs16;
              b_73 = z_72;
              term = has_subsort_of_inject_0_2.instance.invoke(context, b_73, x_72, extraction.constSortNoArgs84);
              if(term == null)
                break Fail149;
              if(true)
                break Success104;
            }
            term = term111;
            IStrategoTerm term112 = term;
            Success105:
            { 
              Fail150:
              { 
                IStrategoTerm s_72 = null;
                IStrategoTerm v_72 = null;
                IStrategoTerm w_72 = null;
                v_72 = term;
                s_72 = extraction.constSortNoArgs85;
                w_72 = v_72;
                term = has_subsort_of_inject_0_2.instance.invoke(context, w_72, s_72, extraction.constSortNoArgs84);
                if(term == null)
                  break Fail150;
                if(true)
                  break Success105;
              }
              term = term112;
              IStrategoTerm term113 = term;
              Success106:
              { 
                Fail151:
                { 
                  IStrategoTerm o_72 = null;
                  IStrategoTerm q_72 = null;
                  IStrategoTerm r_72 = null;
                  q_72 = term;
                  o_72 = extraction.constSortNoArgs86;
                  r_72 = q_72;
                  term = has_subsort_of_inject_0_2.instance.invoke(context, r_72, o_72, extraction.constSortNoArgs87);
                  if(term == null)
                    break Fail151;
                  if(true)
                    break Success106;
                }
                term = term113;
                IStrategoTerm term114 = term;
                Success107:
                { 
                  Fail152:
                  { 
                    IStrategoTerm k_72 = null;
                    IStrategoTerm m_72 = null;
                    IStrategoTerm n_72 = null;
                    m_72 = term;
                    k_72 = extraction.constSortNoArgs88;
                    n_72 = m_72;
                    term = has_subsort_of_inject_0_2.instance.invoke(context, n_72, k_72, extraction.constSortNoArgs89);
                    if(term == null)
                      break Fail152;
                    if(true)
                      break Success107;
                  }
                  term = term114;
                  IStrategoTerm term115 = term;
                  Success108:
                  { 
                    Fail153:
                    { 
                      IStrategoTerm g_72 = null;
                      IStrategoTerm i_72 = null;
                      IStrategoTerm j_72 = null;
                      i_72 = term;
                      g_72 = extraction.constSortNoArgs90;
                      j_72 = i_72;
                      term = has_subsort_of_inject_0_2.instance.invoke(context, j_72, g_72, extraction.constSortNoArgs91);
                      if(term == null)
                        break Fail153;
                      if(true)
                        break Success108;
                    }
                    term = term115;
                    IStrategoTerm term116 = term;
                    Success109:
                    { 
                      Fail154:
                      { 
                        IStrategoTerm c_72 = null;
                        IStrategoTerm e_72 = null;
                        IStrategoTerm f_72 = null;
                        e_72 = term;
                        c_72 = extraction.constSortNoArgs18;
                        f_72 = e_72;
                        term = has_subsort_of_inject_0_2.instance.invoke(context, f_72, c_72, extraction.constSortNoArgs92);
                        if(term == null)
                          break Fail154;
                        if(true)
                          break Success109;
                      }
                      term = term116;
                      IStrategoTerm term117 = term;
                      Success110:
                      { 
                        Fail155:
                        { 
                          IStrategoTerm y_71 = null;
                          IStrategoTerm a_72 = null;
                          IStrategoTerm b_72 = null;
                          a_72 = term;
                          y_71 = extraction.constSortNoArgs93;
                          b_72 = a_72;
                          term = has_subsort_of_inject_0_2.instance.invoke(context, b_72, y_71, extraction.constSortNoArgs94);
                          if(term == null)
                            break Fail155;
                          if(true)
                            break Success110;
                        }
                        term = term117;
                        IStrategoTerm term118 = term;
                        Success111:
                        { 
                          Fail156:
                          { 
                            IStrategoTerm u_71 = null;
                            IStrategoTerm w_71 = null;
                            IStrategoTerm x_71 = null;
                            w_71 = term;
                            u_71 = extraction.constSortNoArgs95;
                            x_71 = w_71;
                            term = has_subsort_of_inject_0_2.instance.invoke(context, x_71, u_71, extraction.constSortNoArgs96);
                            if(term == null)
                              break Fail156;
                            if(true)
                              break Success111;
                          }
                          term = term118;
                          IStrategoTerm term119 = term;
                          Success112:
                          { 
                            Fail157:
                            { 
                              IStrategoTerm o_71 = null;
                              IStrategoTerm s_71 = null;
                              IStrategoTerm t_71 = null;
                              s_71 = term;
                              o_71 = extraction.constSortNoArgs97;
                              t_71 = s_71;
                              term = has_subsort_of_inject_0_2.instance.invoke(context, t_71, o_71, extraction.constSortNoArgs96);
                              if(term == null)
                                break Fail157;
                              if(true)
                                break Success112;
                            }
                            term = term119;
                            IStrategoTerm term120 = term;
                            Success113:
                            { 
                              Fail158:
                              { 
                                IStrategoTerm k_71 = null;
                                IStrategoTerm m_71 = null;
                                IStrategoTerm n_71 = null;
                                m_71 = term;
                                k_71 = extraction.constSortNoArgs8;
                                n_71 = m_71;
                                term = has_subsort_of_inject_0_2.instance.invoke(context, n_71, k_71, extraction.constSortNoArgs98);
                                if(term == null)
                                  break Fail158;
                                if(true)
                                  break Success113;
                              }
                              term = term120;
                              IStrategoTerm term121 = term;
                              Success114:
                              { 
                                Fail159:
                                { 
                                  IStrategoTerm g_71 = null;
                                  IStrategoTerm i_71 = null;
                                  IStrategoTerm j_71 = null;
                                  i_71 = term;
                                  g_71 = extraction.constSortNoArgs18;
                                  j_71 = i_71;
                                  term = has_subsort_of_inject_0_2.instance.invoke(context, j_71, g_71, extraction.constSortNoArgs98);
                                  if(term == null)
                                    break Fail159;
                                  if(true)
                                    break Success114;
                                }
                                term = term121;
                                IStrategoTerm term122 = term;
                                Success115:
                                { 
                                  Fail160:
                                  { 
                                    IStrategoTerm a_71 = null;
                                    IStrategoTerm c_71 = null;
                                    IStrategoTerm d_71 = null;
                                    c_71 = term;
                                    a_71 = extraction.constSortNoArgs99;
                                    d_71 = c_71;
                                    term = has_subsort_of_inject_0_2.instance.invoke(context, d_71, a_71, extraction.constSortNoArgs98);
                                    if(term == null)
                                      break Fail160;
                                    if(true)
                                      break Success115;
                                  }
                                  term = term122;
                                  IStrategoTerm term123 = term;
                                  Success116:
                                  { 
                                    Fail161:
                                    { 
                                      IStrategoTerm t_70 = null;
                                      IStrategoTerm y_70 = null;
                                      IStrategoTerm z_70 = null;
                                      y_70 = term;
                                      t_70 = extraction.constSortNoArgs93;
                                      z_70 = y_70;
                                      term = has_subsort_of_inject_0_2.instance.invoke(context, z_70, t_70, extraction.constSortNoArgs5);
                                      if(term == null)
                                        break Fail161;
                                      if(true)
                                        break Success116;
                                    }
                                    term = term123;
                                    IStrategoTerm term124 = term;
                                    Success117:
                                    { 
                                      Fail162:
                                      { 
                                        IStrategoTerm m_70 = null;
                                        IStrategoTerm r_70 = null;
                                        IStrategoTerm s_70 = null;
                                        r_70 = term;
                                        m_70 = extraction.constSortNoArgs18;
                                        s_70 = r_70;
                                        term = has_subsort_of_inject_0_2.instance.invoke(context, s_70, m_70, extraction.constSortNoArgs6);
                                        if(term == null)
                                          break Fail162;
                                        if(true)
                                          break Success117;
                                      }
                                      term = term124;
                                      IStrategoTerm term125 = term;
                                      Success118:
                                      { 
                                        Fail163:
                                        { 
                                          IStrategoTerm g_70 = null;
                                          IStrategoTerm i_70 = null;
                                          IStrategoTerm l_70 = null;
                                          i_70 = term;
                                          g_70 = extraction.constSortNoArgs30;
                                          l_70 = i_70;
                                          term = has_subsort_of_inject_0_2.instance.invoke(context, l_70, g_70, extraction.constSortNoArgs93);
                                          if(term == null)
                                            break Fail163;
                                          if(true)
                                            break Success118;
                                        }
                                        term = term125;
                                        IStrategoTerm term126 = term;
                                        Success119:
                                        { 
                                          Fail164:
                                          { 
                                            IStrategoTerm c_70 = null;
                                            IStrategoTerm e_70 = null;
                                            IStrategoTerm f_70 = null;
                                            e_70 = term;
                                            c_70 = extraction.constSortNoArgs100;
                                            f_70 = e_70;
                                            term = has_subsort_of_inject_0_2.instance.invoke(context, f_70, c_70, extraction.constSortNoArgs93);
                                            if(term == null)
                                              break Fail164;
                                            if(true)
                                              break Success119;
                                          }
                                          term = term126;
                                          IStrategoTerm term127 = term;
                                          Success120:
                                          { 
                                            Fail165:
                                            { 
                                              IStrategoTerm w_69 = null;
                                              IStrategoTerm y_69 = null;
                                              IStrategoTerm b_70 = null;
                                              y_69 = term;
                                              w_69 = extraction.constSortNoArgs90;
                                              b_70 = y_69;
                                              term = has_subsort_of_inject_0_2.instance.invoke(context, b_70, w_69, extraction.constSortNoArgs93);
                                              if(term == null)
                                                break Fail165;
                                              if(true)
                                                break Success120;
                                            }
                                            term = term127;
                                            IStrategoTerm term128 = term;
                                            Success121:
                                            { 
                                              Fail166:
                                              { 
                                                IStrategoTerm s_69 = null;
                                                IStrategoTerm u_69 = null;
                                                IStrategoTerm v_69 = null;
                                                u_69 = term;
                                                s_69 = extraction.constSortNoArgs90;
                                                v_69 = u_69;
                                                term = has_subsort_of_inject_0_2.instance.invoke(context, v_69, s_69, extraction.constSortNoArgs16);
                                                if(term == null)
                                                  break Fail166;
                                                if(true)
                                                  break Success121;
                                              }
                                              term = term128;
                                              IStrategoTerm term129 = term;
                                              Success122:
                                              { 
                                                Fail167:
                                                { 
                                                  IStrategoTerm o_69 = null;
                                                  IStrategoTerm q_69 = null;
                                                  IStrategoTerm r_69 = null;
                                                  q_69 = term;
                                                  o_69 = extraction.constSort10;
                                                  r_69 = q_69;
                                                  term = has_subsort_of_inject_0_2.instance.invoke(context, r_69, o_69, extraction.constSortNoArgs102);
                                                  if(term == null)
                                                    break Fail167;
                                                  if(true)
                                                    break Success122;
                                                }
                                                term = term129;
                                                IStrategoTerm term130 = term;
                                                Success123:
                                                { 
                                                  Fail168:
                                                  { 
                                                    IStrategoTerm d_69 = null;
                                                    IStrategoTerm k_69 = null;
                                                    IStrategoTerm l_69 = null;
                                                    k_69 = term;
                                                    d_69 = extraction.constSort11;
                                                    l_69 = k_69;
                                                    term = has_subsort_of_inject_0_2.instance.invoke(context, l_69, d_69, extraction.constSortNoArgs103);
                                                    if(term == null)
                                                      break Fail168;
                                                    if(true)
                                                      break Success123;
                                                  }
                                                  term = term130;
                                                  term = has_subsort_of_trans_0_0_fragment_0.instance.invoke(context, term);
                                                  if(term == null)
                                                    break Fail146;
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