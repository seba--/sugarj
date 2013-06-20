package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Dec_2_0 extends Strategy 
{ 
  public static $R$Dec_2_0 instance = new $R$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_16, Strategy l_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDec_2_0");
    Fail38:
    { 
      IStrategoTerm f_104 = null;
      IStrategoTerm d_104 = null;
      IStrategoTerm e_104 = null;
      IStrategoTerm h_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consRDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail38;
      d_104 = term.getSubterm(0);
      e_104 = term.getSubterm(1);
      IStrategoList annos11 = term.getAnnotations();
      f_104 = annos11;
      term = k_16.invoke(context, d_104);
      if(term == null)
        break Fail38;
      h_104 = term;
      term = l_16.invoke(context, e_104);
      if(term == null)
        break Fail38;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consRDec_2, new IStrategoTerm[]{h_104, term}), checkListAnnos(termFactory, f_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}