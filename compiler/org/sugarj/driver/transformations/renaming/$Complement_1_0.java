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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Complement_1_0");
    Fail187:
    { 
      IStrategoTerm p_143 = null;
      IStrategoTerm o_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consComplement_1 != ((IStrategoAppl)term).getConstructor())
        break Fail187;
      o_143 = term.getSubterm(0);
      IStrategoList annos162 = term.getAnnotations();
      p_143 = annos162;
      term = p_29.invoke(context, o_143);
      if(term == null)
        break Fail187;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consComplement_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}