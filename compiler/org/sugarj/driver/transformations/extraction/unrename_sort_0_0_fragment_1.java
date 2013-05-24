package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class unrename_sort_0_0_fragment_1 extends Strategy 
{ 
  public static unrename_sort_0_0_fragment_1 instance = new unrename_sort_0_0_fragment_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("unrename_sort_0_0_fragment_1");
    Fail220:
    { 
      IStrategoTerm term181 = term;
      Success174:
      { 
        Fail221:
        { 
          IStrategoTerm q_82 = null;
          IStrategoTerm r_82 = null;
          r_82 = term;
          q_82 = extraction.constSortNoArgs175;
          term = r_82;
          if(term != q_82 && !q_82.match(term))
            break Fail221;
          term = extraction.constSortNoArgs102;
          if(true)
            break Success174;
        }
        term = term181;
        IStrategoTerm term182 = term;
        Success175:
        { 
          Fail222:
          { 
            IStrategoTerm o_82 = null;
            IStrategoTerm p_82 = null;
            p_82 = term;
            o_82 = extraction.constSortNoArgs176;
            term = p_82;
            if(term != o_82 && !o_82.match(term))
              break Fail222;
            term = extraction.constSortNoArgs177;
            if(true)
              break Success175;
          }
          term = term182;
          IStrategoTerm term183 = term;
          Success176:
          { 
            Fail223:
            { 
              IStrategoTerm m_82 = null;
              IStrategoTerm n_82 = null;
              n_82 = term;
              m_82 = extraction.constSortNoArgs178;
              term = n_82;
              if(term != m_82 && !m_82.match(term))
                break Fail223;
              term = extraction.constSortNoArgs179;
              if(true)
                break Success176;
            }
            term = term183;
            IStrategoTerm term184 = term;
            Success177:
            { 
              Fail224:
              { 
                IStrategoTerm k_82 = null;
                IStrategoTerm l_82 = null;
                l_82 = term;
                k_82 = extraction.constSortNoArgs180;
                term = l_82;
                if(term != k_82 && !k_82.match(term))
                  break Fail224;
                term = extraction.constSortNoArgs55;
                if(true)
                  break Success177;
              }
              term = term184;
              IStrategoTerm term185 = term;
              Success178:
              { 
                Fail225:
                { 
                  IStrategoTerm i_82 = null;
                  IStrategoTerm j_82 = null;
                  j_82 = term;
                  i_82 = extraction.constSortNoArgs181;
                  term = j_82;
                  if(term != i_82 && !i_82.match(term))
                    break Fail225;
                  term = extraction.constSortNoArgs182;
                  if(true)
                    break Success178;
                }
                term = term185;
                IStrategoTerm term186 = term;
                Success179:
                { 
                  Fail226:
                  { 
                    IStrategoTerm g_82 = null;
                    IStrategoTerm h_82 = null;
                    h_82 = term;
                    g_82 = extraction.constSortNoArgs183;
                    term = h_82;
                    if(term != g_82 && !g_82.match(term))
                      break Fail226;
                    term = extraction.constSortNoArgs184;
                    if(true)
                      break Success179;
                  }
                  term = term186;
                  IStrategoTerm term187 = term;
                  Success180:
                  { 
                    Fail227:
                    { 
                      IStrategoTerm e_82 = null;
                      IStrategoTerm f_82 = null;
                      f_82 = term;
                      e_82 = extraction.constSortNoArgs185;
                      term = f_82;
                      if(term != e_82 && !e_82.match(term))
                        break Fail227;
                      term = extraction.constSortNoArgs186;
                      if(true)
                        break Success180;
                    }
                    term = term187;
                    IStrategoTerm term188 = term;
                    Success181:
                    { 
                      Fail228:
                      { 
                        IStrategoTerm c_82 = null;
                        IStrategoTerm d_82 = null;
                        d_82 = term;
                        c_82 = extraction.constSortNoArgs187;
                        term = d_82;
                        if(term != c_82 && !c_82.match(term))
                          break Fail228;
                        term = extraction.constSortNoArgs40;
                        if(true)
                          break Success181;
                      }
                      term = term188;
                      IStrategoTerm term189 = term;
                      Success182:
                      { 
                        Fail229:
                        { 
                          IStrategoTerm a_82 = null;
                          IStrategoTerm b_82 = null;
                          b_82 = term;
                          a_82 = extraction.constSortNoArgs188;
                          term = b_82;
                          if(term != a_82 && !a_82.match(term))
                            break Fail229;
                          term = extraction.constSortNoArgs189;
                          if(true)
                            break Success182;
                        }
                        term = term189;
                        IStrategoTerm term190 = term;
                        Success183:
                        { 
                          Fail230:
                          { 
                            IStrategoTerm y_81 = null;
                            IStrategoTerm z_81 = null;
                            z_81 = term;
                            y_81 = extraction.constSortNoArgs190;
                            term = z_81;
                            if(term != y_81 && !y_81.match(term))
                              break Fail230;
                            term = extraction.constSortNoArgs43;
                            if(true)
                              break Success183;
                          }
                          term = term190;
                          IStrategoTerm term191 = term;
                          Success184:
                          { 
                            Fail231:
                            { 
                              IStrategoTerm w_81 = null;
                              IStrategoTerm x_81 = null;
                              x_81 = term;
                              w_81 = extraction.constSortNoArgs191;
                              term = x_81;
                              if(term != w_81 && !w_81.match(term))
                                break Fail231;
                              term = extraction.constSortNoArgs192;
                              if(true)
                                break Success184;
                            }
                            term = term191;
                            IStrategoTerm term192 = term;
                            Success185:
                            { 
                              Fail232:
                              { 
                                IStrategoTerm u_81 = null;
                                IStrategoTerm v_81 = null;
                                v_81 = term;
                                u_81 = extraction.constSortNoArgs86;
                                term = v_81;
                                if(term != u_81 && !u_81.match(term))
                                  break Fail232;
                                term = extraction.constSortNoArgs193;
                                if(true)
                                  break Success185;
                              }
                              term = term192;
                              IStrategoTerm term193 = term;
                              Success186:
                              { 
                                Fail233:
                                { 
                                  IStrategoTerm s_81 = null;
                                  IStrategoTerm t_81 = null;
                                  t_81 = term;
                                  s_81 = extraction.constSortNoArgs194;
                                  term = t_81;
                                  if(term != s_81 && !s_81.match(term))
                                    break Fail233;
                                  term = extraction.constSortNoArgs65;
                                  if(true)
                                    break Success186;
                                }
                                term = term193;
                                IStrategoTerm term194 = term;
                                Success187:
                                { 
                                  Fail234:
                                  { 
                                    IStrategoTerm q_81 = null;
                                    IStrategoTerm r_81 = null;
                                    r_81 = term;
                                    q_81 = extraction.constSortNoArgs195;
                                    term = r_81;
                                    if(term != q_81 && !q_81.match(term))
                                      break Fail234;
                                    term = extraction.constSortNoArgs196;
                                    if(true)
                                      break Success187;
                                  }
                                  term = term194;
                                  IStrategoTerm term195 = term;
                                  Success188:
                                  { 
                                    Fail235:
                                    { 
                                      IStrategoTerm n_81 = null;
                                      IStrategoTerm o_81 = null;
                                      o_81 = term;
                                      n_81 = extraction.constSortNoArgs197;
                                      term = o_81;
                                      if(term != n_81 && !n_81.match(term))
                                        break Fail235;
                                      term = extraction.constSortNoArgs198;
                                      if(true)
                                        break Success188;
                                    }
                                    term = term195;
                                    IStrategoTerm term196 = term;
                                    Success189:
                                    { 
                                      Fail236:
                                      { 
                                        IStrategoTerm l_81 = null;
                                        IStrategoTerm m_81 = null;
                                        m_81 = term;
                                        l_81 = extraction.constSortNoArgs199;
                                        term = m_81;
                                        if(term != l_81 && !l_81.match(term))
                                          break Fail236;
                                        term = extraction.constSortNoArgs53;
                                        if(true)
                                          break Success189;
                                      }
                                      term = term196;
                                      IStrategoTerm term197 = term;
                                      Success190:
                                      { 
                                        Fail237:
                                        { 
                                          IStrategoTerm j_81 = null;
                                          IStrategoTerm k_81 = null;
                                          k_81 = term;
                                          j_81 = extraction.constSortNoArgs200;
                                          term = k_81;
                                          if(term != j_81 && !j_81.match(term))
                                            break Fail237;
                                          term = extraction.constSortNoArgs201;
                                          if(true)
                                            break Success190;
                                        }
                                        term = term197;
                                        IStrategoTerm term198 = term;
                                        Success191:
                                        { 
                                          Fail238:
                                          { 
                                            IStrategoTerm h_81 = null;
                                            IStrategoTerm i_81 = null;
                                            i_81 = term;
                                            h_81 = extraction.constSortNoArgs82;
                                            term = i_81;
                                            if(term != h_81 && !h_81.match(term))
                                              break Fail238;
                                            term = extraction.constSortNoArgs54;
                                            if(true)
                                              break Success191;
                                          }
                                          term = term198;
                                          IStrategoTerm term199 = term;
                                          Success192:
                                          { 
                                            Fail239:
                                            { 
                                              IStrategoTerm f_81 = null;
                                              IStrategoTerm g_81 = null;
                                              g_81 = term;
                                              f_81 = extraction.constSortNoArgs202;
                                              term = g_81;
                                              if(term != f_81 && !f_81.match(term))
                                                break Fail239;
                                              term = extraction.constSortNoArgs45;
                                              if(true)
                                                break Success192;
                                            }
                                            term = term199;
                                            IStrategoTerm term200 = term;
                                            Success193:
                                            { 
                                              Fail240:
                                              { 
                                                IStrategoTerm d_81 = null;
                                                IStrategoTerm e_81 = null;
                                                e_81 = term;
                                                d_81 = extraction.constSortNoArgs203;
                                                term = e_81;
                                                if(term != d_81 && !d_81.match(term))
                                                  break Fail240;
                                                term = extraction.constSortNoArgs48;
                                                if(true)
                                                  break Success193;
                                              }
                                              term = term200;
                                              IStrategoTerm term201 = term;
                                              Success194:
                                              { 
                                                Fail241:
                                                { 
                                                  IStrategoTerm b_81 = null;
                                                  IStrategoTerm c_81 = null;
                                                  c_81 = term;
                                                  b_81 = extraction.constSortNoArgs204;
                                                  term = c_81;
                                                  if(term != b_81 && !b_81.match(term))
                                                    break Fail241;
                                                  term = extraction.constSortNoArgs46;
                                                  if(true)
                                                    break Success194;
                                                }
                                                term = term201;
                                                IStrategoTerm term202 = term;
                                                Success195:
                                                { 
                                                  Fail242:
                                                  { 
                                                    IStrategoTerm v_80 = null;
                                                    IStrategoTerm a_81 = null;
                                                    a_81 = term;
                                                    v_80 = extraction.constSortNoArgs205;
                                                    term = a_81;
                                                    if(term != v_80 && !v_80.match(term))
                                                      break Fail242;
                                                    term = extraction.constSortNoArgs49;
                                                    if(true)
                                                      break Success195;
                                                  }
                                                  term = term202;
                                                  IStrategoTerm term203 = term;
                                                  Success196:
                                                  { 
                                                    Fail243:
                                                    { 
                                                      IStrategoTerm t_80 = null;
                                                      IStrategoTerm u_80 = null;
                                                      u_80 = term;
                                                      t_80 = extraction.constSortNoArgs206;
                                                      term = u_80;
                                                      if(term != t_80 && !t_80.match(term))
                                                        break Fail243;
                                                      term = extraction.constSortNoArgs47;
                                                      if(true)
                                                        break Success196;
                                                    }
                                                    term = term203;
                                                    IStrategoTerm term204 = term;
                                                    Success197:
                                                    { 
                                                      Fail244:
                                                      { 
                                                        IStrategoTerm r_80 = null;
                                                        IStrategoTerm s_80 = null;
                                                        s_80 = term;
                                                        r_80 = extraction.constSortNoArgs207;
                                                        term = s_80;
                                                        if(term != r_80 && !r_80.match(term))
                                                          break Fail244;
                                                        term = extraction.constSortNoArgs208;
                                                        if(true)
                                                          break Success197;
                                                      }
                                                      term = term204;
                                                      IStrategoTerm term205 = term;
                                                      Success198:
                                                      { 
                                                        Fail245:
                                                        { 
                                                          IStrategoTerm p_80 = null;
                                                          IStrategoTerm q_80 = null;
                                                          q_80 = term;
                                                          p_80 = extraction.constSortNoArgs209;
                                                          term = q_80;
                                                          if(term != p_80 && !p_80.match(term))
                                                            break Fail245;
                                                          term = extraction.constSortNoArgs30;
                                                          if(true)
                                                            break Success198;
                                                        }
                                                        term = term205;
                                                        IStrategoTerm term206 = term;
                                                        Success199:
                                                        { 
                                                          Fail246:
                                                          { 
                                                            IStrategoTerm n_80 = null;
                                                            IStrategoTerm o_80 = null;
                                                            o_80 = term;
                                                            n_80 = extraction.constSortNoArgs210;
                                                            term = o_80;
                                                            if(term != n_80 && !n_80.match(term))
                                                              break Fail246;
                                                            term = extraction.constSortNoArgs211;
                                                            if(true)
                                                              break Success199;
                                                          }
                                                          term = term206;
                                                          IStrategoTerm term207 = term;
                                                          Success200:
                                                          { 
                                                            Fail247:
                                                            { 
                                                              IStrategoTerm l_80 = null;
                                                              IStrategoTerm m_80 = null;
                                                              m_80 = term;
                                                              l_80 = extraction.constSortNoArgs212;
                                                              term = m_80;
                                                              if(term != l_80 && !l_80.match(term))
                                                                break Fail247;
                                                              term = extraction.constSortNoArgs52;
                                                              if(true)
                                                                break Success200;
                                                            }
                                                            term = term207;
                                                            IStrategoTerm term208 = term;
                                                            Success201:
                                                            { 
                                                              Fail248:
                                                              { 
                                                                IStrategoTerm h_80 = null;
                                                                IStrategoTerm k_80 = null;
                                                                k_80 = term;
                                                                h_80 = extraction.constSortNoArgs213;
                                                                term = k_80;
                                                                if(term != h_80 && !h_80.match(term))
                                                                  break Fail248;
                                                                term = extraction.constSortNoArgs44;
                                                                if(true)
                                                                  break Success201;
                                                              }
                                                              term = term208;
                                                              IStrategoTerm term209 = term;
                                                              Success202:
                                                              { 
                                                                Fail249:
                                                                { 
                                                                  IStrategoTerm f_80 = null;
                                                                  IStrategoTerm g_80 = null;
                                                                  g_80 = term;
                                                                  f_80 = extraction.constSortNoArgs214;
                                                                  term = g_80;
                                                                  if(term != f_80 && !f_80.match(term))
                                                                    break Fail249;
                                                                  term = extraction.constSortNoArgs50;
                                                                  if(true)
                                                                    break Success202;
                                                                }
                                                                term = term209;
                                                                IStrategoTerm term210 = term;
                                                                Success203:
                                                                { 
                                                                  Fail250:
                                                                  { 
                                                                    IStrategoTerm d_80 = null;
                                                                    IStrategoTerm e_80 = null;
                                                                    e_80 = term;
                                                                    d_80 = extraction.constSortNoArgs215;
                                                                    term = e_80;
                                                                    if(term != d_80 && !d_80.match(term))
                                                                      break Fail250;
                                                                    term = extraction.constSortNoArgs21;
                                                                    if(true)
                                                                      break Success203;
                                                                  }
                                                                  term = term210;
                                                                  IStrategoTerm term211 = term;
                                                                  Success204:
                                                                  { 
                                                                    Fail251:
                                                                    { 
                                                                      IStrategoTerm b_80 = null;
                                                                      IStrategoTerm c_80 = null;
                                                                      c_80 = term;
                                                                      b_80 = extraction.constSortNoArgs216;
                                                                      term = c_80;
                                                                      if(term != b_80 && !b_80.match(term))
                                                                        break Fail251;
                                                                      term = extraction.constSortNoArgs20;
                                                                      if(true)
                                                                        break Success204;
                                                                    }
                                                                    term = term211;
                                                                    IStrategoTerm term212 = term;
                                                                    Success205:
                                                                    { 
                                                                      Fail252:
                                                                      { 
                                                                        IStrategoTerm z_79 = null;
                                                                        IStrategoTerm a_80 = null;
                                                                        a_80 = term;
                                                                        z_79 = extraction.constSortNoArgs217;
                                                                        term = a_80;
                                                                        if(term != z_79 && !z_79.match(term))
                                                                          break Fail252;
                                                                        term = extraction.constSortNoArgs19;
                                                                        if(true)
                                                                          break Success205;
                                                                      }
                                                                      term = term212;
                                                                      IStrategoTerm term213 = term;
                                                                      Success206:
                                                                      { 
                                                                        Fail253:
                                                                        { 
                                                                          IStrategoTerm x_79 = null;
                                                                          IStrategoTerm y_79 = null;
                                                                          y_79 = term;
                                                                          x_79 = extraction.constSortNoArgs218;
                                                                          term = y_79;
                                                                          if(term != x_79 && !x_79.match(term))
                                                                            break Fail253;
                                                                          term = extraction.constSortNoArgs18;
                                                                          if(true)
                                                                            break Success206;
                                                                        }
                                                                        term = term213;
                                                                        IStrategoTerm term214 = term;
                                                                        Success207:
                                                                        { 
                                                                          Fail254:
                                                                          { 
                                                                            IStrategoTerm v_79 = null;
                                                                            IStrategoTerm w_79 = null;
                                                                            w_79 = term;
                                                                            v_79 = extraction.constSortNoArgs219;
                                                                            term = w_79;
                                                                            if(term != v_79 && !v_79.match(term))
                                                                              break Fail254;
                                                                            term = extraction.constSortNoArgs17;
                                                                            if(true)
                                                                              break Success207;
                                                                          }
                                                                          term = term214;
                                                                          IStrategoTerm term215 = term;
                                                                          Success208:
                                                                          { 
                                                                            Fail255:
                                                                            { 
                                                                              IStrategoTerm t_79 = null;
                                                                              IStrategoTerm u_79 = null;
                                                                              u_79 = term;
                                                                              t_79 = extraction.constSortNoArgs220;
                                                                              term = u_79;
                                                                              if(term != t_79 && !t_79.match(term))
                                                                                break Fail255;
                                                                              term = extraction.constSortNoArgs10;
                                                                              if(true)
                                                                                break Success208;
                                                                            }
                                                                            term = term215;
                                                                            IStrategoTerm term216 = term;
                                                                            Success209:
                                                                            { 
                                                                              Fail256:
                                                                              { 
                                                                                IStrategoTerm p_79 = null;
                                                                                IStrategoTerm q_79 = null;
                                                                                q_79 = term;
                                                                                p_79 = extraction.constSortNoArgs1;
                                                                                term = q_79;
                                                                                if(term != p_79 && !p_79.match(term))
                                                                                  break Fail256;
                                                                                term = extraction.constSortNoArgs27;
                                                                                if(true)
                                                                                  break Success209;
                                                                              }
                                                                              term = term216;
                                                                              IStrategoTerm term217 = term;
                                                                              Success210:
                                                                              { 
                                                                                Fail257:
                                                                                { 
                                                                                  IStrategoTerm n_79 = null;
                                                                                  IStrategoTerm o_79 = null;
                                                                                  o_79 = term;
                                                                                  n_79 = extraction.constSortNoArgs221;
                                                                                  term = o_79;
                                                                                  if(term != n_79 && !n_79.match(term))
                                                                                    break Fail257;
                                                                                  term = extraction.constSortNoArgs26;
                                                                                  if(true)
                                                                                    break Success210;
                                                                                }
                                                                                term = term217;
                                                                                IStrategoTerm term218 = term;
                                                                                Success211:
                                                                                { 
                                                                                  Fail258:
                                                                                  { 
                                                                                    IStrategoTerm j_79 = null;
                                                                                    IStrategoTerm k_79 = null;
                                                                                    k_79 = term;
                                                                                    j_79 = extraction.constSortNoArgs222;
                                                                                    term = k_79;
                                                                                    if(term != j_79 && !j_79.match(term))
                                                                                      break Fail258;
                                                                                    term = extraction.constSortNoArgs25;
                                                                                    if(true)
                                                                                      break Success211;
                                                                                  }
                                                                                  term = term218;
                                                                                  IStrategoTerm term219 = term;
                                                                                  Success212:
                                                                                  { 
                                                                                    Fail259:
                                                                                    { 
                                                                                      IStrategoTerm g_79 = null;
                                                                                      IStrategoTerm h_79 = null;
                                                                                      h_79 = term;
                                                                                      g_79 = extraction.constSortNoArgs223;
                                                                                      term = h_79;
                                                                                      if(term != g_79 && !g_79.match(term))
                                                                                        break Fail259;
                                                                                      term = extraction.constSortNoArgs24;
                                                                                      if(true)
                                                                                        break Success212;
                                                                                    }
                                                                                    term = term219;
                                                                                    IStrategoTerm term220 = term;
                                                                                    Success213:
                                                                                    { 
                                                                                      Fail260:
                                                                                      { 
                                                                                        IStrategoTerm d_79 = null;
                                                                                        IStrategoTerm f_79 = null;
                                                                                        f_79 = term;
                                                                                        d_79 = extraction.constSortNoArgs2;
                                                                                        term = f_79;
                                                                                        if(term != d_79 && !d_79.match(term))
                                                                                          break Fail260;
                                                                                        term = extraction.constSortNoArgs8;
                                                                                        if(true)
                                                                                          break Success213;
                                                                                      }
                                                                                      term = term220;
                                                                                      IStrategoTerm term221 = term;
                                                                                      Success214:
                                                                                      { 
                                                                                        Fail261:
                                                                                        { 
                                                                                          IStrategoTerm b_79 = null;
                                                                                          IStrategoTerm c_79 = null;
                                                                                          c_79 = term;
                                                                                          b_79 = extraction.constSortNoArgs224;
                                                                                          term = c_79;
                                                                                          if(term != b_79 && !b_79.match(term))
                                                                                            break Fail261;
                                                                                          term = extraction.constSortNoArgs23;
                                                                                          if(true)
                                                                                            break Success214;
                                                                                        }
                                                                                        term = term221;
                                                                                        IStrategoTerm term222 = term;
                                                                                        Success215:
                                                                                        { 
                                                                                          Fail262:
                                                                                          { 
                                                                                            IStrategoTerm z_78 = null;
                                                                                            IStrategoTerm a_79 = null;
                                                                                            a_79 = term;
                                                                                            z_78 = extraction.constSortNoArgs225;
                                                                                            term = a_79;
                                                                                            if(term != z_78 && !z_78.match(term))
                                                                                              break Fail262;
                                                                                            term = extraction.constSortNoArgs22;
                                                                                            if(true)
                                                                                              break Success215;
                                                                                          }
                                                                                          term = term222;
                                                                                          IStrategoTerm term223 = term;
                                                                                          Success216:
                                                                                          { 
                                                                                            Fail263:
                                                                                            { 
                                                                                              IStrategoTerm x_78 = null;
                                                                                              IStrategoTerm y_78 = null;
                                                                                              y_78 = term;
                                                                                              x_78 = extraction.constSortNoArgs226;
                                                                                              term = y_78;
                                                                                              if(term != x_78 && !x_78.match(term))
                                                                                                break Fail263;
                                                                                              term = extraction.constSortNoArgs51;
                                                                                              if(true)
                                                                                                break Success216;
                                                                                            }
                                                                                            term = term223;
                                                                                            IStrategoTerm term224 = term;
                                                                                            Success217:
                                                                                            { 
                                                                                              Fail264:
                                                                                              { 
                                                                                                IStrategoTerm v_78 = null;
                                                                                                IStrategoTerm w_78 = null;
                                                                                                w_78 = term;
                                                                                                v_78 = extraction.constSortNoArgs227;
                                                                                                term = w_78;
                                                                                                if(term != v_78 && !v_78.match(term))
                                                                                                  break Fail264;
                                                                                                term = extraction.constSortNoArgs41;
                                                                                                if(true)
                                                                                                  break Success217;
                                                                                              }
                                                                                              term = term224;
                                                                                              IStrategoTerm term225 = term;
                                                                                              Success218:
                                                                                              { 
                                                                                                Fail265:
                                                                                                { 
                                                                                                  IStrategoTerm t_78 = null;
                                                                                                  IStrategoTerm u_78 = null;
                                                                                                  u_78 = term;
                                                                                                  t_78 = extraction.constSortNoArgs228;
                                                                                                  term = u_78;
                                                                                                  if(term != t_78 && !t_78.match(term))
                                                                                                    break Fail265;
                                                                                                  term = extraction.constSortNoArgs42;
                                                                                                  if(true)
                                                                                                    break Success218;
                                                                                                }
                                                                                                term = term225;
                                                                                                IStrategoTerm term226 = term;
                                                                                                Success219:
                                                                                                { 
                                                                                                  Fail266:
                                                                                                  { 
                                                                                                    IStrategoTerm r_78 = null;
                                                                                                    IStrategoTerm s_78 = null;
                                                                                                    s_78 = term;
                                                                                                    r_78 = extraction.constSortNoArgs88;
                                                                                                    term = s_78;
                                                                                                    if(term != r_78 && !r_78.match(term))
                                                                                                      break Fail266;
                                                                                                    term = extraction.constSortNoArgs0;
                                                                                                    if(true)
                                                                                                      break Success219;
                                                                                                  }
                                                                                                  term = term226;
                                                                                                  IStrategoTerm term227 = term;
                                                                                                  Success220:
                                                                                                  { 
                                                                                                    Fail267:
                                                                                                    { 
                                                                                                      IStrategoTerm p_78 = null;
                                                                                                      IStrategoTerm q_78 = null;
                                                                                                      q_78 = term;
                                                                                                      p_78 = extraction.constSortNoArgs229;
                                                                                                      term = q_78;
                                                                                                      if(term != p_78 && !p_78.match(term))
                                                                                                        break Fail267;
                                                                                                      term = extraction.constSortNoArgs230;
                                                                                                      if(true)
                                                                                                        break Success220;
                                                                                                    }
                                                                                                    term = term227;
                                                                                                    IStrategoTerm term228 = term;
                                                                                                    Success221:
                                                                                                    { 
                                                                                                      Fail268:
                                                                                                      { 
                                                                                                        IStrategoTerm k_78 = null;
                                                                                                        IStrategoTerm l_78 = null;
                                                                                                        l_78 = term;
                                                                                                        k_78 = extraction.constSortNoArgs231;
                                                                                                        term = l_78;
                                                                                                        if(term != k_78 && !k_78.match(term))
                                                                                                          break Fail268;
                                                                                                        term = extraction.constSortNoArgs57;
                                                                                                        if(true)
                                                                                                          break Success221;
                                                                                                      }
                                                                                                      term = term228;
                                                                                                      IStrategoTerm term229 = term;
                                                                                                      Success222:
                                                                                                      { 
                                                                                                        Fail269:
                                                                                                        { 
                                                                                                          IStrategoTerm i_78 = null;
                                                                                                          IStrategoTerm j_78 = null;
                                                                                                          j_78 = term;
                                                                                                          i_78 = extraction.constSortNoArgs232;
                                                                                                          term = j_78;
                                                                                                          if(term != i_78 && !i_78.match(term))
                                                                                                            break Fail269;
                                                                                                          term = extraction.constSortNoArgs56;
                                                                                                          if(true)
                                                                                                            break Success222;
                                                                                                        }
                                                                                                        term = term229;
                                                                                                        IStrategoTerm term230 = term;
                                                                                                        Success223:
                                                                                                        { 
                                                                                                          Fail270:
                                                                                                          { 
                                                                                                            IStrategoTerm f_78 = null;
                                                                                                            IStrategoTerm h_78 = null;
                                                                                                            h_78 = term;
                                                                                                            f_78 = extraction.constSortNoArgs233;
                                                                                                            term = h_78;
                                                                                                            if(term != f_78 && !f_78.match(term))
                                                                                                              break Fail270;
                                                                                                            term = extraction.constSortNoArgs59;
                                                                                                            if(true)
                                                                                                              break Success223;
                                                                                                          }
                                                                                                          term = term230;
                                                                                                          term = unrename_sort_0_0_fragment_0.instance.invoke(context, term);
                                                                                                          if(term == null)
                                                                                                            break Fail220;
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