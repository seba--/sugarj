package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Complement_1_0 extends Strategy 
{ 
  public static $Complement_1_0 instance = new $Complement_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Complement_1_0");
    Fail136:
    { 
      IStrategoTerm d_125 = null;
      IStrategoTerm c_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consComplement_1 != ((IStrategoAppl)term).getConstructor())
        break Fail136;
      c_125 = term.getSubterm(0);
      IStrategoList annos121 = term.getAnnotations();
      d_125 = annos121;
      term = p_23.invoke(context, c_125);
      if(term == null)
        break Fail136;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consComplement_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}