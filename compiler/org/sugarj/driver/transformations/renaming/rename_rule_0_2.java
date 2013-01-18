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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_49, IStrategoTerm f_49)
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
            IStrategoTerm q_23 = null;
            if(term.getSubterm(0) != e_49 && !e_49.match(term.getSubterm(0)))
              break Fail2;
            q_23 = term.getSubterm(1);
            term = termFactory.makeAppl(out._consRDefNoArgs_2, new IStrategoTerm[]{f_49, q_23});
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
              IStrategoTerm m_23 = null;
              IStrategoTerm n_23 = null;
              if(term.getSubterm(0) != e_49 && !e_49.match(term.getSubterm(0)))
                break Fail3;
              m_23 = term.getSubterm(1);
              n_23 = term.getSubterm(2);
              term = termFactory.makeAppl(out._consRDef_3, new IStrategoTerm[]{f_49, m_23, n_23});
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
                IStrategoTerm h_23 = null;
                IStrategoTerm i_23 = null;
                IStrategoTerm j_23 = null;
                if(term.getSubterm(0) != e_49 && !e_49.match(term.getSubterm(0)))
                  break Fail4;
                h_23 = term.getSubterm(1);
                i_23 = term.getSubterm(2);
                j_23 = term.getSubterm(3);
                term = termFactory.makeAppl(out._consRDefT_4, new IStrategoTerm[]{f_49, h_23, i_23, j_23});
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
                  IStrategoTerm e_23 = null;
                  if(term.getSubterm(0) != e_49 && !e_49.match(term.getSubterm(0)))
                    break Fail5;
                  e_23 = term.getSubterm(1);
                  term = termFactory.makeAppl(out._consSDefNoArgs_2, new IStrategoTerm[]{f_49, e_23});
                  if(true)
                    break Success3;
                }
                term = term0;
              }
              if(cons0 == out._consSDef_3)
              { 
                IStrategoTerm a_23 = null;
                IStrategoTerm b_23 = null;
                if(term.getSubterm(0) != e_49 && !e_49.match(term.getSubterm(0)))
                  break Fail1;
                a_23 = term.getSubterm(1);
                b_23 = term.getSubterm(2);
                term = termFactory.makeAppl(out._consSDef_3, new IStrategoTerm[]{f_49, a_23, b_23});
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