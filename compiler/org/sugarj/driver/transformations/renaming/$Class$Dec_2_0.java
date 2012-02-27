package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Dec_2_0 extends Strategy 
{ 
  public static $Class$Dec_2_0 instance = new $Class$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_16, Strategy l_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassDec_2_0");
    Fail39:
    { 
      IStrategoTerm b_104 = null;
      IStrategoTerm x_103 = null;
      IStrategoTerm z_103 = null;
      IStrategoTerm c_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail39;
      x_103 = term.getSubterm(0);
      z_103 = term.getSubterm(1);
      IStrategoList annos25 = term.getAnnotations();
      b_104 = annos25;
      term = k_16.invoke(context, x_103);
      if(term == null)
        break Fail39;
      c_104 = term;
      term = l_16.invoke(context, z_103);
      if(term == null)
        break Fail39;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassDec_2, new IStrategoTerm[]{c_104, term}), checkListAnnos(termFactory, b_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}