package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Builders_2_0 extends Strategy 
{ 
  public static $Builders_2_0 instance = new $Builders_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_335, Strategy e_335)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Builders_2_0");
    Fail759:
    { 
      IStrategoTerm z_427 = null;
      IStrategoTerm x_427 = null;
      IStrategoTerm y_427 = null;
      IStrategoTerm a_428 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consBuilders_2 != ((IStrategoAppl)term).getConstructor())
        break Fail759;
      x_427 = term.getSubterm(0);
      y_427 = term.getSubterm(1);
      IStrategoList annos31 = term.getAnnotations();
      z_427 = annos31;
      term = d_335.invoke(context, x_427);
      if(term == null)
        break Fail759;
      a_428 = term;
      term = e_335.invoke(context, y_427);
      if(term == null)
        break Fail759;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consBuilders_2, new IStrategoTerm[]{a_428, term}), checkListAnnos(termFactory, z_427));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}