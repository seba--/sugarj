package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Hexa_1_0 extends Strategy 
{ 
  public static $Hexa_1_0 instance = new $Hexa_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Hexa_1_0");
    Fail194:
    { 
      IStrategoTerm b_136 = null;
      IStrategoTerm z_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consHexa_1 != ((IStrategoAppl)term).getConstructor())
        break Fail194;
      z_135 = term.getSubterm(0);
      IStrategoList annos164 = term.getAnnotations();
      b_136 = annos164;
      term = p_26.invoke(context, z_135);
      if(term == null)
        break Fail194;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consHexa_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}