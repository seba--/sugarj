package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class rename_rule_0_2 extends Strategy 
{ 
  public static rename_rule_0_2 instance = new rename_rule_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_18, IStrategoTerm t_18)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1:
    { 
      IStrategoTerm term0 = term;
      IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success0:
      { 
        if(cons0 == out._consRDefNoArgs_2)
        { 
          Fail2:
          { 
            IStrategoTerm t_9 = null;
            if(term.getSubterm(0) != s_18 && !s_18.match(term.getSubterm(0)))
              break Fail2;
            t_9 = term.getSubterm(1);
            term = termFactory.makeAppl(out._consRDefNoArgs_2, new IStrategoTerm[]{t_18, t_9});
            if(true)
              break Success0;
          }
          term = term0;
        }
        Success1:
        { 
          if(cons0 == out._consRDef_3)
          { 
            Fail3:
            { 
              IStrategoTerm p_9 = null;
              IStrategoTerm q_9 = null;
              if(term.getSubterm(0) != s_18 && !s_18.match(term.getSubterm(0)))
                break Fail3;
              p_9 = term.getSubterm(1);
              q_9 = term.getSubterm(2);
              term = termFactory.makeAppl(out._consRDef_3, new IStrategoTerm[]{t_18, p_9, q_9});
              if(true)
                break Success1;
            }
            term = term0;
          }
          Success2:
          { 
            if(cons0 == out._consRDefT_4)
            { 
              Fail4:
              { 
                IStrategoTerm k_9 = null;
                IStrategoTerm l_9 = null;
                IStrategoTerm m_9 = null;
                if(term.getSubterm(0) != s_18 && !s_18.match(term.getSubterm(0)))
                  break Fail4;
                k_9 = term.getSubterm(1);
                l_9 = term.getSubterm(2);
                m_9 = term.getSubterm(3);
                term = termFactory.makeAppl(out._consRDefT_4, new IStrategoTerm[]{t_18, k_9, l_9, m_9});
                if(true)
                  break Success2;
              }
              term = term0;
            }
            Success3:
            { 
              if(cons0 == out._consSDefNoArgs_2)
              { 
                Fail5:
                { 
                  IStrategoTerm h_9 = null;
                  if(term.getSubterm(0) != s_18 && !s_18.match(term.getSubterm(0)))
                    break Fail5;
                  h_9 = term.getSubterm(1);
                  term = termFactory.makeAppl(out._consSDefNoArgs_2, new IStrategoTerm[]{t_18, h_9});
                  if(true)
                    break Success3;
                }
                term = term0;
              }
              if(cons0 == out._consSDef_3)
              { 
                IStrategoTerm d_9 = null;
                IStrategoTerm e_9 = null;
                if(term.getSubterm(0) != s_18 && !s_18.match(term.getSubterm(0)))
                  break Fail1;
                d_9 = term.getSubterm(1);
                e_9 = term.getSubterm(2);
                term = termFactory.makeAppl(out._consSDef_3, new IStrategoTerm[]{t_18, d_9, e_9});
              }
              else
              { 
                break Fail1;
              }
            }
          }
        }
      }
      if(true)
        return term;
    }
    context.push("rename_rule_0_2");
    context.popOnFailure();
    return null;
  }
}