package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class unrename_sort_0_0_fragment_0 extends Strategy 
{ 
  public static unrename_sort_0_0_fragment_0 instance = new unrename_sort_0_0_fragment_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail271:
    { 
      IStrategoTerm term231 = term;
      Success224:
      { 
        Fail272:
        { 
          IStrategoTerm d_78 = null;
          IStrategoTerm e_78 = null;
          e_78 = term;
          d_78 = extraction.constSortNoArgs234;
          term = e_78;
          if(term != d_78 && !d_78.match(term))
            break Fail272;
          term = extraction.constSortNoArgs58;
          if(true)
            break Success224;
        }
        term = term231;
        IStrategoTerm term232 = term;
        Success225:
        { 
          Fail273:
          { 
            IStrategoTerm a_78 = null;
            IStrategoTerm b_78 = null;
            b_78 = term;
            a_78 = extraction.constSortNoArgs235;
            term = b_78;
            if(term != a_78 && !a_78.match(term))
              break Fail273;
            term = extraction.constSortNoArgs76;
            if(true)
              break Success225;
          }
          term = term232;
          IStrategoTerm term233 = term;
          Success226:
          { 
            Fail274:
            { 
              IStrategoTerm x_77 = null;
              IStrategoTerm y_77 = null;
              y_77 = term;
              x_77 = extraction.constSortNoArgs236;
              term = y_77;
              if(term != x_77 && !x_77.match(term))
                break Fail274;
              term = extraction.constSortNoArgs237;
              if(true)
                break Success226;
            }
            term = term233;
            IStrategoTerm term234 = term;
            Success227:
            { 
              Fail275:
              { 
                IStrategoTerm u_77 = null;
                IStrategoTerm v_77 = null;
                v_77 = term;
                u_77 = extraction.constSortNoArgs238;
                term = v_77;
                if(term != u_77 && !u_77.match(term))
                  break Fail275;
                term = extraction.constSortNoArgs29;
                if(true)
                  break Success227;
              }
              term = term234;
              IStrategoTerm term235 = term;
              Success228:
              { 
                Fail276:
                { 
                  IStrategoTerm r_77 = null;
                  IStrategoTerm s_77 = null;
                  s_77 = term;
                  r_77 = extraction.constSortNoArgs239;
                  term = s_77;
                  if(term != r_77 && !r_77.match(term))
                    break Fail276;
                  term = extraction.constSortNoArgs28;
                  if(true)
                    break Success228;
                }
                term = term235;
                IStrategoTerm term236 = term;
                Success229:
                { 
                  Fail277:
                  { 
                    IStrategoTerm o_77 = null;
                    IStrategoTerm p_77 = null;
                    p_77 = term;
                    o_77 = extraction.constSortNoArgs240;
                    term = p_77;
                    if(term != o_77 && !o_77.match(term))
                      break Fail277;
                    term = extraction.constSortNoArgs30;
                    if(true)
                      break Success229;
                  }
                  term = term236;
                  IStrategoTerm term237 = term;
                  Success230:
                  { 
                    Fail278:
                    { 
                      IStrategoTerm l_77 = null;
                      IStrategoTerm m_77 = null;
                      m_77 = term;
                      l_77 = extraction.constSortNoArgs241;
                      term = m_77;
                      if(term != l_77 && !l_77.match(term))
                        break Fail278;
                      term = extraction.constSortNoArgs242;
                      if(true)
                        break Success230;
                    }
                    term = term237;
                    IStrategoTerm term238 = term;
                    Success231:
                    { 
                      Fail279:
                      { 
                        IStrategoTerm i_77 = null;
                        IStrategoTerm j_77 = null;
                        j_77 = term;
                        i_77 = extraction.constSortNoArgs243;
                        term = j_77;
                        if(term != i_77 && !i_77.match(term))
                          break Fail279;
                        term = extraction.constSortNoArgs61;
                        if(true)
                          break Success231;
                      }
                      term = term238;
                      IStrategoTerm term239 = term;
                      Success232:
                      { 
                        Fail280:
                        { 
                          IStrategoTerm e_77 = null;
                          IStrategoTerm g_77 = null;
                          g_77 = term;
                          e_77 = extraction.constSortNoArgs244;
                          term = g_77;
                          if(term != e_77 && !e_77.match(term))
                            break Fail280;
                          term = extraction.constSortNoArgs60;
                          if(true)
                            break Success232;
                        }
                        term = term239;
                        IStrategoTerm term240 = term;
                        Success233:
                        { 
                          Fail281:
                          { 
                            IStrategoTerm b_77 = null;
                            IStrategoTerm d_77 = null;
                            d_77 = term;
                            b_77 = extraction.constSortNoArgs245;
                            term = d_77;
                            if(term != b_77 && !b_77.match(term))
                              break Fail281;
                            term = extraction.constSortNoArgs32;
                            if(true)
                              break Success233;
                          }
                          term = term240;
                          IStrategoTerm term241 = term;
                          Success234:
                          { 
                            Fail282:
                            { 
                              IStrategoTerm y_76 = null;
                              IStrategoTerm a_77 = null;
                              a_77 = term;
                              y_76 = extraction.constSortNoArgs246;
                              term = a_77;
                              if(term != y_76 && !y_76.match(term))
                                break Fail282;
                              term = extraction.constSortNoArgs31;
                              if(true)
                                break Success234;
                            }
                            term = term241;
                            IStrategoTerm term242 = term;
                            Success235:
                            { 
                              Fail283:
                              { 
                                IStrategoTerm v_76 = null;
                                IStrategoTerm x_76 = null;
                                x_76 = term;
                                v_76 = extraction.constSortNoArgs247;
                                term = x_76;
                                if(term != v_76 && !v_76.match(term))
                                  break Fail283;
                                term = extraction.constSortNoArgs64;
                                if(true)
                                  break Success235;
                              }
                              term = term242;
                              IStrategoTerm term243 = term;
                              Success236:
                              { 
                                Fail284:
                                { 
                                  IStrategoTerm s_76 = null;
                                  IStrategoTerm u_76 = null;
                                  u_76 = term;
                                  s_76 = extraction.constSortNoArgs248;
                                  term = u_76;
                                  if(term != s_76 && !s_76.match(term))
                                    break Fail284;
                                  term = extraction.constSortNoArgs63;
                                  if(true)
                                    break Success236;
                                }
                                term = term243;
                                IStrategoTerm term244 = term;
                                Success237:
                                { 
                                  Fail285:
                                  { 
                                    IStrategoTerm p_76 = null;
                                    IStrategoTerm r_76 = null;
                                    r_76 = term;
                                    p_76 = extraction.constSortNoArgs249;
                                    term = r_76;
                                    if(term != p_76 && !p_76.match(term))
                                      break Fail285;
                                    term = extraction.constSortNoArgs250;
                                    if(true)
                                      break Success237;
                                  }
                                  term = term244;
                                  IStrategoTerm term245 = term;
                                  Success238:
                                  { 
                                    Fail286:
                                    { 
                                      IStrategoTerm m_76 = null;
                                      IStrategoTerm o_76 = null;
                                      o_76 = term;
                                      m_76 = extraction.constSortNoArgs251;
                                      term = o_76;
                                      if(term != m_76 && !m_76.match(term))
                                        break Fail286;
                                      term = extraction.constSortNoArgs75;
                                      if(true)
                                        break Success238;
                                    }
                                    term = term245;
                                    IStrategoTerm term246 = term;
                                    Success239:
                                    { 
                                      Fail287:
                                      { 
                                        IStrategoTerm j_76 = null;
                                        IStrategoTerm l_76 = null;
                                        l_76 = term;
                                        j_76 = extraction.constSortNoArgs252;
                                        term = l_76;
                                        if(term != j_76 && !j_76.match(term))
                                          break Fail287;
                                        term = extraction.constSortNoArgs69;
                                        if(true)
                                          break Success239;
                                      }
                                      term = term246;
                                      IStrategoTerm term247 = term;
                                      Success240:
                                      { 
                                        Fail288:
                                        { 
                                          IStrategoTerm g_76 = null;
                                          IStrategoTerm i_76 = null;
                                          i_76 = term;
                                          g_76 = extraction.constSortNoArgs253;
                                          term = i_76;
                                          if(term != g_76 && !g_76.match(term))
                                            break Fail288;
                                          term = extraction.constSortNoArgs70;
                                          if(true)
                                            break Success240;
                                        }
                                        term = term247;
                                        IStrategoTerm term248 = term;
                                        Success241:
                                        { 
                                          Fail289:
                                          { 
                                            IStrategoTerm d_76 = null;
                                            IStrategoTerm e_76 = null;
                                            e_76 = term;
                                            d_76 = extraction.constSortNoArgs254;
                                            term = e_76;
                                            if(term != d_76 && !d_76.match(term))
                                              break Fail289;
                                            term = extraction.constSortNoArgs255;
                                            if(true)
                                              break Success241;
                                          }
                                          term = term248;
                                          IStrategoTerm term249 = term;
                                          Success242:
                                          { 
                                            Fail290:
                                            { 
                                              IStrategoTerm b_76 = null;
                                              IStrategoTerm c_76 = null;
                                              c_76 = term;
                                              b_76 = extraction.constSortNoArgs256;
                                              term = c_76;
                                              if(term != b_76 && !b_76.match(term))
                                                break Fail290;
                                              term = extraction.constSortNoArgs16;
                                              if(true)
                                                break Success242;
                                            }
                                            term = term249;
                                            IStrategoTerm term250 = term;
                                            Success243:
                                            { 
                                              Fail291:
                                              { 
                                                IStrategoTerm z_75 = null;
                                                IStrategoTerm a_76 = null;
                                                a_76 = term;
                                                z_75 = extraction.constSortNoArgs257;
                                                term = a_76;
                                                if(term != z_75 && !z_75.match(term))
                                                  break Fail291;
                                                term = extraction.constSortNoArgs68;
                                                if(true)
                                                  break Success243;
                                              }
                                              term = term250;
                                              IStrategoTerm term251 = term;
                                              Success244:
                                              { 
                                                Fail292:
                                                { 
                                                  IStrategoTerm x_75 = null;
                                                  IStrategoTerm y_75 = null;
                                                  y_75 = term;
                                                  x_75 = extraction.constSortNoArgs258;
                                                  term = y_75;
                                                  if(term != x_75 && !x_75.match(term))
                                                    break Fail292;
                                                  term = extraction.constSortNoArgs67;
                                                  if(true)
                                                    break Success244;
                                                }
                                                term = term251;
                                                IStrategoTerm term252 = term;
                                                Success245:
                                                { 
                                                  Fail293:
                                                  { 
                                                    IStrategoTerm v_75 = null;
                                                    IStrategoTerm w_75 = null;
                                                    w_75 = term;
                                                    v_75 = extraction.constSortNoArgs259;
                                                    term = w_75;
                                                    if(term != v_75 && !v_75.match(term))
                                                      break Fail293;
                                                    term = extraction.constSortNoArgs65;
                                                    if(true)
                                                      break Success245;
                                                  }
                                                  term = term252;
                                                  IStrategoTerm term253 = term;
                                                  Success246:
                                                  { 
                                                    Fail294:
                                                    { 
                                                      IStrategoTerm t_75 = null;
                                                      IStrategoTerm u_75 = null;
                                                      u_75 = term;
                                                      t_75 = extraction.constSortNoArgs260;
                                                      term = u_75;
                                                      if(term != t_75 && !t_75.match(term))
                                                        break Fail294;
                                                      term = extraction.constSortNoArgs66;
                                                      if(true)
                                                        break Success246;
                                                    }
                                                    term = term253;
                                                    IStrategoTerm term254 = term;
                                                    Success247:
                                                    { 
                                                      Fail295:
                                                      { 
                                                        IStrategoTerm r_75 = null;
                                                        IStrategoTerm s_75 = null;
                                                        s_75 = term;
                                                        r_75 = extraction.constSortNoArgs261;
                                                        term = s_75;
                                                        if(term != r_75 && !r_75.match(term))
                                                          break Fail295;
                                                        term = extraction.constSortNoArgs34;
                                                        if(true)
                                                          break Success247;
                                                      }
                                                      term = term254;
                                                      IStrategoTerm term255 = term;
                                                      Success248:
                                                      { 
                                                        Fail296:
                                                        { 
                                                          IStrategoTerm p_75 = null;
                                                          IStrategoTerm q_75 = null;
                                                          q_75 = term;
                                                          p_75 = extraction.constSortNoArgs262;
                                                          term = q_75;
                                                          if(term != p_75 && !p_75.match(term))
                                                            break Fail296;
                                                          term = extraction.constSortNoArgs33;
                                                          if(true)
                                                            break Success248;
                                                        }
                                                        term = term255;
                                                        IStrategoTerm term256 = term;
                                                        Success249:
                                                        { 
                                                          Fail297:
                                                          { 
                                                            IStrategoTerm n_75 = null;
                                                            IStrategoTerm o_75 = null;
                                                            o_75 = term;
                                                            n_75 = extraction.constSortNoArgs263;
                                                            term = o_75;
                                                            if(term != n_75 && !n_75.match(term))
                                                              break Fail297;
                                                            term = extraction.constSortNoArgs264;
                                                            if(true)
                                                              break Success249;
                                                          }
                                                          term = term256;
                                                          IStrategoTerm term257 = term;
                                                          Success250:
                                                          { 
                                                            Fail298:
                                                            { 
                                                              IStrategoTerm l_75 = null;
                                                              IStrategoTerm m_75 = null;
                                                              m_75 = term;
                                                              l_75 = extraction.constSortNoArgs265;
                                                              term = m_75;
                                                              if(term != l_75 && !l_75.match(term))
                                                                break Fail298;
                                                              term = extraction.constSortNoArgs266;
                                                              if(true)
                                                                break Success250;
                                                            }
                                                            term = term257;
                                                            IStrategoTerm term258 = term;
                                                            Success251:
                                                            { 
                                                              Fail299:
                                                              { 
                                                                IStrategoTerm j_75 = null;
                                                                IStrategoTerm k_75 = null;
                                                                k_75 = term;
                                                                j_75 = extraction.constSortNoArgs267;
                                                                term = k_75;
                                                                if(term != j_75 && !j_75.match(term))
                                                                  break Fail299;
                                                                term = extraction.constSortNoArgs74;
                                                                if(true)
                                                                  break Success251;
                                                              }
                                                              term = term258;
                                                              IStrategoTerm term259 = term;
                                                              Success252:
                                                              { 
                                                                Fail300:
                                                                { 
                                                                  IStrategoTerm h_75 = null;
                                                                  IStrategoTerm i_75 = null;
                                                                  i_75 = term;
                                                                  h_75 = extraction.constSortNoArgs268;
                                                                  term = i_75;
                                                                  if(term != h_75 && !h_75.match(term))
                                                                    break Fail300;
                                                                  term = extraction.constSortNoArgs73;
                                                                  if(true)
                                                                    break Success252;
                                                                }
                                                                term = term259;
                                                                IStrategoTerm term260 = term;
                                                                Success253:
                                                                { 
                                                                  Fail301:
                                                                  { 
                                                                    IStrategoTerm f_75 = null;
                                                                    IStrategoTerm g_75 = null;
                                                                    g_75 = term;
                                                                    f_75 = extraction.constSortNoArgs269;
                                                                    term = g_75;
                                                                    if(term != f_75 && !f_75.match(term))
                                                                      break Fail301;
                                                                    term = extraction.constSortNoArgs270;
                                                                    if(true)
                                                                      break Success253;
                                                                  }
                                                                  term = term260;
                                                                  IStrategoTerm term261 = term;
                                                                  Success254:
                                                                  { 
                                                                    Fail302:
                                                                    { 
                                                                      IStrategoTerm d_75 = null;
                                                                      IStrategoTerm e_75 = null;
                                                                      e_75 = term;
                                                                      d_75 = extraction.constSortNoArgs271;
                                                                      term = e_75;
                                                                      if(term != d_75 && !d_75.match(term))
                                                                        break Fail302;
                                                                      term = extraction.constSortNoArgs115;
                                                                      if(true)
                                                                        break Success254;
                                                                    }
                                                                    term = term261;
                                                                    IStrategoTerm term262 = term;
                                                                    Success255:
                                                                    { 
                                                                      Fail303:
                                                                      { 
                                                                        IStrategoTerm b_75 = null;
                                                                        IStrategoTerm c_75 = null;
                                                                        c_75 = term;
                                                                        b_75 = extraction.constSortNoArgs272;
                                                                        term = c_75;
                                                                        if(term != b_75 && !b_75.match(term))
                                                                          break Fail303;
                                                                        term = extraction.constSortNoArgs77;
                                                                        if(true)
                                                                          break Success255;
                                                                      }
                                                                      term = term262;
                                                                      IStrategoTerm term263 = term;
                                                                      Success256:
                                                                      { 
                                                                        Fail304:
                                                                        { 
                                                                          IStrategoTerm z_74 = null;
                                                                          IStrategoTerm a_75 = null;
                                                                          a_75 = term;
                                                                          z_74 = extraction.constSortNoArgs273;
                                                                          term = a_75;
                                                                          if(term != z_74 && !z_74.match(term))
                                                                            break Fail304;
                                                                          term = extraction.constSortNoArgs72;
                                                                          if(true)
                                                                            break Success256;
                                                                        }
                                                                        term = term263;
                                                                        IStrategoTerm term264 = term;
                                                                        Success257:
                                                                        { 
                                                                          Fail305:
                                                                          { 
                                                                            IStrategoTerm x_74 = null;
                                                                            IStrategoTerm y_74 = null;
                                                                            y_74 = term;
                                                                            x_74 = extraction.constSortNoArgs274;
                                                                            term = y_74;
                                                                            if(term != x_74 && !x_74.match(term))
                                                                              break Fail305;
                                                                            term = extraction.constSortNoArgs275;
                                                                            if(true)
                                                                              break Success257;
                                                                          }
                                                                          term = term264;
                                                                          IStrategoTerm term265 = term;
                                                                          Success258:
                                                                          { 
                                                                            Fail306:
                                                                            { 
                                                                              IStrategoTerm v_74 = null;
                                                                              IStrategoTerm w_74 = null;
                                                                              w_74 = term;
                                                                              v_74 = extraction.constSortNoArgs276;
                                                                              term = w_74;
                                                                              if(term != v_74 && !v_74.match(term))
                                                                                break Fail306;
                                                                              term = extraction.constSortNoArgs277;
                                                                              if(true)
                                                                                break Success258;
                                                                            }
                                                                            term = term265;
                                                                            IStrategoTerm term266 = term;
                                                                            Success259:
                                                                            { 
                                                                              Fail307:
                                                                              { 
                                                                                IStrategoTerm t_74 = null;
                                                                                IStrategoTerm u_74 = null;
                                                                                u_74 = term;
                                                                                t_74 = extraction.constSortNoArgs278;
                                                                                term = u_74;
                                                                                if(term != t_74 && !t_74.match(term))
                                                                                  break Fail307;
                                                                                term = extraction.constSortNoArgs279;
                                                                                if(true)
                                                                                  break Success259;
                                                                              }
                                                                              term = term266;
                                                                              IStrategoTerm term267 = term;
                                                                              Success260:
                                                                              { 
                                                                                Fail308:
                                                                                { 
                                                                                  IStrategoTerm r_74 = null;
                                                                                  IStrategoTerm s_74 = null;
                                                                                  s_74 = term;
                                                                                  r_74 = extraction.constSortNoArgs280;
                                                                                  term = s_74;
                                                                                  if(term != r_74 && !r_74.match(term))
                                                                                    break Fail308;
                                                                                  term = extraction.constSortNoArgs36;
                                                                                  if(true)
                                                                                    break Success260;
                                                                                }
                                                                                term = term267;
                                                                                IStrategoTerm term268 = term;
                                                                                Success261:
                                                                                { 
                                                                                  Fail309:
                                                                                  { 
                                                                                    IStrategoTerm p_74 = null;
                                                                                    IStrategoTerm q_74 = null;
                                                                                    q_74 = term;
                                                                                    p_74 = extraction.constSortNoArgs281;
                                                                                    term = q_74;
                                                                                    if(term != p_74 && !p_74.match(term))
                                                                                      break Fail309;
                                                                                    term = extraction.constSortNoArgs37;
                                                                                    if(true)
                                                                                      break Success261;
                                                                                  }
                                                                                  term = term268;
                                                                                  IStrategoTerm term269 = term;
                                                                                  Success262:
                                                                                  { 
                                                                                    Fail310:
                                                                                    { 
                                                                                      IStrategoTerm n_74 = null;
                                                                                      IStrategoTerm o_74 = null;
                                                                                      o_74 = term;
                                                                                      n_74 = extraction.constSortNoArgs282;
                                                                                      term = o_74;
                                                                                      if(term != n_74 && !n_74.match(term))
                                                                                        break Fail310;
                                                                                      term = extraction.constSortNoArgs19;
                                                                                      if(true)
                                                                                        break Success262;
                                                                                    }
                                                                                    term = term269;
                                                                                    IStrategoTerm term270 = term;
                                                                                    Success263:
                                                                                    { 
                                                                                      Fail311:
                                                                                      { 
                                                                                        IStrategoTerm k_74 = null;
                                                                                        IStrategoTerm m_74 = null;
                                                                                        m_74 = term;
                                                                                        k_74 = extraction.constSortNoArgs283;
                                                                                        term = m_74;
                                                                                        if(term != k_74 && !k_74.match(term))
                                                                                          break Fail311;
                                                                                        term = extraction.constSortNoArgs284;
                                                                                        if(true)
                                                                                          break Success263;
                                                                                      }
                                                                                      term = term270;
                                                                                      IStrategoTerm term271 = term;
                                                                                      Success264:
                                                                                      { 
                                                                                        Fail312:
                                                                                        { 
                                                                                          IStrategoTerm h_74 = null;
                                                                                          IStrategoTerm j_74 = null;
                                                                                          j_74 = term;
                                                                                          h_74 = extraction.constSortNoArgs285;
                                                                                          term = j_74;
                                                                                          if(term != h_74 && !h_74.match(term))
                                                                                            break Fail312;
                                                                                          term = extraction.constSortNoArgs286;
                                                                                          if(true)
                                                                                            break Success264;
                                                                                        }
                                                                                        term = term271;
                                                                                        IStrategoTerm term272 = term;
                                                                                        Success265:
                                                                                        { 
                                                                                          Fail313:
                                                                                          { 
                                                                                            IStrategoTerm e_74 = null;
                                                                                            IStrategoTerm g_74 = null;
                                                                                            g_74 = term;
                                                                                            e_74 = extraction.constSortNoArgs287;
                                                                                            term = g_74;
                                                                                            if(term != e_74 && !e_74.match(term))
                                                                                              break Fail313;
                                                                                            term = extraction.constSortNoArgs288;
                                                                                            if(true)
                                                                                              break Success265;
                                                                                          }
                                                                                          term = term272;
                                                                                          IStrategoTerm term273 = term;
                                                                                          Success266:
                                                                                          { 
                                                                                            Fail314:
                                                                                            { 
                                                                                              IStrategoTerm b_74 = null;
                                                                                              IStrategoTerm d_74 = null;
                                                                                              d_74 = term;
                                                                                              b_74 = extraction.constSortNoArgs289;
                                                                                              term = d_74;
                                                                                              if(term != b_74 && !b_74.match(term))
                                                                                                break Fail314;
                                                                                              term = extraction.constSortNoArgs38;
                                                                                              if(true)
                                                                                                break Success266;
                                                                                            }
                                                                                            term = term273;
                                                                                            IStrategoTerm term274 = term;
                                                                                            Success267:
                                                                                            { 
                                                                                              Fail315:
                                                                                              { 
                                                                                                IStrategoTerm z_73 = null;
                                                                                                IStrategoTerm a_74 = null;
                                                                                                a_74 = term;
                                                                                                z_73 = extraction.constSortNoArgs290;
                                                                                                term = a_74;
                                                                                                if(term != z_73 && !z_73.match(term))
                                                                                                  break Fail315;
                                                                                                term = extraction.constSortNoArgs291;
                                                                                                if(true)
                                                                                                  break Success267;
                                                                                              }
                                                                                              term = term274;
                                                                                              IStrategoTerm term275 = term;
                                                                                              Success268:
                                                                                              { 
                                                                                                Fail316:
                                                                                                { 
                                                                                                  IStrategoTerm x_73 = null;
                                                                                                  IStrategoTerm y_73 = null;
                                                                                                  y_73 = term;
                                                                                                  x_73 = extraction.constSortNoArgs292;
                                                                                                  term = y_73;
                                                                                                  if(term != x_73 && !x_73.match(term))
                                                                                                    break Fail316;
                                                                                                  term = extraction.constSortNoArgs293;
                                                                                                  if(true)
                                                                                                    break Success268;
                                                                                                }
                                                                                                term = term275;
                                                                                                IStrategoTerm term276 = term;
                                                                                                Success269:
                                                                                                { 
                                                                                                  Fail317:
                                                                                                  { 
                                                                                                    IStrategoTerm u_73 = null;
                                                                                                    IStrategoTerm w_73 = null;
                                                                                                    w_73 = term;
                                                                                                    u_73 = extraction.constSortNoArgs294;
                                                                                                    term = w_73;
                                                                                                    if(term != u_73 && !u_73.match(term))
                                                                                                      break Fail317;
                                                                                                    term = extraction.constSortNoArgs71;
                                                                                                    if(true)
                                                                                                      break Success269;
                                                                                                  }
                                                                                                  term = term276;
                                                                                                  IStrategoTerm term277 = term;
                                                                                                  Success270:
                                                                                                  { 
                                                                                                    Fail318:
                                                                                                    { 
                                                                                                      IStrategoTerm s_73 = null;
                                                                                                      IStrategoTerm t_73 = null;
                                                                                                      t_73 = term;
                                                                                                      s_73 = extraction.constSortNoArgs295;
                                                                                                      term = t_73;
                                                                                                      if(term != s_73 && !s_73.match(term))
                                                                                                        break Fail318;
                                                                                                      term = extraction.constSortNoArgs296;
                                                                                                      if(true)
                                                                                                        break Success270;
                                                                                                    }
                                                                                                    term = term277;
                                                                                                    IStrategoTerm term278 = term;
                                                                                                    Success271:
                                                                                                    { 
                                                                                                      Fail319:
                                                                                                      { 
                                                                                                        IStrategoTerm q_73 = null;
                                                                                                        IStrategoTerm r_73 = null;
                                                                                                        r_73 = term;
                                                                                                        q_73 = extraction.constSortNoArgs297;
                                                                                                        term = r_73;
                                                                                                        if(term != q_73 && !q_73.match(term))
                                                                                                          break Fail319;
                                                                                                        term = extraction.constSortNoArgs62;
                                                                                                        if(true)
                                                                                                          break Success271;
                                                                                                      }
                                                                                                      term = term278;
                                                                                                      IStrategoTerm term279 = term;
                                                                                                      Success272:
                                                                                                      { 
                                                                                                        Fail320:
                                                                                                        { 
                                                                                                          IStrategoTerm n_73 = null;
                                                                                                          IStrategoTerm p_73 = null;
                                                                                                          p_73 = term;
                                                                                                          n_73 = extraction.constSortNoArgs298;
                                                                                                          term = p_73;
                                                                                                          if(term != n_73 && !n_73.match(term))
                                                                                                            break Fail320;
                                                                                                          term = extraction.constSortNoArgs299;
                                                                                                          if(true)
                                                                                                            break Success272;
                                                                                                        }
                                                                                                        term = term279;
                                                                                                        IStrategoTerm l_73 = null;
                                                                                                        IStrategoTerm m_73 = null;
                                                                                                        m_73 = term;
                                                                                                        l_73 = extraction.constSortNoArgs300;
                                                                                                        term = m_73;
                                                                                                        if(term != l_73 && !l_73.match(term))
                                                                                                          break Fail271;
                                                                                                        term = extraction.constSortNoArgs301;
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
      if(true)
        return term;
    }
    context.push("unrename_sort_0_0_fragment_0");
    context.popOnFailure();
    return null;
  }
}