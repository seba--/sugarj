package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Plus_1_0 extends Strategy 
{ 
  public static $Plus_1_0 instance = new $Plus_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Plus_1_0");
    Fail191:
    { 
      IStrategoTerm d_144 = null;
      IStrategoTerm c_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPlus_1 != ((IStrategoAppl)term).getConstructor())
        break Fail191;
      c_144 = term.getSubterm(0);
      IStrategoList annos166 = term.getAnnotations();
      d_144 = annos166;
      term = t_29.invoke(context, c_144);
      if(term == null)
        break Fail191;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPlus_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}