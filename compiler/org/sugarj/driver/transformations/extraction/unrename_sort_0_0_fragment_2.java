package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class unrename_sort_0_0_fragment_2 extends Strategy 
{ 
  public static unrename_sort_0_0_fragment_2 instance = new unrename_sort_0_0_fragment_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("unrename_sort_0_0_fragment_2");
    Fail169:
    { 
      IStrategoTerm term131 = term;
      Success124:
      { 
        Fail170:
        { 
          IStrategoTerm z_88 = null;
          IStrategoTerm a_89 = null;
          a_89 = term;
          z_88 = extraction.constSortNoArgs104;
          term = a_89;
          if(term != z_88 && !z_88.match(term))
            break Fail170;
          term = extraction.constSortNoArgs4;
          if(true)
            break Success124;
        }
        term = term131;
        IStrategoTerm term132 = term;
        Success125:
        { 
          Fail171:
          { 
            IStrategoTerm u_88 = null;
            IStrategoTerm x_88 = null;
            x_88 = term;
            u_88 = extraction.constSortNoArgs105;
            term = x_88;
            if(term != u_88 && !u_88.match(term))
              break Fail171;
            term = extraction.constSortNoArgs3;
            if(true)
              break Success125;
          }
          term = term132;
          IStrategoTerm term133 = term;
          Success126:
          { 
            Fail172:
            { 
              IStrategoTerm s_88 = null;
              IStrategoTerm t_88 = null;
              t_88 = term;
              s_88 = extraction.constSortNoArgs106;
              term = t_88;
              if(term != s_88 && !s_88.match(term))
                break Fail172;
              term = extraction.constSortNoArgs98;
              if(true)
                break Success126;
            }
            term = term133;
            IStrategoTerm term134 = term;
            Success127:
            { 
              Fail173:
              { 
                IStrategoTerm q_88 = null;
                IStrategoTerm r_88 = null;
                r_88 = term;
                q_88 = extraction.constSortNoArgs107;
                term = r_88;
                if(term != q_88 && !q_88.match(term))
                  break Fail173;
                term = extraction.constSortNoArgs96;
                if(true)
                  break Success127;
              }
              term = term134;
              IStrategoTerm term135 = term;
              Success128:
              { 
                Fail174:
                { 
                  IStrategoTerm o_88 = null;
                  IStrategoTerm p_88 = null;
                  p_88 = term;
                  o_88 = extraction.constSortNoArgs108;
                  term = p_88;
                  if(term != o_88 && !o_88.match(term))
                    break Fail174;
                  term = extraction.constSortNoArgs97;
                  if(true)
                    break Success128;
                }
                term = term135;
                IStrategoTerm term136 = term;
                Success129:
                { 
                  Fail175:
                  { 
                    IStrategoTerm m_88 = null;
                    IStrategoTerm n_88 = null;
                    n_88 = term;
                    m_88 = extraction.constSortNoArgs109;
                    term = n_88;
                    if(term != m_88 && !m_88.match(term))
                      break Fail175;
                    term = extraction.constSortNoArgs95;
                    if(true)
                      break Success129;
                  }
                  term = term136;
                  IStrategoTerm term137 = term;
                  Success130:
                  { 
                    Fail176:
                    { 
                      IStrategoTerm k_88 = null;
                      IStrategoTerm l_88 = null;
                      l_88 = term;
                      k_88 = extraction.constSortNoArgs110;
                      term = l_88;
                      if(term != k_88 && !k_88.match(term))
                        break Fail176;
                      term = extraction.constSortNoArgs99;
                      if(true)
                        break Success130;
                    }
                    term = term137;
                    IStrategoTerm term138 = term;
                    Success131:
                    { 
                      Fail177:
                      { 
                        IStrategoTerm i_88 = null;
                        IStrategoTerm j_88 = null;
                        j_88 = term;
                        i_88 = extraction.constSortNoArgs111;
                        term = j_88;
                        if(term != i_88 && !i_88.match(term))
                          break Fail177;
                        term = extraction.constSortNoArgs112;
                        if(true)
                          break Success131;
                      }
                      term = term138;
                      IStrategoTerm term139 = term;
                      Success132:
                      { 
                        Fail178:
                        { 
                          IStrategoTerm g_88 = null;
                          IStrategoTerm h_88 = null;
                          h_88 = term;
                          g_88 = extraction.constSortNoArgs113;
                          term = h_88;
                          if(term != g_88 && !g_88.match(term))
                            break Fail178;
                          term = extraction.constSortNoArgs94;
                          if(true)
                            break Success132;
                        }
                        term = term139;
                        IStrategoTerm term140 = term;
                        Success133:
                        { 
                          Fail179:
                          { 
                            IStrategoTerm e_88 = null;
                            IStrategoTerm f_88 = null;
                            f_88 = term;
                            e_88 = extraction.constSortNoArgs114;
                            term = f_88;
                            if(term != e_88 && !e_88.match(term))
                              break Fail179;
                            term = extraction.constSortNoArgs115;
                            if(true)
                              break Success133;
                          }
                          term = term140;
                          IStrategoTerm term141 = term;
                          Success134:
                          { 
                            Fail180:
                            { 
                              IStrategoTerm r_87 = null;
                              IStrategoTerm s_87 = null;
                              s_87 = term;
                              r_87 = extraction.constSortNoArgs116;
                              term = s_87;
                              if(term != r_87 && !r_87.match(term))
                                break Fail180;
                              term = extraction.constSortNoArgs117;
                              if(true)
                                break Success134;
                            }
                            term = term141;
                            IStrategoTerm term142 = term;
                            Success135:
                            { 
                              Fail181:
                              { 
                                IStrategoTerm p_87 = null;
                                IStrategoTerm q_87 = null;
                                q_87 = term;
                                p_87 = extraction.constSortNoArgs118;
                                term = q_87;
                                if(term != p_87 && !p_87.match(term))
                                  break Fail181;
                                term = extraction.constSortNoArgs119;
                                if(true)
                                  break Success135;
                              }
                              term = term142;
                              IStrategoTerm term143 = term;
                              Success136:
                              { 
                                Fail182:
                                { 
                                  IStrategoTerm n_87 = null;
                                  IStrategoTerm o_87 = null;
                                  o_87 = term;
                                  n_87 = extraction.constSortNoArgs120;
                                  term = o_87;
                                  if(term != n_87 && !n_87.match(term))
                                    break Fail182;
                                  term = extraction.constSortNoArgs121;
                                  if(true)
                                    break Success136;
                                }
                                term = term143;
                                IStrategoTerm term144 = term;
                                Success137:
                                { 
                                  Fail183:
                                  { 
                                    IStrategoTerm k_87 = null;
                                    IStrategoTerm l_87 = null;
                                    l_87 = term;
                                    k_87 = extraction.constSortNoArgs122;
                                    term = l_87;
                                    if(term != k_87 && !k_87.match(term))
                                      break Fail183;
                                    term = extraction.constSortNoArgs123;
                                    if(true)
                                      break Success137;
                                  }
                                  term = term144;
                                  IStrategoTerm term145 = term;
                                  Success138:
                                  { 
                                    Fail184:
                                    { 
                                      IStrategoTerm i_87 = null;
                                      IStrategoTerm j_87 = null;
                                      j_87 = term;
                                      i_87 = extraction.constSortNoArgs124;
                                      term = j_87;
                                      if(term != i_87 && !i_87.match(term))
                                        break Fail184;
                                      term = extraction.constSortNoArgs125;
                                      if(true)
                                        break Success138;
                                    }
                                    term = term145;
                                    IStrategoTerm term146 = term;
                                    Success139:
                                    { 
                                      Fail185:
                                      { 
                                        IStrategoTerm y_86 = null;
                                        IStrategoTerm z_86 = null;
                                        z_86 = term;
                                        y_86 = extraction.constSortNoArgs126;
                                        term = z_86;
                                        if(term != y_86 && !y_86.match(term))
                                          break Fail185;
                                        term = extraction.constSortNoArgs127;
                                        if(true)
                                          break Success139;
                                      }
                                      term = term146;
                                      IStrategoTerm term147 = term;
                                      Success140:
                                      { 
                                        Fail186:
                                        { 
                                          IStrategoTerm w_86 = null;
                                          IStrategoTerm x_86 = null;
                                          x_86 = term;
                                          w_86 = extraction.constSortNoArgs128;
                                          term = x_86;
                                          if(term != w_86 && !w_86.match(term))
                                            break Fail186;
                                          term = extraction.constSortNoArgs129;
                                          if(true)
                                            break Success140;
                                        }
                                        term = term147;
                                        IStrategoTerm term148 = term;
                                        Success141:
                                        { 
                                          Fail187:
                                          { 
                                            IStrategoTerm f_86 = null;
                                            IStrategoTerm u_86 = null;
                                            u_86 = term;
                                            f_86 = extraction.constSortNoArgs130;
                                            term = u_86;
                                            if(term != f_86 && !f_86.match(term))
                                              break Fail187;
                                            term = extraction.constSortNoArgs131;
                                            if(true)
                                              break Success141;
                                          }
                                          term = term148;
                                          IStrategoTerm term149 = term;
                                          Success142:
                                          { 
                                            Fail188:
                                            { 
                                              IStrategoTerm c_86 = null;
                                              IStrategoTerm e_86 = null;
                                              e_86 = term;
                                              c_86 = extraction.constSortNoArgs132;
                                              term = e_86;
                                              if(term != c_86 && !c_86.match(term))
                                                break Fail188;
                                              term = extraction.constSortNoArgs133;
                                              if(true)
                                                break Success142;
                                            }
                                            term = term149;
                                            IStrategoTerm term150 = term;
                                            Success143:
                                            { 
                                              Fail189:
                                              { 
                                                IStrategoTerm z_85 = null;
                                                IStrategoTerm b_86 = null;
                                                b_86 = term;
                                                z_85 = extraction.constSortNoArgs134;
                                                term = b_86;
                                                if(term != z_85 && !z_85.match(term))
                                                  break Fail189;
                                                term = extraction.constSortNoArgs135;
                                                if(true)
                                                  break Success143;
                                              }
                                              term = term150;
                                              IStrategoTerm term151 = term;
                                              Success144:
                                              { 
                                                Fail190:
                                                { 
                                                  IStrategoTerm w_85 = null;
                                                  IStrategoTerm y_85 = null;
                                                  y_85 = term;
                                                  w_85 = extraction.constSortNoArgs136;
                                                  term = y_85;
                                                  if(term != w_85 && !w_85.match(term))
                                                    break Fail190;
                                                  term = extraction.constSortNoArgs7;
                                                  if(true)
                                                    break Success144;
                                                }
                                                term = term151;
                                                IStrategoTerm term152 = term;
                                                Success145:
                                                { 
                                                  Fail191:
                                                  { 
                                                    IStrategoTerm t_85 = null;
                                                    IStrategoTerm v_85 = null;
                                                    v_85 = term;
                                                    t_85 = extraction.constSortNoArgs137;
                                                    term = v_85;
                                                    if(term != t_85 && !t_85.match(term))
                                                      break Fail191;
                                                    term = extraction.constSortNoArgs6;
                                                    if(true)
                                                      break Success145;
                                                  }
                                                  term = term152;
                                                  IStrategoTerm term153 = term;
                                                  Success146:
                                                  { 
                                                    Fail192:
                                                    { 
                                                      IStrategoTerm q_85 = null;
                                                      IStrategoTerm s_85 = null;
                                                      s_85 = term;
                                                      q_85 = extraction.constSortNoArgs138;
                                                      term = s_85;
                                                      if(term != q_85 && !q_85.match(term))
                                                        break Fail192;
                                                      term = extraction.constSortNoArgs90;
                                                      if(true)
                                                        break Success146;
                                                    }
                                                    term = term153;
                                                    IStrategoTerm term154 = term;
                                                    Success147:
                                                    { 
                                                      Fail193:
                                                      { 
                                                        IStrategoTerm n_85 = null;
                                                        IStrategoTerm p_85 = null;
                                                        p_85 = term;
                                                        n_85 = extraction.constSortNoArgs139;
                                                        term = p_85;
                                                        if(term != n_85 && !n_85.match(term))
                                                          break Fail193;
                                                        term = extraction.constSortNoArgs67;
                                                        if(true)
                                                          break Success147;
                                                      }
                                                      term = term154;
                                                      IStrategoTerm term155 = term;
                                                      Success148:
                                                      { 
                                                        Fail194:
                                                        { 
                                                          IStrategoTerm k_85 = null;
                                                          IStrategoTerm m_85 = null;
                                                          m_85 = term;
                                                          k_85 = extraction.constSortNoArgs140;
                                                          term = m_85;
                                                          if(term != k_85 && !k_85.match(term))
                                                            break Fail194;
                                                          term = extraction.constSortNoArgs141;
                                                          if(true)
                                                            break Success148;
                                                        }
                                                        term = term155;
                                                        IStrategoTerm term156 = term;
                                                        Success149:
                                                        { 
                                                          Fail195:
                                                          { 
                                                            IStrategoTerm h_85 = null;
                                                            IStrategoTerm j_85 = null;
                                                            j_85 = term;
                                                            h_85 = extraction.constSortNoArgs142;
                                                            term = j_85;
                                                            if(term != h_85 && !h_85.match(term))
                                                              break Fail195;
                                                            term = extraction.constSortNoArgs91;
                                                            if(true)
                                                              break Success149;
                                                          }
                                                          term = term156;
                                                          IStrategoTerm term157 = term;
                                                          Success150:
                                                          { 
                                                            Fail196:
                                                            { 
                                                              IStrategoTerm e_85 = null;
                                                              IStrategoTerm f_85 = null;
                                                              f_85 = term;
                                                              e_85 = extraction.constSortNoArgs143;
                                                              term = f_85;
                                                              if(term != e_85 && !e_85.match(term))
                                                                break Fail196;
                                                              term = extraction.constSortNoArgs144;
                                                              if(true)
                                                                break Success150;
                                                            }
                                                            term = term157;
                                                            IStrategoTerm term158 = term;
                                                            Success151:
                                                            { 
                                                              Fail197:
                                                              { 
                                                                IStrategoTerm b_85 = null;
                                                                IStrategoTerm c_85 = null;
                                                                c_85 = term;
                                                                b_85 = extraction.constSortNoArgs145;
                                                                term = c_85;
                                                                if(term != b_85 && !b_85.match(term))
                                                                  break Fail197;
                                                                term = extraction.constSortNoArgs146;
                                                                if(true)
                                                                  break Success151;
                                                              }
                                                              term = term158;
                                                              IStrategoTerm term159 = term;
                                                              Success152:
                                                              { 
                                                                Fail198:
                                                                { 
                                                                  IStrategoTerm y_84 = null;
                                                                  IStrategoTerm z_84 = null;
                                                                  z_84 = term;
                                                                  y_84 = extraction.constSortNoArgs147;
                                                                  term = z_84;
                                                                  if(term != y_84 && !y_84.match(term))
                                                                    break Fail198;
                                                                  term = extraction.constSortNoArgs148;
                                                                  if(true)
                                                                    break Success152;
                                                                }
                                                                term = term159;
                                                                IStrategoTerm term160 = term;
                                                                Success153:
                                                                { 
                                                                  Fail199:
                                                                  { 
                                                                    IStrategoTerm v_84 = null;
                                                                    IStrategoTerm w_84 = null;
                                                                    w_84 = term;
                                                                    v_84 = extraction.constSortNoArgs149;
                                                                    term = w_84;
                                                                    if(term != v_84 && !v_84.match(term))
                                                                      break Fail199;
                                                                    term = extraction.constSortNoArgs150;
                                                                    if(true)
                                                                      break Success153;
                                                                  }
                                                                  term = term160;
                                                                  IStrategoTerm term161 = term;
                                                                  Success154:
                                                                  { 
                                                                    Fail200:
                                                                    { 
                                                                      IStrategoTerm s_84 = null;
                                                                      IStrategoTerm t_84 = null;
                                                                      t_84 = term;
                                                                      s_84 = extraction.constSortNoArgs151;
                                                                      term = t_84;
                                                                      if(term != s_84 && !s_84.match(term))
                                                                        break Fail200;
                                                                      term = extraction.constSortNoArgs5;
                                                                      if(true)
                                                                        break Success154;
                                                                    }
                                                                    term = term161;
                                                                    IStrategoTerm term162 = term;
                                                                    Success155:
                                                                    { 
                                                                      Fail201:
                                                                      { 
                                                                        IStrategoTerm p_84 = null;
                                                                        IStrategoTerm q_84 = null;
                                                                        q_84 = term;
                                                                        p_84 = extraction.constSortNoArgs152;
                                                                        term = q_84;
                                                                        if(term != p_84 && !p_84.match(term))
                                                                          break Fail201;
                                                                        term = extraction.constSortNoArgs2;
                                                                        if(true)
                                                                          break Success155;
                                                                      }
                                                                      term = term162;
                                                                      IStrategoTerm term163 = term;
                                                                      Success156:
                                                                      { 
                                                                        Fail202:
                                                                        { 
                                                                          IStrategoTerm m_84 = null;
                                                                          IStrategoTerm n_84 = null;
                                                                          n_84 = term;
                                                                          m_84 = extraction.constSortNoArgs153;
                                                                          term = n_84;
                                                                          if(term != m_84 && !m_84.match(term))
                                                                            break Fail202;
                                                                          term = extraction.constSortNoArgs16;
                                                                          if(true)
                                                                            break Success156;
                                                                        }
                                                                        term = term163;
                                                                        IStrategoTerm term164 = term;
                                                                        Success157:
                                                                        { 
                                                                          Fail203:
                                                                          { 
                                                                            IStrategoTerm j_84 = null;
                                                                            IStrategoTerm k_84 = null;
                                                                            k_84 = term;
                                                                            j_84 = extraction.constSortNoArgs154;
                                                                            term = k_84;
                                                                            if(term != j_84 && !j_84.match(term))
                                                                              break Fail203;
                                                                            term = extraction.constSortNoArgs93;
                                                                            if(true)
                                                                              break Success157;
                                                                          }
                                                                          term = term164;
                                                                          IStrategoTerm term165 = term;
                                                                          Success158:
                                                                          { 
                                                                            Fail204:
                                                                            { 
                                                                              IStrategoTerm f_84 = null;
                                                                              IStrategoTerm h_84 = null;
                                                                              h_84 = term;
                                                                              f_84 = extraction.constSortNoArgs155;
                                                                              term = h_84;
                                                                              if(term != f_84 && !f_84.match(term))
                                                                                break Fail204;
                                                                              term = extraction.constSortNoArgs156;
                                                                              if(true)
                                                                                break Success158;
                                                                            }
                                                                            term = term165;
                                                                            IStrategoTerm term166 = term;
                                                                            Success159:
                                                                            { 
                                                                              Fail205:
                                                                              { 
                                                                                IStrategoTerm d_84 = null;
                                                                                IStrategoTerm e_84 = null;
                                                                                e_84 = term;
                                                                                d_84 = extraction.constSortNoArgs157;
                                                                                term = e_84;
                                                                                if(term != d_84 && !d_84.match(term))
                                                                                  break Fail205;
                                                                                term = extraction.constSortNoArgs100;
                                                                                if(true)
                                                                                  break Success159;
                                                                              }
                                                                              term = term166;
                                                                              IStrategoTerm term167 = term;
                                                                              Success160:
                                                                              { 
                                                                                Fail206:
                                                                                { 
                                                                                  IStrategoTerm b_84 = null;
                                                                                  IStrategoTerm c_84 = null;
                                                                                  c_84 = term;
                                                                                  b_84 = extraction.constSortNoArgs158;
                                                                                  term = c_84;
                                                                                  if(term != b_84 && !b_84.match(term))
                                                                                    break Fail206;
                                                                                  term = extraction.constSortNoArgs18;
                                                                                  if(true)
                                                                                    break Success160;
                                                                                }
                                                                                term = term167;
                                                                                IStrategoTerm term168 = term;
                                                                                Success161:
                                                                                { 
                                                                                  Fail207:
                                                                                  { 
                                                                                    IStrategoTerm y_83 = null;
                                                                                    IStrategoTerm a_84 = null;
                                                                                    a_84 = term;
                                                                                    y_83 = extraction.constSortNoArgs159;
                                                                                    term = a_84;
                                                                                    if(term != y_83 && !y_83.match(term))
                                                                                      break Fail207;
                                                                                    term = extraction.constSortNoArgs30;
                                                                                    if(true)
                                                                                      break Success161;
                                                                                  }
                                                                                  term = term168;
                                                                                  IStrategoTerm term169 = term;
                                                                                  Success162:
                                                                                  { 
                                                                                    Fail208:
                                                                                    { 
                                                                                      IStrategoTerm v_83 = null;
                                                                                      IStrategoTerm x_83 = null;
                                                                                      x_83 = term;
                                                                                      v_83 = extraction.constSortNoArgs160;
                                                                                      term = x_83;
                                                                                      if(term != v_83 && !v_83.match(term))
                                                                                        break Fail208;
                                                                                      term = extraction.constSortNoArgs14;
                                                                                      if(true)
                                                                                        break Success162;
                                                                                    }
                                                                                    term = term169;
                                                                                    IStrategoTerm term170 = term;
                                                                                    Success163:
                                                                                    { 
                                                                                      Fail209:
                                                                                      { 
                                                                                        IStrategoTerm s_83 = null;
                                                                                        IStrategoTerm u_83 = null;
                                                                                        u_83 = term;
                                                                                        s_83 = extraction.constSortNoArgs161;
                                                                                        term = u_83;
                                                                                        if(term != s_83 && !s_83.match(term))
                                                                                          break Fail209;
                                                                                        term = extraction.constSortNoArgs13;
                                                                                        if(true)
                                                                                          break Success163;
                                                                                      }
                                                                                      term = term170;
                                                                                      IStrategoTerm term171 = term;
                                                                                      Success164:
                                                                                      { 
                                                                                        Fail210:
                                                                                        { 
                                                                                          IStrategoTerm o_83 = null;
                                                                                          IStrategoTerm r_83 = null;
                                                                                          r_83 = term;
                                                                                          o_83 = extraction.constSortNoArgs162;
                                                                                          term = r_83;
                                                                                          if(term != o_83 && !o_83.match(term))
                                                                                            break Fail210;
                                                                                          term = extraction.constSortNoArgs12;
                                                                                          if(true)
                                                                                            break Success164;
                                                                                        }
                                                                                        term = term171;
                                                                                        IStrategoTerm term172 = term;
                                                                                        Success165:
                                                                                        { 
                                                                                          Fail211:
                                                                                          { 
                                                                                            IStrategoTerm m_83 = null;
                                                                                            IStrategoTerm n_83 = null;
                                                                                            n_83 = term;
                                                                                            m_83 = extraction.constSortNoArgs163;
                                                                                            term = n_83;
                                                                                            if(term != m_83 && !m_83.match(term))
                                                                                              break Fail211;
                                                                                            term = extraction.constSortNoArgs11;
                                                                                            if(true)
                                                                                              break Success165;
                                                                                          }
                                                                                          term = term172;
                                                                                          IStrategoTerm term173 = term;
                                                                                          Success166:
                                                                                          { 
                                                                                            Fail212:
                                                                                            { 
                                                                                              IStrategoTerm h_83 = null;
                                                                                              IStrategoTerm l_83 = null;
                                                                                              l_83 = term;
                                                                                              h_83 = extraction.constSortNoArgs164;
                                                                                              term = l_83;
                                                                                              if(term != h_83 && !h_83.match(term))
                                                                                                break Fail212;
                                                                                              term = extraction.constSortNoArgs10;
                                                                                              if(true)
                                                                                                break Success166;
                                                                                            }
                                                                                            term = term173;
                                                                                            IStrategoTerm term174 = term;
                                                                                            Success167:
                                                                                            { 
                                                                                              Fail213:
                                                                                              { 
                                                                                                IStrategoTerm f_83 = null;
                                                                                                IStrategoTerm g_83 = null;
                                                                                                g_83 = term;
                                                                                                f_83 = extraction.constSortNoArgs165;
                                                                                                term = g_83;
                                                                                                if(term != f_83 && !f_83.match(term))
                                                                                                  break Fail213;
                                                                                                term = extraction.constSortNoArgs9;
                                                                                                if(true)
                                                                                                  break Success167;
                                                                                              }
                                                                                              term = term174;
                                                                                              IStrategoTerm term175 = term;
                                                                                              Success168:
                                                                                              { 
                                                                                                Fail214:
                                                                                                { 
                                                                                                  IStrategoTerm d_83 = null;
                                                                                                  IStrategoTerm e_83 = null;
                                                                                                  e_83 = term;
                                                                                                  d_83 = extraction.constSortNoArgs166;
                                                                                                  term = e_83;
                                                                                                  if(term != d_83 && !d_83.match(term))
                                                                                                    break Fail214;
                                                                                                  term = extraction.constSortNoArgs8;
                                                                                                  if(true)
                                                                                                    break Success168;
                                                                                                }
                                                                                                term = term175;
                                                                                                IStrategoTerm term176 = term;
                                                                                                Success169:
                                                                                                { 
                                                                                                  Fail215:
                                                                                                  { 
                                                                                                    IStrategoTerm b_83 = null;
                                                                                                    IStrategoTerm c_83 = null;
                                                                                                    c_83 = term;
                                                                                                    b_83 = extraction.constSortNoArgs167;
                                                                                                    term = c_83;
                                                                                                    if(term != b_83 && !b_83.match(term))
                                                                                                      break Fail215;
                                                                                                    term = extraction.constSortNoArgs103;
                                                                                                    if(true)
                                                                                                      break Success169;
                                                                                                  }
                                                                                                  term = term176;
                                                                                                  IStrategoTerm term177 = term;
                                                                                                  Success170:
                                                                                                  { 
                                                                                                    Fail216:
                                                                                                    { 
                                                                                                      IStrategoTerm z_82 = null;
                                                                                                      IStrategoTerm a_83 = null;
                                                                                                      a_83 = term;
                                                                                                      z_82 = extraction.constSortNoArgs168;
                                                                                                      term = a_83;
                                                                                                      if(term != z_82 && !z_82.match(term))
                                                                                                        break Fail216;
                                                                                                      term = extraction.constSortNoArgs169;
                                                                                                      if(true)
                                                                                                        break Success170;
                                                                                                    }
                                                                                                    term = term177;
                                                                                                    IStrategoTerm term178 = term;
                                                                                                    Success171:
                                                                                                    { 
                                                                                                      Fail217:
                                                                                                      { 
                                                                                                        IStrategoTerm x_82 = null;
                                                                                                        IStrategoTerm y_82 = null;
                                                                                                        y_82 = term;
                                                                                                        x_82 = extraction.constSortNoArgs170;
                                                                                                        term = y_82;
                                                                                                        if(term != x_82 && !x_82.match(term))
                                                                                                          break Fail217;
                                                                                                        term = extraction.constSortNoArgs101;
                                                                                                        if(true)
                                                                                                          break Success171;
                                                                                                      }
                                                                                                      term = term178;
                                                                                                      IStrategoTerm term179 = term;
                                                                                                      Success172:
                                                                                                      { 
                                                                                                        Fail218:
                                                                                                        { 
                                                                                                          IStrategoTerm u_82 = null;
                                                                                                          IStrategoTerm w_82 = null;
                                                                                                          w_82 = term;
                                                                                                          u_82 = extraction.constSortNoArgs171;
                                                                                                          term = w_82;
                                                                                                          if(term != u_82 && !u_82.match(term))
                                                                                                            break Fail218;
                                                                                                          term = extraction.constSortNoArgs172;
                                                                                                          if(true)
                                                                                                            break Success172;
                                                                                                        }
                                                                                                        term = term179;
                                                                                                        IStrategoTerm term180 = term;
                                                                                                        Success173:
                                                                                                        { 
                                                                                                          Fail219:
                                                                                                          { 
                                                                                                            IStrategoTerm s_82 = null;
                                                                                                            IStrategoTerm t_82 = null;
                                                                                                            t_82 = term;
                                                                                                            s_82 = extraction.constSortNoArgs173;
                                                                                                            term = t_82;
                                                                                                            if(term != s_82 && !s_82.match(term))
                                                                                                              break Fail219;
                                                                                                            term = extraction.constSortNoArgs174;
                                                                                                            if(true)
                                                                                                              break Success173;
                                                                                                          }
                                                                                                          term = term180;
                                                                                                          term = unrename_sort_0_0_fragment_1.instance.invoke(context, term);
                                                                                                          if(term == null)
                                                                                                            break Fail169;
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
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}