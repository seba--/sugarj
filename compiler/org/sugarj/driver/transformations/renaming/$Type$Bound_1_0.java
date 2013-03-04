package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Bound_1_0 extends Strategy 
{ 
  public static $Type$Bound_1_0 instance = new $Type$Bound_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeBound_1_0");
    Fail197:
    { 
      IStrategoTerm u_169 = null;
      IStrategoTerm t_169 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTypeBound_1 != ((IStrategoAppl)term).getConstructor())
        break Fail197;
      t_169 = term.getSubterm(0);
      IStrategoList annos166 = term.getAnnotations();
      u_169 = annos166;
      term = e_39.invoke(context, t_169);
      if(term == null)
        break Fail197;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTypeBound_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_169));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}