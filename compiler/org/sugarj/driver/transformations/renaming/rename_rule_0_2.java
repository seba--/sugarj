package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_18, IStrategoTerm y_18)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail4:
    { 
      IStrategoTerm term0 = term;
      IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success0:
      { 
        if(cons0 == out._consRDefNoArgs_2)
        { 
          Fail5:
          { 
            IStrategoTerm y_9 = null;
            if(term.getSubterm(0) != x_18 && !x_18.match(term.getSubterm(0)))
              break Fail5;
            y_9 = term.getSubterm(1);
            term = termFactory.makeAppl(out._consRDefNoArgs_2, new IStrategoTerm[]{y_18, y_9});
            if(true)
              break Success0;
          }
          term = term0;
        }
        Success1:
        { 
          if(cons0 == out._consRDef_3)
          { 
            Fail6:
            { 
              IStrategoTerm u_9 = null;
              IStrategoTerm v_9 = null;
              if(term.getSubterm(0) != x_18 && !x_18.match(term.getSubterm(0)))
                break Fail6;
              u_9 = term.getSubterm(1);
              v_9 = term.getSubterm(2);
              term = termFactory.makeAppl(out._consRDef_3, new IStrategoTerm[]{y_18, u_9, v_9});
              if(true)
                break Success1;
            }
            term = term0;
          }
          Success2:
          { 
            if(cons0 == out._consRDefT_4)
            { 
              Fail7:
              { 
                IStrategoTerm p_9 = null;
                IStrategoTerm q_9 = null;
                IStrategoTerm r_9 = null;
                if(term.getSubterm(0) != x_18 && !x_18.match(term.getSubterm(0)))
                  break Fail7;
                p_9 = term.getSubterm(1);
                q_9 = term.getSubterm(2);
                r_9 = term.getSubterm(3);
                term = termFactory.makeAppl(out._consRDefT_4, new IStrategoTerm[]{y_18, p_9, q_9, r_9});
                if(true)
                  break Success2;
              }
              term = term0;
            }
            Success3:
            { 
              if(cons0 == out._consSDefNoArgs_2)
              { 
                Fail8:
                { 
                  IStrategoTerm m_9 = null;
                  if(term.getSubterm(0) != x_18 && !x_18.match(term.getSubterm(0)))
                    break Fail8;
                  m_9 = term.getSubterm(1);
                  term = termFactory.makeAppl(out._consSDefNoArgs_2, new IStrategoTerm[]{y_18, m_9});
                  if(true)
                    break Success3;
                }
                term = term0;
              }
              if(cons0 == out._consSDef_3)
              { 
                IStrategoTerm i_9 = null;
                IStrategoTerm j_9 = null;
                if(term.getSubterm(0) != x_18 && !x_18.match(term.getSubterm(0)))
                  break Fail4;
                i_9 = term.getSubterm(1);
                j_9 = term.getSubterm(2);
                term = termFactory.makeAppl(out._consSDef_3, new IStrategoTerm[]{y_18, i_9, j_9});
              }
              else
              { 
                break Fail4;
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