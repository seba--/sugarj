package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Or$Interface$Type_2_0 extends Strategy 
{ 
  public static $Class$Or$Interface$Type_2_0 instance = new $Class$Or$Interface$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_25, Strategy j_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassOrInterfaceType_2_0");
    Fail157:
    { 
      IStrategoTerm z_128 = null;
      IStrategoTerm x_128 = null;
      IStrategoTerm y_128 = null;
      IStrategoTerm a_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassOrInterfaceType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail157;
      x_128 = term.getSubterm(0);
      y_128 = term.getSubterm(1);
      IStrategoList annos138 = term.getAnnotations();
      z_128 = annos138;
      term = i_25.invoke(context, x_128);
      if(term == null)
        break Fail157;
      a_129 = term;
      term = j_25.invoke(context, y_128);
      if(term == null)
        break Fail157;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassOrInterfaceType_2, new IStrategoTerm[]{a_129, term}), checkListAnnos(termFactory, z_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}