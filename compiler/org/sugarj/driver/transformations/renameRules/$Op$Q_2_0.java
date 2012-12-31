package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Op$Q_2_0 extends Strategy 
{ 
  public static $Op$Q_2_0 instance = new $Op$Q_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_18, Strategy l_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpQ_2_0");
    Fail138:
    { 
      IStrategoTerm e_114 = null;
      IStrategoTerm c_114 = null;
      IStrategoTerm d_114 = null;
      IStrategoTerm f_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOpQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail138;
      c_114 = term.getSubterm(0);
      d_114 = term.getSubterm(1);
      IStrategoList annos128 = term.getAnnotations();
      e_114 = annos128;
      term = k_18.invoke(context, c_114);
      if(term == null)
        break Fail138;
      f_114 = term;
      term = l_18.invoke(context, d_114);
      if(term == null)
        break Fail138;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOpQ_2, new IStrategoTerm[]{f_114, term}), checkListAnnos(termFactory, e_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}