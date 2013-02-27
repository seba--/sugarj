package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $L$Choice_2_0 extends Strategy 
{ 
  public static $L$Choice_2_0 instance = new $L$Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_15, Strategy r_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LChoice_2_0");
    Fail94:
    { 
      IStrategoTerm e_106 = null;
      IStrategoTerm c_106 = null;
      IStrategoTerm d_106 = null;
      IStrategoTerm f_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail94;
      c_106 = term.getSubterm(0);
      d_106 = term.getSubterm(1);
      IStrategoList annos83 = term.getAnnotations();
      e_106 = annos83;
      term = q_15.invoke(context, c_106);
      if(term == null)
        break Fail94;
      f_106 = term;
      term = r_15.invoke(context, d_106);
      if(term == null)
        break Fail94;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLChoice_2, new IStrategoTerm[]{f_106, term}), checkListAnnos(termFactory, e_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}