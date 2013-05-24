package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class intersect_0_0 extends Strategy 
{ 
  public static intersect_0_0 instance = new intersect_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("intersect_0_0");
    Fail2:
    { 
      IStrategoTerm term1 = term;
      Success1:
      { 
        Fail3:
        { 
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail3;
          IStrategoTerm arg0 = term.getSubterm(0);
          if(arg0.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg0).isEmpty())
            break Fail3;
          term = extraction.constNil0;
          if(true)
            break Success1;
        }
        term = term1;
        IStrategoTerm term2 = term;
        Success2:
        { 
          Fail4:
          { 
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail4;
            IStrategoTerm arg7 = term.getSubterm(1);
            if(arg7.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7).isEmpty())
              break Fail4;
            term = extraction.constNil0;
            if(true)
              break Success2;
          }
          term = term2;
          IStrategoTerm h_50 = null;
          IStrategoTerm i_50 = null;
          IStrategoTerm j_50 = null;
          IStrategoTerm k_50 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail2;
          IStrategoTerm arg8 = term.getSubterm(0);
          if(arg8.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8).isEmpty())
            break Fail2;
          j_50 = ((IStrategoList)arg8).head();
          h_50 = ((IStrategoList)arg8).tail();
          i_50 = term.getSubterm(1);
          term = termFactory.makeTuple(h_50, i_50);
          term = this.invoke(context, term);
          if(term == null)
            break Fail2;
          k_50 = term;
          Success3:
          { 
            Fail5:
            { 
              IStrategoTerm l_50 = null;
              l_50 = term;
              term = termFactory.makeTuple(j_50, i_50);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail5;
              term = l_50;
              { 
                IStrategoList list0;
                list0 = checkListTail(k_50);
                if(list0 == null)
                  break Fail2;
                term = (IStrategoTerm)termFactory.makeListCons(j_50, list0);
                if(true)
                  break Success3;
              }
            }
            term = k_50;
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