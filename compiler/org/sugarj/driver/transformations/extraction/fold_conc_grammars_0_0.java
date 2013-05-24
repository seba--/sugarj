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
    Fail717:
    { 
      IStrategoTerm term916 = term;
      Success294:
      { 
        Fail718:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail718;
          term = extraction.constempty_grammar0;
          if(true)
            break Success294;
        }
        term = term916;
        IStrategoTerm term917 = term;
        Success295:
        { 
          Fail719:
          { 
            IStrategoTerm g_333 = null;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail719;
            g_333 = ((IStrategoList)term).head();
            IStrategoTerm arg73 = ((IStrategoList)term).tail();
            if(arg73.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg73).isEmpty())
              break Fail719;
            term = g_333;
            if(true)
              break Success295;
          }
          term = term917;
          IStrategoTerm d_333 = null;
          IStrategoTerm e_333 = null;
          IStrategoTerm f_333 = null;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail717;
          d_333 = ((IStrategoList)term).head();
          IStrategoTerm arg74 = ((IStrategoList)term).tail();
          if(arg74.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg74).isEmpty())
            break Fail717;
          e_333 = ((IStrategoList)arg74).head();
          f_333 = ((IStrategoList)arg74).tail();
          IStrategoList list443;
          list443 = checkListTail(f_333);
          if(list443 == null)
            break Fail717;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(ext._consconc_grammars_2, new IStrategoTerm[]{d_333, e_333}), list443);
          term = this.invoke(context, term);
          if(term == null)
            break Fail717;
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