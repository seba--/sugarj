package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Bool_1_0 extends Strategy 
{ 
  public static $Bool_1_0 instance = new $Bool_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Bool_1_0");
    Fail188:
    { 
      IStrategoTerm c_133 = null;
      IStrategoTerm z_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consBool_1 != ((IStrategoAppl)term).getConstructor())
        break Fail188;
      z_132 = term.getSubterm(0);
      IStrategoList annos161 = term.getAnnotations();
      c_133 = annos161;
      term = x_25.invoke(context, z_132);
      if(term == null)
        break Fail188;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consBool_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_133));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}