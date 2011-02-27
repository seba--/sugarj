package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class fold_conc_grammars_0_0 extends Strategy 
{ 
  public static fold_conc_grammars_0_0 instance = new fold_conc_grammars_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_conc_grammars_0_0");
    Fail13:
    { 
      IStrategoTerm term3 = term;
      Success3:
      { 
        Fail14:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail14;
          term = extraction.constempty_grammar0;
          if(true)
            break Success3;
        }
        term = term3;
        IStrategoTerm term4 = term;
        Success4:
        { 
          Fail15:
          { 
            IStrategoTerm w_15 = null;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail15;
            w_15 = ((IStrategoList)term).head();
            IStrategoTerm arg1 = ((IStrategoList)term).tail();
            if(arg1.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1).isEmpty())
              break Fail15;
            term = w_15;
            if(true)
              break Success4;
          }
          term = term4;
          IStrategoTerm t_15 = null;
          IStrategoTerm u_15 = null;
          IStrategoTerm v_15 = null;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail13;
          t_15 = ((IStrategoList)term).head();
          IStrategoTerm arg2 = ((IStrategoList)term).tail();
          if(arg2.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg2).isEmpty())
            break Fail13;
          u_15 = ((IStrategoList)arg2).head();
          v_15 = ((IStrategoList)arg2).tail();
          IStrategoList list0;
          list0 = checkListTail(v_15);
          if(list0 == null)
            break Fail13;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(extraction._consconc_grammars_2, new IStrategoTerm[]{t_15, u_15}), list0);
          term = this.invoke(context, term);
          if(term == null)
            break Fail13;
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