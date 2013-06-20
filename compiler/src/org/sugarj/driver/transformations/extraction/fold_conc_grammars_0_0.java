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
    Fail15:
    { 
      IStrategoTerm term4 = term;
      Success4:
      { 
        Fail16:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail16;
          term = extraction.constempty_grammar0;
          if(true)
            break Success4;
        }
        term = term4;
        IStrategoTerm term5 = term;
        Success5:
        { 
          Fail17:
          { 
            IStrategoTerm j_15 = null;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail17;
            j_15 = ((IStrategoList)term).head();
            IStrategoTerm arg1 = ((IStrategoList)term).tail();
            if(arg1.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1).isEmpty())
              break Fail17;
            term = j_15;
            if(true)
              break Success5;
          }
          term = term5;
          IStrategoTerm g_15 = null;
          IStrategoTerm h_15 = null;
          IStrategoTerm i_15 = null;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail15;
          g_15 = ((IStrategoList)term).head();
          IStrategoTerm arg2 = ((IStrategoList)term).tail();
          if(arg2.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg2).isEmpty())
            break Fail15;
          h_15 = ((IStrategoList)arg2).head();
          i_15 = ((IStrategoList)arg2).tail();
          IStrategoList list0;
          list0 = checkListTail(i_15);
          if(list0 == null)
            break Fail15;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(ext_out._consconc_grammars_2, new IStrategoTerm[]{g_15, h_15}), list0);
          term = this.invoke(context, term);
          if(term == null)
            break Fail15;
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