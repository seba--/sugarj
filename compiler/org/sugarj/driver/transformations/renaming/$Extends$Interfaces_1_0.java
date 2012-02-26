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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtendsInterfaces_1_0");
    Fail38:
    { 
      IStrategoTerm v_103 = null;
      IStrategoTerm u_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consExtendsInterfaces_1 != ((IStrategoAppl)term).getConstructor())
        break Fail38;
      u_103 = term.getSubterm(0);
      IStrategoList annos26 = term.getAnnotations();
      v_103 = annos26;
      term = e_16.invoke(context, u_103);
      if(term == null)
        break Fail38;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consExtendsInterfaces_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}