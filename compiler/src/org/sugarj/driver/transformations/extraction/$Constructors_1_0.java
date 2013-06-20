package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constructors_1_0 extends Strategy 
{ 
  public static $Constructors_1_0 instance = new $Constructors_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Constructors_1_0");
    Fail153:
    { 
      IStrategoTerm e_126 = null;
      IStrategoTerm d_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consConstructors_1 != ((IStrategoAppl)term).getConstructor())
        break Fail153;
      d_126 = term.getSubterm(0);
      IStrategoList annos123 = term.getAnnotations();
      e_126 = annos123;
      term = d_24.invoke(context, d_126);
      if(term == null)
        break Fail153;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consConstructors_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}