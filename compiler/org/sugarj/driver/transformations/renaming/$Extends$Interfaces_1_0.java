package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Extends$Interfaces_1_0 extends Strategy 
{ 
  public static $Extends$Interfaces_1_0 instance = new $Extends$Interfaces_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtendsInterfaces_1_0");
    Fail76:
    { 
      IStrategoTerm x_136 = null;
      IStrategoTerm w_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtendsInterfaces_1 != ((IStrategoAppl)term).getConstructor())
        break Fail76;
      w_136 = term.getSubterm(0);
      IStrategoList annos52 = term.getAnnotations();
      x_136 = annos52;
      term = x_29.invoke(context, w_136);
      if(term == null)
        break Fail76;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtendsInterfaces_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}