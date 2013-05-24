package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class unrename_sort_0_0 extends Strategy 
{ 
  public static unrename_sort_0_0 instance = new unrename_sort_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("unrename_sort_0_0");
    Fail321:
    { 
      IStrategoTerm term280 = term;
      Success273:
      { 
        Fail322:
        { 
          IStrategoTerm r_89 = null;
          IStrategoTerm t_89 = null;
          t_89 = term;
          r_89 = extraction.constSortNoArgs302;
          term = t_89;
          if(term != r_89 && !r_89.match(term))
            break Fail322;
          term = extraction.constSortNoArgs69;
          if(true)
            break Success273;
        }
        term = term280;
        IStrategoTerm term281 = term;
        Success274:
        { 
          Fail323:
          { 
            IStrategoTerm o_89 = null;
            IStrategoTerm p_89 = null;
            p_89 = term;
            o_89 = extraction.constSortNoArgs303;
            term = p_89;
            if(term != o_89 && !o_89.match(term))
              break Fail323;
            term = extraction.constSortNoArgs70;
            if(true)
              break Success274;
          }
          term = term281;
          IStrategoTerm term282 = term;
          Success275:
          { 
            Fail324:
            { 
              IStrategoTerm m_89 = null;
              IStrategoTerm n_89 = null;
              n_89 = term;
              m_89 = extraction.constSortNoArgs304;
              term = n_89;
              if(term != m_89 && !m_89.match(term))
                break Fail324;
              term = extraction.constSortNoArgs65;
              if(true)
                break Success275;
            }
            term = term282;
            IStrategoTerm term283 = term;
            Success276:
            { 
              Fail325:
              { 
                IStrategoTerm k_89 = null;
                IStrategoTerm l_89 = null;
                l_89 = term;
                k_89 = extraction.constSortNoArgs305;
                term = l_89;
                if(term != k_89 && !k_89.match(term))
                  break Fail325;
                term = extraction.constSortNoArgs15;
                if(true)
                  break Success276;
              }
              term = term283;
              IStrategoTerm term284 = term;
              Success277:
              { 
                Fail326:
                { 
                  IStrategoTerm i_89 = null;
                  IStrategoTerm j_89 = null;
                  j_89 = term;
                  i_89 = extraction.constSortNoArgs306;
                  term = j_89;
                  if(term != i_89 && !i_89.match(term))
                    break Fail326;
                  term = extraction.constSortNoArgs307;
                  if(true)
                    break Success277;
                }
                term = term284;
                IStrategoTerm term285 = term;
                Success278:
                { 
                  Fail327:
                  { 
                    IStrategoTerm f_89 = null;
                    IStrategoTerm g_89 = null;
                    g_89 = term;
                    f_89 = extraction.constSortNoArgs308;
                    term = g_89;
                    if(term != f_89 && !f_89.match(term))
                      break Fail327;
                    term = extraction.constSortNoArgs309;
                    if(true)
                      break Success278;
                  }
                  term = term285;
                  IStrategoTerm term286 = term;
                  Success279:
                  { 
                    Fail328:
                    { 
                      IStrategoTerm b_89 = null;
                      IStrategoTerm c_89 = null;
                      c_89 = term;
                      b_89 = extraction.constSortNoArgs310;
                      term = c_89;
                      if(term != b_89 && !b_89.match(term))
                        break Fail328;
                      term = extraction.constSortNoArgs92;
                      if(true)
                        break Success279;
                    }
                    term = term286;
                    term = unrename_sort_0_0_fragment_2.instance.invoke(context, term);
                    if(term == null)
                      break Fail321;
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